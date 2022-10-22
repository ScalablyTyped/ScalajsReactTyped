package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterClose extends StObject {
  
  def afterClose(): Unit
  
  var closable: Boolean
  
  var disabled: Boolean
  
  def onChange(): Unit
  
  def onClose(): Unit
  
  def onLongPress(): Unit
  
  var selected: Boolean
  
  var small: Boolean
}
object AfterClose {
  
  inline def apply(
    afterClose: Callback,
    closable: Boolean,
    disabled: Boolean,
    onChange: Callback,
    onClose: Callback,
    onLongPress: Callback,
    selected: Boolean,
    small: Boolean
  ): AfterClose = {
    val __obj = js.Dynamic.literal(afterClose = afterClose.toJsFn, closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onChange = onChange.toJsFn, onClose = onClose.toJsFn, onLongPress = onLongPress.toJsFn, selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterClose]
  }
  
  extension [Self <: AfterClose](x: Self) {
    
    inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
    
    inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
