package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidLiteral extends Type_ {
  var `type`: typingsJapgolly.doctrine.doctrineStrings.VoidLiteral
}

object VoidLiteral {
  @scala.inline
  def apply(`type`: typingsJapgolly.doctrine.doctrineStrings.VoidLiteral): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidLiteral]
  }
}

