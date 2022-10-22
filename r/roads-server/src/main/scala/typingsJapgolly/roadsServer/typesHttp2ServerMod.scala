package typingsJapgolly.roadsServer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.http2Mod.Http2Server
import typingsJapgolly.node.http2Mod.ServerHttp2Stream
import typingsJapgolly.roads.mod.Response
import typingsJapgolly.roads.mod.Road
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHttp2ServerMod {
  
  @JSImport("roads-server/types/http2Server", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Server {
    /**
      * Constructs a new Server object that helps create Roads servers.
      *
      * @param {Road} road The Road that handles all the routes
      */
    def this(road: Road) = this()
    
    /**
      * Start the http server. Accepts the same parameters as HttpServer.listen
      *
      * @param {number} port
      * @param {string} hostname
      */
    /* CompleteClass */
    override def listen(port: Double, hostname: String): Http2Server = js.native
    
    /**
      * Standard logic for turning each request into a road request, and communicating the response
      * back to the client
      *
      * @param {ServerHttp2Stream} stream
      * @param {object} headers
      */
    /* protected */ /* CompleteClass */
    override def onStream(stream: ServerHttp2Stream, headers: StringDictionary[Any]): Unit = js.native
    
    /**
      * This is the road object that will handle all requests
      * @type {Road}
      */
    /* protected */ /* CompleteClass */
    var road: Road = js.native
    
    /**
      * Helper function to write a roads Response object to an HTTPResponse object
      *
      * @param {ServerHttp2Stream} stream
      * @param {Response} response
      */
    /* protected */ /* CompleteClass */
    override def sendResponse(stream: ServerHttp2Stream, response: Response): Unit = js.native
    
    /**
      * This is the node.js http2 server from the http2 library.
      * @todo  support HTTPS
      * @type HTTPServer
      */
    /* protected */ /* CompleteClass */
    var server: Http2Server = js.native
  }
  
  trait Server extends StObject {
    
    /**
      * Start the http server. Accepts the same parameters as HttpServer.listen
      *
      * @param {number} port
      * @param {string} hostname
      */
    def listen(port: Double, hostname: String): Http2Server
    
    /**
      * Standard logic for turning each request into a road request, and communicating the response
      * back to the client
      *
      * @param {ServerHttp2Stream} stream
      * @param {object} headers
      */
    /* protected */ def onStream(stream: ServerHttp2Stream, headers: StringDictionary[Any]): Unit
    
    /**
      * This is the road object that will handle all requests
      * @type {Road}
      */
    /* protected */ var road: Road
    
    /**
      * Helper function to write a roads Response object to an HTTPResponse object
      *
      * @param {ServerHttp2Stream} stream
      * @param {Response} response
      */
    /* protected */ def sendResponse(stream: ServerHttp2Stream, response: Response): Unit
    
    /**
      * This is the node.js http2 server from the http2 library.
      * @todo  support HTTPS
      * @type HTTPServer
      */
    /* protected */ var server: Http2Server
  }
  object Server {
    
    inline def apply(
      listen: (Double, String) => Http2Server,
      onStream: (ServerHttp2Stream, StringDictionary[Any]) => Callback,
      road: Road,
      sendResponse: (ServerHttp2Stream, Response) => Callback,
      server: Http2Server
    ): Server = {
      val __obj = js.Dynamic.literal(listen = js.Any.fromFunction2(listen), onStream = js.Any.fromFunction2((t0: ServerHttp2Stream, t1: StringDictionary[Any]) => (onStream(t0, t1)).runNow()), road = road.asInstanceOf[js.Any], sendResponse = js.Any.fromFunction2((t0: ServerHttp2Stream, t1: Response) => (sendResponse(t0, t1)).runNow()), server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setListen(value: (Double, String) => Http2Server): Self = StObject.set(x, "listen", js.Any.fromFunction2(value))
      
      inline def setOnStream(value: (ServerHttp2Stream, StringDictionary[Any]) => Callback): Self = StObject.set(x, "onStream", js.Any.fromFunction2((t0: ServerHttp2Stream, t1: StringDictionary[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRoad(value: Road): Self = StObject.set(x, "road", value.asInstanceOf[js.Any])
      
      inline def setSendResponse(value: (ServerHttp2Stream, Response) => Callback): Self = StObject.set(x, "sendResponse", js.Any.fromFunction2((t0: ServerHttp2Stream, t1: Response) => (value(t0, t1)).runNow()))
      
      inline def setServer(value: Http2Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
