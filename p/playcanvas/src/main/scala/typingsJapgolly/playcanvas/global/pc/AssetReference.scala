package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.anon.Add
import typingsJapgolly.playcanvas.mod.Asset_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./asset.js').Asset} Asset */
/** @typedef {import('./asset-registry.js').AssetRegistry} AssetRegistry */
/**
  * An object that manages the case where an object holds a reference to an asset and needs to be
  * notified when changes occur in the asset. e.g. notifications include load, add and remove
  * events.
  */
@JSGlobal("pc.AssetReference")
@js.native
open class AssetReference protected ()
  extends typingsJapgolly.playcanvas.mod.AssetReference {
  def this(
    propertyName: String,
    parent: js.Object,
    registry: typingsJapgolly.playcanvas.mod.AssetRegistry,
    callbacks: Add
  ) = this()
  /**
    * Create a new AssetReference instance.
    *
    * @param {string} propertyName - The name of the property that the asset is stored under,
    * passed into callbacks to enable updating.
    * @param {Asset|object} parent - The parent object that contains the asset reference, passed
    * into callbacks to enable updating. Currently an asset, but could be component or other.
    * @param {AssetRegistry} registry - The asset registry that stores all assets.
    * @param {object} callbacks - A set of functions called when the asset state changes: load,
    * add, remove.
    * @param {object} [callbacks.load] - The function called when the asset loads
    * load(propertyName, parent, asset).
    * @param {object} [callbacks.add] - The function called when the asset is added to the
    * registry add(propertyName, parent, asset).
    * @param {object} [callbacks.remove] - The function called when the asset is remove from the
    * registry remove(propertyName, parent, asset).
    * @param {object} [callbacks.unload] - The function called when the asset is unloaded
    * unload(propertyName, parent, asset).
    * @param {object} [scope] - The scope to call the callbacks in.
    * @example
    * var reference = new pc.AssetReference('textureAsset', this, this.app.assets, {
    *     load: this.onTextureAssetLoad,
    *     add: this.onTextureAssetAdd,
    *     remove: this.onTextureAssetRemove
    * }, this);
    * reference.id = this.textureAsset.id;
    */
  def this(
    propertyName: String,
    parent: Asset_,
    registry: typingsJapgolly.playcanvas.mod.AssetRegistry,
    callbacks: Add
  ) = this()
  def this(
    propertyName: String,
    parent: js.Object,
    registry: typingsJapgolly.playcanvas.mod.AssetRegistry,
    callbacks: Add,
    scope: js.Object
  ) = this()
  def this(
    propertyName: String,
    parent: Asset_,
    registry: typingsJapgolly.playcanvas.mod.AssetRegistry,
    callbacks: Add,
    scope: js.Object
  ) = this()
}
