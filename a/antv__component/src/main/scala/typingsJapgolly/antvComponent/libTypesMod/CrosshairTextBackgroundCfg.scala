package typingsJapgolly.antvComponent.libTypesMod

import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairTextBackgroundCfg extends StObject {
  
  /**
    * 文本背景周围的留白
    * @type {number|number[]}
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * 文本背景的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object CrosshairTextBackgroundCfg {
  
  inline def apply(): CrosshairTextBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextBackgroundCfg]
  }
  
  extension [Self <: CrosshairTextBackgroundCfg](x: Self) {
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
