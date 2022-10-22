package typingsJapgolly.rcVirtualList.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcVirtualList.esScrollBarMod.ScrollBarProps
import typingsJapgolly.rcVirtualList.esScrollBarMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollBar {
  
  inline def apply(
    count: Double,
    height: Double,
    onScroll: Double => Callback,
    onStartMove: Callback,
    onStopMove: Callback,
    prefixCls: String,
    scrollHeight: Double,
    scrollTop: Double
  ): Default[default] = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1((t0: Double) => onScroll(t0).runNow()), onStartMove = onStartMove.toJsFn, onStopMove = onStopMove.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[ScrollBarProps]))
  }
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ScrollBarProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
