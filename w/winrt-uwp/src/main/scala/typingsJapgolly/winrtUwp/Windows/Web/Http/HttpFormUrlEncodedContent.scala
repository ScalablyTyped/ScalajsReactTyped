package typingsJapgolly.winrtUwp.Windows.Web.Http

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typingsJapgolly.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses name/value data encoded with the application/x-www-form-urlencoded MIME type. */
trait HttpFormUrlEncodedContent extends StObject {
  
  /**
    * Serialize the HttpFormUrlEncodedContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  
  /** Closes the HttpFormUrlEncodedContent instance and releases allocated resources. */
  def close(): Unit
  
  /** Get a collection of content headers set on the HttpFormUrlEncodedContent . */
  var headers: HttpContentHeaderCollection
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  
  /**
    * Serialize the HttpFormUrlEncodedContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  
  /**
    * Serialize the HttpFormUrlEncodedContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  
  /**
    * Computes the HttpFormUrlEncodedContent length in bytes.
    */
  def tryComputeLength(): Length
  
  /**
    * Write the HttpFormUrlEncodedContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object HttpFormUrlEncodedContent {
  
  inline def apply(
    bufferAllAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]],
    close: Callback,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]],
    readAsInputStreamAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]],
    readAsStringAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[String, Double]],
    tryComputeLength: CallbackTo[Length],
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpFormUrlEncodedContent = {
    val __obj = js.Dynamic.literal(bufferAllAsync = bufferAllAsync.toJsFn, close = close.toJsFn, headers = headers.asInstanceOf[js.Any], readAsBufferAsync = readAsBufferAsync.toJsFn, readAsInputStreamAsync = readAsInputStreamAsync.toJsFn, readAsStringAsync = readAsStringAsync.toJsFn, tryComputeLength = tryComputeLength.toJsFn, writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpFormUrlEncodedContent]
  }
  
  extension [Self <: HttpFormUrlEncodedContent](x: Self) {
    
    inline def setBufferAllAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]]): Self = StObject.set(x, "bufferAllAsync", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setHeaders(value: HttpContentHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setReadAsBufferAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]]): Self = StObject.set(x, "readAsBufferAsync", value.toJsFn)
    
    inline def setReadAsInputStreamAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]]): Self = StObject.set(x, "readAsInputStreamAsync", value.toJsFn)
    
    inline def setReadAsStringAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[String, Double]]): Self = StObject.set(x, "readAsStringAsync", value.toJsFn)
    
    inline def setTryComputeLength(value: CallbackTo[Length]): Self = StObject.set(x, "tryComputeLength", value.toJsFn)
    
    inline def setWriteToStreamAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeToStreamAsync", js.Any.fromFunction1(value))
  }
}
