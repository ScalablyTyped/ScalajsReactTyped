package typingsJapgolly.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionDefinition extends js.Object {
  var content: String
  var `type`: js.UndefOr[String] = js.undefined
}

object DescriptionDefinition {
  @scala.inline
  def apply(content: String, `type`: String = null): DescriptionDefinition = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionDefinition]
  }
}

