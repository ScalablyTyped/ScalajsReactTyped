package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.CIMHatchFill
  - typingsJapgolly.arcgisJsApi.esri.CIMPictureFill
  - typingsJapgolly.arcgisJsApi.esri.CIMPictureMarker
  - typingsJapgolly.arcgisJsApi.esri.CIMPictureStroke
  - typingsJapgolly.arcgisJsApi.esri.CIMSolidFill
  - typingsJapgolly.arcgisJsApi.esri.CIMSolidStroke
  - typingsJapgolly.arcgisJsApi.esri.CIMVectorMarker
*/
trait CIMSymbolLayer extends StObject
object CIMSymbolLayer {
  
  inline def CIMHatchFill(
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    lineSymbol: CIMLineSymbol,
    propertyIsEnumerable: PropertyKey => Boolean,
    separation: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMHatchFill = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lineSymbol = lineSymbol.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), separation = separation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMHatchFill")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMHatchFill]
  }
  
  inline def CIMPictureFill(
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    url: String
  ): typingsJapgolly.arcgisJsApi.esri.CIMPictureFill = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureFill")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMPictureFill]
  }
  
  inline def CIMPictureMarker(
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double,
    url: String
  ): typingsJapgolly.arcgisJsApi.esri.CIMPictureMarker = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureMarker")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMPictureMarker]
  }
  
  inline def CIMPictureStroke(
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    url: String,
    width: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMPictureStroke = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPictureStroke")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMPictureStroke]
  }
  
  inline def CIMSolidFill(
    color: js.Array[Double],
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.CIMSolidFill = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("CIMSolidFill")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMSolidFill]
  }
  
  inline def CIMSolidStroke(
    color: js.Array[Double],
    constructor: js.Function,
    enable: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMSolidStroke = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMSolidStroke")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMSolidStroke]
  }
  
  inline def CIMVectorMarker(
    constructor: js.Function,
    enable: Boolean,
    frame: Envelope,
    hasOwnProperty: PropertyKey => Boolean,
    markerGraphics: js.Array[CIMMarkerGraphic],
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): typingsJapgolly.arcgisJsApi.esri.CIMVectorMarker = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), markerGraphics = markerGraphics.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMVectorMarker")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.CIMVectorMarker]
  }
}
