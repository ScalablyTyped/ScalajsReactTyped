package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.reactNativePaper.libTypescriptComponentsDataTableDataTableCellMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTableCell {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableCell", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DataTableCell.type): SharedBuilder_Props_799149358 = new SharedBuilder_Props_799149358(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_799149358 = new SharedBuilder_Props_799149358(js.Array(this.component, p.asInstanceOf[js.Any]))
}
