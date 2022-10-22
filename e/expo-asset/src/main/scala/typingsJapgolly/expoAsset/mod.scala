package typingsJapgolly.expoAsset

import typingsJapgolly.expoAsset.buildAssetMod.AssetDescriptor
import typingsJapgolly.expoAsset.buildAssetSourcesMod.AssetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-asset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-asset", "Asset")
  @js.native
  open class Asset protected ()
    extends typingsJapgolly.expoAsset.buildAssetMod.Asset {
    def this(hasNameTypeHashUriWidthHeight: AssetDescriptor) = this()
  }
  /* static members */
  object Asset {
    
    @JSImport("expo-asset", "Asset")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @private
      */
    @JSImport("expo-asset", "Asset.byHash")
    @js.native
    def byHash: js.Object = js.native
    inline def byHash_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byHash")(x.asInstanceOf[js.Any])
    
    /**
      * @private
      */
    @JSImport("expo-asset", "Asset.byUri")
    @js.native
    def byUri: js.Object = js.native
    inline def byUri_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byUri")(x.asInstanceOf[js.Any])
    
    inline def fromMetadata(meta: AssetMetadata): typingsJapgolly.expoAsset.buildAssetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.expoAsset.buildAssetMod.Asset]
    
    inline def fromModule(virtualAssetModule: String): typingsJapgolly.expoAsset.buildAssetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.expoAsset.buildAssetMod.Asset]
    /**
      * Returns the [`Asset`](#asset) instance representing an asset given its module or URL.
      * @param virtualAssetModule The value of `require('path/to/file')` for the asset or external
      * network URL
      * @return The [`Asset`](#asset) instance for the asset.
      */
    inline def fromModule(virtualAssetModule: Double): typingsJapgolly.expoAsset.buildAssetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromModule")(virtualAssetModule.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.expoAsset.buildAssetMod.Asset]
    
    inline def fromURI(uri: String): typingsJapgolly.expoAsset.buildAssetMod.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURI")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.expoAsset.buildAssetMod.Asset]
    
    inline def loadAsync(moduleId: String): js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]]]
    inline def loadAsync(moduleId: js.Array[Double | String]): js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]]]
    /**
      * A helper that wraps `Asset.fromModule(module).downloadAsync` for convenience.
      * @param moduleId An array of `require('path/to/file')` or external network URLs. Can also be
      * just one module or URL without an Array.
      * @return Returns a Promise that fulfills with an array of `Asset`s when the asset(s) has been
      * saved to disk.
      * @example
      * ```ts
      * const [{ localUri }] = await Asset.loadAsync(require('./assets/snack-icon.png'));
      * ```
      */
    inline def loadAsync(moduleId: Double): js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAsync")(moduleId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]]]
  }
  
  inline def useAssets(moduleIds: js.Array[Double]): js.Tuple2[
    js.UndefOr[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]], 
    js.UndefOr[js.Error]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]], 
    js.UndefOr[js.Error]
  ]]
  inline def useAssets(moduleIds: Double): js.Tuple2[
    js.UndefOr[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]], 
    js.UndefOr[js.Error]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[js.Array[typingsJapgolly.expoAsset.buildAssetMod.Asset]], 
    js.UndefOr[js.Error]
  ]]
}
