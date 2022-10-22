package typingsJapgolly.msportalfxMock

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.expressServeStaticCore.mod.Express
import typingsJapgolly.node.httpsMod.Server
import typingsJapgolly.node.nodeColonhttpMod.IncomingMessage
import typingsJapgolly.node.nodeColonhttpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.q.mod.Promise
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcHttpsProxyHttpsProxyMod {
  
  object HttpsProxy {
    
    @JSImport("msportalfx-mock/lib/src/HttpsProxy/httpsProxy", "HttpsProxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a local server running express.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param options The local https server options.
      * @param defaultHandler The default handler for incoming requests. The default handler return 404.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServer(sslOptions: Any, targetHost: String, options: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServer(
      sslOptions: Any,
      targetHost: String,
      options: ServerOptions,
      defaultHandler: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], defaultHandler.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * Creates a local server running express with a proxy to allow forwarding call to a target host.
      *
      * @param sslOptions The ssl options for the local https server.
      * @param targetHost The target host for the proxy.
      * @param serverOptions The local https server options.
      * @param proxOptions The proxy options.
      * @return A promise that when resolved will return the proxy server.
      */
    inline def createServerWithProxy(sslOptions: Any, targetHost: String, serverOptions: ServerOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    inline def createServerWithProxy(sslOptions: Any, targetHost: String, serverOptions: ServerOptions, proxOptions: ProxyOptions): Promise[ProxyServer] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerWithProxy")(sslOptions.asInstanceOf[js.Any], targetHost.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], proxOptions.asInstanceOf[js.Any])).asInstanceOf[Promise[ProxyServer]]
    
    /**
      * The local express server interface.
      */
    @js.native
    trait ExpressServer extends Express {
      
      /**
        * The instance of http proxy.
        */
      var proxy: js.UndefOr[Any] = js.native
    }
    
    /**
      * The proxy options.
      */
    trait ProxyOptions extends StObject {
      
      /**
        * NOTE: if not defined default will be used.
        */
      var closeCallback: js.UndefOr[js.Function3[/* res */ Any, /* socket */ Any, /* head */ Any, js.Object]] = js.undefined
      
      /**
        * NOTE: if not defined default will be used.
        */
      var errorCallback: js.UndefOr[js.Function3[/* err */ Any, /* req */ Any, /* res */ Any, js.Object]] = js.undefined
      
      /**
        * NOTE: if not defined default will be used.
        */
      var openCallback: js.UndefOr[js.Function1[/* proxySocket */ Any, js.Object]] = js.undefined
      
      /**
        * NOTE: if not defined default will be used.
        */
      var responseCallback: js.UndefOr[js.Function3[/* proxyRes */ Any, /* req */ Any, /* res */ Any, js.Object]] = js.undefined
    }
    object ProxyOptions {
      
      inline def apply(): ProxyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProxyOptions]
      }
      
      extension [Self <: ProxyOptions](x: Self) {
        
        inline def setCloseCallback(value: (/* res */ Any, /* socket */ Any, /* head */ Any) => js.Object): Self = StObject.set(x, "closeCallback", js.Any.fromFunction3(value))
        
        inline def setCloseCallbackUndefined: Self = StObject.set(x, "closeCallback", js.undefined)
        
        inline def setErrorCallback(value: (/* err */ Any, /* req */ Any, /* res */ Any) => js.Object): Self = StObject.set(x, "errorCallback", js.Any.fromFunction3(value))
        
        inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
        
        inline def setOpenCallback(value: /* proxySocket */ Any => js.Object): Self = StObject.set(x, "openCallback", js.Any.fromFunction1(value))
        
        inline def setOpenCallbackUndefined: Self = StObject.set(x, "openCallback", js.undefined)
        
        inline def setResponseCallback(value: (/* proxyRes */ Any, /* req */ Any, /* res */ Any) => js.Object): Self = StObject.set(x, "responseCallback", js.Any.fromFunction3(value))
        
        inline def setResponseCallbackUndefined: Self = StObject.set(x, "responseCallback", js.undefined)
      }
    }
    
    /**
      * The instance https proxy server
      */
    trait ProxyServer extends StObject {
      
      /**
        * The proxy server instance.
        */
      def app(): Application
      /**
        * The proxy server instance.
        */
      @JSName("app")
      var app_Original: ExpressServer
      
      /**
        * Sets the default routes, should be called after all other routes are setup.
        */
      def initializeDefaultRoutes(): Unit
      
      /**
        * The local address for the portal patch file.
        */
      var patchAddress: String
      
      /**
        * The instance of http proxy.
        */
      var proxy: js.UndefOr[Any] = js.undefined
      
      /**
        * The local server.
        */
      var server: Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
            ]
          ]
    }
    object ProxyServer {
      
      inline def apply(
        app: ExpressServer,
        initializeDefaultRoutes: Callback,
        patchAddress: String,
        server: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
              ]
            ]
      ): ProxyServer = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], initializeDefaultRoutes = initializeDefaultRoutes.toJsFn, patchAddress = patchAddress.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProxyServer]
      }
      
      extension [Self <: ProxyServer](x: Self) {
        
        inline def setApp(value: ExpressServer): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        inline def setInitializeDefaultRoutes(value: Callback): Self = StObject.set(x, "initializeDefaultRoutes", value.toJsFn)
        
        inline def setPatchAddress(value: String): Self = StObject.set(x, "patchAddress", value.asInstanceOf[js.Any])
        
        inline def setProxy(value: Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
        
        inline def setServer(
          value: Server[
                  Instantiable1[/* socket */ Socket, IncomingMessage], 
                  Instantiable1[
                    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                    ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]
                  ]
                ]
        ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The local server options.
      */
    trait ServerOptions extends StObject {
      
      /**
        * NOTE: if not defined default will be used.
        */
      var serverCallback: js.UndefOr[js.Function0[js.Object]] = js.undefined
      
      /**
        * The local server port.
        */
      var serverPort: Double
    }
    object ServerOptions {
      
      inline def apply(serverPort: Double): ServerOptions = {
        val __obj = js.Dynamic.literal(serverPort = serverPort.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerOptions]
      }
      
      extension [Self <: ServerOptions](x: Self) {
        
        inline def setServerCallback(value: CallbackTo[js.Object]): Self = StObject.set(x, "serverCallback", value.toJsFn)
        
        inline def setServerCallbackUndefined: Self = StObject.set(x, "serverCallback", js.undefined)
        
        inline def setServerPort(value: Double): Self = StObject.set(x, "serverPort", value.asInstanceOf[js.Any])
      }
    }
  }
}
