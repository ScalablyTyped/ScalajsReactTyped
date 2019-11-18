package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileReference extends TextRange {
  var fileName: String
}

object FileReference {
  @scala.inline
  def apply(end: Double, fileName: String, pos: Double): FileReference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileReference]
  }
}

