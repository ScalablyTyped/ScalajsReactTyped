package typingsJapgolly.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISqlType extends js.Object {
  var `type`: ISqlTypeFactory
}

object ISqlType {
  @scala.inline
  def apply(`type`: ISqlTypeFactory): ISqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlType]
  }
}

