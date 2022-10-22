package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`extent-and-rotation`
import typingsJapgolly.arcgisJsApi.esri.ExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ExtentAndRotationGeoreferenceProperties & {  type :'extent-and-rotation'} */
trait ExtentAndRotationGeorefer extends StObject {
  
  /**
    * An extent of the image or video element representing its geographic location when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * A rotation of the image or video element when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#rotation)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[`extent-and-rotation`] & `extent-and-rotation`
}
object ExtentAndRotationGeorefer {
  
  inline def apply(`type`: js.UndefOr[`extent-and-rotation`] & `extent-and-rotation`): ExtentAndRotationGeorefer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentAndRotationGeorefer]
  }
  
  extension [Self <: ExtentAndRotationGeorefer](x: Self) {
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setType(value: js.UndefOr[`extent-and-rotation`] & `extent-and-rotation`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
