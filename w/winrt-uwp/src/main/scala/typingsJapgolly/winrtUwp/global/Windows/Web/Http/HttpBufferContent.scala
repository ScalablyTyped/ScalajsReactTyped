package typingsJapgolly.winrtUwp.global.Windows.Web.Http

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import typingsJapgolly.winrtUwp.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides HTTP content that uses a buffer. */
@JSGlobal("Windows.Web.Http.HttpBufferContent")
@js.native
open class HttpBufferContent protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Web.Http.HttpBufferContent {
  /**
    * Initializes a new instance of the HttpBufferContent class with the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    */
  def this(content: IBuffer) = this()
  /**
    * Initializes a new instance of the HttpBufferContent class with an offset and count of bytes from the specified buffer.
    * @param content The content used to initialize the HttpBufferContent .
    * @param offset The offset in bytes from the beginning of the content buffer to initialize the HttpBufferContent .
    * @param count The count of bytes in the content buffer to initialize the HttpBufferContent .
    */
  def this(content: IBuffer, offset: Double, count: Double) = this()
  
  /**
    * Serialize the HttpBufferContent into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  
  /** Closes the HttpBufferContent instance and releases allocated resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Get a collection of content headers set on the HttpBufferContent . */
  /* CompleteClass */
  var headers: HttpContentHeaderCollection = js.native
  
  /**
    * Serialize the HttpBufferContent to a buffer as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Serialize the HttpBufferContent and return an input stream that represents the content as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double] = js.native
  
  /**
    * Serialize the HttpBufferContent to a String as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double] = js.native
  
  /**
    * Computes the HttpBufferContent length in bytes.
    */
  /* CompleteClass */
  override def tryComputeLength(): Length = js.native
  
  /**
    * Write the HttpBufferContent to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object that represents the asynchronous operation.
    */
  /* CompleteClass */
  override def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
