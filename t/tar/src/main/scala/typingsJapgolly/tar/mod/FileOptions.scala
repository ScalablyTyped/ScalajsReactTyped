package typingsJapgolly.tar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  /**
    * Alias for file.
    */
  var f: js.UndefOr[String] = js.undefined
  /**
    * Uses the given file as the input or output of this function.
    */
  var file: js.UndefOr[String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(f: String = null, file: String = null): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

