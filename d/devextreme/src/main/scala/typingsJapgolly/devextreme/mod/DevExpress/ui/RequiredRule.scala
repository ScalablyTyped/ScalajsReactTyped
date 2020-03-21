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

trait RequiredRule extends js.Object {
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether to remove the Space characters from the validated value. */
  var trim: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "required" to use the RequiredRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object RequiredRule {
  @scala.inline
  def apply(
    message: String = null,
    trim: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): RequiredRule = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredRule]
  }
}

