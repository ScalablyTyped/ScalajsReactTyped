package typingsJapgolly.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPluralFieldName extends js.Object {
  var pluralFieldName: js.Any
  var `type`: js.Any
  var where: String
}

object AnonPluralFieldName {
  @scala.inline
  def apply(pluralFieldName: js.Any, `type`: js.Any, where: String): AnonPluralFieldName = {
    val __obj = js.Dynamic.literal(pluralFieldName = pluralFieldName.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPluralFieldName]
  }
}

