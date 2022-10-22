package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGetImageDataOptions extends StObject {
  
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasGetImageDataRes, Unit]] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的左上角 x 坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * 将要被提取的图像数据矩形区域的左上角 y 坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}
object CanvasGetImageDataOptions {
  
  inline def apply(): CanvasGetImageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasGetImageDataOptions]
  }
  
  extension [Self <: CanvasGetImageDataOptions](x: Self) {
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
    
    inline def setCanvasIdUndefined: Self = StObject.set(x, "canvasId", js.undefined)
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSuccess(value: /* result */ CanvasGetImageDataRes => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ CanvasGetImageDataRes) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
