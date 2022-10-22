package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.esComponentsSelectorSelectorMod.SelectorProps
import typingsJapgolly.antdMobile.esComponentsSelectorSelectorMod.SelectorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSelectorMod {
  
  @JSImport("antd-mobile/es/components/selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V /* <: SelectorValue */](p: SelectorProps[V]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
}
