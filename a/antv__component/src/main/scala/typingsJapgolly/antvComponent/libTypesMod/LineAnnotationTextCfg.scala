package typingsJapgolly.antvComponent.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineAnnotationTextCfg
  extends StObject
     with EnhancedTextCfg {
  
  /**
    * 自动旋转，沿着线的方向，默认 true
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 文本的偏移 x
    * @type {number}
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本的偏移 y
    * @type {number}
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * 位置，可以选择： start, end, center 和 '50%' 这类的百分比写法，默认 'center'
    * @type {string}
    */
  var position: js.UndefOr[String] = js.undefined
}
object LineAnnotationTextCfg {
  
  inline def apply(content: String | Double): LineAnnotationTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationTextCfg]
  }
  
  extension [Self <: LineAnnotationTextCfg](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
