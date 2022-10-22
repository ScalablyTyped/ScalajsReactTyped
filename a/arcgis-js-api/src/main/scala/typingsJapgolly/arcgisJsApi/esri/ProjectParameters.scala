package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectParameters
  extends StObject
     with Accessor {
  
  /**
    * The input geometries to project.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * The spatial reference to which you are projecting the geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * Converts an instance of  this class to its ArcGIS portal JSON representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#toJSON)
    */
  def toJSON(): Any = js.native
  
  /**
    * Indicates whether to transform forward or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#transformForward)
    */
  var transformForward: Boolean = js.native
  
  /**
    * The well-known id {wkid:number} or well-known text {wkt:string} of the datum transformation to be applied to the projected geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ProjectParameters.html#transformation)
    */
  var transformation: ProjectParametersTransformation = js.native
}
