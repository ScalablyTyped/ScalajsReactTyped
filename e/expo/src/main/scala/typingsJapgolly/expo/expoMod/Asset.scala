package typingsJapgolly.expo.expoMod

import typingsJapgolly.expoDashAsset.buildAssetMod.AssetDescriptor
import typingsJapgolly.expoDashAsset.buildAssetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Asset")
@js.native
class Asset protected ()
  extends typingsJapgolly.expoDashAsset.expoDashAssetMod.Asset {
  def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
}

/* static members */
@JSImport("expo", "Asset")
@js.native
object Asset extends js.Object {
  def fromMetadata(meta: AssetMetadata): typingsJapgolly.expoDashAsset.buildAssetMod.Asset = js.native
  def fromModule(virtualAssetModule: String): typingsJapgolly.expoDashAsset.buildAssetMod.Asset = js.native
  def fromModule(virtualAssetModule: Double): typingsJapgolly.expoDashAsset.buildAssetMod.Asset = js.native
  def fromURI(uri: String): typingsJapgolly.expoDashAsset.buildAssetMod.Asset = js.native
  def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
  def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
}

