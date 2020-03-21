package typingsJapgolly.jest.mod.jest

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatcherHintOptions extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var expectedColor: js.UndefOr[MatcherHintColor] = js.undefined
  var isDirectExpectCall: js.UndefOr[Boolean] = js.undefined
  var isNot: js.UndefOr[Boolean] = js.undefined
  var promise: js.UndefOr[String] = js.undefined
  var receivedColor: js.UndefOr[MatcherHintColor] = js.undefined
  var secondArgument: js.UndefOr[String] = js.undefined
  var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.undefined
}

object MatcherHintOptions {
  @scala.inline
  def apply(
    comment: String = null,
    expectedColor: /* arg */ String => CallbackTo[String] = null,
    isDirectExpectCall: js.UndefOr[Boolean] = js.undefined,
    isNot: js.UndefOr[Boolean] = js.undefined,
    promise: String = null,
    receivedColor: /* arg */ String => CallbackTo[String] = null,
    secondArgument: String = null,
    secondArgumentColor: /* arg */ String => CallbackTo[String] = null
  ): MatcherHintOptions = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (expectedColor != null) __obj.updateDynamic("expectedColor")(js.Any.fromFunction1((t0: /* arg */ java.lang.String) => expectedColor(t0).runNow()))
    if (!js.isUndefined(isDirectExpectCall)) __obj.updateDynamic("isDirectExpectCall")(isDirectExpectCall.asInstanceOf[js.Any])
    if (!js.isUndefined(isNot)) __obj.updateDynamic("isNot")(isNot.asInstanceOf[js.Any])
    if (promise != null) __obj.updateDynamic("promise")(promise.asInstanceOf[js.Any])
    if (receivedColor != null) __obj.updateDynamic("receivedColor")(js.Any.fromFunction1((t0: /* arg */ java.lang.String) => receivedColor(t0).runNow()))
    if (secondArgument != null) __obj.updateDynamic("secondArgument")(secondArgument.asInstanceOf[js.Any])
    if (secondArgumentColor != null) __obj.updateDynamic("secondArgumentColor")(js.Any.fromFunction1((t0: /* arg */ java.lang.String) => secondArgumentColor(t0).runNow()))
    __obj.asInstanceOf[MatcherHintOptions]
  }
}

