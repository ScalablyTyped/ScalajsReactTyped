package typingsJapgolly.uniApp

import typingsJapgolly.uniApp.uniAppStrings.easeIn
import typingsJapgolly.uniApp.uniAppStrings.easeInOut
import typingsJapgolly.uniApp.uniAppStrings.easeOut
import typingsJapgolly.uniApp.uniAppStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarAnimation extends StObject {
  
  /**
    * 动画变化时间，默认0，单位：毫秒
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 动画变化方式，默认 linear
    * - linear: 动画从头到尾的速度是相同的
    * - easeIn: 动画以低速开始
    * - easeOut: 动画以低速结束
    * - easeInOut: 动画以低速开始和结束
    */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}
object NavigationBarAnimation {
  
  inline def apply(): NavigationBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarAnimation]
  }
  
  extension [Self <: NavigationBarAnimation](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "timingFunc", value.asInstanceOf[js.Any])
    
    inline def setTimingFuncUndefined: Self = StObject.set(x, "timingFunc", js.undefined)
  }
}
