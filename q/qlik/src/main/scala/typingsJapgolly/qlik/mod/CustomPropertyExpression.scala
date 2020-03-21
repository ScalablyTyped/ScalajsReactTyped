package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.StringExpr
import typingsJapgolly.qlik.qlikStrings.StringExpression
import typingsJapgolly.qlik.qlikStrings.ValueExpression
import typingsJapgolly.qlik.qlikStrings.dimension
import typingsJapgolly.qlik.qlikStrings.expression
import typingsJapgolly.qlik.qlikStrings.measure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  var component: expression
  var defaultValue: js.UndefOr[String] = js.undefined
  var expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing] = js.undefined
}

object CustomPropertyExpression {
  @scala.inline
  def apply(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    defaultValue: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
}

