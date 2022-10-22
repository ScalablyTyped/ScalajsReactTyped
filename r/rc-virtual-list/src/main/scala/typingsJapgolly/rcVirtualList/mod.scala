package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcVirtualList.anon.Ref
import typingsJapgolly.rcVirtualList.esListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-virtual-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Item](props: ListProps[Item] & Ref): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
