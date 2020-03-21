package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonColumn
import typingsJapgolly.devextreme.devextremeStrings.async
import typingsJapgolly.devextreme.devextremeStrings.compare
import typingsJapgolly.devextreme.devextremeStrings.custom
import typingsJapgolly.devextreme.devextremeStrings.email
import typingsJapgolly.devextreme.devextremeStrings.numeric
import typingsJapgolly.devextreme.devextremeStrings.pattern
import typingsJapgolly.devextreme.devextremeStrings.range
import typingsJapgolly.devextreme.devextremeStrings.required
import typingsJapgolly.devextreme.devextremeStrings.stringLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRule extends js.Object {
  /** If true, the validationCallback is not executed for null, undefined, false, and empty strings. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether the rule should be always checked for the target value or only when the target value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "custom" to use the CustomRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
  /** A function that validates the target value. */
  var validationCallback: js.UndefOr[js.Function1[/* options */ AnonColumn, Boolean]] = js.undefined
}

object CustomRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null,
    validationCallback: /* options */ AnonColumn => CallbackTo[Boolean] = null
  ): CustomRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validationCallback != null) __obj.updateDynamic("validationCallback")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.devextreme.AnonColumn) => validationCallback(t0).runNow()))
    __obj.asInstanceOf[CustomRule]
  }
}

