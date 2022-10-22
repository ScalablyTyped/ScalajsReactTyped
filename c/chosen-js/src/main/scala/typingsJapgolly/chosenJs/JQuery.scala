package typingsJapgolly.chosenJs

import typingsJapgolly.chosenJs.Chosen.OnEvent
import typingsJapgolly.chosenJs.Chosen.Options
import typingsJapgolly.chosenJs.Chosen.SelectedData
import typingsJapgolly.chosenJs.Chosen.TriggerEvent
import typingsJapgolly.chosenJs.chosenJsStrings.change
import typingsJapgolly.chosenJs.chosenJsStrings.destroy
import typingsJapgolly.jquery.JQuery.TriggeredEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def chosen(): JQuery = js.native
  def chosen(options: Options): JQuery = js.native
  @JSName("chosen")
  def chosen_destroy(options: destroy): JQuery = js.native
  
  /**
    * * `chosen:ready` Triggered after Chosen has been fully instantiated.
    * * `chosen:maxselected` Triggered if max_selected_options is set and that total is broken.
    * * `chosen:showing_dropdown` Triggered when Chosen’s dropdown is opened.
    * * `chosen:hiding_dropdown` Triggered when Chosen’s dropdown is closed.
    * * `chosen:no_results` Triggered when a search returns no matching results.
    */
  def on(events: OnEvent, handler: js.Function1[/* eventObject */ TriggeredEvent[Any, Any, Any, Any], Any]): JQuery = js.native
  /**
    * Chosen triggers the standard DOM event whenever a selection is made (it also sends a selected or deselected parameter that tells you which option was changed).
    */
  @JSName("on")
  def on_change(
    events: change,
    handler: js.Function2[/* eventObject */ TriggeredEvent[Any, Any, Any, Any], /* args */ SelectedData, Any]
  ): JQuery = js.native
  
  /**
    * * `chosen:updated` This event should be triggered whenever Chosen’s underlying select element changes (such as a change in selected options).
    * * `chosen:activate` This is the equivalent of focusing a standard HTML select field. When activated, Chosen will capture keypress events as if you had clicked the field directly.
    * * `chosen:open` This event activates Chosen and also displays the search results.
    * * `chosen:close` This event deactivates Chosen and hides the search results.
    */
  def trigger(eventType: TriggerEvent): JQuery = js.native
}
