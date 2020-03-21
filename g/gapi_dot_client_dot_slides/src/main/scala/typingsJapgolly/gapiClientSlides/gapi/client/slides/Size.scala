package typingsJapgolly.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** The height of the object. */
  var height: js.UndefOr[Dimension] = js.undefined
  /** The width of the object. */
  var width: js.UndefOr[Dimension] = js.undefined
}

object Size {
  @scala.inline
  def apply(height: Dimension = null, width: Dimension = null): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

