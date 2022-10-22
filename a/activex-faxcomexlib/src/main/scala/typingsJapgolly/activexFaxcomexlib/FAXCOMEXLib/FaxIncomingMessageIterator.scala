package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingMessageIterator Class */
trait FaxIncomingMessageIterator extends StObject {
  
  /** End of archive marker */
  val AtEOF: Boolean
  
  /* private */ @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator
  
  /** The current message */
  val Message: IFaxIncomingMessage
  
  /** Move to the first message in the archive */
  def MoveFirst(): Unit
  
  /** Move to the next message in the archive */
  def MoveNext(): Unit
  
  /** Size of the prefetch buffer */
  var PrefetchSize: Double
}
object FaxIncomingMessageIterator {
  
  inline def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator,
    Message: IFaxIncomingMessage,
    MoveFirst: Callback,
    MoveNext: Callback,
    PrefetchSize: Double
  ): FaxIncomingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = MoveFirst.toJsFn, MoveNext = MoveNext.toJsFn, PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")(FAXCOMEXLibDotFaxIncomingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessageIterator]
  }
  
  extension [Self <: FaxIncomingMessageIterator](x: Self) {
    
    inline def setAtEOF(value: Boolean): Self = StObject.set(x, "AtEOF", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxIncomingMessageIterator_typekey(value: FaxIncomingMessageIterator): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingMessageIterator_typekey", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: IFaxIncomingMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMoveFirst(value: Callback): Self = StObject.set(x, "MoveFirst", value.toJsFn)
    
    inline def setMoveNext(value: Callback): Self = StObject.set(x, "MoveNext", value.toJsFn)
    
    inline def setPrefetchSize(value: Double): Self = StObject.set(x, "PrefetchSize", value.asInstanceOf[js.Any])
  }
}
