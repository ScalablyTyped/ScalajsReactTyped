package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseMobileTouchMoveMod {
  
  @JSImport("rc-virtual-list/es/hooks/useMobileTouchMove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    inVirtual: Boolean,
    listRef: RefHandle[HTMLDivElement],
    callback: js.Function2[/* offsetY */ Double, /* smoothOffset */ js.UndefOr[Boolean], Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inVirtual.asInstanceOf[js.Any], listRef.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
