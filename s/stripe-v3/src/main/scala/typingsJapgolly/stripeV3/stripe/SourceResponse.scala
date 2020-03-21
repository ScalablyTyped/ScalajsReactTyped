package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceResponse extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var source: js.UndefOr[Source] = js.undefined
}

object SourceResponse {
  @scala.inline
  def apply(error: Error = null, source: Source = null): SourceResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceResponse]
  }
}

