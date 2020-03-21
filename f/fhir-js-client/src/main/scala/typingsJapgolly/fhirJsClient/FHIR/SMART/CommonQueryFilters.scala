package typingsJapgolly.fhirJsClient.FHIR.SMART

import typingsJapgolly.fhirJsClient.AnonDictpropName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonQueryFilters extends js.Object {
  /**
    * Number of return records requested. The server is not bound to return the number requested, but cannot return more
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Addition filters to be applied on the history query. The object will be converted into query string parameters.
    */
  var params: js.UndefOr[AnonDictpropName] = js.undefined
  /**
    * Only include resource versions that were created at or after the given instant in time
    *
    * Type: instant An instant in time - known at least to the second and always includes a time zone.
    * Note: This is intended for precisely observed times (typically system logs etc.), and not human-reported times - for them,
    * use date and dateTime. instant is a more constrained dateTime xs:dateTime A JSON string - an xs:dateTime
    * Note: This type is for system times, not human times (see date and dateTime below).
    */
  var since: js.UndefOr[String] = js.undefined
}

object CommonQueryFilters {
  @scala.inline
  def apply(count: Int | Double = null, params: AnonDictpropName = null, since: String = null): CommonQueryFilters = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonQueryFilters]
  }
}

