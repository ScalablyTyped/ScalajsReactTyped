package typingsJapgolly.jqueryui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributeExpression extends js.Object {
  var attribute: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[js.RegExp] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object Anon_AttributeExpression {
  @scala.inline
  def apply(attribute: String = null, expression: js.RegExp = null, key: String = null): Anon_AttributeExpression = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributeExpression]
  }
}

