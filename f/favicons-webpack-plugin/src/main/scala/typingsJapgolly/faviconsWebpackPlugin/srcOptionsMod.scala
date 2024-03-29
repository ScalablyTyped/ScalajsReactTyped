package typingsJapgolly.faviconsWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.faviconsWebpackPlugin.anon.PartialFaviconOptions
import typingsJapgolly.faviconsWebpackPlugin.faviconsWebpackPluginStrings.auto
import typingsJapgolly.faviconsWebpackPlugin.faviconsWebpackPluginStrings.light
import typingsJapgolly.faviconsWebpackPlugin.faviconsWebpackPluginStrings.webapp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOptionsMod {
  
  /* Inlined std.Required<std.Omit<favicons-webpack-plugin.favicons-webpack-plugin/src/options.FaviconWebpackPlugionOptions, 'mode' | 'devMode' | 'publicPath' | 'outputPath'>> & favicons-webpack-plugin.favicons-webpack-plugin/src/options.FaviconWebpackPlugionOptions */
  trait FaviconWebpackPlugionInternalOptions extends StObject {
    
    /** 
      * Enable caching
      *  Note: disabling caching may increase build times considerably
      */
    var cache: Boolean & js.UndefOr[Boolean]
    
    /**
      * Favicon generation modes used during development  
      * - `light`  
      *     the light mode is using the original logo as favicon
      *     this mode has a very fast compilation but limited features
      *     by default this mode is used for development
      * - `webapp`  
      *     the webapp mode is convertig the original logo into different favicons
      *     this mode has a quite slow compilation but wide browser support
      *     by default this mode is used for production
      */
    var devMode: js.UndefOr[light | webapp] = js.undefined
    
    /** 
      * Favicons configuration option 
      * @see https://github.com/itgalaxy/favicons
      */
    var favicons: PartialFaviconOptions & js.UndefOr[PartialFaviconOptions]
    
    /**
      * 
      * Inject html links/metadata (requires html-webpack-plugin).
      * This option accepts arguments of different types:
      * - boolean
      *   `false`: disables injection
      *   `true`: enables injection if that is not disabled in html-webpack-plugin
      * - function
      *   any predicate that takes an instance of html-webpack-plugin and returns either
      *   `true` or `false` to control the injection of html metadata for the html files
      *   generated by this instance.
      */
    var inject: (Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])) & (js.UndefOr[Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])])
    
    /** our source logo - can be png or svg (required) */
    var logo: String
    
    /**
      * Web app manifests are part of a collection of web technologies called progressive web apps (PWAs), 
      * which are websites that can be installed to a device’s homescreen without an app store.
      * @see https://developer.mozilla.org/en-US/docs/Web/Manifest
      * 
      * The manifest option allows to provide a filepath to a base manifest.json file or a base manifest configuration
      */
    var manifest: (String | StringDictionary[Any]) & (js.UndefOr[String | StringDictionary[Any]])
    
    /**
      * Favicon generation modes
      * - `light`  
      *     the light mode is using the original logo as favicon
      *     this mode has a very fast compilation but limited features
      *     by default this mode is used for development
      * - `webapp`  
      *     the webapp mode is convertig the original logo into different favicons
      *     this mode has a quite slow compilation but wide browser support
      *     by default this mode is used for production
      */
    var mode: js.UndefOr[light | webapp | auto] = js.undefined
    
    /**
      * The directory to output the assets relative to the webpack output dir.
      * Relative string paths are allowed here ie '../public/static'. If this
      * option is not set, `prefix` is used.
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix path for generated assets
      */
    var prefix: String & js.UndefOr[String]
    
    /** Override the publicPath option usually read from webpack configuration */
    var publicPath: js.UndefOr[String] = js.undefined
  }
  object FaviconWebpackPlugionInternalOptions {
    
    inline def apply(
      cache: Boolean & js.UndefOr[Boolean],
      favicons: PartialFaviconOptions & js.UndefOr[PartialFaviconOptions],
      inject: (Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])) & (js.UndefOr[Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])]),
      logo: String,
      manifest: (String | StringDictionary[Any]) & (js.UndefOr[String | StringDictionary[Any]]),
      prefix: String & js.UndefOr[String]
    ): FaviconWebpackPlugionInternalOptions = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], favicons = favicons.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconWebpackPlugionInternalOptions]
    }
    
    extension [Self <: FaviconWebpackPlugionInternalOptions](x: Self) {
      
      inline def setCache(value: Boolean & js.UndefOr[Boolean]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setDevMode(value: light | webapp): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
      
      inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
      
      inline def setFavicons(value: PartialFaviconOptions & js.UndefOr[PartialFaviconOptions]): Self = StObject.set(x, "favicons", value.asInstanceOf[js.Any])
      
      inline def setInject(
        value: (Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])) & (js.UndefOr[Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])])
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setManifest(value: (String | StringDictionary[Any]) & (js.UndefOr[String | StringDictionary[Any]])): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setMode(value: light | webapp | auto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPrefix(value: String & js.UndefOr[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
  
  trait FaviconWebpackPlugionOptions extends StObject {
    
    /** 
      * Enable caching
      *  Note: disabling caching may increase build times considerably
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Favicon generation modes used during development  
      * - `light`  
      *     the light mode is using the original logo as favicon
      *     this mode has a very fast compilation but limited features
      *     by default this mode is used for development
      * - `webapp`  
      *     the webapp mode is convertig the original logo into different favicons
      *     this mode has a quite slow compilation but wide browser support
      *     by default this mode is used for production
      */
    var devMode: js.UndefOr[light | webapp] = js.undefined
    
    /** 
      * Favicons configuration option 
      * @see https://github.com/itgalaxy/favicons
      */
    var favicons: js.UndefOr[PartialFaviconOptions] = js.undefined
    
    /**
      * 
      * Inject html links/metadata (requires html-webpack-plugin).
      * This option accepts arguments of different types:
      * - boolean
      *   `false`: disables injection
      *   `true`: enables injection if that is not disabled in html-webpack-plugin
      * - function
      *   any predicate that takes an instance of html-webpack-plugin and returns either
      *   `true` or `false` to control the injection of html metadata for the html files
      *   generated by this instance.
      */
    var inject: js.UndefOr[Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])] = js.undefined
    
    /** our source logo - can be png or svg (required) */
    var logo: String
    
    /**
      * Web app manifests are part of a collection of web technologies called progressive web apps (PWAs), 
      * which are websites that can be installed to a device’s homescreen without an app store.
      * @see https://developer.mozilla.org/en-US/docs/Web/Manifest
      * 
      * The manifest option allows to provide a filepath to a base manifest.json file or a base manifest configuration
      */
    var manifest: js.UndefOr[String | StringDictionary[Any]] = js.undefined
    
    /**
      * Favicon generation modes
      * - `light`  
      *     the light mode is using the original logo as favicon
      *     this mode has a very fast compilation but limited features
      *     by default this mode is used for development
      * - `webapp`  
      *     the webapp mode is convertig the original logo into different favicons
      *     this mode has a quite slow compilation but wide browser support
      *     by default this mode is used for production
      */
    var mode: js.UndefOr[light | webapp | auto] = js.undefined
    
    /**
      * The directory to output the assets relative to the webpack output dir.
      * Relative string paths are allowed here ie '../public/static'. If this
      * option is not set, `prefix` is used.
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix path for generated assets
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /** Override the publicPath option usually read from webpack configuration */
    var publicPath: js.UndefOr[String] = js.undefined
  }
  object FaviconWebpackPlugionOptions {
    
    inline def apply(logo: String): FaviconWebpackPlugionOptions = {
      val __obj = js.Dynamic.literal(logo = logo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconWebpackPlugionOptions]
    }
    
    extension [Self <: FaviconWebpackPlugionOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDevMode(value: light | webapp): Self = StObject.set(x, "devMode", value.asInstanceOf[js.Any])
      
      inline def setDevModeUndefined: Self = StObject.set(x, "devMode", js.undefined)
      
      inline def setFavicons(value: PartialFaviconOptions): Self = StObject.set(x, "favicons", value.asInstanceOf[js.Any])
      
      inline def setFaviconsUndefined: Self = StObject.set(x, "favicons", js.undefined)
      
      inline def setInject(value: Boolean | (js.Function1[/* htmlWebpackPlugin */ Any, Boolean])): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectFunction1(value: /* htmlWebpackPlugin */ Any => Boolean): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setManifest(value: String | StringDictionary[Any]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setMode(value: light | webapp | auto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
}
