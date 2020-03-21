package typingsJapgolly.expoAsset

import typingsJapgolly.expoAsset.assetMod.AssetDescriptor
import typingsJapgolly.expoAsset.assetMod.AssetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Asset protected ()
    extends typingsJapgolly.expoAsset.assetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromMetadata(meta: AssetMetadata): typingsJapgolly.expoAsset.assetMod.Asset = js.native
    def fromModule(virtualAssetModule: String): typingsJapgolly.expoAsset.assetMod.Asset = js.native
    def fromModule(virtualAssetModule: Double): typingsJapgolly.expoAsset.assetMod.Asset = js.native
    def fromURI(uri: String): typingsJapgolly.expoAsset.assetMod.Asset = js.native
    def loadAsync(moduleId: js.Array[Double]): js.Promise[js.Array[Unit]] = js.native
    def loadAsync(moduleId: Double): js.Promise[js.Array[Unit]] = js.native
  }
  
}

