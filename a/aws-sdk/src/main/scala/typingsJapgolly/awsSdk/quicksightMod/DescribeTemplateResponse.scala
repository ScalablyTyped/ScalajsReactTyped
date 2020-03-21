package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTemplateResponse extends js.Object {
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The template structure for the object you want to describe.
    */
  var Template: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.Template] = js.native
}

object DescribeTemplateResponse {
  @scala.inline
  def apply(Status: Int | scala.Double = null, Template: Template = null): DescribeTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Template != null) __obj.updateDynamic("Template")(Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplateResponse]
  }
}

