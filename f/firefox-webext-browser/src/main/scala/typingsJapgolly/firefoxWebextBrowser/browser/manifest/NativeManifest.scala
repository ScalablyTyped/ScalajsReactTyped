package typingsJapgolly.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.pkcs11
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.stdio
import typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a native manifest file */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.AnonAllowedextensions
  - typingsJapgolly.firefoxWebextBrowser.AnonType
*/
trait NativeManifest extends js.Object

object NativeManifest {
  @scala.inline
  def AnonAllowedextensions(
    allowed_extensions: js.Array[ExtensionID],
    description: String,
    name: String,
    path: String,
    `type`: pkcs11 | stdio
  ): NativeManifest = {
    val __obj = js.Dynamic.literal(allowed_extensions = allowed_extensions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeManifest]
  }
  @scala.inline
  def AnonType(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): NativeManifest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeManifest]
  }
}

