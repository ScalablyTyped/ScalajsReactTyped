package typingsJapgolly.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typekit extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object Typekit {
  @scala.inline
  def apply(id: String = null): Typekit = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typekit]
  }
}

