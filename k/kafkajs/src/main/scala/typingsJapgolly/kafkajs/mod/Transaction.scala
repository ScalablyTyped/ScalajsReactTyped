package typingsJapgolly.kafkajs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kafkajs.anon.OffsetsconsumerGroupIdstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction
  extends StObject
     with Sender {
  
  def abort(): js.Promise[Unit]
  
  def commit(): js.Promise[Unit]
  
  def isActive(): Boolean
  
  def sendOffsets(offsets: OffsetsconsumerGroupIdstr): js.Promise[Unit]
}
object Transaction {
  
  inline def apply(
    abort: CallbackTo[js.Promise[Unit]],
    commit: CallbackTo[js.Promise[Unit]],
    isActive: CallbackTo[Boolean],
    send: ProducerRecord => js.Promise[js.Array[RecordMetadata]],
    sendBatch: ProducerBatch => js.Promise[js.Array[RecordMetadata]],
    sendOffsets: OffsetsconsumerGroupIdstr => js.Promise[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, commit = commit.toJsFn, isActive = isActive.toJsFn, send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch), sendOffsets = js.Any.fromFunction1(sendOffsets))
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setAbort(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setCommit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setSendOffsets(value: OffsetsconsumerGroupIdstr => js.Promise[Unit]): Self = StObject.set(x, "sendOffsets", js.Any.fromFunction1(value))
  }
}
