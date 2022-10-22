package typingsJapgolly.workboxBuild

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.workboxBuild.anon.Count
import typingsJapgolly.workboxBuild.typesMod.ManifestEntry
import typingsJapgolly.workboxBuild.typesMod.ManifestTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectManifestMod {
  
  @JSImport("workbox-build/inject-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectManifest(config: InjectManifestConfig): js.Promise[Count] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Count]]
  
  trait InjectManifestConfig extends StObject {
    
    /**
      * A list of entries to be precached, in addition to any entries that are
      * generated as part of the build configuration.
      *
      * @default true
      */
    var additionalManifestEntries: js.UndefOr[js.Array[ManifestEntry]] = js.undefined
    
    /**
      * Assets that match this will be assumed to be uniquely versioned via their
      * URL, and exempted from the normal HTTP cache-busting that's done when
      * populating the precache. While not required, it's recommended that if your
      * existing build process already inserts a `[hash]` value into each filename,
      * you provide a RegExp that will detect that, as it will reduce the bandwidth
      * consumed when precaching.
      */
    var dontCacheBustURLsMatching: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * The local directory you wish to match `globPatterns` against. The path is relative to the current directory.
      */
    var globDirectory: String
    
    /**
      * Determines whether or not symlinks are followed when generating the precache
      * manifest. For more information, see the definition of `follow` in the `glob`
      * [documentation](https://github.com/isaacs/node-glob#options).
      *
      * @default true
      */
    var globFollow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of patterns matching files to always exclude when generating the
      * precache manifest. For more information, see the definition of `ignore` in the `glob`
      * [documentation](https://github.com/isaacs/node-glob#options).
      *
      * @default ['node_modules/ **']
      */
    var globIgnores: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Files matching any of these patterns will be included in the precache
      * manifest. For more information, see the
      * [`glob` primer](https://github.com/isaacs/node-glob#glob-primer).
      *
      * @default ['**.{js,css,html}']
      */
    var globPatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If true, an error reading a directory when generating a precache manifest
      * will cause the build to fail. If false, the problematic directory will be
      * skipped. For more information, see the definition of `strict` in the `glob`
      * [documentation](https://github.com/isaacs/node-glob#options).
      *
      * @default true
      */
    var globStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The string to find inside of the `swSrc` file. Once found, it will be replaced by
      * the generated precache manifest.
      *
      * @default 'self.__WB_MANIFEST'
      */
    var injectionPoint: js.UndefOr[String] = js.undefined
    
    /**
      * One or more functions which will be applied sequentially against the
      * generated manifest. If `modifyURLPrefix` or `dontCacheBustURLsMatching` are
      * also specified, their corresponding transformations will be applied first.
      */
    var manifestTransforms: js.UndefOr[js.Array[ManifestTransform]] = js.undefined
    
    /**
      * This value can be used to determine the maximum size of files that will be
      * precached. This prevents you from inadvertently precaching very large files
      * that might have accidentally matched one of your patterns.
      *
      * @default 2097152
      */
    var maximumFileSizeToCacheInBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * If set to 'production', then an optimized service worker bundle that excludes
      * debugging info will be produced. If not explicitly configured here, the `mode`
      * value configured in the current `webpack` compiltion will be used.
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * A mapping of prefixes that, if present in an entry in the precache manifest,
      * will be replaced with the corresponding value. This can be used to, for example,
      * remove or add a path prefix from a manifest entry if your web hosting setup
      * doesn't match your local filesystem setup. As an alternative with more flexibility,
      * you can use the `manifestTransforms` option and provide a function that modifies
      * the entries in the manifest using whatever logic you provide.
      */
    var modifyURLPrefix: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The path and filename of the service worker file that will be created by the
      * build process, relative to the current working directory. It must end in '.js'.
      */
    var swDest: String
    
    /**
      * The path and filename of the service worker file that will be created by
      * the build process, relative to the current working directory. It must end in '.js'.
      */
    var swSrc: String
    
    /**
      * If a URL is rendered based on some server-side logic, its contents may depend
      * on multiple files or on some other unique string value. The keys in this object
      * are server-rendered URLs. If the values are an array of strings, they will be
      * interpreted as `glob` patterns, and the contents of any files matching the
      * patterns will be used to uniquely version the URL. If used with a single string,
      * it will be interpreted as unique versioning information that you've generated
      * for a given URL.
      */
    var templatedURLs: js.UndefOr[js.Object] = js.undefined
  }
  object InjectManifestConfig {
    
    inline def apply(globDirectory: String, swDest: String, swSrc: String): InjectManifestConfig = {
      val __obj = js.Dynamic.literal(globDirectory = globDirectory.asInstanceOf[js.Any], swDest = swDest.asInstanceOf[js.Any], swSrc = swSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectManifestConfig]
    }
    
    extension [Self <: InjectManifestConfig](x: Self) {
      
      inline def setAdditionalManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "additionalManifestEntries", value.asInstanceOf[js.Any])
      
      inline def setAdditionalManifestEntriesUndefined: Self = StObject.set(x, "additionalManifestEntries", js.undefined)
      
      inline def setAdditionalManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "additionalManifestEntries", js.Array(value*))
      
      inline def setDontCacheBustURLsMatching(value: js.RegExp): Self = StObject.set(x, "dontCacheBustURLsMatching", value.asInstanceOf[js.Any])
      
      inline def setDontCacheBustURLsMatchingUndefined: Self = StObject.set(x, "dontCacheBustURLsMatching", js.undefined)
      
      inline def setGlobDirectory(value: String): Self = StObject.set(x, "globDirectory", value.asInstanceOf[js.Any])
      
      inline def setGlobFollow(value: Boolean): Self = StObject.set(x, "globFollow", value.asInstanceOf[js.Any])
      
      inline def setGlobFollowUndefined: Self = StObject.set(x, "globFollow", js.undefined)
      
      inline def setGlobIgnores(value: js.Array[String]): Self = StObject.set(x, "globIgnores", value.asInstanceOf[js.Any])
      
      inline def setGlobIgnoresUndefined: Self = StObject.set(x, "globIgnores", js.undefined)
      
      inline def setGlobIgnoresVarargs(value: String*): Self = StObject.set(x, "globIgnores", js.Array(value*))
      
      inline def setGlobPatterns(value: js.Array[String]): Self = StObject.set(x, "globPatterns", value.asInstanceOf[js.Any])
      
      inline def setGlobPatternsUndefined: Self = StObject.set(x, "globPatterns", js.undefined)
      
      inline def setGlobPatternsVarargs(value: String*): Self = StObject.set(x, "globPatterns", js.Array(value*))
      
      inline def setGlobStrict(value: Boolean): Self = StObject.set(x, "globStrict", value.asInstanceOf[js.Any])
      
      inline def setGlobStrictUndefined: Self = StObject.set(x, "globStrict", js.undefined)
      
      inline def setInjectionPoint(value: String): Self = StObject.set(x, "injectionPoint", value.asInstanceOf[js.Any])
      
      inline def setInjectionPointUndefined: Self = StObject.set(x, "injectionPoint", js.undefined)
      
      inline def setManifestTransforms(value: js.Array[ManifestTransform]): Self = StObject.set(x, "manifestTransforms", value.asInstanceOf[js.Any])
      
      inline def setManifestTransformsUndefined: Self = StObject.set(x, "manifestTransforms", js.undefined)
      
      inline def setManifestTransformsVarargs(value: ManifestTransform*): Self = StObject.set(x, "manifestTransforms", js.Array(value*))
      
      inline def setMaximumFileSizeToCacheInBytes(value: Double): Self = StObject.set(x, "maximumFileSizeToCacheInBytes", value.asInstanceOf[js.Any])
      
      inline def setMaximumFileSizeToCacheInBytesUndefined: Self = StObject.set(x, "maximumFileSizeToCacheInBytes", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setModifyURLPrefix(value: StringDictionary[String]): Self = StObject.set(x, "modifyURLPrefix", value.asInstanceOf[js.Any])
      
      inline def setModifyURLPrefixUndefined: Self = StObject.set(x, "modifyURLPrefix", js.undefined)
      
      inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
      
      inline def setSwSrc(value: String): Self = StObject.set(x, "swSrc", value.asInstanceOf[js.Any])
      
      inline def setTemplatedURLs(value: js.Object): Self = StObject.set(x, "templatedURLs", value.asInstanceOf[js.Any])
      
      inline def setTemplatedURLsUndefined: Self = StObject.set(x, "templatedURLs", js.undefined)
    }
  }
  
  type InjectManifestResult = js.Promise[Count]
}
