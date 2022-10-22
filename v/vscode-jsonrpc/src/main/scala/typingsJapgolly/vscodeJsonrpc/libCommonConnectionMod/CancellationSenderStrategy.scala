package typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationSenderStrategy extends StObject {
  
  def cleanup(id: CancellationId): Unit
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def sendCancellation(conn: MessageConnection, id: CancellationId): js.Promise[Unit]
}
object CancellationSenderStrategy {
  
  inline def apply(
    cleanup: CancellationId => Callback,
    sendCancellation: (MessageConnection, CancellationId) => js.Promise[Unit]
  ): CancellationSenderStrategy = {
    val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction1((t0: CancellationId) => cleanup(t0).runNow()), sendCancellation = js.Any.fromFunction2(sendCancellation))
    __obj.asInstanceOf[CancellationSenderStrategy]
  }
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationSenderStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/connection", "CancellationSenderStrategy.Message")
  @js.native
  val Message: CancellationSenderStrategy = js.native
  
  inline def is(value: Any): /* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationSenderStrategy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-jsonrpc.vscode-jsonrpc/lib/common/connection.CancellationSenderStrategy */ Boolean]
  
  extension [Self <: CancellationSenderStrategy](x: Self) {
    
    inline def setCleanup(value: CancellationId => Callback): Self = StObject.set(x, "cleanup", js.Any.fromFunction1((t0: CancellationId) => value(t0).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setSendCancellation(value: (MessageConnection, CancellationId) => js.Promise[Unit]): Self = StObject.set(x, "sendCancellation", js.Any.fromFunction2(value))
  }
}
