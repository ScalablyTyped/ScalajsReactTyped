package typingsJapgolly.phaser.Phaser.Loader.FileTypes

import typingsJapgolly.phaser.Phaser.Loader.File
import typingsJapgolly.phaser.Phaser.Loader.LoaderPlugin
import typingsJapgolly.phaser.Phaser.Types.Loader.FileTypes.JSONFileConfig
import typingsJapgolly.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Animation JSON File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#animation method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#animation.
  */
@JSGlobal("Phaser.Loader.FileTypes.AnimationJSONFile")
@js.native
class AnimationJSONFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param dataKey When the JSON file loads only this property will be stored in the Cache.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject,
    dataKey: String
  ) = this()
  /**
    * Called at the end of the load process, after the Loader has finished all files in its queue.
    */
  def onLoadComplete(): Unit = js.native
}

