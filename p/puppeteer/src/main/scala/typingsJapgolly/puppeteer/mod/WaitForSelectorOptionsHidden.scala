package typingsJapgolly.puppeteer.mod

import typingsJapgolly.puppeteer.puppeteerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true`
}

object WaitForSelectorOptionsHidden {
  @scala.inline
  def apply(hidden: `true`, timeout: Int | Double = null, visible: js.UndefOr[Boolean] = js.undefined): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
}

