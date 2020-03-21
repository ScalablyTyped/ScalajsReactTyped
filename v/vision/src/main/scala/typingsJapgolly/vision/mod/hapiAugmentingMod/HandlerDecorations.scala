package typingsJapgolly.vision.mod.hapiAugmentingMod

import typingsJapgolly.vision.AnonContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerDecorations extends js.Object {
  /**
    * The view handler can be used with routes registered in the same realm as the view manager.
    * The handler takes an options parameter that can be either a string or an object.
    * When the options parameter is a string, it should be the filename and path of the template relative
    * to the templates path configured via the views manager. When the options parameter is an object, it may have the following keys:
    * The rendering context contains the `params`, `payload`, `query`, and `pre` values from the request by default
    * (these can be overriden by values explicitly set via the options).
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler}
    */
  var view: js.UndefOr[String | AnonContext] = js.undefined
}

object HandlerDecorations {
  @scala.inline
  def apply(view: String | AnonContext = null): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerDecorations]
  }
}

