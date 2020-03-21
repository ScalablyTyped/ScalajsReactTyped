package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
trait IMemoryBuffer extends IClosable {
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference
}

object IMemoryBuffer {
  @scala.inline
  def apply(close: Callback, createReference: CallbackTo[IMemoryBufferReference]): IMemoryBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("createReference")(createReference.toJsFn)
    __obj.asInstanceOf[IMemoryBuffer]
  }
}

