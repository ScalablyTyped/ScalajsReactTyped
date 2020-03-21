package typingsJapgolly.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArraySqlTokenType extends _SqlTokenType {
  var memberType: TypeNameIdentifierType | SqlTokenType
  var `type`: js.Symbol
  var values: js.Array[ValueExpressionType]
}

object ArraySqlTokenType {
  @scala.inline
  def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySqlTokenType]
  }
}

