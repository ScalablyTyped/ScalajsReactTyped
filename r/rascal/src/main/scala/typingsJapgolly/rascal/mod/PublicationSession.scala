package typingsJapgolly.rascal.mod

import typingsJapgolly.amqplib.propertiesMod.Message
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rascal.rascalStrings.`return`
import typingsJapgolly.rascal.rascalStrings.error
import typingsJapgolly.rascal.rascalStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rascal", "PublicationSession")
@js.native
open class PublicationSession protected () extends EventEmitter {
  def this(vhost: Vhost, messageId: String) = this()
  
  def abort(): Unit = js.native
  
  def emitPaused(): Unit = js.native
  
  def isAborted(): Boolean = js.native
  
  @JSName("on")
  def on_error(event: error, cb: js.Function2[/* err */ js.Error, /* messageId */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_return(event: `return`, cb: js.Function1[/* message */ Message, Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, cb: js.Function1[/* messageId */ String, Unit]): this.type = js.native
}
