package typingsJapgolly.semanticUiDropdown

import typingsJapgolly.semanticUiDropdown.SemanticUI.Dropdown
import typingsJapgolly.semanticUiDropdown.SemanticUI.DropdownSettings
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind mouse events`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`bind touch events`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`determine intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`determine select action`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get default text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get item`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get placeholder text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`get value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`hide others`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is animated`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is hidden`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is selection`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`is visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove active`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove selected`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`remove visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore default text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore default value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore defaults`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`restore placeholder text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`save defaults`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set active`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set exactly`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set selected`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set text`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set value`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`set visible`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`setup menu`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.`unbind intent`
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.clear
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.destroy
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.hide
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.refresh
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.setting
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.show
import typingsJapgolly.semanticUiDropdown.semanticUiDropdownStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def dropdown(): JQuery
  def dropdown(settings: DropdownSettings): JQuery
  @JSName("dropdown")
  var dropdown_Original: Dropdown
  /**
    * Binds a click to document to determine if you click away from a dropdown
    */
  @JSName("dropdown")
  def dropdown_bindintent(behavior: `bind intent`): JQuery
  /**
    * Adds mouse events to element
    */
  @JSName("dropdown")
  def dropdown_bindmouseevents(behavior: `bind mouse events`): JQuery
  /**
    * Adds touch events to element
    */
  @JSName("dropdown")
  def dropdown_bindtouchevents(behavior: `bind touch events`): JQuery
  /**
    * Clears dropdown of selection
    */
  @JSName("dropdown")
  def dropdown_clear(behavior: clear): JQuery
  @JSName("dropdown")
  def dropdown_destroy(behavior: destroy): JQuery
  /**
    * Returns whether event occurred inside dropdown
    */
  @JSName("dropdown")
  def dropdown_determineintent(behavior: `determine intent`): Boolean
  /**
    * Triggers preset item selection action based on settings passing text/value
    */
  @JSName("dropdown")
  def dropdown_determineselectaction(behavior: `determine select action`, text: String, value: Any): JQuery
  /**
    * Returns dropdown value as set on page load
    */
  @JSName("dropdown")
  def dropdown_getdefaulttext(behavior: `get default text`): String
  /**
    * Returns DOM element that matches a given input value
    */
  @JSName("dropdown")
  def dropdown_getitem(behavior: `get item`, value: Any): JQuery
  /**
    * Returns placeholder text
    */
  @JSName("dropdown")
  def dropdown_getplaceholdertext(behavior: `get placeholder text`): String
  /**
    * Returns current dropdown text
    */
  @JSName("dropdown")
  def dropdown_gettext(behavior: `get text`): String
  /**
    * Returns current dropdown input value
    */
  @JSName("dropdown")
  def dropdown_getvalue(behavior: `get value`): Any
  /**
    * Hides dropdown
    */
  @JSName("dropdown")
  def dropdown_hide(behavior: hide): JQuery
  /**
    * Hides all other dropdowns that is not current dropdown
    */
  @JSName("dropdown")
  def dropdown_hideothers(behavior: `hide others`): JQuery
  /**
    * Returns whether dropdown is animated
    */
  @JSName("dropdown")
  def dropdown_isanimated(behavior: `is animated`): Boolean
  /**
    * Returns whether dropdown is hidden
    */
  @JSName("dropdown")
  def dropdown_ishidden(behavior: `is hidden`): Boolean
  /**
    * Returns whether dropdown is a selection dropdown
    */
  @JSName("dropdown")
  def dropdown_isselection(behavior: `is selection`): Boolean
  /**
    * Returns whether dropdown is visible
    */
  @JSName("dropdown")
  def dropdown_isvisible(behavior: `is visible`): Boolean
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("dropdown")
  def dropdown_refresh(behavior: refresh): JQuery
  /**
    * Removes dropdown active state
    */
  @JSName("dropdown")
  def dropdown_removeactive(behavior: `remove active`): JQuery
  /**
    * Remove value from selected
    */
  @JSName("dropdown")
  def dropdown_removeselected(behavior: `remove selected`, value: Any): JQuery
  /**
    * Removes dropdown visible state
    */
  @JSName("dropdown")
  def dropdown_removevisible(behavior: `remove visible`): JQuery
  /**
    * Restores dropdown text and value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaults(behavior: `restore defaults`): JQuery
  /**
    * Restores dropdown text to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaulttext(behavior: `restore default text`): JQuery
  /**
    * Restores dropdown value to its value on page load
    */
  @JSName("dropdown")
  def dropdown_restoredefaultvalue(behavior: `restore default value`): JQuery
  /**
    * Restores dropdown text to its prompt, placeholder text
    */
  @JSName("dropdown")
  def dropdown_restoreplaceholdertext(behavior: `restore placeholder text`): JQuery
  /**
    * Saves current text and value as new defaults (for use with restore)
    */
  @JSName("dropdown")
  def dropdown_savedefaults(behavior: `save defaults`): JQuery
  /**
    * Sets dropdown to active state
    */
  @JSName("dropdown")
  def dropdown_setactive(behavior: `set active`): JQuery
  /**
    * Sets selected values to exactly specified values, removing current selection
    */
  @JSName("dropdown")
  def dropdown_setexactly(behavior: `set exactly`, values: js.Array[Any]): JQuery
  /**
    * Sets value as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, value: Any): JQuery
  /**
    * Adds a group of values as selected
    */
  @JSName("dropdown")
  def dropdown_setselected(behavior: `set selected`, values: js.Array[Any]): JQuery
  /**
    * Sets dropdown text to a value
    */
  @JSName("dropdown")
  def dropdown_settext(behavior: `set text`, text: String): JQuery
  @JSName("dropdown")
  def dropdown_setting(behavior: setting, value: DropdownSettings): JQuery
  @JSName("dropdown")
  def dropdown_setting[K /* <: /* keyof semantic-ui-dropdown.SemanticUI.DropdownSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("dropdown")
  def dropdown_setting[K /* <: /* keyof semantic-ui-dropdown.SemanticUI.DropdownSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl[K] */ js.Any
  /**
    * Recreates dropdown menu from select option values.
    */
  @JSName("dropdown")
  def dropdown_setupmenu(behavior: `setup menu`): JQuery
  /**
    * Sets dropdown input to value (does not update display state)
    */
  @JSName("dropdown")
  def dropdown_setvalue(behavior: `set value`, value: Any): JQuery
  /**
    * Sets dropdown to visible state
    */
  @JSName("dropdown")
  def dropdown_setvisible(behavior: `set visible`): JQuery
  /**
    * Shows dropdown
    */
  @JSName("dropdown")
  def dropdown_show(behavior: show): JQuery
  /**
    * Toggles current visibility of dropdown
    */
  @JSName("dropdown")
  def dropdown_toggle(behavior: toggle): JQuery
  /**
    * Unbinds document intent click
    */
  @JSName("dropdown")
  def dropdown_unbindintent(behavior: `unbind intent`): JQuery
}
object JQuery {
  
  inline def apply(dropdown: Dropdown): JQuery = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDropdown(value: Dropdown): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
