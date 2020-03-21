package typingsJapgolly.testingLibraryDom.waitForElementMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitForElementOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object WaitForElementOptions {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    mutationObserverOptions: MutationObserverInit = null,
    timeout: Int | Double = null
  ): WaitForElementOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForElementOptions]
  }
}

