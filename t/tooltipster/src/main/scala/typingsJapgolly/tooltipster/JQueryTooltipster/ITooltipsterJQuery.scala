package typingsJapgolly.tooltipster.JQueryTooltipster

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.tooltipster.JQuery
import typingsJapgolly.tooltipster.tooltipsterStrings.close
import typingsJapgolly.tooltipster.tooltipsterStrings.content
import typingsJapgolly.tooltipster.tooltipsterStrings.destroy
import typingsJapgolly.tooltipster.tooltipsterStrings.disable
import typingsJapgolly.tooltipster.tooltipsterStrings.elementOrigin
import typingsJapgolly.tooltipster.tooltipsterStrings.elementTooltip
import typingsJapgolly.tooltipster.tooltipsterStrings.enable
import typingsJapgolly.tooltipster.tooltipsterStrings.instance
import typingsJapgolly.tooltipster.tooltipsterStrings.off
import typingsJapgolly.tooltipster.tooltipsterStrings.on
import typingsJapgolly.tooltipster.tooltipsterStrings.one
import typingsJapgolly.tooltipster.tooltipsterStrings.open
import typingsJapgolly.tooltipster.tooltipsterStrings.option
import typingsJapgolly.tooltipster.tooltipsterStrings.reposition
import typingsJapgolly.tooltipster.tooltipsterStrings.status
import typingsJapgolly.tooltipster.tooltipsterStrings.triggerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterJQuery extends js.Object {
  /** Activates Tooltipster */
  def apply(): JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  def apply(method: close): JQuery = js.native
  def apply(method: close, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
  /**
  		 * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
  		 * will be returned.
  		 */
  def apply(method: content): js.Any = js.native
  /**
  		 * Updates the tooltip's content.
  		 * @param value the new content of the tooltip
  		 */
  def apply(method: content, value: String): JQuery = js.native
  /**
  		 * Closes and destroys the tooltip functionality.
  		 */
  def apply(method: destroy): JQuery = js.native
  /**
  		 * Temporarily disables a tooltip from being able to open.
  		 */
  def apply(method: disable): JQuery = js.native
  /**
  		 * Returns the HTML element which has been tooltipped.
  		 */
  def apply(method: elementOrigin): HTMLElement = js.native
  /**
  		 * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
  		 */
  def apply(method: elementTooltip): HTMLElement | Null = js.native
  /**
  		 * If a tooltip was disabled, restores its previous functionality.
  		 */
  def apply(method: enable): JQuery = js.native
  /**
  		 * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
  		 * only the instance of the first will be returned.
  		 */
  def apply(method: instance): ITooltipsterInstance = js.native
  /**
  		 * Handle Tooltipster's `off` event coming from any instance.
  		 */
  def apply(method: off, eventName: String): JQuery = js.native
  /**
  		 * Handle Tooltipster's `one` event coming from any instance.
  		 */
  def apply(method: one, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
  /**
  		 * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
  		 * for a complete description of available events.
  		 */
  def apply(method: on, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  def apply(method: open): JQuery = js.native
  def apply(method: open, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
  /**
  		 * Returns the value of an option.
  		 */
  def apply(method: option, optionName: String): js.Any = js.native
  /**
  		 * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
  		 */
  def apply(method: option, optionName: String, optionValue: js.Any): JQuery = js.native
  /**
  		 * Resizes and repositions the tooltip.
  		 */
  def apply(method: reposition): JQuery = js.native
  /**
  		 * Returns various information about the tooltip, like whether it is open or not. See 
  		 * http://iamceege.github.io/tooltipster/#status
  		 */
  def apply(method: status): ITooltipStatus = js.native
  /**
  		 * Trigger a Tooltipster's event coming from any instance.
  		 */
  def apply(method: triggerHandler, eventName: String): JQuery = js.native
  def apply(options: ITooltipsterOptions): JQuery = js.native
}

