package typingsJapgolly.agGrid

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.agGrid.colDefMod.CellClassParams
import typingsJapgolly.agGrid.colDefMod.ColDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/styling/stylingService", JSImport.Namespace)
@js.native
object stylingServiceMod extends js.Object {
  @js.native
  class StylingService () extends js.Object {
    var expressionService: js.Any = js.native
    def processAllCellClasses(colDef: ColDef, params: js.Any, onApplicableClass: js.Function1[/* className */ String, Unit]): Unit = js.native
    def processAllCellClasses(
      colDef: ColDef,
      params: js.Any,
      onApplicableClass: js.Function1[/* className */ String, Unit],
      onNotApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    def processClassRules(
      classRules: StringDictionary[js.Function | String],
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    def processClassRules(
      classRules: StringDictionary[js.Function | String],
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit],
      onNotApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
    def processStaticCellClasses(
      colDef: ColDef,
      params: CellClassParams,
      onApplicableClass: js.Function1[/* className */ String, Unit]
    ): Unit = js.native
  }
  
}

