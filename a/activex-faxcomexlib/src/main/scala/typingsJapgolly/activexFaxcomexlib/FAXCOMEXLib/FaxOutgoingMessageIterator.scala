package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingMessageIterator Class */
trait FaxOutgoingMessageIterator extends StObject {
  
  /** End of archive marker */
  val AtEOF: Boolean
  
  /* private */ @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator
  
  /** Current message */
  val Message: IFaxOutgoingMessage
  
  /** Move to the first message */
  def MoveFirst(): Unit
  
  /** Move to the next message */
  def MoveNext(): Unit
  
  /** Size of prefetch buffer */
  var PrefetchSize: Double
}
object FaxOutgoingMessageIterator {
  
  inline def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator,
    Message: IFaxOutgoingMessage,
    MoveFirst: Callback,
    MoveNext: Callback,
    PrefetchSize: Double
  ): FaxOutgoingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = MoveFirst.toJsFn, MoveNext = MoveNext.toJsFn, PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")(FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingMessageIterator]
  }
  
  extension [Self <: FaxOutgoingMessageIterator](x: Self) {
    
    inline def setAtEOF(value: Boolean): Self = StObject.set(x, "AtEOF", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxOutgoingMessageIterator_typekey(value: FaxOutgoingMessageIterator): Self = StObject.set(x, "FAXCOMEXLib.FaxOutgoingMessageIterator_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: IFaxOutgoingMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMoveFirst(value: Callback): Self = StObject.set(x, "MoveFirst", value.toJsFn)
    
    inline def setMoveNext(value: Callback): Self = StObject.set(x, "MoveNext", value.toJsFn)
    
    inline def setPrefetchSize(value: Double): Self = StObject.set(x, "PrefetchSize", value.asInstanceOf[js.Any])
  }
}
