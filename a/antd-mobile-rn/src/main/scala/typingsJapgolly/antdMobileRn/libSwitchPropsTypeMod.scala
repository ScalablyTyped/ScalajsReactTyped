package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchPropsTypeMod {
  
  trait SwitchPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* checked */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object SwitchPropsType {
    
    inline def apply(): SwitchPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchPropsType]
    }
    
    extension [Self <: SwitchPropsType](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* checked */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* checked */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* checked */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
