package typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryFileConfig extends js.Object {
  /**
    * Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    */
  var dataType: js.UndefOr[js.Any] = js.undefined
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Binary Cache.
    */
  var key: String
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object BinaryFileConfig {
  @scala.inline
  def apply(
    key: String,
    dataType: js.Any = null,
    extension: String = null,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): BinaryFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFileConfig]
  }
}

