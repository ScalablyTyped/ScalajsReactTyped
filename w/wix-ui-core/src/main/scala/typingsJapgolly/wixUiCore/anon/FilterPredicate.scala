package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPredicate extends StObject {
  
  def filterPredicate(inputValue: Any, optionValue: Any): Any
  
  var highlightMatches: Boolean
  
  var initialSelectedIds: js.Array[Any]
  
  var multi: Boolean
  
  def onDeselect(): Any
  
  def onInitialSelectedOptionsSet(): Any
  
  def onManualInput(): Any
  
  def onSelect(): Any
  
  var openTrigger: String
  
  var placement: String
}
object FilterPredicate {
  
  inline def apply(
    filterPredicate: (Any, Any) => Any,
    highlightMatches: Boolean,
    initialSelectedIds: js.Array[Any],
    multi: Boolean,
    onDeselect: CallbackTo[Any],
    onInitialSelectedOptionsSet: CallbackTo[Any],
    onManualInput: CallbackTo[Any],
    onSelect: CallbackTo[Any],
    openTrigger: String,
    placement: String
  ): FilterPredicate = {
    val __obj = js.Dynamic.literal(filterPredicate = js.Any.fromFunction2(filterPredicate), highlightMatches = highlightMatches.asInstanceOf[js.Any], initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onDeselect = onDeselect.toJsFn, onInitialSelectedOptionsSet = onInitialSelectedOptionsSet.toJsFn, onManualInput = onManualInput.toJsFn, onSelect = onSelect.toJsFn, openTrigger = openTrigger.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPredicate]
  }
  
  extension [Self <: FilterPredicate](x: Self) {
    
    inline def setFilterPredicate(value: (Any, Any) => Any): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction2(value))
    
    inline def setHighlightMatches(value: Boolean): Self = StObject.set(x, "highlightMatches", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIds(value: js.Array[Any]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIdsVarargs(value: Any*): Self = StObject.set(x, "initialSelectedIds", js.Array(value*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setOnDeselect(value: CallbackTo[Any]): Self = StObject.set(x, "onDeselect", value.toJsFn)
    
    inline def setOnInitialSelectedOptionsSet(value: CallbackTo[Any]): Self = StObject.set(x, "onInitialSelectedOptionsSet", value.toJsFn)
    
    inline def setOnManualInput(value: CallbackTo[Any]): Self = StObject.set(x, "onManualInput", value.toJsFn)
    
    inline def setOnSelect(value: CallbackTo[Any]): Self = StObject.set(x, "onSelect", value.toJsFn)
    
    inline def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
