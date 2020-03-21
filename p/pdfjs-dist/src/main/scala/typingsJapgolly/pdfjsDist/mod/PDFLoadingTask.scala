package typingsJapgolly.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFLoadingTask[T] extends js.Object {
  var promise: PDFPromise[T]
}

object PDFLoadingTask {
  @scala.inline
  def apply[T](promise: PDFPromise[T]): PDFLoadingTask[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFLoadingTask[T]]
  }
}

