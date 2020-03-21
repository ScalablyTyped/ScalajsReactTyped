package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclude
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.include
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudValueFilter extends PointCloudFilter {
  /**
    * Whether points should be included or excluded from the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    *
    * @default "exclude"
    */
  var mode: include | exclude = js.native
  @JSName("type")
  val type_PointCloudValueFilter: value = js.native
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.Array[Double] = js.native
}

@JSGlobal("__esri.PointCloudValueFilter")
@js.native
object PointCloudValueFilter extends TopLevel[PointCloudValueFilterConstructor]

