package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables a Windows Runtime component to provide sequential read access to an encapsulated stream. */
trait IInputStreamReference extends js.Object {
  /**
    * Opens a stream for sequential read access.
    * @return The asynchronous operation.
    */
  def openSequentialReadAsync(): IPromiseWithIAsyncOperation[IInputStream]
}

object IInputStreamReference {
  @scala.inline
  def apply(openSequentialReadAsync: CallbackTo[IPromiseWithIAsyncOperation[IInputStream]]): IInputStreamReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openSequentialReadAsync")(openSequentialReadAsync.toJsFn)
    __obj.asInstanceOf[IInputStreamReference]
  }
}

