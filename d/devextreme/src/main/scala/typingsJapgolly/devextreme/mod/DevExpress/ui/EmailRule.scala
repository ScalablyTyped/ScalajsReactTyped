package typingsJapgolly.devextreme.mod.DevExpress.ui

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

trait EmailRule extends js.Object {
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Specifies the rule type. Set it to "email" to use the EmailRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object EmailRule {
  @scala.inline
  def apply(
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): EmailRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRule]
  }
}

