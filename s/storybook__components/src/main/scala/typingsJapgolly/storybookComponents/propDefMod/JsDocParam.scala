package typingsJapgolly.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsDocParam extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
}

object JsDocParam {
  @scala.inline
  def apply(name: String, description: String = null): JsDocParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsDocParam]
  }
}

