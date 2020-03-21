package typingsJapgolly.webappsecCredentialManagement

import typingsJapgolly.std.BufferSource
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.`public-key`
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.ble
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.internal
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.nfc
import typingsJapgolly.webappsecCredentialManagement.webappsecCredentialManagementStrings.usb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: BufferSource
  var transports: js.UndefOr[js.Array[usb | nfc | ble | internal]] = js.undefined
  var `type`: `public-key`
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(id: BufferSource, `type`: `public-key`, transports: js.Array[usb | nfc | ble | internal] = null): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

