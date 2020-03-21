package typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasXMLFileConfig extends js.Object {
  /**
    * The default file extension to use for the atlas xml if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the atlas xml file from.
    */
  var atlasURL: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the atlas xml file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.undefined
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object AtlasXMLFileConfig {
  @scala.inline
  def apply(
    key: String,
    atlasExtension: String = null,
    atlasURL: String = null,
    atlasXhrSettings: XHRSettingsObject = null,
    normalMap: String = null,
    textureExtension: String = null,
    textureURL: String = null,
    textureXhrSettings: XHRSettingsObject = null
  ): AtlasXMLFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (atlasExtension != null) __obj.updateDynamic("atlasExtension")(atlasExtension.asInstanceOf[js.Any])
    if (atlasURL != null) __obj.updateDynamic("atlasURL")(atlasURL.asInstanceOf[js.Any])
    if (atlasXhrSettings != null) __obj.updateDynamic("atlasXhrSettings")(atlasXhrSettings.asInstanceOf[js.Any])
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (textureExtension != null) __obj.updateDynamic("textureExtension")(textureExtension.asInstanceOf[js.Any])
    if (textureURL != null) __obj.updateDynamic("textureURL")(textureURL.asInstanceOf[js.Any])
    if (textureXhrSettings != null) __obj.updateDynamic("textureXhrSettings")(textureXhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasXMLFileConfig]
  }
}

