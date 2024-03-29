package typingsJapgolly.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightRpx extends StObject {
  
  /** 输入框高度(px) */
  var height: Double
  
  /** 输入框高度(rpx) */
  var heightRpx: Double
  
  /** 行数 */
  var lineCount: Double
  
  /** 行高 */
  var lineHeight: Double
}
object HeightRpx {
  
  inline def apply(height: Double, heightRpx: Double, lineCount: Double, lineHeight: Double): HeightRpx = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightRpx = heightRpx.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightRpx]
  }
  
  extension [Self <: HeightRpx](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightRpx(value: Double): Self = StObject.set(x, "heightRpx", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
