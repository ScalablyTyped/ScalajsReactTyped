package typingsJapgolly.vndb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vndb", JSImport.Namespace)
  @js.native
  val ^ : VNDB_ = js.native
  
  /**
    * Used for creating a connection to VNDB API
    */
  @js.native
  trait VNDB_ extends StObject {
    
    /**
      * Connects to the VNDB API.
      * Host and port are not required unless VNDB changes them.
      * @param host VNDB host address
      * @param port VNDB port
      */
    def start(): js.Promise[typingsJapgolly.vndb.mod.vndb] = js.native
    def start(host: String): js.Promise[typingsJapgolly.vndb.mod.vndb] = js.native
    def start(host: String, port: Double): js.Promise[typingsJapgolly.vndb.mod.vndb] = js.native
    def start(host: Unit, port: Double): js.Promise[typingsJapgolly.vndb.mod.vndb] = js.native
  }
  
  type _To = VNDB_
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VNDB_ = ^
  
  /**
    * Object containing the socket and methods to interact with it
    */
  trait vndb extends StObject {
    
    /**
      * Close the connection to the VNDB API
      */
    def end(): js.Promise[Unit]
    
    var socket: TLSSocket
    
    /**
      * Send a message to the VNDB API, according to https://vndb.org/d11
      * @param message message to send to the VNDB API
      */
    def write(message: String): js.Promise[String]
  }
  object vndb {
    
    inline def apply(end: CallbackTo[js.Promise[Unit]], socket: TLSSocket, write: String => js.Promise[String]): typingsJapgolly.vndb.mod.vndb = {
      val __obj = js.Dynamic.literal(end = end.toJsFn, socket = socket.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[typingsJapgolly.vndb.mod.vndb]
    }
    
    extension [Self <: typingsJapgolly.vndb.mod.vndb](x: Self) {
      
      inline def setEnd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setSocket(value: TLSSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => js.Promise[String]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
