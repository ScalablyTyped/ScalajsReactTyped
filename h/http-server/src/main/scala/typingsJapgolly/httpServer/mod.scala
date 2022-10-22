package typingsJapgolly.httpServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.connect.mod.HandleFunction
import typingsJapgolly.httpServer.httpServerBooleans.`true`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.httpsMod.ServerOptions
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): (Server[
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
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[(Server[
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
  ])]
  inline def createServer(options: Options): (Server[
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
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[(Server[
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
  ])]
  
  trait Options extends StObject {
    
    var autoIndex: js.UndefOr[Boolean] = js.undefined
    
    var before: js.UndefOr[js.Array[HandleFunction]] = js.undefined
    
    var cache: js.UndefOr[Double] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var cors: js.UndefOr[Boolean] = js.undefined
    
    var corsHeaders: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var https: js.UndefOr[
        ServerOptions[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var logFn: js.UndefOr[
        js.Function3[
          /* req */ IncomingMessage, 
          /* res */ ServerResponse[IncomingMessage], 
          /* err */ js.Error, 
          Unit
        ]
      ] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var robots: js.UndefOr[String | `true`] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var showDir: js.UndefOr[Boolean] = js.undefined
    
    var showDotfiles: js.UndefOr[Boolean] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoIndex(value: Boolean): Self = StObject.set(x, "autoIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoIndexUndefined: Self = StObject.set(x, "autoIndex", js.undefined)
      
      inline def setBefore(value: js.Array[HandleFunction]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: HandleFunction*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsHeaders(value: String): Self = StObject.set(x, "corsHeaders", value.asInstanceOf[js.Any])
      
      inline def setCorsHeadersUndefined: Self = StObject.set(x, "corsHeaders", js.undefined)
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setExt(value: Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
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
      
      inline def setLogFn(
        value: (/* req */ IncomingMessage, /* res */ ServerResponse[IncomingMessage], /* err */ js.Error) => Callback
      ): Self = StObject.set(x, "logFn", js.Any.fromFunction3((t0: /* req */ IncomingMessage, t1: /* res */ ServerResponse[IncomingMessage], t2: /* err */ js.Error) => (value(t0, t1, t2)).runNow()))
      
      inline def setLogFnUndefined: Self = StObject.set(x, "logFn", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRobots(value: String | `true`): Self = StObject.set(x, "robots", value.asInstanceOf[js.Any])
      
      inline def setRobotsUndefined: Self = StObject.set(x, "robots", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setShowDir(value: Boolean): Self = StObject.set(x, "showDir", value.asInstanceOf[js.Any])
      
      inline def setShowDirUndefined: Self = StObject.set(x, "showDir", js.undefined)
      
      inline def setShowDotfiles(value: Boolean): Self = StObject.set(x, "showDotfiles", value.asInstanceOf[js.Any])
      
      inline def setShowDotfilesUndefined: Self = StObject.set(x, "showDotfiles", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
