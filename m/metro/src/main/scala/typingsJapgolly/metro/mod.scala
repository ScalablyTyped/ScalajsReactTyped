package typingsJapgolly.metro

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.metro.anon.Errorcodestringundefined
import typingsJapgolly.metro.assetMod.AssetData
import typingsJapgolly.metro.sharedTypesMod.BundleOptions
import typingsJapgolly.metro.srcServerMod.DefaultBundleOptions
import typingsJapgolly.metro.srcServerMod.DefaultGraphOptions
import typingsJapgolly.metro.srcServerMod.ServerOptions
import typingsJapgolly.metroConfig.configTypesMod.ConfigT
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.RequestListener
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("metro", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.metro.serverMod.default {
    def this(config: ConfigT) = this()
    def this(config: ConfigT, options: ServerOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("metro", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro", "default.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: DefaultBundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: DefaultBundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro", "default.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @since v0.1.17
    */
  @JSImport("metro", "HttpServer")
  @js.native
  open class HttpServer[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[IncomingMessage]
  ] */] ()
    extends typingsJapgolly.node.httpMod.Server[Request, Response] {
    def this(options: typingsJapgolly.node.httpMod.ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(
      options: typingsJapgolly.node.httpMod.ServerOptions[Request, Response],
      requestListener: RequestListener[Request, Response]
    ) = this()
  }
  
  /**
    * See `http.Server` for more information.
    * @since v0.3.4
    */
  @JSImport("metro", "HttpsServer")
  @js.native
  open class HttpsServer[Request /* <: Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
  ] */] ()
    extends typingsJapgolly.node.httpsMod.Server[Request, Response] {
    def this(options: typingsJapgolly.node.httpsMod.ServerOptions[Request, Response]) = this()
    def this(requestListener: RequestListener[Request, Response]) = this()
    def this(
      options: typingsJapgolly.node.httpsMod.ServerOptions[Request, Response],
      requestListener: RequestListener[Request, Response]
    ) = this()
  }
  
  @JSImport("metro", "Server")
  @js.native
  open class Server protected ()
    extends StObject
       with typingsJapgolly.metro.srcServerMod.Server {
    def this(config: ConfigT) = this()
    def this(config: ConfigT, options: ServerOptions) = this()
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def getAssets(options: BundleOptions): js.Promise[js.Array[AssetData]] = js.native
  }
  /* static members */
  object Server {
    
    @JSImport("metro", "Server")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro", "Server.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: DefaultBundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: DefaultBundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro", "Server.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
  
  inline def runServer(config: ConfigT, options: RunServerOptions): js.Promise[
    (typingsJapgolly.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runServer")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (typingsJapgolly.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ]]
  
  trait RunServerOptions extends StObject {
    
    var hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Errorcodestringundefined, Unit]] = js.undefined
    
    var onReady: js.UndefOr[
        js.Function1[
          /* server */ (typingsJapgolly.node.httpMod.Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) | (typingsJapgolly.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ]), 
          Unit
        ]
      ] = js.undefined
    
    var runInspectorProxy: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secureCert: js.UndefOr[String] = js.undefined
    
    /** @deprecated since version 0.61 */
    var secureKey: js.UndefOr[String] = js.undefined
    
    var secureServerOptions: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object RunServerOptions {
    
    inline def apply(): RunServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunServerOptions]
    }
    
    extension [Self <: RunServerOptions](x: Self) {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setOnError(value: /* error */ Errorcodestringundefined => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ Errorcodestringundefined) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReady(
        value: /* server */ (typingsJapgolly.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typingsJapgolly.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ]) => Callback
      ): Self = StObject.set(x, "onReady", js.Any.fromFunction1((t0: /* server */ (typingsJapgolly.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typingsJapgolly.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ])) => value(t0).runNow()))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
      
      inline def setRunInspectorProxyUndefined: Self = StObject.set(x, "runInspectorProxy", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureCert(value: String): Self = StObject.set(x, "secureCert", value.asInstanceOf[js.Any])
      
      inline def setSecureCertUndefined: Self = StObject.set(x, "secureCert", js.undefined)
      
      inline def setSecureKey(value: String): Self = StObject.set(x, "secureKey", value.asInstanceOf[js.Any])
      
      inline def setSecureKeyUndefined: Self = StObject.set(x, "secureKey", js.undefined)
      
      inline def setSecureServerOptions(value: Record[String, Any]): Self = StObject.set(x, "secureServerOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureServerOptionsUndefined: Self = StObject.set(x, "secureServerOptions", js.undefined)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
}
