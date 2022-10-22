package typingsJapgolly.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 相交区域的边界 */
trait IntersectionRectResult extends StObject {
  
  /** 下边界 */
  var bottom: Double
  
  /** 左边界 */
  var left: Double
  
  /** 右边界 */
  var right: Double
  
  /** 上边界 */
  var top: Double
}
object IntersectionRectResult {
  
  inline def apply(bottom: Double, left: Double, right: Double, top: Double): IntersectionRectResult = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionRectResult]
  }
  
  extension [Self <: IntersectionRectResult](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
