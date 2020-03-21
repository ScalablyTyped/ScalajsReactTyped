package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterType extends Type_ {
  var expression: Type_
  var name: String
  var `type`: typingsJapgolly.doctrine.doctrineStrings.ParameterType
}

object ParameterType {
  @scala.inline
  def apply(expression: Type_, name: String, `type`: typingsJapgolly.doctrine.doctrineStrings.ParameterType): ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterType]
  }
}

