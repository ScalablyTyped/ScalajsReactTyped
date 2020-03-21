package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterExpression extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var expressionValue: js.UndefOr[String] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var fieldIndex: js.UndefOr[Double] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
}

object FilterExpression {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    expressionValue: String = null,
    field: String = null,
    fieldIndex: Int | Double = null,
    kind: String = null,
    matchType: String = null
  ): FilterExpression = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (expressionValue != null) __obj.updateDynamic("expressionValue")(expressionValue.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
}

