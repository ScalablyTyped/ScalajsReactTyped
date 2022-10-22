package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.TableComponentProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined data, columns, fontSize, selectedRows, forceFitColumns, title, ariaRowCount, ariaColumnCount, updateCells, moveFocusOutWithTab */ @js.native
trait TableComponent
  extends StObject
     with Component {
  
  var ariaColumnCount: js.UndefOr[Double] = js.native
  
  var ariaRowCount: js.UndefOr[Double] = js.native
  
  var columns: js.Array[String | TableColumn] = js.native
  
  var data: js.Array[js.Array[Any]] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var forceFitColumns: js.UndefOr[ColumnSizingMode] = js.native
  
  var moveFocusOutWithTab: js.UndefOr[Boolean] = js.native
  
  var onCellAction: js.UndefOr[Event[ICellActionEventArgs]] = js.native
  
  def onRowSelected(listener: js.Function1[/* e */ Any, Any]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Any): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onRowSelected(listener: js.Function1[/* e */ Any, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  @JSName("onRowSelected")
  var onRowSelected_Original: Event[Any] = js.native
  
  var selectedRows: js.UndefOr[js.Array[Double]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var updateCells: js.UndefOr[js.Array[TableCell]] = js.native
}
