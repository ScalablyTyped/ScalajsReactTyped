package typingsJapgolly.reactIntl.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageDescriptor extends js.Object {
  var defaultMessage: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String | js.Object] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
}

object MessageDescriptor {
  @scala.inline
  def apply(defaultMessage: String = null, description: String | js.Object = null, id: String | Double = null): MessageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
}

