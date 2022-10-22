package typingsJapgolly.rollupPluginPostcss

import japgolly.scalajs.react.Callback
import typingsJapgolly.rollupPluginPostcss.mod.FunctionType
import typingsJapgolly.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ctx extends StObject {
    
    var ctx: Any
    
    var path: String
  }
  object Ctx {
    
    inline def apply(ctx: Any, path: String): Ctx = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    extension [Self <: Ctx](x: Self) {
      
      inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<rollup-plugin-postcss.rollup-plugin-postcss.PostCSSPluginConf> */
  trait ReadonlyPostCSSPluginConf extends StObject {
    
    val autoModules: js.UndefOr[Boolean] = js.undefined
    
    val config: js.UndefOr[Boolean | Ctx] = js.undefined
    
    val exclude: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[1] */ js.Any
      ] = js.undefined
    
    val exec: js.UndefOr[Boolean] = js.undefined
    
    val extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    val extract: js.UndefOr[Boolean | String] = js.undefined
    
    val include: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<rollup-pluginutils.rollup-pluginutils.CreateFilter>[0] */ js.Any
      ] = js.undefined
    
    val inject: js.UndefOr[
        Boolean | (Record[String, Any]) | (js.Function2[/* cssVariableName */ String, /* id */ String, String])
      ] = js.undefined
    
    val loaders: js.UndefOr[js.Array[Any]] = js.undefined
    
    val minimize: js.UndefOr[Boolean | Any] = js.undefined
    
    val modules: js.UndefOr[Boolean | (Record[String, Any])] = js.undefined
    
    val name: js.UndefOr[js.Array[Any | js.Array[Any]]] = js.undefined
    
    val namedExports: js.UndefOr[Boolean | (js.Function1[/* id */ String, String])] = js.undefined
    
    val onExtract: js.UndefOr[typingsJapgolly.rollupPluginPostcss.mod.onExtract] = js.undefined
    
    val onImport: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    val parser: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    val plugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    val sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
    
    val stringifier: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    val syntax: js.UndefOr[String | (FunctionType[Any, Any])] = js.undefined
    
    val to: js.UndefOr[String] = js.undefined
    
    val use: js.UndefOr[js.Array[String] | keyinsassstyluslessany] = js.undefined
  }
  object ReadonlyPostCSSPluginConf {
    
    inline def apply(): ReadonlyPostCSSPluginConf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPostCSSPluginConf]
    }
    
    extension [Self <: ReadonlyPostCSSPluginConf](x: Self) {
      
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
  
  /* Inlined std.Readonly<{  code :any,   map :any,   codeFileName :string,   mapFileName :string}> */
  trait Readonlycodeanymapanycode extends StObject {
    
    val code: Any
    
    val codeFileName: String
    
    val map: Any
    
    val mapFileName: String
  }
  object Readonlycodeanymapanycode {
    
    inline def apply(code: Any, codeFileName: String, map: Any, mapFileName: String): Readonlycodeanymapanycode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], codeFileName = codeFileName.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mapFileName = mapFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlycodeanymapanycode]
    }
    
    extension [Self <: Readonlycodeanymapanycode](x: Self) {
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeFileName(value: String): Self = StObject.set(x, "codeFileName", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapFileName(value: String): Self = StObject.set(x, "mapFileName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in 'sass' | 'stylus' | 'less' ]: any} */
  trait keyinsassstyluslessany extends StObject {
    
    var less: Any
    
    var sass: Any
    
    var stylus: Any
  }
  object keyinsassstyluslessany {
    
    inline def apply(less: Any, sass: Any, stylus: Any): keyinsassstyluslessany = {
      val __obj = js.Dynamic.literal(less = less.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], stylus = stylus.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinsassstyluslessany]
    }
    
    extension [Self <: keyinsassstyluslessany](x: Self) {
      
      inline def setLess(value: Any): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      inline def setSass(value: Any): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
      
      inline def setStylus(value: Any): Self = StObject.set(x, "stylus", value.asInstanceOf[js.Any])
    }
  }
}
