package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides random access of data in input and output streams that are stored in memory instead of on disk. */
trait InMemoryRandomAccessStream extends StObject {
  
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: Boolean
  
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: Boolean
  
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit
  
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream
  
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream
  
  /** Gets the byte offset of the stream. */
  var position: Double
  
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: Double): Unit
  
  /** Gets or sets the size of the random access stream. */
  var size: Double
  
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object InMemoryRandomAccessStream {
  
  inline def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: CallbackTo[IRandomAccessStream],
    close: Callback,
    flushAsync: CallbackTo[IPromiseWithIAsyncOperation[Boolean]],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Callback,
    size: Double,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): InMemoryRandomAccessStream = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = cloneStream.toJsFn, close = close.toJsFn, flushAsync = flushAsync.toJsFn, getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[InMemoryRandomAccessStream]
  }
  
  extension [Self <: InMemoryRandomAccessStream](x: Self) {
    
    inline def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    inline def setCanWrite(value: Boolean): Self = StObject.set(x, "canWrite", value.asInstanceOf[js.Any])
    
    inline def setCloneStream(value: CallbackTo[IRandomAccessStream]): Self = StObject.set(x, "cloneStream", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setFlushAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Boolean]]): Self = StObject.set(x, "flushAsync", value.toJsFn)
    
    inline def setGetInputStreamAt(value: Double => IInputStream): Self = StObject.set(x, "getInputStreamAt", js.Any.fromFunction1(value))
    
    inline def setGetOutputStreamAt(value: Double => IOutputStream): Self = StObject.set(x, "getOutputStreamAt", js.Any.fromFunction1(value))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
