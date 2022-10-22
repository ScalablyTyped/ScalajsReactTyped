package typingsJapgolly.webpackAssetsManifest

import typingsJapgolly.std.Set
import typingsJapgolly.tapable.mod.AsyncSeriesHook
import typingsJapgolly.tapable.mod.SyncHook
import typingsJapgolly.tapable.mod.SyncWaterfallHook
import typingsJapgolly.tapable.mod.UnsetAdditionalOptions
import typingsJapgolly.webpack.mod.Asset
import typingsJapgolly.webpack.mod.Stats
import typingsJapgolly.webpackAssetsManifest.mod.Entry
import typingsJapgolly.webpackAssetsManifest.mod.Options
import typingsJapgolly.webpackAssetsManifest.mod.WebpackAssetsManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterOptions extends StObject {
    
    var afterOptions: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions]
    
    @JSName("apply")
    var apply: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions]
    
    var customize: SyncWaterfallHook[
        js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
        UnsetAdditionalOptions
      ]
    
    var done: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions]
    
    var options: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions]
    
    var transform: SyncWaterfallHook[
        js.Tuple2[typingsJapgolly.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
        UnsetAdditionalOptions
      ]
  }
  object AfterOptions {
    
    inline def apply(
      afterOptions: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions],
      apply: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions],
      customize: SyncWaterfallHook[
          js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
          UnsetAdditionalOptions
        ],
      done: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions],
      options: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions],
      transform: SyncWaterfallHook[
          js.Tuple2[typingsJapgolly.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
          UnsetAdditionalOptions
        ]
    ): AfterOptions = {
      val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterOptions]
    }
    
    extension [Self <: AfterOptions](x: Self) {
      
      inline def setAfterOptions(value: SyncHook[js.Array[Options], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterOptions", value.asInstanceOf[js.Any])
      
      inline def setApply(value: SyncHook[js.Array[WebpackAssetsManifest], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
      
      inline def setCustomize(
        value: SyncWaterfallHook[
              js.Tuple4[Entry, Entry, WebpackAssetsManifest, Asset | Null], 
              UnsetAdditionalOptions
            ]
      ): Self = StObject.set(x, "customize", value.asInstanceOf[js.Any])
      
      inline def setDone(value: AsyncSeriesHook[js.Tuple2[WebpackAssetsManifest, Stats], UnsetAdditionalOptions]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: SyncWaterfallHook[js.Array[Options], UnsetAdditionalOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTransform(
        value: SyncWaterfallHook[
              js.Tuple2[typingsJapgolly.webpackAssetsManifest.mod.Assets, WebpackAssetsManifest], 
              UnsetAdditionalOptions
            ]
      ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assets extends StObject {
    
    var assets: js.Array[Asset]
    
    var hmrFiles: Set[String]
  }
  object Assets {
    
    inline def apply(assets: js.Array[Asset], hmrFiles: Set[String]): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], hmrFiles = hmrFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setAssets(value: js.Array[Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setHmrFiles(value: Set[String]): Self = StObject.set(x, "hmrFiles", value.asInstanceOf[js.Any])
    }
  }
}
