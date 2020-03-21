package typingsJapgolly.reactSvg

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterInjection extends js.Object {
  var evalScripts: String
  var fallback: Null
  var loading: Null
  var renumerateIRIElements: Boolean
  var wrapper: String
  def afterInjection(): js.UndefOr[scala.Nothing]
  def beforeInjection(): js.UndefOr[scala.Nothing]
}

object AnonAfterInjection {
  @scala.inline
  def apply(
    afterInjection: CallbackTo[js.UndefOr[scala.Nothing]],
    beforeInjection: CallbackTo[js.UndefOr[scala.Nothing]],
    evalScripts: String,
    fallback: Null,
    loading: Null,
    renumerateIRIElements: Boolean,
    wrapper: String
  ): AnonAfterInjection = {
    val __obj = js.Dynamic.literal(evalScripts = evalScripts.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], renumerateIRIElements = renumerateIRIElements.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.updateDynamic("afterInjection")(afterInjection.toJsFn)
    __obj.updateDynamic("beforeInjection")(beforeInjection.toJsFn)
    __obj.asInstanceOf[AnonAfterInjection]
  }
}

