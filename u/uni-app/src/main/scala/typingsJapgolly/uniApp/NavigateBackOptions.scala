package typingsJapgolly.uniApp

import typingsJapgolly.uniApp.uniAppStrings.`fade-out`
import typingsJapgolly.uniApp.uniAppStrings.`pop-out`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-bottom`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-left`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-right`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-top`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-fade-in`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-in`
import typingsJapgolly.uniApp.uniAppStrings.auto
import typingsJapgolly.uniApp.uniAppStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateBackOptions extends StObject {
  
  /**
    * 窗口关闭动画的持续时间，单位为 ms
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * 窗口关闭的动画类型
    * - auto: 自动选择动画效果
    * - none: 无动画效果
    * - slide-out-right: 横向向右侧滑出屏幕动画
    * - slide-out-left: 横向向左侧滑出屏幕动画
    * - slide-out-top: 竖向向上侧滑出屏幕动画
    * - slide-out-bottom: 竖向向下侧滑出屏幕动画
    * - fade-out: 从不透明到透明逐渐隐藏动画
    * - zoom-in: 从大逐渐缩小关闭动画
    * - zoom-fade-in: 从大逐渐缩小并且从不透明到透明逐渐隐藏关闭动画
    * - pop-out: 从右侧平移出栈动画效果
    */
  var animationType: js.UndefOr[
    auto | none | `slide-out-right` | `slide-out-left` | `slide-out-top` | `slide-out-bottom` | `fade-out` | `zoom-in` | `zoom-fade-in` | `pop-out`
  ] = js.undefined
  
  /**
    * 返回的页面数，如果 delta 大于现有页面数，则返回到首页
    */
  var delta: js.UndefOr[Double] = js.undefined
}
object NavigateBackOptions {
  
  inline def apply(): NavigateBackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackOptions]
  }
  
  extension [Self <: NavigateBackOptions](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationType(
      value: auto | none | `slide-out-right` | `slide-out-left` | `slide-out-top` | `slide-out-bottom` | `fade-out` | `zoom-in` | `zoom-fade-in` | `pop-out`
    ): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
  }
}
