package typingsJapgolly.winrtUwp.Windows.Web.Http

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.AnonLength
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Foundation.IStringable
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrtUwp.Windows.Web.Http.Headers.HttpContentHeaderCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a base interface for an HTTP entity body and content headers. */
trait IHttpContent
  extends IClosable
     with IStringable {
  /** Get a collection of content headers set on the IHttpContent . */
  var headers: HttpContentHeaderCollection
  /**
    * Serialize the HTTP content into memory as an asynchronous operation.
    * @return The object that represents the asynchronous operation.
    */
  def bufferAllAsync(): IPromiseWithIAsyncOperationWithProgress[Double, Double]
  /**
    * Serialize the HTTP content to a buffer as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsBufferAsync(): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  /**
    * Serialize the HTTP content and return an input stream that represents the content as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsInputStreamAsync(): IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]
  /**
    * Serialize the HTTP content to a String as an asynchronous operation.
    * @return The object representing the asynchronous operation.
    */
  def readAsStringAsync(): IPromiseWithIAsyncOperationWithProgress[String, Double]
  /**
    * Determines whether the HTTP content has a valid length in bytes.
    */
  def tryComputeLength(): AnonLength
  /**
    * Write the HTTP content to an output stream as an asynchronous operation.
    * @param outputStream The output stream to write to.
    * @return The object representing the asynchronous operation.
    */
  def writeToStreamAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object IHttpContent {
  @scala.inline
  def apply(
    bufferAllAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]],
    close: Callback,
    headers: HttpContentHeaderCollection,
    readAsBufferAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]],
    readAsInputStreamAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[IInputStream, Double]],
    readAsStringAsync: CallbackTo[IPromiseWithIAsyncOperationWithProgress[String, Double]],
    tryComputeLength: CallbackTo[AnonLength],
    writeToStreamAsync: IOutputStream => CallbackTo[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
  ): IHttpContent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("bufferAllAsync")(bufferAllAsync.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("readAsBufferAsync")(readAsBufferAsync.toJsFn)
    __obj.updateDynamic("readAsInputStreamAsync")(readAsInputStreamAsync.toJsFn)
    __obj.updateDynamic("readAsStringAsync")(readAsStringAsync.toJsFn)
    __obj.updateDynamic("tryComputeLength")(tryComputeLength.toJsFn)
    __obj.updateDynamic("writeToStreamAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream) => writeToStreamAsync(t0).runNow()))
    __obj.asInstanceOf[IHttpContent]
  }
}

