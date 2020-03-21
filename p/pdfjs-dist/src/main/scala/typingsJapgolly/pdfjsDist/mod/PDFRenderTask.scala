package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RenderTask is basically a promise but adds a cancel function to termiate it.
  **/
trait PDFRenderTask extends PDFLoadingTask[PDFPageProxy] {
  /**
    * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
    **/
  def cancel(): Unit
}

object PDFRenderTask {
  @scala.inline
  def apply(cancel: Callback, promise: PDFPromise[PDFPageProxy]): PDFRenderTask = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.asInstanceOf[PDFRenderTask]
  }
}

