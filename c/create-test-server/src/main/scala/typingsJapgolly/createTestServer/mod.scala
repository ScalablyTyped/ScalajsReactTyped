package typingsJapgolly.createTestServer

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsText
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.createTestServer.anon.Get
import typingsJapgolly.createTestServer.createTestServerBooleans.`false`
import typingsJapgolly.createTestServer.createTestServerStrings.listen
import typingsJapgolly.express.mod.Express
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a Promise which resolves to an (already listening) server.
    */
  inline def apply(): js.Promise[Server] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Server]]
  inline def apply(options: Options): js.Promise[Server] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Server]]
  
  @JSImport("create-test-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Body parser options object to be passed to `body-parser` methods.
      *
      * If set to `false` then all body parsing middleware will be disabled.
      */
    var bodyParser: js.UndefOr[`false` | (OptionsJson & OptionsText & OptionsUrlencoded)] = js.undefined
    
    /**
      * SSL certificate options to be passed to {@link create-cert#createCert | createCert()}.
      */
    var certificate: js.UndefOr[String | typingsJapgolly.createCert.mod.Options] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBodyParser(value: `false` | (OptionsJson & OptionsText & OptionsUrlencoded)): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      inline def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      inline def setCertificate(value: String | typingsJapgolly.createCert.mod.Options): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    }
  }
  
  type Server = TestServer & (Omit[Express, listen]) & Get
  
  trait TestServer extends StObject {
    
    /**
      * The CA certificate to validate the server certificate against.
      */
    var caCert: String
    
    /**
      * Returns a Promise that resolves when both the HTTP and HTTPS servers have stopped listening.
      *
      * Once the servers have stopped listening, `server.url` and `server.sslUrl` will be set to undefined.
      */
    def close(): js.Promise[Unit]
    
    /**
      * The underlying HTTP server instance.
      */
    var http: typingsJapgolly.node.httpMod.Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ]
    
    /**
      * The underlying HTTPS server instance.
      */
    var https: typingsJapgolly.node.httpsMod.Server[
        Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
        ]
      ]
    
    /**
      * Returns a Promise that resolves when both the HTTP and HTTPS servers are listening.
      *
      * Once the servers are listening, `server.url` and `server.sslUrl` will be updated.
      *
      * Please note, this function doesn't take a port argument, it uses a new randomised port each time.
      * Also, you don't need to manually call this after creating a server, it will start listening automatically.
      */
    def listen(): js.Promise[Unit]
    
    /**
      * The port number you can reach the HTTP server on.
      *
      * e.g: `5486`
      *
      * `undefined` while the server is not listening.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * The port number you can reach the HTTPS server on.
      *
      * e.g: `5487`
      *
      * `undefined` while the server is not listening.
      */
    var sslPort: js.UndefOr[Double] = js.undefined
    
    /**
      * The url you can reach the HTTPS server on.
      *
      * e.g: `'https://localhost:5487'`
      *
      * `undefined` while the server is not listening.
      */
    var sslUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The url you can reach the HTTP server on.
      *
      * e.g: `'http://localhost:5486'`
      *
      * `undefined` while the server is not listening.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object TestServer {
    
    inline def apply(
      caCert: String,
      close: CallbackTo[js.Promise[Unit]],
      http: typingsJapgolly.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      https: typingsJapgolly.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ],
      listen: CallbackTo[js.Promise[Unit]]
    ): TestServer = {
      val __obj = js.Dynamic.literal(caCert = caCert.asInstanceOf[js.Any], close = close.toJsFn, http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], listen = listen.toJsFn)
      __obj.asInstanceOf[TestServer]
    }
    
    extension [Self <: TestServer](x: Self) {
      
      inline def setCaCert(value: String): Self = StObject.set(x, "caCert", value.asInstanceOf[js.Any])
      
      inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setHttp(
        value: typingsJapgolly.node.httpMod.Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttps(
        value: typingsJapgolly.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setListen(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "listen", value.toJsFn)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSslPort(value: Double): Self = StObject.set(x, "sslPort", value.asInstanceOf[js.Any])
      
      inline def setSslPortUndefined: Self = StObject.set(x, "sslPort", js.undefined)
      
      inline def setSslUrl(value: String): Self = StObject.set(x, "sslUrl", value.asInstanceOf[js.Any])
      
      inline def setSslUrlUndefined: Self = StObject.set(x, "sslUrl", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
