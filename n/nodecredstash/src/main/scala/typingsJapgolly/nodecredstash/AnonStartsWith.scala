package typingsJapgolly.nodecredstash

import typingsJapgolly.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStartsWith extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.undefined
  var startsWith: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object AnonStartsWith {
  @scala.inline
  def apply(context: CredstashContext = null, startsWith: String = null, version: Int | Double = null): AnonStartsWith = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStartsWith]
  }
}

