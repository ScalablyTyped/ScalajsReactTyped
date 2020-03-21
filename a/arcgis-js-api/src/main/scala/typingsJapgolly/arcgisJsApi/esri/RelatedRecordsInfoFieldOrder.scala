package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.asc
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedRecordsInfoFieldOrder
  extends Accessor
     with JSONSupport {
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#field)
    */
  var field: String = js.native
  /**
    * Set the ascending or descending sort order of the returned related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#order)
    */
  var order: asc | desc = js.native
}

@JSGlobal("__esri.RelatedRecordsInfoFieldOrder")
@js.native
object RelatedRecordsInfoFieldOrder extends TopLevel[RelatedRecordsInfoFieldOrderConstructor]

