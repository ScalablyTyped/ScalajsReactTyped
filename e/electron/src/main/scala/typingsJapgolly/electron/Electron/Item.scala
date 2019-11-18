package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * or files Array The path(s) to the file(s) being dragged.
    */
  var file: String
  /**
    * The image must be non-empty on macOS.
    */
  var icon: NativeImage
}

object Item {
  @scala.inline
  def apply(file: String, icon: NativeImage): Item = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Item]
  }
}

