package typingsJapgolly.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[js.Object] = js.undefined
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String = null, source: js.Object = null): AnonPrefix = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
}

