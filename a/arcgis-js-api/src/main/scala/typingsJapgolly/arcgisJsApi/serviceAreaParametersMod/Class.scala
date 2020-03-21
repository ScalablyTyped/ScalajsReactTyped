package typingsJapgolly.arcgisJsApi.serviceAreaParametersMod

import typingsJapgolly.arcgisJsApi.esri.ServiceAreaParameters
import typingsJapgolly.arcgisJsApi.esri.ServiceAreaParametersProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/ServiceAreaParameters", JSImport.Namespace)
@js.native
/**
  * Input parameters for [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaParameters.html)
  */
class Class () extends ServiceAreaParameters {
  def this(properties: ServiceAreaParametersProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

