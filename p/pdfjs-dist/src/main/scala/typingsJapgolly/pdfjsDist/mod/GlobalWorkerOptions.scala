package typingsJapgolly.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalWorkerOptions extends js.Object {
  var workerSrc: String
}

object GlobalWorkerOptions {
  @scala.inline
  def apply(workerSrc: String): GlobalWorkerOptions = {
    val __obj = js.Dynamic.literal(workerSrc = workerSrc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalWorkerOptions]
  }
}

