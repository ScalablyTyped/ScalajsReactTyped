package typingsJapgolly.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的 rgba
    */
  var data: js.typedarray.ArrayBuffer
  
  /**
    * 图像数据矩形的高度
    */
  var height: Double
  
  /**
    * 图像数据矩形的宽度
    */
  var width: Double
}
object Data {
  
  inline def apply(data: js.typedarray.ArrayBuffer, height: Double, width: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
