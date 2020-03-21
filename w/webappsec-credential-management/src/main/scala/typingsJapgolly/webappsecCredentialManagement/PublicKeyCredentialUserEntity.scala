package typingsJapgolly.webappsecCredentialManagement

import typingsJapgolly.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialuserentity}
  */
trait PublicKeyCredentialUserEntity extends PublicKeyCredentialEntity {
  var displayName: String
  var id: BufferSource
}

object PublicKeyCredentialUserEntity {
  @scala.inline
  def apply(displayName: String, id: BufferSource, name: String, icon: String = null): PublicKeyCredentialUserEntity = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntity]
  }
}

