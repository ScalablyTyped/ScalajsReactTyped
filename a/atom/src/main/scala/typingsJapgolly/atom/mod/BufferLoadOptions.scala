package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferLoadOptions extends js.Object {
  /** The file's encoding. */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    *  A function that returns a boolean indicating whether the buffer should
    *  be destroyed if its file is deleted.
    */
  var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object BufferLoadOptions {
  @scala.inline
  def apply(encoding: String = null, shouldDestroyOnFileDelete: js.UndefOr[CallbackTo[Boolean]] = js.undefined): BufferLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    shouldDestroyOnFileDelete.foreach(p => __obj.updateDynamic("shouldDestroyOnFileDelete")(p.toJsFn))
    __obj.asInstanceOf[BufferLoadOptions]
  }
}

