package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectableOption extends StObject {
  
  var clickBehavior: js.UndefOr[String] = js.undefined
  
  var finish: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
  
  var ignoreVal: js.UndefOr[Double] = js.undefined
  
  var mouseButton: js.UndefOr[String] = js.undefined
  
  var rangeStyle: js.UndefOr[String | js.Object] = js.undefined
  
  var select: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Boolean]] = js.undefined
  
  var trigger: js.UndefOr[String] = js.undefined
  
  var unselect: js.UndefOr[js.Function1[/* e */ js.UndefOr[SelectableEvent], Unit]] = js.undefined
}
object SelectableOption {
  
  inline def apply(): SelectableOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableOption]
  }
  
  extension [Self <: SelectableOption](x: Self) {
    
    inline def setClickBehavior(value: String): Self = StObject.set(x, "clickBehavior", value.asInstanceOf[js.Any])
    
    inline def setClickBehaviorUndefined: Self = StObject.set(x, "clickBehavior", js.undefined)
    
    inline def setFinish(value: /* e */ js.UndefOr[SelectableEvent] => Callback): Self = StObject.set(x, "finish", js.Any.fromFunction1((t0: /* e */ js.UndefOr[SelectableEvent]) => value(t0).runNow()))
    
    inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    
    inline def setIgnoreVal(value: Double): Self = StObject.set(x, "ignoreVal", value.asInstanceOf[js.Any])
    
    inline def setIgnoreValUndefined: Self = StObject.set(x, "ignoreVal", js.undefined)
    
    inline def setMouseButton(value: String): Self = StObject.set(x, "mouseButton", value.asInstanceOf[js.Any])
    
    inline def setMouseButtonUndefined: Self = StObject.set(x, "mouseButton", js.undefined)
    
    inline def setRangeStyle(value: String | js.Object): Self = StObject.set(x, "rangeStyle", value.asInstanceOf[js.Any])
    
    inline def setRangeStyleUndefined: Self = StObject.set(x, "rangeStyle", js.undefined)
    
    inline def setSelect(value: /* e */ js.UndefOr[SelectableEvent] => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ js.UndefOr[SelectableEvent]) => value(t0).runNow()))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStart(value: /* e */ js.UndefOr[SelectableEvent] => Boolean): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setUnselect(value: /* e */ js.UndefOr[SelectableEvent] => Callback): Self = StObject.set(x, "unselect", js.Any.fromFunction1((t0: /* e */ js.UndefOr[SelectableEvent]) => value(t0).runNow()))
    
    inline def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
  }
}
