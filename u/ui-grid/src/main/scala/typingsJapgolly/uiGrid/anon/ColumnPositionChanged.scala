package typingsJapgolly.uiGrid.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.uiGrid.mod.moveColumns.columnPositionChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnPositionChanged extends StObject {
  
  /**
    * Raised when a column is moved
    * @param scope Grid Scope
    * @param handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.undefined
}
object ColumnPositionChanged {
  
  inline def apply(): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPositionChanged]
  }
  
  extension [Self <: ColumnPositionChanged](x: Self) {
    
    inline def setColumnPositionChanged(value: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Callback): Self = StObject.set(x, "columnPositionChanged", js.Any.fromFunction2((t0: /* scope */ IScope, t1: /* handler */ columnPositionChangedHandler) => (value(t0, t1)).runNow()))
    
    inline def setColumnPositionChangedUndefined: Self = StObject.set(x, "columnPositionChanged", js.undefined)
  }
}
