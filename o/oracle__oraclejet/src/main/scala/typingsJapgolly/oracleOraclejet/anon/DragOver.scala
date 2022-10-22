package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.oracleOraclejet.ojlistviewMod.ojListView.ItemsDropContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOver extends StObject {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ org.scalajs.dom.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ org.scalajs.dom.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ org.scalajs.dom.Event, /* param1 */ Item, Unit]] = js.undefined
  
  var drop: js.UndefOr[
    js.Function2[/* param0 */ org.scalajs.dom.Event, /* param1 */ ItemsDropContext, Unit]
  ] = js.undefined
}
object DragOver {
  
  inline def apply(): DragOver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragOver]
  }
  
  extension [Self <: DragOver](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (/* param0 */ org.scalajs.dom.Event, /* param1 */ Item) => Callback): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.Event, t1: /* param1 */ Item) => (value(t0, t1)).runNow()))
    
    inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    inline def setDragLeave(value: (/* param0 */ org.scalajs.dom.Event, /* param1 */ Item) => Callback): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.Event, t1: /* param1 */ Item) => (value(t0, t1)).runNow()))
    
    inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    inline def setDragOver(value: (/* param0 */ org.scalajs.dom.Event, /* param1 */ Item) => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.Event, t1: /* param1 */ Item) => (value(t0, t1)).runNow()))
    
    inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    inline def setDrop(value: (/* param0 */ org.scalajs.dom.Event, /* param1 */ ItemsDropContext) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: /* param0 */ org.scalajs.dom.Event, t1: /* param1 */ ItemsDropContext) => (value(t0, t1)).runNow()))
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
  }
}
