package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference to an IMemoryBuffer object. */
trait IMemoryBufferReference extends IClosable {
  /** Gets the size of the memory buffer in bytes. */
  var capacity: Double
}

object IMemoryBufferReference {
  @scala.inline
  def apply(capacity: Double, close: Callback): IMemoryBufferReference = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[IMemoryBufferReference]
  }
}

