package typingsJapgolly.tooltipster

import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQueryEventObject
import typingsJapgolly.tooltipster.JQueryTooltipster.ITooltipStatus
import typingsJapgolly.tooltipster.JQueryTooltipster.ITooltipsterInstance
import typingsJapgolly.tooltipster.JQueryTooltipster.ITooltipsterJQuery
import typingsJapgolly.tooltipster.JQueryTooltipster.ITooltipsterOptions
import typingsJapgolly.tooltipster.JQueryTooltipster.TooltipsterStandardCallbackFunction
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /** Activates Tooltipster */
  def tooltipster(): JQuery
  def tooltipster(options: ITooltipsterOptions): JQuery
  @JSName("tooltipster")
  var tooltipster_Original: ITooltipsterJQuery
  /**
    * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
    * DOM). The `callback` function argument is optional.
    */
  @JSName("tooltipster")
  def tooltipster_close(method: close): JQuery
  @JSName("tooltipster")
  def tooltipster_close(method: close, callback: TooltipsterStandardCallbackFunction): JQuery
  /**
    * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
    * will be returned.
    */
  @JSName("tooltipster")
  def tooltipster_content(method: content): Any
  /**
    * Updates the tooltip's content.
    * @param value the new content of the tooltip
    */
  @JSName("tooltipster")
  def tooltipster_content(method: content, value: String): JQuery
  /**
    * Closes and destroys the tooltip functionality.
    */
  @JSName("tooltipster")
  def tooltipster_destroy(method: destroy): JQuery
  /**
    * Temporarily disables a tooltip from being able to open.
    */
  @JSName("tooltipster")
  def tooltipster_disable(method: disable): JQuery
  /**
    * Returns the HTML element which has been tooltipped.
    */
  @JSName("tooltipster")
  def tooltipster_elementOrigin(method: elementOrigin): HTMLElement
  /**
    * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
    */
  @JSName("tooltipster")
  def tooltipster_elementTooltip(method: elementTooltip): HTMLElement | Null
  /**
    * If a tooltip was disabled, restores its previous functionality.
    */
  @JSName("tooltipster")
  def tooltipster_enable(method: enable): JQuery
  /**
    * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
    * only the instance of the first will be returned.
    */
  @JSName("tooltipster")
  def tooltipster_instance(method: instance): ITooltipsterInstance
  /**
    * Handle Tooltipster's `off` event coming from any instance.
    */
  @JSName("tooltipster")
  def tooltipster_off(method: off, eventName: String): JQuery
  /**
    * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
    * for a complete description of available events.
    */
  @JSName("tooltipster")
  def tooltipster_on(method: on, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery
  /**
    * Handle Tooltipster's `one` event coming from any instance.
    */
  @JSName("tooltipster")
  def tooltipster_one(method: one, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery
  /**
    * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
    * is called when the opening animation has ended
    */
  @JSName("tooltipster")
  def tooltipster_open(method: open): JQuery
  @JSName("tooltipster")
  def tooltipster_open(method: open, callback: TooltipsterStandardCallbackFunction): JQuery
  /**
    * Returns the value of an option.
    */
  @JSName("tooltipster")
  def tooltipster_option(method: option, optionName: String): Any
  /**
    * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
    */
  @JSName("tooltipster")
  def tooltipster_option(method: option, optionName: String, optionValue: Any): JQuery
  /**
    * Resizes and repositions the tooltip.
    */
  @JSName("tooltipster")
  def tooltipster_reposition(method: reposition): JQuery
  /**
    * Returns various information about the tooltip, like whether it is open or not. See 
    * http://iamceege.github.io/tooltipster/#status
    */
  @JSName("tooltipster")
  def tooltipster_status(method: status): ITooltipStatus
  /**
    * Trigger a Tooltipster's event coming from any instance.
    */
  @JSName("tooltipster")
  def tooltipster_triggerHandler(method: triggerHandler, eventName: String): JQuery
}
object JQuery {
  
  inline def apply(tooltipster: ITooltipsterJQuery): JQuery = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTooltipster(value: ITooltipsterJQuery): Self = StObject.set(x, "tooltipster", value.asInstanceOf[js.Any])
  }
}
