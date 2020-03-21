package typingsJapgolly.saml20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.saml20.mod.ValidationOptionsWithKey
  - typingsJapgolly.saml20.mod.ValidationOptionsWithPrint
*/
trait ValidationOptions extends js.Object

object ValidationOptions {
  @scala.inline
  def ValidationOptionsWithKey(publicKey: String, audience: js.Any = null, bypassExpiration: js.UndefOr[Boolean] = js.undefined): ValidationOptions = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  def ValidationOptionsWithPrint(thumbprint: String, audience: js.Any = null, bypassExpiration: js.UndefOr[Boolean] = js.undefined): ValidationOptions = {
    val __obj = js.Dynamic.literal(thumbprint = thumbprint.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassExpiration)) __obj.updateDynamic("bypassExpiration")(bypassExpiration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

