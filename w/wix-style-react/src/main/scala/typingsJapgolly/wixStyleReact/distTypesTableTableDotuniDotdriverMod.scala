package typingsJapgolly.wixStyleReact

import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typingsJapgolly.wixStyleReact.distTypesTableDataTableDataTableDotuniDotdriverMod.DataTableDriver
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ALL
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.NONE
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.SOME
import typingsJapgolly.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTableDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Table/Table.uni.driver", "tableUniDriverFactory")
  @js.native
  val tableUniDriverFactory: UniDriverFactory[TableUniDriver] = js.native
  
  @js.native
  trait TableUniDriver
    extends StObject
       with DataTableDriver {
    
    def clickBulkSelectionCheckbox(): js.Promise[Unit] = js.native
    
    def clickRowCheckbox(index: Double): js.Promise[Unit] = js.native
    
    def getBulkSelectionCheckboxDriver(): js.Promise[CheckboxUniDriver] = js.native
    
    def getBulkSelectionState(): js.Promise[ALL | SOME | NONE] = js.native
    
    def getCellTextValue(): js.Promise[String] = js.native
    def getCellTextValue(row: Double): js.Promise[String] = js.native
    def getCellTextValue(row: Double, column: Double): js.Promise[String] = js.native
    def getCellTextValue(row: Unit, column: Double): js.Promise[String] = js.native
    
    def getRowCheckboxDriver(index: Double): js.Promise[CheckboxUniDriver] = js.native
    
    def getSelectionTooltipContent(index: Double): js.Promise[String] = js.native
    
    def getTitlebar(): js.Promise[UniDriver[Any] | Null] = js.native
    
    def isBulkSelectionDisabled(): js.Promise[Boolean] = js.native
    
    def isRowSelected(index: Double): js.Promise[Boolean] = js.native
    
    def isRowSelectionDisabled(index: Double): js.Promise[Boolean] = js.native
    
    def isSelectionTooltipEnabled(index: Double): js.Promise[Boolean] = js.native
  }
}
