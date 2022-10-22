package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSLayerInfo
  extends StObject
     with Object {
  
  /**
    * The custom parameters applied to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var customParameters: Any
  
  /**
    * The extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var extent: Extent
  
  /**
    * The fields on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var fields: js.Array[Field]
  
  /**
    * The geometry type of the features in the layer.
    *
    * [Read more...](global.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon
  
  /**
    * The name of the layer in the WFS service to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var name: String
  
  /**
    * The namespace URI for the layer name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var namespaceUri: String
  
  /**
    * The field containing the object ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var objectIdField: String
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var spatialReference: SpatialReference
  
  /**
    * Determines whether the X and Y coordinates should be swapped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var swapXY: Boolean | Any
  
  /**
    * The URL to the WFS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo)
    */
  var url: String
  
  var wfsCapabilities: WFSCapabilities
}
object WFSLayerInfo {
  
  inline def apply(
    constructor: js.Function,
    customParameters: Any,
    extent: Extent,
    fields: js.Array[Field],
    geometryType: point | multipoint | polyline | polygon,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    namespaceUri: String,
    objectIdField: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    spatialReference: SpatialReference,
    swapXY: Boolean | Any,
    url: String,
    wfsCapabilities: WFSCapabilities
  ): WFSLayerInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], customParameters = customParameters.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], objectIdField = objectIdField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), spatialReference = spatialReference.asInstanceOf[js.Any], swapXY = swapXY.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wfsCapabilities = wfsCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSLayerInfo]
  }
  
  extension [Self <: WFSLayerInfo](x: Self) {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUri(value: String): Self = StObject.set(x, "namespaceUri", value.asInstanceOf[js.Any])
    
    inline def setObjectIdField(value: String): Self = StObject.set(x, "objectIdField", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSwapXY(value: Boolean | Any): Self = StObject.set(x, "swapXY", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWfsCapabilities(value: WFSCapabilities): Self = StObject.set(x, "wfsCapabilities", value.asInstanceOf[js.Any])
  }
}
