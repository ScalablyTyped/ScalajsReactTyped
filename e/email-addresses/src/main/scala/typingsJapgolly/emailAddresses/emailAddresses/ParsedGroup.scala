package typingsJapgolly.emailAddresses.emailAddresses

import typingsJapgolly.emailAddresses.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedGroup extends js.Object {
  var addresses: js.Array[ParsedMailbox]
  var name: String
  var node: js.UndefOr[ASTNode] = js.undefined
  var parts: AnonName
  var `type`: String
}

object ParsedGroup {
  @scala.inline
  def apply(
    addresses: js.Array[ParsedMailbox],
    name: String,
    parts: AnonName,
    `type`: String,
    node: ASTNode = null
  ): ParsedGroup = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedGroup]
  }
}

