package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapContextTranslateMarkerOptions extends StObject {
  
  /**
    * 动画结束回调函数
    */
  var animationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 移动过程中是否自动旋转marker
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 指定marker移动到的目标点
    */
  var destination: js.UndefOr[LocationObject] = js.undefined
  
  /**
    * 动画持续时长，默认值1000ms，平移与旋转分别计算
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 指定marker
    */
  var markerId: js.UndefOr[Double] = js.undefined
  
  /**
    * marker的旋转角度
    */
  var rotate: js.UndefOr[Double] = js.undefined
}
object MapContextTranslateMarkerOptions {
  
  inline def apply(): MapContextTranslateMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapContextTranslateMarkerOptions]
  }
  
  extension [Self <: MapContextTranslateMarkerOptions](x: Self) {
    
    inline def setAnimationEnd(value: Callback): Self = StObject.set(x, "animationEnd", value.toJsFn)
    
    inline def setAnimationEndUndefined: Self = StObject.set(x, "animationEnd", js.undefined)
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setDestination(value: LocationObject): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
    
    inline def setMarkerIdUndefined: Self = StObject.set(x, "markerId", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
  }
}
