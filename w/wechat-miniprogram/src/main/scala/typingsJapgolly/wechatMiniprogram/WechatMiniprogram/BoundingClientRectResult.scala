package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 目标边界 */
trait BoundingClientRectResult extends StObject {
  
  /** 下边界 */
  var bottom: Double
  
  /** 高度 */
  var height: Double
  
  /** 左边界 */
  var left: Double
  
  /** 右边界 */
  var right: Double
  
  /** 上边界 */
  var top: Double
  
  /** 宽度 */
  var width: Double
}
object BoundingClientRectResult {
  
  inline def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): BoundingClientRectResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingClientRectResult]
  }
  
  extension [Self <: BoundingClientRectResult](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
