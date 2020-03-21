package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableType extends Type_ {
  var expression: Type_
  var prefix: Boolean
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NullableType
}

object NullableType {
  @scala.inline
  def apply(expression: Type_, prefix: Boolean, `type`: typingsJapgolly.doctrine.doctrineStrings.NullableType): NullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableType]
  }
}

