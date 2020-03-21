package typingsJapgolly.titanium

import typingsJapgolly.titanium.Titanium.UI.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object for specifying options when showing or dismissing a <Titanium.UI.iOS.DocumentViewer>.
  */
trait DocumentViewerOptions extends js.Object {
  /**
  	 * Indicates whether to animate the transition.
  	 */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Anchors the options menu to the specified view.
  	 */
  var view: js.UndefOr[View] = js.undefined
}

object DocumentViewerOptions {
  @scala.inline
  def apply(animated: js.UndefOr[Boolean] = js.undefined, view: View = null): DocumentViewerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewerOptions]
  }
}

