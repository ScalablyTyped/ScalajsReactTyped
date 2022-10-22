package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fold extends StObject {
  
  def addSubFold(fold: Fold): Fold
  
  var end: Point
  
  var foldLine: js.UndefOr[FoldLine] = js.undefined
  
  var range: Range
  
  def restoreRange(range: Range): Unit
  
  var sameRow: Boolean
  
  def setFoldLine(foldLine: FoldLine): Unit
  
  var start: Point
  
  var subFolds: js.Array[Fold]
}
object Fold {
  
  inline def apply(
    addSubFold: Fold => Fold,
    end: Point,
    range: Range,
    restoreRange: Range => Callback,
    sameRow: Boolean,
    setFoldLine: FoldLine => Callback,
    start: Point,
    subFolds: js.Array[Fold]
  ): Fold = {
    val __obj = js.Dynamic.literal(addSubFold = js.Any.fromFunction1(addSubFold), end = end.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], restoreRange = js.Any.fromFunction1((t0: Range) => restoreRange(t0).runNow()), sameRow = sameRow.asInstanceOf[js.Any], setFoldLine = js.Any.fromFunction1((t0: FoldLine) => setFoldLine(t0).runNow()), start = start.asInstanceOf[js.Any], subFolds = subFolds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fold]
  }
  
  extension [Self <: Fold](x: Self) {
    
    inline def setAddSubFold(value: Fold => Fold): Self = StObject.set(x, "addSubFold", js.Any.fromFunction1(value))
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setFoldLine(value: FoldLine): Self = StObject.set(x, "foldLine", value.asInstanceOf[js.Any])
    
    inline def setFoldLineUndefined: Self = StObject.set(x, "foldLine", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRestoreRange(value: Range => Callback): Self = StObject.set(x, "restoreRange", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setSameRow(value: Boolean): Self = StObject.set(x, "sameRow", value.asInstanceOf[js.Any])
    
    inline def setSetFoldLine(value: FoldLine => Callback): Self = StObject.set(x, "setFoldLine", js.Any.fromFunction1((t0: FoldLine) => value(t0).runNow()))
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSubFolds(value: js.Array[Fold]): Self = StObject.set(x, "subFolds", value.asInstanceOf[js.Any])
    
    inline def setSubFoldsVarargs(value: Fold*): Self = StObject.set(x, "subFolds", js.Array(value*))
  }
}
