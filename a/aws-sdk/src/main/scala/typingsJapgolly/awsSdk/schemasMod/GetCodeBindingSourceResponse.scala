package typingsJapgolly.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCodeBindingSourceResponse extends js.Object {
  var Body: js.UndefOr[typingsJapgolly.awsSdk.schemasMod.Body] = js.native
}

object GetCodeBindingSourceResponse {
  @scala.inline
  def apply(Body: Body = null): GetCodeBindingSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeBindingSourceResponse]
  }
}

