package typingsJapgolly.webosService

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Record
import typingsJapgolly.webosService.messageMod.Message
import typingsJapgolly.webosService.webosServiceStrings.cancel
import typingsJapgolly.webosService.webosServiceStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodMod {
  
  @JSImport("webos-service/method", "Method")
  @js.native
  open class Method protected () extends EventEmitter {
    def this(methodName: String, description: Record[String, Any]) = this()
    
    val description: Record[String, Any] = js.native
    
    val name: String = js.native
    
    def on(event: request | cancel, listener: js.Function1[/* message */ Message, Unit]): this.type = js.native
    def on(event: String, listener: js.Function0[Unit]): this.type = js.native
  }
}
