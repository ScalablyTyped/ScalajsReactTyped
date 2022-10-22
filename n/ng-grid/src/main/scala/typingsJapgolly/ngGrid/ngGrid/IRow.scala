package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRow extends StObject {
  
  def afterSelectionChange(): Unit
  
  def alternatingRowClass(): Unit
  
  def beforeSelectionChange(): Unit
  
  var config: IRowConfig
  
  def continueSelection(event: Any): Unit
  
  def copy(): IRow
  
  var cursor: String
  
  def ensureEntity(expected: Any): Unit
  
  var entity: Any
  
  def getProperty(path: String): Any
  
  var offsetTop: Double
  
  var rowDisplayIndex: Double
  
  var rowIndex: Double
  
  var selected: Boolean
  
  var selectionProvider: ISelectionProvider
  
  def setSelection(isSelected: Boolean): Unit
  
  def setVars(fromRow: IRow): Unit
  
  def toggleSelected(event: Any): Boolean
  
  var utils: Any
}
object IRow {
  
  inline def apply(
    afterSelectionChange: Callback,
    alternatingRowClass: Callback,
    beforeSelectionChange: Callback,
    config: IRowConfig,
    continueSelection: Any => Callback,
    copy: CallbackTo[IRow],
    cursor: String,
    ensureEntity: Any => Callback,
    entity: Any,
    getProperty: String => Any,
    offsetTop: Double,
    rowDisplayIndex: Double,
    rowIndex: Double,
    selected: Boolean,
    selectionProvider: ISelectionProvider,
    setSelection: Boolean => Callback,
    setVars: IRow => Callback,
    toggleSelected: Any => Boolean,
    utils: Any
  ): IRow = {
    val __obj = js.Dynamic.literal(afterSelectionChange = afterSelectionChange.toJsFn, alternatingRowClass = alternatingRowClass.toJsFn, beforeSelectionChange = beforeSelectionChange.toJsFn, config = config.asInstanceOf[js.Any], continueSelection = js.Any.fromFunction1((t0: Any) => continueSelection(t0).runNow()), copy = copy.toJsFn, cursor = cursor.asInstanceOf[js.Any], ensureEntity = js.Any.fromFunction1((t0: Any) => ensureEntity(t0).runNow()), entity = entity.asInstanceOf[js.Any], getProperty = js.Any.fromFunction1(getProperty), offsetTop = offsetTop.asInstanceOf[js.Any], rowDisplayIndex = rowDisplayIndex.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectionProvider = selectionProvider.asInstanceOf[js.Any], setSelection = js.Any.fromFunction1((t0: Boolean) => setSelection(t0).runNow()), setVars = js.Any.fromFunction1((t0: IRow) => setVars(t0).runNow()), toggleSelected = js.Any.fromFunction1(toggleSelected), utils = utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRow]
  }
  
  extension [Self <: IRow](x: Self) {
    
    inline def setAfterSelectionChange(value: Callback): Self = StObject.set(x, "afterSelectionChange", value.toJsFn)
    
    inline def setAlternatingRowClass(value: Callback): Self = StObject.set(x, "alternatingRowClass", value.toJsFn)
    
    inline def setBeforeSelectionChange(value: Callback): Self = StObject.set(x, "beforeSelectionChange", value.toJsFn)
    
    inline def setConfig(value: IRowConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setContinueSelection(value: Any => Callback): Self = StObject.set(x, "continueSelection", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCopy(value: CallbackTo[IRow]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setEnsureEntity(value: Any => Callback): Self = StObject.set(x, "ensureEntity", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setEntity(value: Any): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setGetProperty(value: String => Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setRowDisplayIndex(value: Double): Self = StObject.set(x, "rowDisplayIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectionProvider(value: ISelectionProvider): Self = StObject.set(x, "selectionProvider", value.asInstanceOf[js.Any])
    
    inline def setSetSelection(value: Boolean => Callback): Self = StObject.set(x, "setSelection", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVars(value: IRow => Callback): Self = StObject.set(x, "setVars", js.Any.fromFunction1((t0: IRow) => value(t0).runNow()))
    
    inline def setToggleSelected(value: Any => Boolean): Self = StObject.set(x, "toggleSelected", js.Any.fromFunction1(value))
    
    inline def setUtils(value: Any): Self = StObject.set(x, "utils", value.asInstanceOf[js.Any])
  }
}
