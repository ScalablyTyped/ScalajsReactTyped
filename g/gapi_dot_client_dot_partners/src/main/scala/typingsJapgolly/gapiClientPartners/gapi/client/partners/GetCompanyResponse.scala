package typingsJapgolly.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCompanyResponse extends js.Object {
  /** The company. */
  var company: js.UndefOr[Company] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
}

object GetCompanyResponse {
  @scala.inline
  def apply(company: Company = null, responseMetadata: ResponseMetadata = null): GetCompanyResponse = {
    val __obj = js.Dynamic.literal()
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompanyResponse]
  }
}

