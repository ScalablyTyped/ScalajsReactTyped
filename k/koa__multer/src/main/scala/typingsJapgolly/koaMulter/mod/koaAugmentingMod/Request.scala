package typingsJapgolly.koaMulter.mod.koaAugmentingMod

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var file: File
  var files: js.Array[File]
}

object Request {
  @scala.inline
  def apply(file: File, files: js.Array[File]): Request = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

