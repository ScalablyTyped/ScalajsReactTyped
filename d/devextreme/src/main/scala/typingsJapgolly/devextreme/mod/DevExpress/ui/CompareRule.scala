package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.EqualssignEqualssign
import typingsJapgolly.devextreme.devextremeStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.devextreme.devextremeStrings.ExclamationmarkEqualssign
import typingsJapgolly.devextreme.devextremeStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.devextreme.devextremeStrings.Greaterthansign
import typingsJapgolly.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsJapgolly.devextreme.devextremeStrings.Lessthansign
import typingsJapgolly.devextreme.devextremeStrings.LessthansignEqualssign
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

trait CompareRule extends js.Object {
  /** Specifies the function whose return value is used for comparison with the validated value. */
  var comparisonTarget: js.UndefOr[js.Function0[_]] = js.undefined
  /** Specifies the operator to be used for comparing the validated value with the target. */
  var comparisonType: js.UndefOr[
    ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign
  ] = js.undefined
  /** If set to true, empty values are valid. */
  var ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the message that is shown if the rule is broken. */
  var message: js.UndefOr[String] = js.undefined
  /** Indicates whether or not the rule should be always checked for the target value or only when the target value changes. */
  var reevaluate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rule type. Set it to "compare" to use the CompareRule. */
  var `type`: js.UndefOr[
    required | numeric | range | stringLength | custom | compare | pattern | email | async
  ] = js.undefined
}

object CompareRule {
  @scala.inline
  def apply(
    comparisonTarget: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    comparisonType: ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | EqualssignEqualssign | EqualssignEqualssignEqualssign | Greaterthansign | GreaterthansignEqualssign = null,
    ignoreEmptyValue: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    reevaluate: js.UndefOr[Boolean] = js.undefined,
    `type`: required | numeric | range | stringLength | custom | compare | pattern | email | async = null
  ): CompareRule = {
    val __obj = js.Dynamic.literal()
    comparisonTarget.foreach(p => __obj.updateDynamic("comparisonTarget")(p.toJsFn))
    if (comparisonType != null) __obj.updateDynamic("comparisonType")(comparisonType.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyValue)) __obj.updateDynamic("ignoreEmptyValue")(ignoreEmptyValue.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareRule]
  }
}

