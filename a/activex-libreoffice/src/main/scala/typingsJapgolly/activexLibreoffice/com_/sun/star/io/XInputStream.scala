package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the basic interface to read data from a stream.
  *
  * See the [streaming document]{@link url="http://udk.openoffice.org/common/man/concept/streams.html"} for further information on chaining and piping
  * streams.
  */
trait XInputStream
  extends StObject
     with XInterface {
  
  /**
    * states how many bytes can be read or skipped without blocking.
    *
    * Note: This method offers no information on whether the EOF has been reached.
    */
  def available(): Double
  
  /**
    * closes the stream.
    *
    * Users must close the stream explicitly when no further reading should be done. (There may exist ring references to chained objects that can only be
    * released during this call. Thus not calling this method would result in a leak of memory or external resources.)
    */
  def closeInput(): Unit
  
  /**
    * reads the specified number of bytes in the given sequence.
    *
    * The return value specifies the number of bytes which have been put into the sequence. A difference between **nBytesToRead** and the return value
    * indicates that EOF has been reached. This means that the method blocks until the specified number of bytes are available or the EOF is reached.
    * @param aData after the call, the byte sequence contains the requested number of bytes (or less as a sign of EOF). ;  C++ only : Note that for unbridged
    * @param nBytesToRead the total number of bytes to read
    */
  def readBytes(aData: js.Array[SeqEquiv[Double]], nBytesToRead: Double): Double
  
  /**
    * reads the available number of bytes, at maximum **nMaxBytesToRead** .
    *
    * This method is very similar to the readBytes method, except that it has different blocking behaviour. The method blocks as long as at least 1 byte is
    * available or EOF has been reached. EOF has only been reached, when the method returns 0 and the corresponding byte sequence is empty. Otherwise, after
    * the call, aData contains the available, but no more than nMaxBytesToRead, bytes.
    * @param aData contains the data read from the stream.
    * @param nMaxBytesToRead The maximum number of bytes to be read from this stream during the call.
    * @see com.sun.star.io.XInputStream.readBytes
    */
  def readSomeBytes(aData: js.Array[SeqEquiv[Double]], nMaxBytesToRead: Double): Double
  
  /**
    * skips the next **nBytesToSkip** bytes (must be positive).
    *
    * It is up to the implementation whether this method is blocking the thread or not.
    * @param nBytesToSkip number of bytes to skip
    */
  def skipBytes(nBytesToSkip: Double): Unit
}
object XInputStream {
  
  inline def apply(
    acquire: Callback,
    available: CallbackTo[Double],
    closeInput: Callback,
    queryInterface: `type` => Any,
    readBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    readSomeBytes: (js.Array[SeqEquiv[Double]], Double) => Double,
    release: Callback,
    skipBytes: Double => Callback
  ): XInputStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, available = available.toJsFn, closeInput = closeInput.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), readBytes = js.Any.fromFunction2(readBytes), readSomeBytes = js.Any.fromFunction2(readSomeBytes), release = release.toJsFn, skipBytes = js.Any.fromFunction1((t0: Double) => skipBytes(t0).runNow()))
    __obj.asInstanceOf[XInputStream]
  }
  
  extension [Self <: XInputStream](x: Self) {
    
    inline def setAvailable(value: CallbackTo[Double]): Self = StObject.set(x, "available", value.toJsFn)
    
    inline def setCloseInput(value: Callback): Self = StObject.set(x, "closeInput", value.toJsFn)
    
    inline def setReadBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = StObject.set(x, "readBytes", js.Any.fromFunction2(value))
    
    inline def setReadSomeBytes(value: (js.Array[SeqEquiv[Double]], Double) => Double): Self = StObject.set(x, "readSomeBytes", js.Any.fromFunction2(value))
    
    inline def setSkipBytes(value: Double => Callback): Self = StObject.set(x, "skipBytes", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
