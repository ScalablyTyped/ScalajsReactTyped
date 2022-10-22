package typingsJapgolly.assetsWebpackPlugin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assets-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AssetsWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  type Assets = StringDictionary[StringDictionary[String]]
  
  trait AssetsWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object AssetsWebpackPlugin {
    
    inline def apply(apply: Compiler => Callback): AssetsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[AssetsWebpackPlugin]
    }
    
    extension [Self <: AssetsWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * If the `entrypoints` option is given, the output will be limited to the entrypoints and the chunks associated with them.
      *
      * `false` by default.
      */
    var entrypoints: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set and `includeAllFileTypes` is set `false` , only assets matching these types will be included in the assets file.
      *
      * `['js', 'css']` by default.
      */
    var fileTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Name for the created json file.
      *
      * `"webpack-assets.json"` by default.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * If `false` the output will not include the full path of the generated file.
      *
      * e.g. `/public/path/bundle.js` vs `bundle.js`
      *
      * `true` by default.
      */
    var fullPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set `false` , falls back to the "fileTypes" option array to decide which file types to include in the assets file.
      *
      * `true` by default.
      */
    var includeAllFileTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, will output any files that are part of the chunk and marked as auxiliary assets.
      *
      * `false` by default.
      */
    var includeAuxiliaryAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set, will output any files that are part of the chunk and marked as preloadable or prefechtable child assets via a dynamic import.
      *
      * `false` by default.
      */
    var includeDynamicImportedAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set and `entrypoints` is set `true` , will output any files that are part of the unnamed chunk to an additional unnamed ("") entry.
      *
      * `false` by default.
      */
    var includeFilesWithoutChunk: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inserts the manifest javascript as a `text` property in your assets.
      * Accepts the name or names of your manifest chunk.
      * A manifest is the last CommonChunk that only contains the webpack bootstrap code.
      * This is useful for production use when you want to inline the manifest in your HTML skeleton for long-term caching.
      *
      * `false` by default.
      */
    var includeManifest: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /**
      * When set the output from `webpack-subresource-integrity` is included in the assets file.
      *
      * `false` by default.
      */
    var integrity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set the assets file will only be generated in memory while running `webpack-dev-server` and not written to disk.
      *
      * `false` by default.
      */
    var keepInMemory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Orders the assets output so that manifest is the first entry.
      * This is useful for cases where script tags are generated from the assets json output, and order of import is important.
      *
      * `false` by default.
      */
    var manifestFirst: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inject metadata into the output file. All values will be injected into the key `metadata`.
      */
    var metadata: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Path where to save the created JSON file.
      *
      * Defaults to the current directory.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to format the JSON output for readability.
      *
      * `false` by default.
      */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Formats the assets output.
      *
      * Defaults to `JSON.stringify`.
      */
    var processOutput: js.UndefOr[ProcessOutputFn] = js.undefined
    
    /**
      * If `true` the full path will automatically be stripped of the `/auto/` prefix generated by webpack.
      *
      * `false` by default.
      */
    var removeFullPathAutoPrefix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to `true` , the output JSON file will be updated instead of overwritten.
      *
      * `false` by default.
      */
    var update: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will override the path to use the compiler output path set in your webpack config.
      *
      * `false` by default.
      */
    var useCompilerPath: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
      
      inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
      
      inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFullPath(value: Boolean): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      inline def setFullPathUndefined: Self = StObject.set(x, "fullPath", js.undefined)
      
      inline def setIncludeAllFileTypes(value: Boolean): Self = StObject.set(x, "includeAllFileTypes", value.asInstanceOf[js.Any])
      
      inline def setIncludeAllFileTypesUndefined: Self = StObject.set(x, "includeAllFileTypes", js.undefined)
      
      inline def setIncludeAuxiliaryAssets(value: Boolean): Self = StObject.set(x, "includeAuxiliaryAssets", value.asInstanceOf[js.Any])
      
      inline def setIncludeAuxiliaryAssetsUndefined: Self = StObject.set(x, "includeAuxiliaryAssets", js.undefined)
      
      inline def setIncludeDynamicImportedAssets(value: Boolean): Self = StObject.set(x, "includeDynamicImportedAssets", value.asInstanceOf[js.Any])
      
      inline def setIncludeDynamicImportedAssetsUndefined: Self = StObject.set(x, "includeDynamicImportedAssets", js.undefined)
      
      inline def setIncludeFilesWithoutChunk(value: Boolean): Self = StObject.set(x, "includeFilesWithoutChunk", value.asInstanceOf[js.Any])
      
      inline def setIncludeFilesWithoutChunkUndefined: Self = StObject.set(x, "includeFilesWithoutChunk", js.undefined)
      
      inline def setIncludeManifest(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "includeManifest", value.asInstanceOf[js.Any])
      
      inline def setIncludeManifestUndefined: Self = StObject.set(x, "includeManifest", js.undefined)
      
      inline def setIncludeManifestVarargs(value: String*): Self = StObject.set(x, "includeManifest", js.Array(value*))
      
      inline def setIntegrity(value: Boolean): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepInMemory(value: Boolean): Self = StObject.set(x, "keepInMemory", value.asInstanceOf[js.Any])
      
      inline def setKeepInMemoryUndefined: Self = StObject.set(x, "keepInMemory", js.undefined)
      
      inline def setManifestFirst(value: Boolean): Self = StObject.set(x, "manifestFirst", value.asInstanceOf[js.Any])
      
      inline def setManifestFirstUndefined: Self = StObject.set(x, "manifestFirst", js.undefined)
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setProcessOutput(value: /* assets */ Assets => String): Self = StObject.set(x, "processOutput", js.Any.fromFunction1(value))
      
      inline def setProcessOutputUndefined: Self = StObject.set(x, "processOutput", js.undefined)
      
      inline def setRemoveFullPathAutoPrefix(value: Boolean): Self = StObject.set(x, "removeFullPathAutoPrefix", value.asInstanceOf[js.Any])
      
      inline def setRemoveFullPathAutoPrefixUndefined: Self = StObject.set(x, "removeFullPathAutoPrefix", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setUseCompilerPath(value: Boolean): Self = StObject.set(x, "useCompilerPath", value.asInstanceOf[js.Any])
      
      inline def setUseCompilerPathUndefined: Self = StObject.set(x, "useCompilerPath", js.undefined)
    }
  }
  
  type ProcessOutputFn = js.Function1[/* assets */ Assets, String]
}
