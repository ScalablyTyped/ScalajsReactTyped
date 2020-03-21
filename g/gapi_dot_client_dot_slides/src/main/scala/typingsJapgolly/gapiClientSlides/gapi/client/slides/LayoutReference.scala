package typingsJapgolly.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutReference extends js.Object {
  /** Layout ID: the object ID of one of the layouts in the presentation. */
  var layoutId: js.UndefOr[String] = js.undefined
  /** Predefined layout. */
  var predefinedLayout: js.UndefOr[String] = js.undefined
}

object LayoutReference {
  @scala.inline
  def apply(layoutId: String = null, predefinedLayout: String = null): LayoutReference = {
    val __obj = js.Dynamic.literal()
    if (layoutId != null) __obj.updateDynamic("layoutId")(layoutId.asInstanceOf[js.Any])
    if (predefinedLayout != null) __obj.updateDynamic("predefinedLayout")(predefinedLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutReference]
  }
}

