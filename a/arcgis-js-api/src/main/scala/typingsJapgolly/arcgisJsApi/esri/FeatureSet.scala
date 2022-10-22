package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.extent
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mesh
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multipoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSet
  extends StObject
     with Accessor
     with JSONSupport
     with _ProfileVariableInstanceType {
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: String = js.native
  
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: Boolean = js.native
  
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#features)
    */
  var features: js.Array[Graphic] = js.native
  
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#fields)
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * The geometry type of features in the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#geometryType)
    */
  var geometryType: point | multipoint | polyline | polygon | extent | mesh = js.native
  
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#geometry) used to query the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: Geometry_ = js.native
  
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
}
