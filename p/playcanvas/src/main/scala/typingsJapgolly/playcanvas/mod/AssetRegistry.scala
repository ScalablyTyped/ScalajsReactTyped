package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AssetRegistry
  * @augments pc.EventHandler
  * @classdesc Container for all assets that are available to this application.
  * @description Create an instance of an AssetRegistry.
  * Note: PlayCanvas scripts are provided with an AssetRegistry instance as 'app.assets'.
  * @param {pc.ResourceLoader} loader - The ResourceLoader used to load the asset files.
  * @property {string} prefix A URL prefix that will be added to all asset loading requests.
  */
@JSImport("playcanvas", "AssetRegistry")
@js.native
class AssetRegistry protected ()
  extends typingsJapgolly.playcanvas.pc.AssetRegistry {
  def this(loader: typingsJapgolly.playcanvas.pc.ResourceLoader) = this()
}

