package typingsJapgolly.arcgisJsApi.colorStopMod

import typingsJapgolly.arcgisJsApi.esri.ColorStop
import typingsJapgolly.arcgisJsApi.esri.ColorStopProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/visualVariables/support/ColorStop", JSImport.Namespace)
@js.native
class Class () extends ColorStop {
  def this(properties: ColorStopProperties) = this()
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

