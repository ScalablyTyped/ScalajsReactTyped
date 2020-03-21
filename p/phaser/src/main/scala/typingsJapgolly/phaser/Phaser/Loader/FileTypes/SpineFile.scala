package typingsJapgolly.phaser.Phaser.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Loader.MultiFile
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Loader.FileTypes.SpineFile")
@js.native
class SpineFile protected () extends MultiFile {
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
  def addToCache(): js.Any = js.native
}

