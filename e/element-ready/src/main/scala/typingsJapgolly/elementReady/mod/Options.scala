package typingsJapgolly.elementReady.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Automatically stop checking for the element to be ready after the DOM ready event. The promise is then resolved to `undefined`.
  		@default true
  		*/
  val stopOnDomReady: js.UndefOr[Boolean] = js.undefined
  /**
  		The element that's expected to contain a match.
  		@default document
  		*/
  val target: js.UndefOr[Element | Document_] = js.undefined
  /**
  		Milliseconds to wait before stopping the search and resolving the promise to `undefined`.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    stopOnDomReady: js.UndefOr[Boolean] = js.undefined,
    target: Element | Document_ = null,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stopOnDomReady)) __obj.updateDynamic("stopOnDomReady")(stopOnDomReady.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

