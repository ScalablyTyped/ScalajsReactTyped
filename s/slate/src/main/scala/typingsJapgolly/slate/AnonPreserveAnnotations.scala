package typingsJapgolly.slate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveAnnotations extends js.Object {
  var preserveAnnotations: js.UndefOr[Boolean] = js.undefined
  var preserveData: js.UndefOr[Boolean] = js.undefined
  var preserveSelection: js.UndefOr[Boolean] = js.undefined
}

object AnonPreserveAnnotations {
  @scala.inline
  def apply(
    preserveAnnotations: js.UndefOr[Boolean] = js.undefined,
    preserveData: js.UndefOr[Boolean] = js.undefined,
    preserveSelection: js.UndefOr[Boolean] = js.undefined
  ): AnonPreserveAnnotations = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveAnnotations)) __obj.updateDynamic("preserveAnnotations")(preserveAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveData)) __obj.updateDynamic("preserveData")(preserveData.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSelection)) __obj.updateDynamic("preserveSelection")(preserveSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveAnnotations]
  }
}

