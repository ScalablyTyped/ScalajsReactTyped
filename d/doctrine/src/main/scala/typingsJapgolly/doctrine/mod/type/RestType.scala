package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestType extends Type_ {
  var expression: js.UndefOr[Type_] = js.undefined
  var `type`: typingsJapgolly.doctrine.doctrineStrings.RestType
}

object RestType {
  @scala.inline
  def apply(`type`: typingsJapgolly.doctrine.doctrineStrings.RestType, expression: Type_ = null): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
}

