package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEngine extends js.Object {
  /** Search engine to use. Uses the default if not specified. */
  var engine: js.UndefOr[String] = js.undefined
  /** Terms to search for. */
  var query: String
  /** The ID of the tab for the search results. If not specified, a new tab is created. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object AnonEngine {
  @scala.inline
  def apply(query: String, engine: String = null, tabId: Int | Double = null): AnonEngine = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEngine]
  }
}

