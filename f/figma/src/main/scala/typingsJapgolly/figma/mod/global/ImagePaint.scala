package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.CROP
import typingsJapgolly.figma.figmaStrings.FILL
import typingsJapgolly.figma.figmaStrings.FIT
import typingsJapgolly.figma.figmaStrings.IMAGE
import typingsJapgolly.figma.figmaStrings.TILE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePaint
  extends StObject
     with Paint {
  
  val blendMode: js.UndefOr[BlendMode] = js.undefined
  
  // setting for "TILE"
  val filters: js.UndefOr[ImageFilters] = js.undefined
  
  val imageHash: String | Null
  
  val imageTransform: js.UndefOr[Transform] = js.undefined
  
  val opacity: js.UndefOr[Double] = js.undefined
  
  val scaleMode: FILL | FIT | CROP | TILE
  
  // setting for "CROP"
  val scalingFactor: js.UndefOr[Double] = js.undefined
  
  val `type`: IMAGE
  
  val visible: js.UndefOr[Boolean] = js.undefined
}
object ImagePaint {
  
  inline def apply(scaleMode: FILL | FIT | CROP | TILE): ImagePaint = {
    val __obj = js.Dynamic.literal(scaleMode = scaleMode.asInstanceOf[js.Any], imageHash = null)
    __obj.updateDynamic("type")("IMAGE")
    __obj.asInstanceOf[ImagePaint]
  }
  
  extension [Self <: ImagePaint](x: Self) {
    
    inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setFilters(value: ImageFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setImageHash(value: String): Self = StObject.set(x, "imageHash", value.asInstanceOf[js.Any])
    
    inline def setImageHashNull: Self = StObject.set(x, "imageHash", null)
    
    inline def setImageTransform(value: Transform): Self = StObject.set(x, "imageTransform", value.asInstanceOf[js.Any])
    
    inline def setImageTransformUndefined: Self = StObject.set(x, "imageTransform", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setScaleMode(value: FILL | FIT | CROP | TILE): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScalingFactor(value: Double): Self = StObject.set(x, "scalingFactor", value.asInstanceOf[js.Any])
    
    inline def setScalingFactorUndefined: Self = StObject.set(x, "scalingFactor", js.undefined)
    
    inline def setType(value: IMAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
