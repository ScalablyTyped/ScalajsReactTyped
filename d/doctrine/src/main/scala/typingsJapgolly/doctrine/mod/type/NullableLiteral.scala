package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullableLiteral extends Type_ {
  var `type`: typingsJapgolly.doctrine.doctrineStrings.NullableLiteral
}

object NullableLiteral {
  @scala.inline
  def apply(`type`: typingsJapgolly.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
}

