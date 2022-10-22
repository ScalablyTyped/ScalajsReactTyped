package typingsJapgolly.webpackBlocksAssets

import typingsJapgolly.webpackBlocksAssets.mod.css.FileOptions
import typingsJapgolly.webpackBlocksAssets.mod.css.UrlOptions
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsInts.`0`
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsInts.`1`
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsInts.`2`
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsStrings.asIs
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCase
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsStrings.camelCaseOnly
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsStrings.dashes
import typingsJapgolly.webpackBlocksAssets.webpackBlocksAssetsStrings.dashesOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@webpack-blocks/assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object css {
    
    inline def apply(): Any = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Any]
    inline def apply(options: CssOptions): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@webpack-blocks/assets", "css")
    @js.native
    val ^ : js.Any = js.native
    
    inline def modules(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")().asInstanceOf[Any]
    inline def modules(options: ModuleOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("modules")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    trait CssOptions extends StObject {
      
      var `import`: js.UndefOr[Boolean | ImportFilter] = js.undefined
      
      var modules: js.UndefOr[Boolean | String | ModuleOptions] = js.undefined
      
      var sourceMap: js.UndefOr[Boolean] = js.undefined
      
      var url: js.UndefOr[Boolean | UrlFilter] = js.undefined
    }
    object CssOptions {
      
      inline def apply(): CssOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CssOptions]
      }
      
      extension [Self <: CssOptions](x: Self) {
        
        inline def setImport(value: Boolean | ImportFilter): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
        
        inline def setImportFunction2(value: (/* parseImport */ ParseImportOptions, /* resourcePath */ String) => Boolean): Self = StObject.set(x, "import", js.Any.fromFunction2(value))
        
        inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
        
        inline def setModules(value: Boolean | String | ModuleOptions): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
        
        inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
        
        inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
        
        inline def setUrl(value: Boolean | UrlFilter): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlFunction2(value: (/* url */ String, /* resourcePath */ String) => Boolean): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait FileOptions extends StObject {
      
      var context: js.UndefOr[String] = js.undefined
      
      var emitFile: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String | NameFunction] = js.undefined
      
      var outputPath: js.UndefOr[String | PathFunction] = js.undefined
      
      var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
      
      var publicPath: js.UndefOr[String | PathFunction] = js.undefined
      
      var regExp: js.UndefOr[js.RegExp] = js.undefined
    }
    object FileOptions {
      
      inline def apply(): FileOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileOptions]
      }
      
      extension [Self <: FileOptions](x: Self) {
        
        inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setEmitFile(value: Boolean): Self = StObject.set(x, "emitFile", value.asInstanceOf[js.Any])
        
        inline def setEmitFileUndefined: Self = StObject.set(x, "emitFile", js.undefined)
        
        inline def setName(value: String | NameFunction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameFunction1(value: /* file */ String => Any): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOutputPath(value: String | PathFunction): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
        
        inline def setOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => Any): Self = StObject.set(x, "outputPath", js.Any.fromFunction3(value))
        
        inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
        
        inline def setPostTransformPublicPath(value: /* p */ String => String): Self = StObject.set(x, "postTransformPublicPath", js.Any.fromFunction1(value))
        
        inline def setPostTransformPublicPathUndefined: Self = StObject.set(x, "postTransformPublicPath", js.undefined)
        
        inline def setPublicPath(value: String | PathFunction): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
        
        inline def setPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => Any): Self = StObject.set(x, "publicPath", js.Any.fromFunction3(value))
        
        inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
        
        inline def setRegExp(value: js.RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
      }
    }
    
    type GetLocalIdent = js.Function4[
        /* context */ Any, 
        /* localIdentName */ Any, 
        /* localName */ Any, 
        /* options */ Any, 
        String
      ]
    
    type ImportFilter = js.Function2[/* parseImport */ ParseImportOptions, /* resourcePath */ String, Boolean]
    
    trait ModuleOptions extends StObject {
      
      var context: js.UndefOr[String] = js.undefined
      
      var getLocalIdent: js.UndefOr[GetLocalIdent] = js.undefined
      
      var hashPrefix: js.UndefOr[String] = js.undefined
      
      /**
        * 0 => no loaders (default);
        * 1 => postcss-loader;
        * 2 => postcss-loader, sass-loader
        */
      var importLoaders: js.UndefOr[`0` | `1` | `2`] = js.undefined
      
      var localIdentName: js.UndefOr[String] = js.undefined
      
      var localIdentRegExp: js.UndefOr[String | js.RegExp] = js.undefined
      
      var localsConvention: js.UndefOr[asIs | camelCase | camelCaseOnly | dashes | dashesOnly] = js.undefined
      
      var mode: js.UndefOr[String] = js.undefined
      
      var onlyLocals: js.UndefOr[Boolean] = js.undefined
    }
    object ModuleOptions {
      
      inline def apply(): ModuleOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModuleOptions]
      }
      
      extension [Self <: ModuleOptions](x: Self) {
        
        inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setGetLocalIdent(
          value: (/* context */ Any, /* localIdentName */ Any, /* localName */ Any, /* options */ Any) => String
        ): Self = StObject.set(x, "getLocalIdent", js.Any.fromFunction4(value))
        
        inline def setGetLocalIdentUndefined: Self = StObject.set(x, "getLocalIdent", js.undefined)
        
        inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
        
        inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
        
        inline def setImportLoaders(value: `0` | `1` | `2`): Self = StObject.set(x, "importLoaders", value.asInstanceOf[js.Any])
        
        inline def setImportLoadersUndefined: Self = StObject.set(x, "importLoaders", js.undefined)
        
        inline def setLocalIdentName(value: String): Self = StObject.set(x, "localIdentName", value.asInstanceOf[js.Any])
        
        inline def setLocalIdentNameUndefined: Self = StObject.set(x, "localIdentName", js.undefined)
        
        inline def setLocalIdentRegExp(value: String | js.RegExp): Self = StObject.set(x, "localIdentRegExp", value.asInstanceOf[js.Any])
        
        inline def setLocalIdentRegExpUndefined: Self = StObject.set(x, "localIdentRegExp", js.undefined)
        
        inline def setLocalsConvention(value: asIs | camelCase | camelCaseOnly | dashes | dashesOnly): Self = StObject.set(x, "localsConvention", value.asInstanceOf[js.Any])
        
        inline def setLocalsConventionUndefined: Self = StObject.set(x, "localsConvention", js.undefined)
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setOnlyLocals(value: Boolean): Self = StObject.set(x, "onlyLocals", value.asInstanceOf[js.Any])
        
        inline def setOnlyLocalsUndefined: Self = StObject.set(x, "onlyLocals", js.undefined)
      }
    }
    
    type NameFunction = js.Function1[/* file */ String, Any]
    
    trait ParseImportOptions extends StObject {
      
      var media: String
      
      var url: String
    }
    object ParseImportOptions {
      
      inline def apply(media: String, url: String): ParseImportOptions = {
        val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[ParseImportOptions]
      }
      
      extension [Self <: ParseImportOptions](x: Self) {
        
        inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    type PathFunction = js.Function3[/* url */ String, /* resourcePath */ String, /* context */ String, Any]
    
    type UrlFilter = js.Function2[/* url */ String, /* resourcePath */ String, Boolean]
    
    trait UrlOptions extends StObject {
      
      var fallback: js.UndefOr[String] = js.undefined
      
      var limit: js.UndefOr[Double | Boolean | String] = js.undefined
      
      var mimetype: js.UndefOr[String] = js.undefined
    }
    object UrlOptions {
      
      inline def apply(): UrlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UrlOptions]
      }
      
      extension [Self <: UrlOptions](x: Self) {
        
        inline def setFallback(value: String): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
        
        inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
        
        inline def setLimit(value: Double | Boolean | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
        
        inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      }
    }
  }
  
  inline def file(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[Any]
  inline def file(options: FileOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def url(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")().asInstanceOf[Any]
  inline def url(options: UrlOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
}
