package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides recording functionality of dispatches
  *
  * With such recorder it will be possible to record requests of type {@link XDispatch} by using additional interface {@link XRecordableDispatch} . The
  * result of that will be a a script which can be used to start the dispatch at later time again. Such recorder objects are available on a {@link
  * XDispatchRecorderSupplier} which is provided by the {@link Frame} service.
  * @see Frame
  * @see XDispatchRecorderSupplier
  * @since OOo 1.1.2
  */
trait XDispatchRecorder
  extends StObject
     with XInterface {
  
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  val RecordedMacro: String
  
  /**
    * stops the recording process
    *
    * Must be called in pairs with {@link XDispatchRecorder.startRecording()} .
    * @see getRecordedMacro()
    */
  def endRecording(): Unit
  
  /**
    * returns the recorded source code
    *
    * This method must be used before {@link endRecording()} is called! Otherwise the macro will be released.
    * @returns the recorded data as a string which can be interpreted as a script
    */
  def getRecordedMacro(): String
  
  /**
    * records a single dispatch call identified by its command URL
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatch(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit
  
  /**
    * records a single dispatch call identified by its command URL, but comments it out
    *
    * This way calls that failed on execution can be documented.
    * @param URL the full parsed command URL
    * @param Arguments optional arguments for the command URL ;  (see {@link com.sun.star.document.MediaDescriptor} for further information)
    */
  def recordDispatchAsComment(URL: URL, Arguments: SeqEquiv[PropertyValue]): Unit
  
  /**
    * initializes the recorder by passing the frame for which all macro statements shall be recorded
    * @param Frame it includes the document on which such requests shall be recorded
    */
  def startRecording(Frame: XFrame): Unit
}
object XDispatchRecorder {
  
  inline def apply(
    RecordedMacro: String,
    acquire: Callback,
    endRecording: Callback,
    getRecordedMacro: CallbackTo[String],
    queryInterface: `type` => Any,
    recordDispatch: (URL, SeqEquiv[PropertyValue]) => Callback,
    recordDispatchAsComment: (URL, SeqEquiv[PropertyValue]) => Callback,
    release: Callback,
    startRecording: XFrame => Callback
  ): XDispatchRecorder = {
    val __obj = js.Dynamic.literal(RecordedMacro = RecordedMacro.asInstanceOf[js.Any], acquire = acquire.toJsFn, endRecording = endRecording.toJsFn, getRecordedMacro = getRecordedMacro.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), recordDispatch = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (recordDispatch(t0, t1)).runNow()), recordDispatchAsComment = js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (recordDispatchAsComment(t0, t1)).runNow()), release = release.toJsFn, startRecording = js.Any.fromFunction1((t0: XFrame) => startRecording(t0).runNow()))
    __obj.asInstanceOf[XDispatchRecorder]
  }
  
  extension [Self <: XDispatchRecorder](x: Self) {
    
    inline def setEndRecording(value: Callback): Self = StObject.set(x, "endRecording", value.toJsFn)
    
    inline def setGetRecordedMacro(value: CallbackTo[String]): Self = StObject.set(x, "getRecordedMacro", value.toJsFn)
    
    inline def setRecordDispatch(value: (URL, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "recordDispatch", js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setRecordDispatchAsComment(value: (URL, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "recordDispatchAsComment", js.Any.fromFunction2((t0: URL, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setRecordedMacro(value: String): Self = StObject.set(x, "RecordedMacro", value.asInstanceOf[js.Any])
    
    inline def setStartRecording(value: XFrame => Callback): Self = StObject.set(x, "startRecording", js.Any.fromFunction1((t0: XFrame) => value(t0).runNow()))
  }
}
