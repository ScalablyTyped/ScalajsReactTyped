package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcVirtualList.anon.Children
import typingsJapgolly.rcVirtualList.esListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod {
  
  @JSImport("rc-virtual-list/es/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Item](props: Children & ListProps[Item]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
