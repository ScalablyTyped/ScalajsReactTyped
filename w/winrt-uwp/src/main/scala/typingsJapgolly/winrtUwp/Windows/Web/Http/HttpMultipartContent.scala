package typingsJapgolly.winrtUwp.Windows.Web.Http

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typingsJapgolly.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses the multipart/ * MIME type. */
trait HttpMultipartContent extends StObject {
  
  /**
    * Add HTTP content to the HttpMultipartContent instance.
    * @param content The HTTP content to add to HttpMultipartContent .
    */
  def add(content: IHttpContent): Unit
  
  /**
    * Serialize the HttpMultipartContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  
  /** Closes the HttpMultipartContent instance and releases allocated resources. */
  def close(): Unit
  
  /**
    * Gets an object that can be used to enumerate the contents in the HttpMultipartContent object.
    * @return An object that can be used to enumerate the contents in the HttpMultipartContent object.
    */
  def first(): IIterator[IHttpContent]
  
  /** Get a collection of content headers set on the HttpMultipartContent . */
  var headers: HttpContentHeaderCollection
  
  /**
    * Serialize the HttpMultipartContent to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  
  /**
    * Serialize the HttpMultipartContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  
  /**
    * Serialize the HttpMultipartContent to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  
  /**
    * Determines whether the HttpMultipartContent has a valid length in bytes.
    */
  def tryComputeLength(): Length
  
  /**
    * Write the HttpMultipartContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object HttpMultipartContent {
  
  inline def apply(
    add: IHttpContent => Callback,
    bufferAllAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]],
    close: Callback,
    first: CallbackTo[IIterator[IHttpContent]],
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]],
    readAsInputStreamAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]],
    readAsStringAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[String, Double]],
    tryComputeLength: CallbackTo[Length],
    writeToStreamAsync: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): HttpMultipartContent = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: IHttpContent) => add(t0).runNow()), bufferAllAsync = bufferAllAsync.toJsFn, close = close.toJsFn, first = first.toJsFn, headers = headers.asInstanceOf[js.Any], readAsBufferAsync = readAsBufferAsync.toJsFn, readAsInputStreamAsync = readAsInputStreamAsync.toJsFn, readAsStringAsync = readAsStringAsync.toJsFn, tryComputeLength = tryComputeLength.toJsFn, writeToStreamAsync = js.Any.fromFunction1(writeToStreamAsync))
    __obj.asInstanceOf[HttpMultipartContent]
  }
  
  extension [Self <: HttpMultipartContent](x: Self) {
    
    inline def setAdd(value: IHttpContent => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: IHttpContent) => value(t0).runNow()))
    
    inline def setBufferAllAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]]): Self = StObject.set(x, "bufferAllAsync", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setFirst(value: CallbackTo[IIterator[IHttpContent]]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setHeaders(value: HttpContentHeaderCollection): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setReadAsBufferAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]]): Self = StObject.set(x, "readAsBufferAsync", value.toJsFn)
    
    inline def setReadAsInputStreamAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]]): Self = StObject.set(x, "readAsInputStreamAsync", value.toJsFn)
    
    inline def setReadAsStringAsync(value: CallbackTo[IPromiseWithIAsyncOperationWithProgress[String, Double]]): Self = StObject.set(x, "readAsStringAsync", value.toJsFn)
    
    inline def setTryComputeLength(value: CallbackTo[Length]): Self = StObject.set(x, "tryComputeLength", value.toJsFn)
    
    inline def setWriteToStreamAsync(value: IOutputStream => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeToStreamAsync", js.Any.fromFunction1(value))
  }
}
