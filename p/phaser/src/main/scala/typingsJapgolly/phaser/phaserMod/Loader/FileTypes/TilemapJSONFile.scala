package typingsJapgolly.phaser.phaserMod.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes.TilemapJSONFileConfig
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Tiled Tilemap JSON File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapTiledJSON method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapTiledJSON.
  */
@JSImport("phaser", "Loader.FileTypes.TilemapJSONFile")
@js.native
class TilemapJSONFile protected ()
  extends typingsJapgolly.phaser.Phaser.Loader.FileTypes.TilemapJSONFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: TilemapJSONFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: TilemapJSONFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
}

