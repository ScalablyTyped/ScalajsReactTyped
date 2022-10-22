package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../asset/asset.js').Asset} Asset */
/** @typedef {import('../asset/asset-registry.js').AssetRegistry} AssetRegistry */
/**
  * Keeps track of which assets are in bundles and loads files from bundles.
  *
  * @ignore
  */
@JSGlobal("pc.BundleRegistry")
@js.native
open class BundleRegistry protected ()
  extends typingsJapgolly.playcanvas.mod.BundleRegistry {
  /**
    * Create a new BundleRegistry instance.
    *
    * @param {AssetRegistry} assets - The asset registry.
    */
  def this(assets: typingsJapgolly.playcanvas.mod.AssetRegistry) = this()
}
