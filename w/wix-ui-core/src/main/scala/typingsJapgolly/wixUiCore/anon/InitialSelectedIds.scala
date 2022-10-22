package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialSelectedIds extends StObject {
  
  var initialSelectedIds: js.Array[Any]
  
  var multi: Boolean
  
  def onDeselect(): Any
  
  def onSelect(): Any
  
  def renderSuffix(): Any
}
object InitialSelectedIds {
  
  inline def apply(
    initialSelectedIds: js.Array[Any],
    multi: Boolean,
    onDeselect: CallbackTo[Any],
    onSelect: CallbackTo[Any],
    renderSuffix: CallbackTo[Any]
  ): InitialSelectedIds = {
    val __obj = js.Dynamic.literal(initialSelectedIds = initialSelectedIds.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onDeselect = onDeselect.toJsFn, onSelect = onSelect.toJsFn, renderSuffix = renderSuffix.toJsFn)
    __obj.asInstanceOf[InitialSelectedIds]
  }
  
  extension [Self <: InitialSelectedIds](x: Self) {
    
    inline def setInitialSelectedIds(value: js.Array[Any]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedIdsVarargs(value: Any*): Self = StObject.set(x, "initialSelectedIds", js.Array(value*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setOnDeselect(value: CallbackTo[Any]): Self = StObject.set(x, "onDeselect", value.toJsFn)
    
    inline def setOnSelect(value: CallbackTo[Any]): Self = StObject.set(x, "onSelect", value.toJsFn)
    
    inline def setRenderSuffix(value: CallbackTo[Any]): Self = StObject.set(x, "renderSuffix", value.toJsFn)
  }
}
