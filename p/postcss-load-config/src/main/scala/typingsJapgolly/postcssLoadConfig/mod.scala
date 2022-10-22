package typingsJapgolly.postcssLoadConfig

import japgolly.scalajs.react.Callback
import typingsJapgolly.lilconfig.mod.Options
import typingsJapgolly.postcss.anon.PickProcessOptionsmapfrom
import typingsJapgolly.postcss.anon.ToString
import typingsJapgolly.postcss.libNodeMod.AnyNode
import typingsJapgolly.postcss.libRootMod.default
import typingsJapgolly.postcss.mod.Builder
import typingsJapgolly.postcss.mod.Parser
import typingsJapgolly.postcss.mod.Plugin
import typingsJapgolly.postcss.mod.ProcessOptions
import typingsJapgolly.postcss.mod.SourceMapOptions
import typingsJapgolly.postcss.mod.Stringifier
import typingsJapgolly.postcss.mod.Syntax
import typingsJapgolly.postcss.mod.Transformer
import typingsJapgolly.postcssLoadConfig.postcssLoadConfigBooleans.`false`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: Unit, path: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: Unit, path: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: Unit, path: Unit, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: ConfigContext): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: ConfigContext, path: String): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: ConfigContext, path: String, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  inline def apply(ctx: ConfigContext, path: Unit, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(ctx.asInstanceOf[js.Any], path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("postcss-load-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[String | `false`] = js.undefined
    
    var parser: js.UndefOr[
        String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default]) | `false`
      ] = js.undefined
    
    var plugins: js.UndefOr[(js.Array[ConfigPlugin | `false`]) | (Record[String, js.Object | `false`])] = js.undefined
    
    var stringifier: js.UndefOr[String | Syntax | Stringifier | `false`] = js.undefined
    
    var syntax: js.UndefOr[String | Syntax | `false`] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: String | `false`): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setParser(
        value: String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default]) | `false`
      ): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction2(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => default | typingsJapgolly.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: (js.Array[ConfigPlugin | `false`]) | (Record[String, js.Object | `false`])): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (ConfigPlugin | `false`)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setStringifier(value: String | Syntax | Stringifier | `false`): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Callback): Self = StObject.set(x, "stringifier", js.Any.fromFunction2((t0: /* node */ AnyNode, t1: /* builder */ Builder) => (value(t0, t1)).runNow()))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | Syntax | `false`): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Inlined postcss-load-config.postcss-load-config.Context & postcss-load-config.postcss-load-config.ProcessOptionsPreload & postcss-load-config.postcss-load-config.RemainingProcessOptions */
  trait ConfigContext extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var from: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
    
    var parser: js.UndefOr[
        String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default])
      ] = js.undefined
    
    var stringifier: js.UndefOr[String | Syntax | Stringifier] = js.undefined
    
    var syntax: js.UndefOr[String | Syntax] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object ConfigContext {
    
    inline def apply(): ConfigContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigContext]
    }
    
    extension [Self <: ConfigContext](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setParser(value: String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction2(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => default | typingsJapgolly.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setStringifier(value: String | Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Callback): Self = StObject.set(x, "stringifier", js.Any.fromFunction2((t0: /* node */ AnyNode, t1: /* builder */ Builder) => (value(t0, t1)).runNow()))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type ConfigFn = js.Function1[/* ctx */ ConfigContext, Config | js.Promise[Config]]
  
  type ConfigPlugin = Transformer | Plugin | typingsJapgolly.postcss.libProcessorMod.default
  
  trait Context extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  trait ProcessOptionsPreload extends StObject {
    
    var parser: js.UndefOr[
        String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default])
      ] = js.undefined
    
    var stringifier: js.UndefOr[String | Syntax | Stringifier] = js.undefined
    
    var syntax: js.UndefOr[String | Syntax] = js.undefined
  }
  object ProcessOptionsPreload {
    
    inline def apply(): ProcessOptionsPreload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProcessOptionsPreload]
    }
    
    extension [Self <: ProcessOptionsPreload](x: Self) {
      
      inline def setParser(value: String | Syntax | (Parser[default | typingsJapgolly.postcss.libDocumentMod.default])): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction2(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => default | typingsJapgolly.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setStringifier(value: String | Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Callback): Self = StObject.set(x, "stringifier", js.Any.fromFunction2((t0: /* node */ AnyNode, t1: /* builder */ Builder) => (value(t0, t1)).runNow()))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  /* Inlined std.Pick<postcss.postcss.ProcessOptions, std.Exclude<keyof postcss.postcss.ProcessOptions, keyof postcss-load-config.postcss-load-config.ProcessOptionsPreload>> */
  trait RemainingProcessOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var map: js.UndefOr[SourceMapOptions | Boolean] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object RemainingProcessOptions {
    
    inline def apply(): RemainingProcessOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemainingProcessOptions]
    }
    
    extension [Self <: RemainingProcessOptions](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setMap(value: SourceMapOptions | Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var file: String
    
    var options: ProcessOptions
    
    var plugins: js.Array[ResultPlugin]
  }
  object Result {
    
    inline def apply(file: String, options: ProcessOptions, plugins: js.Array[ResultPlugin]): Result = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ProcessOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: js.Array[ResultPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: ResultPlugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  type ResultPlugin = Plugin | Transformer | typingsJapgolly.postcss.libProcessorMod.default
}
