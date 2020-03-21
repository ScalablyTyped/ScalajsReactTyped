package typingsJapgolly.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveCaseRequest extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
}

object ResolveCaseRequest {
  @scala.inline
  def apply(caseId: CaseId = null): ResolveCaseRequest = {
    val __obj = js.Dynamic.literal()
    if (caseId != null) __obj.updateDynamic("caseId")(caseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCaseRequest]
  }
}

