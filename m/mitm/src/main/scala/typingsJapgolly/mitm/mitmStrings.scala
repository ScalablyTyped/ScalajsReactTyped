package typingsJapgolly.mitm

import typingsJapgolly.mitm.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mitmStrings {
  
  @js.native
  sealed trait connect
    extends StObject
       with Event
  inline def connect: connect = "connect".asInstanceOf[connect]
  
  @js.native
  sealed trait connection
    extends StObject
       with Event
  inline def connection: connection = "connection".asInstanceOf[connection]
  
  @js.native
  sealed trait request
    extends StObject
       with Event
  inline def request: request = "request".asInstanceOf[request]
}
