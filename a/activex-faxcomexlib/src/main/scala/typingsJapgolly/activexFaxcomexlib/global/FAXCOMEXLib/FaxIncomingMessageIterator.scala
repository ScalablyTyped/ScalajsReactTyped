package typingsJapgolly.activexFaxcomexlib.global.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessageIterator")
@js.native
/* private */ open class FaxIncomingMessageIterator ()
  extends StObject
     with typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessageIterator {
  
  /** End of archive marker */
  /* CompleteClass */
  override val AtEOF: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessageIterator = js.native
  
  /** The current message */
  /* CompleteClass */
  override val Message: typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.IFaxIncomingMessage = js.native
  
  /** Move to the first message in the archive */
  /* CompleteClass */
  override def MoveFirst(): Unit = js.native
  
  /** Move to the next message in the archive */
  /* CompleteClass */
  override def MoveNext(): Unit = js.native
  
  /** Size of the prefetch buffer */
  /* CompleteClass */
  var PrefetchSize: Double = js.native
}
