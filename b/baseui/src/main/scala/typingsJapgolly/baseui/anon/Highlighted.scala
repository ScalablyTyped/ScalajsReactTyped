package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlighted extends StObject {
  
  var adapter: DateIOAdapter[js.Date]
  
  var disabled: Boolean
  
  var highlighted: Boolean
  
  def onBlur(): Unit
  
  def onClick(): Unit
  
  def onFocus(): Unit
  
  def onMouseLeave(): Unit
  
  def onMouseOver(): Unit
  
  def onSelect(): Unit
  
  var peekNextMonth: Boolean
  
  var range: Boolean
  
  var value: Any
}
object Highlighted {
  
  inline def apply(
    adapter: DateIOAdapter[js.Date],
    disabled: Boolean,
    highlighted: Boolean,
    onBlur: Callback,
    onClick: Callback,
    onFocus: Callback,
    onMouseLeave: Callback,
    onMouseOver: Callback,
    onSelect: Callback,
    peekNextMonth: Boolean,
    range: Boolean,
    value: Any
  ): Highlighted = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onClick = onClick.toJsFn, onFocus = onFocus.toJsFn, onMouseLeave = onMouseLeave.toJsFn, onMouseOver = onMouseOver.toJsFn, onSelect = onSelect.toJsFn, peekNextMonth = peekNextMonth.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlighted]
  }
  
  extension [Self <: Highlighted](x: Self) {
    
    inline def setAdapter(value: DateIOAdapter[js.Date]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setOnMouseLeave(value: Callback): Self = StObject.set(x, "onMouseLeave", value.toJsFn)
    
    inline def setOnMouseOver(value: Callback): Self = StObject.set(x, "onMouseOver", value.toJsFn)
    
    inline def setOnSelect(value: Callback): Self = StObject.set(x, "onSelect", value.toJsFn)
    
    inline def setPeekNextMonth(value: Boolean): Self = StObject.set(x, "peekNextMonth", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
