package typingsJapgolly.rollupPluginPostcss

import japgolly.scalajs.react.Callback
import typingsJapgolly.rollup.mod.Plugin
import typingsJapgolly.rollupPluginPostcss.anon.Ctx
import typingsJapgolly.rollupPluginPostcss.anon.ReadonlyPostCSSPluginConf
import typingsJapgolly.rollupPluginPostcss.anon.Readonlycodeanymapanycode
import typingsJapgolly.rollupPluginPostcss.anon.keyinsassstyluslessany
import typingsJapgolly.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin]
  inline def default(options: ReadonlyPostCSSPluginConf): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  @js.native
  trait FunctionType[T, U] extends StObject {
    
    def apply(args: T*): U = js.native
  }
  
  trait PostCSSPluginConf extends StObject {
    
    var autoModules: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[Boolean | Ctx] = js.undefined
    
    var exclude: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[1] */ js.Any
      ] = js.undefined
    
    var exec: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var extract: js.UndefOr[Boolean | String] = js.undefined
    
    var include: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[0] */ js.Any
      ] = js.undefined
    
    var inject: js.UndefOr[
        Boolean | (Record[String, Any]) | (js.Function2[/* cssVariableName */ String, /* id */ String, String])
      ] = js.undefined
    
    var loaders: js.UndefOr[js.Array[Any]] = js.undefined
    
    var minimize: js.UndefOr[Boolean | Any] = js.undefined
    
    var modules: js.UndefOr[Boolean | (Record[String, Any])] = js.undefined
    
    var name: js.UndefOr[js.Array[Any | js.Array[Any]]] = js.undefined
    
    var namedExports: js.UndefOr[Boolean | (js.Function1[/* id */ String, String])] = js.undefined
    
    var onExtract: js.UndefOr[typingsJapgolly.rollupPluginPostcss.mod.onExtract] = js.undefined
    
    var onImport: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var parser: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @default: false
      **/
    var sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
    
    var stringifier: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    var syntax: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var use: js.UndefOr[js.Array[String] | keyinsassstyluslessany] = js.undefined
  }
  object PostCSSPluginConf {
    
    inline def apply(): PostCSSPluginConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostCSSPluginConf]
    }
    
    extension [Self <: PostCSSPluginConf](x: Self) {
      
      inline def setAutoModules(value: Boolean): Self = StObject.set(x, "autoModules", value.asInstanceOf[js.Any])
      
      inline def setAutoModulesUndefined: Self = StObject.set(x, "autoModules", js.undefined)
      
      inline def setConfig(value: Boolean | Ctx): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExclude(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[1] */ js.Any
      ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setExtract(value: Boolean | String): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setInclude(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[0] */ js.Any
      ): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setInject(
        value: Boolean | (Record[String, Any]) | (js.Function2[/* cssVariableName */ String, /* id */ String, String])
      ): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectFunction2(value: (/* cssVariableName */ String, /* id */ String) => String): Self = StObject.set(x, "inject", js.Any.fromFunction2(value))
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setLoaders(value: js.Array[Any]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      inline def setLoadersUndefined: Self = StObject.set(x, "loaders", js.undefined)
      
      inline def setLoadersVarargs(value: Any*): Self = StObject.set(x, "loaders", js.Array(value*))
      
      inline def setMinimize(value: Boolean | Any): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      inline def setModules(value: Boolean | (Record[String, Any])): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setName(value: js.Array[Any | js.Array[Any]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNameVarargs(value: (Any | js.Array[Any])*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setNamedExports(value: Boolean | (js.Function1[/* id */ String, String])): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsFunction1(value: /* id */ String => String): Self = StObject.set(x, "namedExports", js.Any.fromFunction1(value))
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setOnExtract(value: /* asset */ Readonlycodeanymapanycode => Boolean): Self = StObject.set(x, "onExtract", js.Any.fromFunction1(value))
      
      inline def setOnExtractUndefined: Self = StObject.set(x, "onExtract", js.undefined)
      
      inline def setOnImport(value: /* id */ String => Callback): Self = StObject.set(x, "onImport", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setOnImportUndefined: Self = StObject.set(x, "onImport", js.undefined)
      
      inline def setParser(value: String | (FunctionType[Any, Any])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: js.Array[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Any*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSourceMap(value: Boolean | `inline`): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStringifier(value: String | (FunctionType[Any, Any])): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | (FunctionType[Any, Any])): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setUse(value: js.Array[String] | keyinsassstyluslessany): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
      
      inline def setUseVarargs(value: String*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
  
  type onExtract = js.Function1[/* asset */ Readonlycodeanymapanycode, Boolean]
}
