package typingsJapgolly.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemDataRelationshipsTipData extends js.Object {
  var id: String
  var `type`: String
}

object CreateItemDataRelationshipsTipData {
  @scala.inline
  def apply(id: String, `type`: String): CreateItemDataRelationshipsTipData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemDataRelationshipsTipData]
  }
}

