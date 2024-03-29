package typingsJapgolly.ot.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ot.mod.Client.Synchronized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "Client")
@js.native
open class Client protected () extends StObject {
  def this(revision: Double) = this()
  
  /**
    * Call this method when the user changes the document.
    * @param operation The op
    */
  def applyClient(operation: TextOperation): Unit = js.native
  
  /**
    * Override this method.
    * @param operation The op
    */
  def applyOperation(operation: TextOperation): Unit = js.native
  
  /**
    * Call this method with a new operation from the server
    * @param operation The op
    */
  def applyServer(operation: TextOperation): Unit = js.native
  
  var revision: Double = js.native
  
  /**
    * Override this method.
    * @param revision The revision
    * @param operation The op
    */
  def sendOperation(revision: Double, operation: TextOperation): Unit = js.native
  
  def serverAck(): Unit = js.native
  
  def serverReconnect(): Unit = js.native
  
  def setState(state: Synchronized): Unit = js.native
  
  var state: Synchronized = js.native
  
  /**
    * Transforms a selection from the latest known server state to the current
    * client state. For example, if we get from the server the information that
    * another user's cursor is at position 3, but the server hasn't yet received
    * our newest operation, an insertion of 5 characters at the beginning of the
    * document, the correct position of the other user's cursor in our current
    * document is 8.
    * @param selection The selection
    */
  def transformSelection(selection: Selection): Selection = js.native
}
object Client {
  
  /**
    * In the 'AwaitingConfirm' state, there's one operation the client has sent
    * to the server and is still waiting for an acknowledgement.
    */
  trait AwaitingConfirm
    extends StObject
       with Sync[AwaitingWithBuffer, AwaitingConfirm, Synchronized] {
    
    var outstanding: TextOperation
    
    def resend(client: Client): Unit
  }
  object AwaitingConfirm {
    
    @JSImport("ot", "Client.AwaitingConfirm")
    @js.native
    def apply(outstanding: TextOperation): AwaitingConfirm = js.native
    
    extension [Self <: AwaitingConfirm](x: Self) {
      
      inline def setOutstanding(value: TextOperation): Self = StObject.set(x, "outstanding", value.asInstanceOf[js.Any])
      
      inline def setResend(value: Client => Callback): Self = StObject.set(x, "resend", js.Any.fromFunction1((t0: Client) => value(t0).runNow()))
    }
  }
  
  /**
    * In the 'AwaitingWithBuffer' state, the client is waiting for an operation
    * to be acknowledged by the server while buffering the edits the user makes
    */
  trait AwaitingWithBuffer
    extends StObject
       with Sync[AwaitingWithBuffer, AwaitingWithBuffer, AwaitingConfirm] {
    
    var buffer: TextOperation
    
    var outstanding: TextOperation
    
    def resend(client: Client): Unit
  }
  object AwaitingWithBuffer {
    
    @JSImport("ot", "Client.AwaitingWithBuffer")
    @js.native
    def apply(outstanding: TextOperation, buffer: TextOperation): AwaitingWithBuffer = js.native
    
    extension [Self <: AwaitingWithBuffer](x: Self) {
      
      inline def setBuffer(value: TextOperation): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setOutstanding(value: TextOperation): Self = StObject.set(x, "outstanding", value.asInstanceOf[js.Any])
      
      inline def setResend(value: Client => Callback): Self = StObject.set(x, "resend", js.Any.fromFunction1((t0: Client) => value(t0).runNow()))
    }
  }
  
  /**
    * In the 'Synchronized' state, there is no pending operation that the client
    * has sent to the server.
    */
  trait Synchronized
    extends StObject
       with Sync[AwaitingConfirm, Synchronized, scala.Nothing]
  object Synchronized {
    
    @JSImport("ot", "Client.Synchronized")
    @js.native
    def apply(): Synchronized = js.native
  }
  
  trait Sync[C, S, A] extends StObject {
    
    def applyClient(client: Client, operation: TextOperation): C
    
    def applyServer(client: Client, operation: TextOperation): S
    
    def serverAck(): A
    
    def transformSelection(selection: Selection): Selection
  }
  object Sync {
    
    inline def apply[C, S, A](
      applyClient: (Client, TextOperation) => C,
      applyServer: (Client, TextOperation) => S,
      serverAck: CallbackTo[A],
      transformSelection: Selection => Selection
    ): Sync[C, S, A] = {
      val __obj = js.Dynamic.literal(applyClient = js.Any.fromFunction2(applyClient), applyServer = js.Any.fromFunction2(applyServer), serverAck = serverAck.toJsFn, transformSelection = js.Any.fromFunction1(transformSelection))
      __obj.asInstanceOf[Sync[C, S, A]]
    }
    
    extension [Self <: Sync[?, ?, ?], C, S, A](x: Self & (Sync[C, S, A])) {
      
      inline def setApplyClient(value: (Client, TextOperation) => C): Self = StObject.set(x, "applyClient", js.Any.fromFunction2(value))
      
      inline def setApplyServer(value: (Client, TextOperation) => S): Self = StObject.set(x, "applyServer", js.Any.fromFunction2(value))
      
      inline def setServerAck(value: CallbackTo[A]): Self = StObject.set(x, "serverAck", value.toJsFn)
      
      inline def setTransformSelection(value: Selection => Selection): Self = StObject.set(x, "transformSelection", js.Any.fromFunction1(value))
    }
  }
}
