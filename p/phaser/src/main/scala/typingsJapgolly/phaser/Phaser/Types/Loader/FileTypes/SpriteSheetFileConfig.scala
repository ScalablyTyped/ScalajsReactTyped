package typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheetFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * The frame configuration object.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object SpriteSheetFileConfig {
  @scala.inline
  def apply(
    key: String,
    extension: String = null,
    frameConfig: ImageFrameConfig = null,
    normalMap: String = null,
    url: String = null,
    xhrSettings: XHRSettingsObject = null
  ): SpriteSheetFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (frameConfig != null) __obj.updateDynamic("frameConfig")(frameConfig.asInstanceOf[js.Any])
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSheetFileConfig]
  }
}

