package typingsJapgolly.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesQueryResult extends js.Object {
  /** The file names. */
  var files: js.Array[String]
}

object FilesQueryResult {
  @scala.inline
  def apply(files: js.Array[String]): FilesQueryResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilesQueryResult]
  }
}

