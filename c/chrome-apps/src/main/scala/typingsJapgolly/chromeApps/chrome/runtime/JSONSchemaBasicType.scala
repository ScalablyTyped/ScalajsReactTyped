package typingsJapgolly.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchemaBasicType extends js.Object {
  var `type`: JSONBasicTypes
}

object JSONSchemaBasicType {
  @scala.inline
  def apply(`type`: JSONBasicTypes): JSONSchemaBasicType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaBasicType]
  }
}

