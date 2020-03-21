package typingsJapgolly.arcgisJsApi.callout3DMod

import typingsJapgolly.arcgisJsApi.esri.Callout3D
import typingsJapgolly.arcgisJsApi.esri.Callout3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/callouts/Callout3D", JSImport.Namespace)
@js.native
/**
  * When symbols have an offset from their position, it's important to still see what the real location is. This can be achieved with callouts:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-Callout3D.html)
  */
class Class () extends Callout3D {
  def this(properties: Callout3DProperties) = this()
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

