package typingsJapgolly.arcgisJsApi.directionsFeatureSetMod

import typingsJapgolly.arcgisJsApi.esri.DirectionsFeatureSet
import typingsJapgolly.arcgisJsApi.esri.DirectionsFeatureSetProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/DirectionsFeatureSet", JSImport.Namespace)
@js.native
/**
  * A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) that has properties specific to routing. The [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#features) property contains the turn by turn directions text and geometry of the route. The attributes for each feature provide information associated with the corresponding route segment. The following attributes are returned:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html)
  */
class Class () extends DirectionsFeatureSet {
  def this(properties: DirectionsFeatureSetProperties) = this()
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

