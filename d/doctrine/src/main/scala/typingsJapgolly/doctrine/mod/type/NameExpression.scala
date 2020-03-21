package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameExpression extends Type_ {
  var name: String
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NameExpression
}

object NameExpression {
  @scala.inline
  def apply(name: String, `type`: typingsJapgolly.doctrine.doctrineStrings.NameExpression): NameExpression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameExpression]
  }
}

