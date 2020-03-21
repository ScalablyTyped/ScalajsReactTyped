package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPopulate extends js.Object {
  /**
    * If true, the `windows.Window` returned will have a `tabs` property that contains a list of the `tabs.Tab`
    * objects. The `Tab` objects only contain the `url`, `title` and `favIconUrl` properties if the extension's
    * manifest file includes the `"tabs"` permission. If false, the `windows.Window` won't have the `tabs`
    * property.
    */
  var populate: js.UndefOr[Boolean] = js.undefined
  /** One or more tab indices to highlight. */
  var tabs: js.Array[Double] | Double
  /** The window that contains the tabs. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonPopulate {
  @scala.inline
  def apply(
    tabs: js.Array[Double] | Double,
    populate: js.UndefOr[Boolean] = js.undefined,
    windowId: Int | Double = null
  ): AnonPopulate = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(populate)) __obj.updateDynamic("populate")(populate.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPopulate]
  }
}

