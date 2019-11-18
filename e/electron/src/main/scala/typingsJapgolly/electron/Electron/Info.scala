package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  /**
    * Content Security Policy for the isolated world.
    */
  var csp: js.UndefOr[String] = js.undefined
  /**
    * Name for isolated world. Useful in devtools.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Security origin for the isolated world.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
}

object Info {
  @scala.inline
  def apply(csp: String = null, name: String = null, securityOrigin: String = null): Info = {
    val __obj = js.Dynamic.literal()
    if (csp != null) __obj.updateDynamic("csp")(csp.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityOrigin != null) __obj.updateDynamic("securityOrigin")(securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

