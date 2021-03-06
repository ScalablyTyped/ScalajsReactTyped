package typingsJapgolly.arcgisJsApi.pointCloudRGBRendererMod

import typingsJapgolly.arcgisJsApi.esri.PointCloudRGBRenderer
import typingsJapgolly.arcgisJsApi.esri.PointCloudRGBRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/PointCloudRGBRenderer", JSImport.Namespace)
@js.native
/**
  * PointCloudRGBRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a color attribute.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html)
  */
class Class () extends PointCloudRGBRenderer {
  def this(properties: PointCloudRGBRendererProperties) = this()
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

