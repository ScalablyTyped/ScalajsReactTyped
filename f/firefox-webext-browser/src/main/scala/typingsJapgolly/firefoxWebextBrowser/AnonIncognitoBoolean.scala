package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncognitoBoolean extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.undefined
}

object AnonIncognitoBoolean {
  @scala.inline
  def apply(incognito: js.UndefOr[Boolean] = js.undefined): AnonIncognitoBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncognitoBoolean]
  }
}

