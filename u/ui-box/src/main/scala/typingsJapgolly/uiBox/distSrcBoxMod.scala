package typingsJapgolly.uiBox

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uiBox.distSrcTypesBoxTypesMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBoxMod {
  
  @JSImport("ui-box/dist/src/box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: ElementType */](props: BoxProps[E]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
