package typingsJapgolly.requiresPort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(port: String, protocol: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: String, protocol: Protocol): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: Double, protocol: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(port: Double, protocol: Protocol): Boolean = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("requires-port", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.requiresPort.requiresPortStrings.http
    - typingsJapgolly.requiresPort.requiresPortStrings.https
    - typingsJapgolly.requiresPort.requiresPortStrings.ws
    - typingsJapgolly.requiresPort.requiresPortStrings.wss
    - typingsJapgolly.requiresPort.requiresPortStrings.ftp
    - typingsJapgolly.requiresPort.requiresPortStrings.gopher
    - typingsJapgolly.requiresPort.requiresPortStrings.file
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def file: typingsJapgolly.requiresPort.requiresPortStrings.file = "file".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.file]
    
    inline def ftp: typingsJapgolly.requiresPort.requiresPortStrings.ftp = "ftp".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.ftp]
    
    inline def gopher: typingsJapgolly.requiresPort.requiresPortStrings.gopher = "gopher".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.gopher]
    
    inline def http: typingsJapgolly.requiresPort.requiresPortStrings.http = "http".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.http]
    
    inline def https: typingsJapgolly.requiresPort.requiresPortStrings.https = "https".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.https]
    
    inline def ws: typingsJapgolly.requiresPort.requiresPortStrings.ws = "ws".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.ws]
    
    inline def wss: typingsJapgolly.requiresPort.requiresPortStrings.wss = "wss".asInstanceOf[typingsJapgolly.requiresPort.requiresPortStrings.wss]
  }
}
