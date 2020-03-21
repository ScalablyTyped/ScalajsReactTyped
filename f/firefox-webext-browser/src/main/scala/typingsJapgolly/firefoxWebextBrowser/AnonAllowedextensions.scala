package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ExtensionID
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.NativeManifest
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowedextensions extends NativeManifest {
  var allowed_extensions: js.Array[ExtensionID]
  var description: String
  var name: String
  var path: String
  var `type`: pkcs11 | stdio
}

object AnonAllowedextensions {
  @scala.inline
  def apply(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): AnonAllowedextensions = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedextensions]
  }
}

