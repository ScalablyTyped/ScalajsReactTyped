package typingsJapgolly.expoAsset

import typingsJapgolly.expoAsset.buildAssetMod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAssetHooksMod {
  
  @JSImport("expo-asset/build/AssetHooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAssets(moduleIds: js.Array[Double]): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]]]
  inline def useAssets(moduleIds: Double): js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAssets")(moduleIds.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[js.Array[Asset]], js.UndefOr[js.Error]]]
}
