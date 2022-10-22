package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSizeChanged extends StObject {
  
  /**
    * Raised when column is resized
    * @param scope Grid Scope
    * @param handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit
}
object ColumnSizeChanged {
  
  inline def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Callback): ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2((t0: IScope, t1: columnSizeChangedHandler) => (columnSizeChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[ColumnSizeChanged]
  }
  
  extension [Self <: ColumnSizeChanged](x: Self) {
    
    inline def setColumnSizeChanged(value: (IScope, columnSizeChangedHandler) => Callback): Self = StObject.set(x, "columnSizeChanged", js.Any.fromFunction2((t0: IScope, t1: columnSizeChangedHandler) => (value(t0, t1)).runNow()))
  }
}
