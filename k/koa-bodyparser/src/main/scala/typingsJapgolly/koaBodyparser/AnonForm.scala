package typingsJapgolly.koaBodyparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForm extends js.Object {
  var form: js.UndefOr[js.Array[String]] = js.undefined
  var json: js.UndefOr[js.Array[String]] = js.undefined
  var text: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonForm {
  @scala.inline
  def apply(form: js.Array[String] = null, json: js.Array[String] = null, text: js.Array[String] = null): AnonForm = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForm]
  }
}

