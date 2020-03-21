package typingsJapgolly.expo.globalsWebMod

import typingsJapgolly.expoAsset.assetMod.AssetDescriptor
import typingsJapgolly.expoAsset.assetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/globals.web", "Asset")
@js.native
class Asset protected ()
  extends typingsJapgolly.expoAsset.mod.Asset {
  def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
}

/* static members */
@JSImport("expo/build/globals.web", "Asset")
@js.native
object Asset extends js.Object {
  def fromMetadata(meta: AssetMetadata): typingsJapgolly.expoAsset.assetMod.Asset = js.native
  def fromModule(virtualAssetModule: String): typingsJapgolly.expoAsset.assetMod.Asset = js.native
  def fromModule(virtualAssetModule: Double): typingsJapgolly.expoAsset.assetMod.Asset = js.native
  def fromURI(uri: String): typingsJapgolly.expoAsset.assetMod.Asset = js.native
  def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
  def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
}

