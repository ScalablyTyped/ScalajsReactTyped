package typingsJapgolly.phaser.phaserMod.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Loader.FileTypes.SpineFileConfig
import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Loader.FileTypes.SpineFile")
@js.native
class SpineFile protected ()
  extends typingsJapgolly.phaser.Phaser.Loader.FileTypes.SpineFile {
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: js.Array[String],
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpineFileConfig,
    jsonURL: js.Array[String],
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
}

