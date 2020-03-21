package typingsJapgolly.actionsOnGoogle.buttonMod

import typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsOpenUrlAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  /**
    * Action to take when selected. Recommended to use the url property for simple web page url open.
    * @public
    */
  var action: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  /**
    * Text shown on the button.
    * @public
    */
  var title: String
  /**
    * String URL to open.
    * @public
    */
  var url: js.UndefOr[String] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(title: String, action: GoogleActionsV2UiElementsOpenUrlAction = null, url: String = null): ButtonOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

