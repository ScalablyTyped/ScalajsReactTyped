package typingsJapgolly.materialUiCore.snackbarSnackbarMod

import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.center
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarOrigin extends js.Object {
  var horizontal: left | center | right = js.native
  var vertical: top | bottom = js.native
}

object SnackbarOrigin {
  @scala.inline
  def apply(horizontal: left | center | right, vertical: top | bottom): SnackbarOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnackbarOrigin]
  }
}

