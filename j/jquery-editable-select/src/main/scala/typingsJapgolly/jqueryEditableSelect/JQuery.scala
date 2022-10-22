package typingsJapgolly.jqueryEditableSelect

import typingsJapgolly.jqueryEditableSelect.JQueryEditableSelect.EditableSelectOptions
import typingsJapgolly.jqueryEditableSelect.anon.Name
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.add
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.clear
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.destroy
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.filter
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.hide
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.remove
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.select
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Transforms the <select> into a typeahead field. Accepts an optional options object.
    *
    * @param options Options setting the editable select behavior
    */
  def editableSelect(): JQuery = js.native
  /**
    * Manually shows/hide/filters/clears/destorys the dropdown list.
    *
    * @param action Action to apply
    */
  def editableSelect(action: show | hide | filter | clear | destroy): Unit = js.native
  def editableSelect(options: EditableSelectOptions): JQuery = js.native
  /**
    * Adds a new option in the dropdown list
    *
    * @param action Action to apply, must be 'add'
    * @param text Test to be displayed
    * @param index position to insert the element at.
    * @param attrs optional attributes to add to the element
    * @param data optional data to add to the element
    */
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double, attrs: js.Array[Name]): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double, attrs: js.Array[Name], data: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Double, attrs: Unit, data: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Unit, attrs: js.Array[Name]): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Unit, attrs: js.Array[Name], data: String): Unit = js.native
  @JSName("editableSelect")
  def editableSelect_add(action: add, text: String, index: Unit, attrs: Unit, data: String): Unit = js.native
  /**
    * Removes an option in the dropdown list at the given index.
    *
    * @param action Action to apply, must be 'remove'
    * @param index position of the element to remove.
    */
  @JSName("editableSelect")
  def editableSelect_remove(action: remove, index: Double): Unit = js.native
  /**
    * Manually sets the value of the text field to the value of the $element passed as parameter.
    *
    * @param action Action to apply, must be 'select'
    * @param element element to select (it must be one of the elements in the dropdown list)
    */
  @JSName("editableSelect")
  def editableSelect_select(action: select, element: JQuery): Unit = js.native
}
