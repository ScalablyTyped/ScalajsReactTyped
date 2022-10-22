package typingsJapgolly.webpackServe

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpsMod.ServerOptions
import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpackDevMiddleware.mod.ServerResponse
import typingsJapgolly.webpackServe.anon.Compiler
import typingsJapgolly.webpackServe.anon.CompilerStats
import typingsJapgolly.webpackServe.anon.Stats
import typingsJapgolly.webpackServe.webpackServeStrings.`build-finished`
import typingsJapgolly.webpackServe.webpackServeStrings.`build-started`
import typingsJapgolly.webpackServe.webpackServeStrings.`compiler-error`
import typingsJapgolly.webpackServe.webpackServeStrings.`compiler-warning`
import typingsJapgolly.webpackServe.webpackServeStrings.debug
import typingsJapgolly.webpackServe.webpackServeStrings.error
import typingsJapgolly.webpackServe.webpackServeStrings.http
import typingsJapgolly.webpackServe.webpackServeStrings.https
import typingsJapgolly.webpackServe.webpackServeStrings.info
import typingsJapgolly.webpackServe.webpackServeStrings.listening
import typingsJapgolly.webpackServe.webpackServeStrings.silent
import typingsJapgolly.webpackServe.webpackServeStrings.trace
import typingsJapgolly.webpackServe.webpackServeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(argv: js.Object, options: Options): js.Promise[Result] = (^.asInstanceOf[js.Dynamic].apply(argv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result]]
  
  @JSImport("webpack-serve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EventMap extends StObject {
    
    var `build-finished`: Stats
    
    var `build-started`: Compiler
    
    var `compiler-error`: CompilerStats
    
    var `compiler-warning`: CompilerStats
    
    var listening: typingsJapgolly.webpackServe.anon.Options
  }
  object EventMap {
    
    inline def apply(
      `build-finished`: Stats,
      `build-started`: Compiler,
      `compiler-error`: CompilerStats,
      `compiler-warning`: CompilerStats,
      listening: typingsJapgolly.webpackServe.anon.Options
    ): EventMap = {
      val __obj = js.Dynamic.literal(listening = listening.asInstanceOf[js.Any])
      __obj.updateDynamic("build-finished")(`build-finished`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-started")(`build-started`.asInstanceOf[js.Any])
      __obj.updateDynamic("compiler-error")(`compiler-error`.asInstanceOf[js.Any])
      __obj.updateDynamic("compiler-warning")(`compiler-warning`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    extension [Self <: EventMap](x: Self) {
      
      inline def `setBuild-finished`(value: Stats): Self = StObject.set(x, "build-finished", value.asInstanceOf[js.Any])
      
      inline def `setBuild-started`(value: Compiler): Self = StObject.set(x, "build-started", value.asInstanceOf[js.Any])
      
      inline def `setCompiler-error`(value: CompilerStats): Self = StObject.set(x, "compiler-error", value.asInstanceOf[js.Any])
      
      inline def `setCompiler-warning`(value: CompilerStats): Self = StObject.set(x, "compiler-warning", value.asInstanceOf[js.Any])
      
      inline def setListening(value: typingsJapgolly.webpackServe.anon.Options): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InitializedKoa
    extends typingsJapgolly.koa.mod.^[DefaultState, DefaultContext] {
    
    var server: Server = js.native
    
    def stop(): Unit = js.native
  }
  
  trait InitializedOptions
    extends StObject
       with Options {
    
    var protocol: http | https
  }
  object InitializedOptions {
    
    inline def apply(protocol: http | https): InitializedOptions = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedOptions]
    }
    
    extension [Self <: InitializedOptions](x: Self) {
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Middleware extends StObject {
    
    /** Function to call to add koa-static */
    def content(): Unit
    
    /** Function to call to add the webpack-dev-middleware */
    def webpack(): Unit
  }
  object Middleware {
    
    inline def apply(content: Callback, webpack: Callback): Middleware = {
      val __obj = js.Dynamic.literal(content = content.toJsFn, webpack = webpack.toJsFn)
      __obj.asInstanceOf[Middleware]
    }
    
    extension [Self <: Middleware](x: Self) {
      
      inline def setContent(value: Callback): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setWebpack(value: Callback): Self = StObject.set(x, "webpack", value.toJsFn)
    }
  }
  
  /* Inlined {[ K in keyof webpack-serve.webpack-serve.EventMap ]:? (args : webpack-serve.webpack-serve.EventMap[K]): void} */
  trait OnOptions extends StObject {
    
    var `build-finished`: js.UndefOr[js.Function1[/* args */ Stats, Unit]] = js.undefined
    
    var `build-started`: js.UndefOr[js.Function1[/* args */ Compiler, Unit]] = js.undefined
    
    var `compiler-error`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.undefined
    
    var `compiler-warning`: js.UndefOr[js.Function1[/* args */ CompilerStats, Unit]] = js.undefined
    
    var listening: js.UndefOr[js.Function1[/* args */ typingsJapgolly.webpackServe.anon.Options, Unit]] = js.undefined
  }
  object OnOptions {
    
    inline def apply(): OnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnOptions]
    }
    
    extension [Self <: OnOptions](x: Self) {
      
      inline def `setBuild-finished`(value: /* args */ Stats => Callback): Self = StObject.set(x, "build-finished", js.Any.fromFunction1((t0: /* args */ Stats) => value(t0).runNow()))
      
      inline def `setBuild-finishedUndefined`: Self = StObject.set(x, "build-finished", js.undefined)
      
      inline def `setBuild-started`(value: /* args */ Compiler => Callback): Self = StObject.set(x, "build-started", js.Any.fromFunction1((t0: /* args */ Compiler) => value(t0).runNow()))
      
      inline def `setBuild-startedUndefined`: Self = StObject.set(x, "build-started", js.undefined)
      
      inline def `setCompiler-error`(value: /* args */ CompilerStats => Callback): Self = StObject.set(x, "compiler-error", js.Any.fromFunction1((t0: /* args */ CompilerStats) => value(t0).runNow()))
      
      inline def `setCompiler-errorUndefined`: Self = StObject.set(x, "compiler-error", js.undefined)
      
      inline def `setCompiler-warning`(value: /* args */ CompilerStats => Callback): Self = StObject.set(x, "compiler-warning", js.Any.fromFunction1((t0: /* args */ CompilerStats) => value(t0).runNow()))
      
      inline def `setCompiler-warningUndefined`: Self = StObject.set(x, "compiler-warning", js.undefined)
      
      inline def setListening(value: /* args */ typingsJapgolly.webpackServe.anon.Options => Callback): Self = StObject.set(x, "listening", js.Any.fromFunction1((t0: /* args */ typingsJapgolly.webpackServe.anon.Options) => value(t0).runNow()))
      
      inline def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
    }
  }
  
  trait OpenOptions extends StObject {
    
    /** Name of the browser to open */
    var app: js.UndefOr[String] = js.undefined
    
    /** Path on the server to open */
    var path: js.UndefOr[String] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /** Addon to webpack-serve that allows access to the Koa server instance */
    var add: js.UndefOr[
        js.Function3[/* app */ InitializedKoa, /* middleware */ Middleware, /* options */ this.type, Unit]
      ] = js.undefined
    
    /** Copy the server URL to the clipboard when the server is started */
    var clipboard: js.UndefOr[Boolean] = js.undefined
    
    /** Custom instance of a webpack compiler */
    var compiler: js.UndefOr[typingsJapgolly.webpack.mod.Compiler] = js.undefined
    
    /** Webpack configuration for creating a new webpack compiler instance */
    var config: js.UndefOr[Configuration] = js.undefined
    
    /** A path or array of paths where content will be served from */
    var content: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** Options for webpack-dev-middleware */
    var devMiddleware: js.UndefOr[
        typingsJapgolly.webpackDevMiddleware.mod.Options[IncomingMessage, ServerResponse]
      ] = js.undefined
    
    /** The host the server will listen on */
    var host: js.UndefOr[String] = js.undefined
    
    /** Options for webpack-hot-client */
    var hotClient: js.UndefOr[typingsJapgolly.webpackHotClient.mod.Options | Boolean] = js.undefined
    
    /** Enable HTTP2 support */
    var http2: js.UndefOr[Boolean] = js.undefined
    
    /** Configuration object for the server to use HTTPS */
    var https: js.UndefOr[
        ServerOptions[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    /** Level of information for webpack-serve to output */
    var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
    
    /** Prepend timestamp to each log line */
    var logTime: js.UndefOr[Boolean] = js.undefined
    
    /** Object of subscribers to webpack-serve bus events */
    var on: js.UndefOr[OnOptions] = js.undefined
    
    /** Open the browser when started */
    var open: js.UndefOr[OpenOptions | Boolean] = js.undefined
    
    /** Port that the server listens on */
    var port: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdd(value: (/* app */ InitializedKoa, /* middleware */ Middleware, Options) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction3((t0: /* app */ InitializedKoa, t1: /* middleware */ Middleware, t2: Options) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setClipboard(value: Boolean): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      inline def setCompiler(value: typingsJapgolly.webpack.mod.Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setConfig(value: Configuration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDevMiddleware(value: typingsJapgolly.webpackDevMiddleware.mod.Options[IncomingMessage, ServerResponse]): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
      
      inline def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHotClient(value: typingsJapgolly.webpackHotClient.mod.Options | Boolean): Self = StObject.set(x, "hotClient", value.asInstanceOf[js.Any])
      
      inline def setHotClientUndefined: Self = StObject.set(x, "hotClient", js.undefined)
      
      inline def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      inline def setHttps(
        value: ServerOptions[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLogLevel(value: trace | debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      inline def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      inline def setOn(value: OnOptions): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOpen(value: OpenOptions | Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /** An instance of a Koa application, extended with a server property, and stop method, which is used to programatically stop the server */
    var app: InitializedKoa = js.native
    
    @JSName("on")
    def on_buildfinished(`type`: `build-finished`, callback: js.Function1[/* args */ Stats, Unit]): Unit = js.native
    /** A function which binds a serve event-name to a function */
    @JSName("on")
    def on_buildstarted(`type`: `build-started`, callback: js.Function1[/* args */ Compiler, Unit]): Unit = js.native
    @JSName("on")
    def on_compilererror(`type`: `compiler-error`, callback: js.Function1[/* args */ CompilerStats, Unit]): Unit = js.native
    @JSName("on")
    def on_compilerwarning(`type`: `compiler-warning`, callback: js.Function1[/* args */ CompilerStats, Unit]): Unit = js.native
    @JSName("on")
    def on_listening(
      `type`: listening,
      callback: js.Function1[/* args */ typingsJapgolly.webpackServe.anon.Options, Unit]
    ): Unit = js.native
    
    /** Access to a frozen copy of the internal options object used by the module. */
    var options: InitializedOptions = js.native
  }
  
  /* augmented module */
  object webpackAugmentingMod {
    
    trait Configuration extends StObject {
      
      var serve: js.UndefOr[Options] = js.undefined
    }
    object Configuration {
      
      inline def apply(): typingsJapgolly.webpackServe.mod.webpackAugmentingMod.Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.webpackServe.mod.webpackAugmentingMod.Configuration]
      }
      
      extension [Self <: typingsJapgolly.webpackServe.mod.webpackAugmentingMod.Configuration](x: Self) {
        
        inline def setServe(value: Options): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
        
        inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      }
    }
  }
}
