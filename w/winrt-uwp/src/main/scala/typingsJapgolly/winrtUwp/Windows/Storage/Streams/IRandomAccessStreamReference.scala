package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide access to an encapsulated stream. */
trait IRandomAccessStreamReference extends js.Object {
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}

object IRandomAccessStreamReference {
  @scala.inline
  def apply(openReadAsync: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): IRandomAccessStreamReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openReadAsync")(openReadAsync.toJsFn)
    __obj.asInstanceOf[IRandomAccessStreamReference]
  }
}

