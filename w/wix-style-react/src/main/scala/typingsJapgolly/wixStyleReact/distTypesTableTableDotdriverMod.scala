package typingsJapgolly.wixStyleReact

import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotdriverMod.CheckboxDriver
import typingsJapgolly.wixStyleReact.distTypesTableDataTableDataTableDotdriverMod.DataTableDriver
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ALL
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.NONE
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.SOME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTableDotdriverMod {
  
  @js.native
  trait TableDriver[T]
    extends StObject
       with DataTableDriver {
    
    def clickBulkSelectionCheckbox(): Unit = js.native
    
    /**
      * @deprecated
      */
    def clickRowChecbox(index: Double): Unit = js.native
    
    def clickRowCheckbox(index: Double): Unit = js.native
    
    var element: T = js.native
    
    def getBulkSelectionCheckboxDriver(): CheckboxDriver = js.native
    
    def getBulkSelectionState(): ALL | SOME | NONE = js.native
    
    def getCellTextValue(): String = js.native
    def getCellTextValue(row: Double): String = js.native
    def getCellTextValue(row: Double, column: Double): String = js.native
    def getCellTextValue(row: Unit, column: Double): String = js.native
    
    def getRowCheckboxDriver(index: Double): CheckboxDriver = js.native
    
    def getTitlebar(): HTMLElement = js.native
    
    def isBulkSelectionDisabled(): Boolean = js.native
    
    def isRowSelected(index: Double): Boolean = js.native
    
    def isRowSelectionDisabled(index: Double): Boolean = js.native
  }
}
