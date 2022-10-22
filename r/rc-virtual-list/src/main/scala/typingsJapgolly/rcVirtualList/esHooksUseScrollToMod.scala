package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcVirtualList.esInterfaceMod.GetKey
import typingsJapgolly.rcVirtualList.esListMod.ScrollTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseScrollToMod {
  
  @JSImport("rc-virtual-list/es/hooks/useScrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    containerRef: RefHandle[HTMLDivElement],
    data: js.Array[T],
    heights: typingsJapgolly.rcVirtualList.esUtilsCacheMapMod.default,
    itemHeight: Double,
    getKey: GetKey[T],
    collectHeight: js.Function0[Unit],
    syncScrollTop: js.Function1[/* newTop */ Double, Unit],
    triggerFlash: js.Function0[Unit]
  ): ScrollTo = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(containerRef.asInstanceOf[js.Any], data.asInstanceOf[js.Any], heights.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], collectHeight.asInstanceOf[js.Any], syncScrollTop.asInstanceOf[js.Any], triggerFlash.asInstanceOf[js.Any])).asInstanceOf[ScrollTo]
}
