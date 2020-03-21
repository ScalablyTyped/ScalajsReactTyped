package typingsJapgolly.ckeditorCkeditor5Engine.mod.model

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaContextItem extends js.Object {
  var getAttributeKeys: js.Iterable[String]
  var name: String
  def getAttribute(key: String): String
}

object SchemaContextItem {
  @scala.inline
  def apply(getAttribute: String => CallbackTo[String], getAttributeKeys: js.Iterable[String], name: String): SchemaContextItem = {
    val __obj = js.Dynamic.literal(getAttributeKeys = getAttributeKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.asInstanceOf[SchemaContextItem]
  }
}

