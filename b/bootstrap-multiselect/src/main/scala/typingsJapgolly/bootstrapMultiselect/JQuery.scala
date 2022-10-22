package typingsJapgolly.bootstrapMultiselect

import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.dataprovider
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.deselect
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.deselectAll
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.destroy
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.disable
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.enable
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.rebuild
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.refresh
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.select
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.selectAll
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.setAllSelectedText
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.setOptions
import typingsJapgolly.bootstrapMultiselect.bootstrapMultiselectStrings.updateButtonText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def multiselect(): JQuery = js.native
  def multiselect(
    method: deselectAll | destroy | disable | enable | rebuild | refresh | selectAll | updateButtonText
  ): JQuery = js.native
  def multiselect(method: selectAll | deselectAll, justVisible: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: String): JQuery = js.native
  def multiselect(method: select | deselect, value: String, triggerOnChange: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: js.Array[String]): JQuery = js.native
  def multiselect(method: select | deselect, value: js.Array[String], triggerOnChange: Boolean): JQuery = js.native
  def multiselect(method: select | deselect, value: Double): JQuery = js.native
  def multiselect(method: select | deselect, value: Double, triggerOnChange: Boolean): JQuery = js.native
  def multiselect(options: MultiSelectOptions): JQuery = js.native
  @JSName("multiselect")
  def multiselect_dataprovider(method: dataprovider, data: js.Array[MultiSelectOptionElement]): JQuery = js.native
  @JSName("multiselect")
  def multiselect_setAllSelectedText(method: setAllSelectedText, value: String): JQuery = js.native
  @JSName("multiselect")
  def multiselect_setOptions(method: setOptions, options: MultiSelectOptions): JQuery = js.native
}
