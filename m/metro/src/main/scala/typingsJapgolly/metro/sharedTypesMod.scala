package typingsJapgolly.metro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.metro.metroStrings.ascii
import typingsJapgolly.metro.metroStrings.utf16le
import typingsJapgolly.metro.metroStrings.utf8
import typingsJapgolly.metroBabelTransformer.mod.CustomTransformOptions
import typingsJapgolly.metroBabelTransformer.mod.TransformProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedTypesMod {
  
  trait BundleOptions extends StObject {
    
    var bundleType: BundleType
    
    var createModuleIdFactory: js.UndefOr[js.Function0[js.Function1[/* path */ String, Double]]] = js.undefined
    
    var customTransformOptions: CustomTransformOptions
    
    var dev: Boolean
    
    var entryFile: String
    
    val excludeSource: Boolean
    
    val hot: Boolean
    
    val inlineSourceMap: Boolean
    
    var minify: Boolean
    
    val modulesOnly: Boolean
    
    var onProgress: js.UndefOr[js.Function2[/* doneCont */ Double, /* totalCount */ Double, Any]] = js.undefined
    
    val platform: js.UndefOr[String] = js.undefined
    
    val runModule: Boolean
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    val shallow: Boolean
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
    
    var sourceUrl: js.UndefOr[String] = js.undefined
    
    val unstable_transformProfile: TransformProfile
  }
  object BundleOptions {
    
    inline def apply(
      bundleType: BundleType,
      customTransformOptions: CustomTransformOptions,
      dev: Boolean,
      entryFile: String,
      excludeSource: Boolean,
      hot: Boolean,
      inlineSourceMap: Boolean,
      minify: Boolean,
      modulesOnly: Boolean,
      runModule: Boolean,
      shallow: Boolean,
      unstable_transformProfile: TransformProfile
    ): BundleOptions = {
      val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], excludeSource = excludeSource.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], modulesOnly = modulesOnly.asInstanceOf[js.Any], runModule = runModule.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleOptions]
    }
    
    extension [Self <: BundleOptions](x: Self) {
      
      inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
      
      inline def setCreateModuleIdFactory(value: CallbackTo[js.Function1[/* path */ String, Double]]): Self = StObject.set(x, "createModuleIdFactory", value.toJsFn)
      
      inline def setCreateModuleIdFactoryUndefined: Self = StObject.set(x, "createModuleIdFactory", js.undefined)
      
      inline def setCustomTransformOptions(value: CustomTransformOptions): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setExcludeSource(value: Boolean): Self = StObject.set(x, "excludeSource", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: (/* doneCont */ Double, /* totalCount */ Double) => Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRunModule(value: Boolean): Self = StObject.set(x, "runModule", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
      
      inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
      
      inline def setUnstable_transformProfile(value: TransformProfile): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.metro.metroStrings.bundle
    - typingsJapgolly.metro.metroStrings.delta
    - typingsJapgolly.metro.metroStrings.meta
    - typingsJapgolly.metro.metroStrings.map
    - typingsJapgolly.metro.metroStrings.ram
    - typingsJapgolly.metro.metroStrings.cli
    - typingsJapgolly.metro.metroStrings.hmr
    - typingsJapgolly.metro.metroStrings.todo
    - typingsJapgolly.metro.metroStrings.graph
  */
  trait BundleType extends StObject
  object BundleType {
    
    inline def bundle: typingsJapgolly.metro.metroStrings.bundle = "bundle".asInstanceOf[typingsJapgolly.metro.metroStrings.bundle]
    
    inline def cli: typingsJapgolly.metro.metroStrings.cli = "cli".asInstanceOf[typingsJapgolly.metro.metroStrings.cli]
    
    inline def delta: typingsJapgolly.metro.metroStrings.delta = "delta".asInstanceOf[typingsJapgolly.metro.metroStrings.delta]
    
    inline def graph: typingsJapgolly.metro.metroStrings.graph = "graph".asInstanceOf[typingsJapgolly.metro.metroStrings.graph]
    
    inline def hmr: typingsJapgolly.metro.metroStrings.hmr = "hmr".asInstanceOf[typingsJapgolly.metro.metroStrings.hmr]
    
    inline def map: typingsJapgolly.metro.metroStrings.map = "map".asInstanceOf[typingsJapgolly.metro.metroStrings.map]
    
    inline def meta: typingsJapgolly.metro.metroStrings.meta = "meta".asInstanceOf[typingsJapgolly.metro.metroStrings.meta]
    
    inline def ram: typingsJapgolly.metro.metroStrings.ram = "ram".asInstanceOf[typingsJapgolly.metro.metroStrings.ram]
    
    inline def todo: typingsJapgolly.metro.metroStrings.todo = "todo".asInstanceOf[typingsJapgolly.metro.metroStrings.todo]
  }
  
  trait OutputOptions extends StObject {
    
    var bundleEncoding: js.UndefOr[utf8 | utf16le | ascii] = js.undefined
    
    var bundleOutput: String
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var indexedRamBundle: js.UndefOr[Boolean] = js.undefined
    
    var platform: String
    
    var sourcemapOutput: js.UndefOr[String] = js.undefined
    
    var sourcemapSourcesRoot: js.UndefOr[String] = js.undefined
    
    var sourcemapUseAbsolutePath: js.UndefOr[Boolean] = js.undefined
  }
  object OutputOptions {
    
    inline def apply(bundleOutput: String, platform: String): OutputOptions = {
      val __obj = js.Dynamic.literal(bundleOutput = bundleOutput.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputOptions]
    }
    
    extension [Self <: OutputOptions](x: Self) {
      
      inline def setBundleEncoding(value: utf8 | utf16le | ascii): Self = StObject.set(x, "bundleEncoding", value.asInstanceOf[js.Any])
      
      inline def setBundleEncodingUndefined: Self = StObject.set(x, "bundleEncoding", js.undefined)
      
      inline def setBundleOutput(value: String): Self = StObject.set(x, "bundleOutput", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setIndexedRamBundle(value: Boolean): Self = StObject.set(x, "indexedRamBundle", value.asInstanceOf[js.Any])
      
      inline def setIndexedRamBundleUndefined: Self = StObject.set(x, "indexedRamBundle", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutput(value: String): Self = StObject.set(x, "sourcemapOutput", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutputUndefined: Self = StObject.set(x, "sourcemapOutput", js.undefined)
      
      inline def setSourcemapSourcesRoot(value: String): Self = StObject.set(x, "sourcemapSourcesRoot", value.asInstanceOf[js.Any])
      
      inline def setSourcemapSourcesRootUndefined: Self = StObject.set(x, "sourcemapSourcesRoot", js.undefined)
      
      inline def setSourcemapUseAbsolutePath(value: Boolean): Self = StObject.set(x, "sourcemapUseAbsolutePath", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUseAbsolutePathUndefined: Self = StObject.set(x, "sourcemapUseAbsolutePath", js.undefined)
    }
  }
  
  trait RequestOptions extends StObject {
    
    var createModuleIdFactory: js.UndefOr[js.Function0[js.Function1[/* path */ String, Double]]] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var entryFile: String
    
    var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
    
    var minify: Boolean
    
    var onProgress: js.UndefOr[
        js.Function2[/* transformedFileCount */ Double, /* totalFileCount */ Double, Unit]
      ] = js.undefined
    
    var platform: String
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(entryFile: String, minify: Boolean, platform: String): RequestOptions = {
      val __obj = js.Dynamic.literal(entryFile = entryFile.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setCreateModuleIdFactory(value: CallbackTo[js.Function1[/* path */ String, Double]]): Self = StObject.set(x, "createModuleIdFactory", value.toJsFn)
      
      inline def setCreateModuleIdFactoryUndefined: Self = StObject.set(x, "createModuleIdFactory", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: (/* transformedFileCount */ Double, /* totalFileCount */ Double) => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction2((t0: /* transformedFileCount */ Double, t1: /* totalFileCount */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
    }
  }
}
