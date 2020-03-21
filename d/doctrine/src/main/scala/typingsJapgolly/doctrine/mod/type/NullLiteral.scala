package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullLiteral extends Type_ {
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NullLiteral
}

object NullLiteral {
  @scala.inline
  def apply(`type`: typingsJapgolly.doctrine.doctrineStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
}

