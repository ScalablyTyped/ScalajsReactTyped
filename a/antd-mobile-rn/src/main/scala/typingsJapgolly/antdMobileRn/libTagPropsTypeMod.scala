package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagPropsTypeMod {
  
  trait TagPropsType extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* selected */ Boolean, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object TagPropsType {
    
    inline def apply(): TagPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagPropsType]
    }
    
    extension [Self <: TagPropsType](x: Self) {
      
      inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* selected */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* selected */ Boolean) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
}
