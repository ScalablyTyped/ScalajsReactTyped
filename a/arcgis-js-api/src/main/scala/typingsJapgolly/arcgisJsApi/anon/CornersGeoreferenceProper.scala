package typingsJapgolly.arcgisJsApi.anon

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.corners
import typingsJapgolly.arcgisJsApi.esri.PointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.CornersGeoreferenceProperties & {  type :'corners'} */
trait CornersGeoreferenceProper extends StObject {
  
  /**
    * The bottom left [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#bottomLeft)
    */
  var bottomLeft: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The bottom right [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#bottomRight)
    */
  var bottomRight: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The top left [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#topLeft)
    */
  var topLeft: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The top right [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#topRight)
    */
  var topRight: js.UndefOr[PointProperties] = js.undefined
  
  var `type`: js.UndefOr[corners] & corners
}
object CornersGeoreferenceProper {
  
  inline def apply(`type`: js.UndefOr[corners] & corners): CornersGeoreferenceProper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornersGeoreferenceProper]
  }
  
  extension [Self <: CornersGeoreferenceProper](x: Self) {
    
    inline def setBottomLeft(value: PointProperties): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
    
    inline def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
    
    inline def setBottomRight(value: PointProperties): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
    
    inline def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
    
    inline def setTopLeft(value: PointProperties): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
    
    inline def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
    
    inline def setTopRight(value: PointProperties): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    
    inline def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
    
    inline def setType(value: js.UndefOr[corners] & corners): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
