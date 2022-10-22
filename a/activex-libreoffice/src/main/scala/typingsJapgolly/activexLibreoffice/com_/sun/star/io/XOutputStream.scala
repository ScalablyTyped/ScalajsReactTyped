package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the basic interface to write data to a stream.
  *
  * See the [streaming document]{@link url="http://udk.openoffice.org/common/man/concept/streams.html"} for further information on chaining and piping
  * streams.
  */
trait XOutputStream
  extends StObject
     with XInterface {
  
  /**
    * gets called to indicate that all data has been written.
    *
    * If this method has not yet been called, no attached {@link XInputStream} receives an EOF signal. No further bytes may be written after this method has
    * been called.
    */
  def closeOutput(): Unit
  
  /**
    * flushes out of the stream any data that may exist in buffers.
    *
    * The semantics of this method are rather vague. See {@link com.sun.star.io.XAsyncOutputMonitor.waitForCompletion()} for a similar method with very
    * specific semantics, that is useful in certain scenarios.
    */
  def flush(): Unit
  
  /** writes the whole sequence to the stream. (blocking call) */
  def writeBytes(aData: SeqEquiv[Double]): Unit
}
object XOutputStream {
  
  inline def apply(
    acquire: Callback,
    closeOutput: Callback,
    flush: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    writeBytes: SeqEquiv[Double] => Callback
  ): XOutputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closeOutput = closeOutput.toJsFn, flush = flush.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, writeBytes = js.Any.fromFunction1((t0: SeqEquiv[Double]) => writeBytes(t0).runNow()))
    __obj.asInstanceOf[XOutputStream]
  }
  
  extension [Self <: XOutputStream](x: Self) {
    
    inline def setCloseOutput(value: Callback): Self = StObject.set(x, "closeOutput", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setWriteBytes(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "writeBytes", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
