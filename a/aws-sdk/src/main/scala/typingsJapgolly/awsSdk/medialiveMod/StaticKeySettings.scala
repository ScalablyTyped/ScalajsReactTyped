package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticKeySettings extends js.Object {
  /**
    * The URL of the license server used for protecting content.
    */
  var KeyProviderServer: js.UndefOr[InputLocation] = js.native
  /**
    * Static key value as a 32 character hexadecimal string.
    */
  var StaticKeyValue: stringMin32Max32 = js.native
}

object StaticKeySettings {
  @scala.inline
  def apply(StaticKeyValue: stringMin32Max32, KeyProviderServer: InputLocation = null): StaticKeySettings = {
    val __obj = js.Dynamic.literal(StaticKeyValue = StaticKeyValue.asInstanceOf[js.Any])
    if (KeyProviderServer != null) __obj.updateDynamic("KeyProviderServer")(KeyProviderServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticKeySettings]
  }
}

