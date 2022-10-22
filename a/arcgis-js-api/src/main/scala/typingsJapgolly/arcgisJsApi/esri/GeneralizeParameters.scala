package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralizeParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The maximum deviation unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html#deviationUnit)
    */
  var deviationUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  
  /**
    * The array of input geometries to generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * The maximum deviation for constructing a generalized geometry based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html#maxDeviation)
    */
  var maxDeviation: Double = js.native
}
