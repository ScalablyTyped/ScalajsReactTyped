package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDateEditorMethods extends StObject {
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.igdateeditor#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.igdateeditor#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  def dropDownButton(): Unit = js.native
  
  def dropDownContainer(): Unit = js.native
  
  def dropDownVisible(): Unit = js.native
  
  def findListItemIndex(): Unit = js.native
  
  /**
    * Gets selected date as a date object. This method can be used when dataMode is set as either displayModeText or editModeText.
    * In such cases the value() method will not return date object and getSelectedDate() can be used to replace that functionality.
    */
  def getSelectedDate(): js.Date = js.native
  
  def getSelectedListItem(): Unit = js.native
  
  def hideDropDown(): Unit = js.native
  
  /**
    * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
    */
  def isValid(): Boolean = js.native
  
  /**
    * Sets selected date. This method can be used when dataMode is set as either displayModeText or editModeText.
    * In such cases the value() cannot accept a date object as a new value and getSelectedDate() can be used to replace that functionality.
    *
    * @param date
    */
  def selectDate(date: js.Date): Unit = js.native
  
  def selectedListIndex(): Unit = js.native
  
  def showDropDown(): Unit = js.native
  
  /**
    * Decreases the date or time period, depending on the current cursor position.
    *
    * @param delta The decrease delta.
    */
  def spinDown(): Unit = js.native
  def spinDown(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin down UI element of the editor.
    */
  def spinDownButton(): String = js.native
  
  /**
    * Increases the date or time period, depending on the current cursor position.
    *
    * @param delta The increase delta.
    */
  def spinUp(): Unit = js.native
  def spinUp(delta: Double): Unit = js.native
  
  /**
    * Returns a reference to the spin up UI element of the editor.
    */
  def spinUpButton(): String = js.native
  
  /**
    * Gets/Sets editor value.
    *
    * Note! This option doesn't use the dateInputFormat to extract the date
    *
    * @param newValue New editor value. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too. For example Date(/"thicks"/).
    */
  def value(): js.Date = js.native
  def value(newValue: js.Date): js.Date = js.native
}
