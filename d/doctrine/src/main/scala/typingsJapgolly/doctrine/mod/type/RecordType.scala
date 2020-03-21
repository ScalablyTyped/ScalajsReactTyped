package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordType extends Type_ {
  var fields: js.Array[Type_]
  var `type`: typingsJapgolly.doctrine.doctrineStrings.RecordType
}

object RecordType {
  @scala.inline
  def apply(fields: js.Array[Type_], `type`: typingsJapgolly.doctrine.doctrineStrings.RecordType): RecordType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordType]
  }
}

