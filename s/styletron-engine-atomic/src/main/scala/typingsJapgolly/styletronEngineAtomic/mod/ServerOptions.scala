package typingsJapgolly.styletronEngineAtomic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(prefix: String = null): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

