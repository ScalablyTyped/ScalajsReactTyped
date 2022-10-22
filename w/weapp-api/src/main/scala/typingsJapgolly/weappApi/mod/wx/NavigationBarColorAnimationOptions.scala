package typingsJapgolly.weappApi.mod.wx

import typingsJapgolly.weappApi.weappApiStrings.easeIn
import typingsJapgolly.weappApi.weappApiStrings.easeInOut
import typingsJapgolly.weappApi.weappApiStrings.easeOut
import typingsJapgolly.weappApi.weappApiStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBarColorAnimationOptions extends StObject {
  
  //  动画变化时间，单位 ms，默认0
  var animation: js.UndefOr[Double] = js.undefined
  
  //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}
object NavigationBarColorAnimationOptions {
  
  inline def apply(): NavigationBarColorAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarColorAnimationOptions]
  }
  
  extension [Self <: NavigationBarColorAnimationOptions](x: Self) {
    
    inline def setAnimation(value: Double): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = StObject.set(x, "timingFunc", value.asInstanceOf[js.Any])
    
    inline def setTimingFuncUndefined: Self = StObject.set(x, "timingFunc", js.undefined)
  }
}
