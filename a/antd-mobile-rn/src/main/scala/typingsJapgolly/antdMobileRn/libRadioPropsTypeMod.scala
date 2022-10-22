package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antdMobileRn.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRadioPropsTypeMod {
  
  trait RadioItemPropsType
    extends StObject
       with RadioPropsType {
    
    var onClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var radioProps: js.UndefOr[js.Object] = js.undefined
  }
  object RadioItemPropsType {
    
    inline def apply(): RadioItemPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemPropsType]
    }
    
    extension [Self <: RadioItemPropsType](x: Self) {
      
      inline def setOnClick(value: CallbackTo[Any]): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRadioProps(value: js.Object): Self = StObject.set(x, "radioProps", value.asInstanceOf[js.Any])
      
      inline def setRadioPropsUndefined: Self = StObject.set(x, "radioProps", js.undefined)
    }
  }
  
  trait RadioPropsType extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Target, Unit]] = js.undefined
    
    var wrapLabel: js.UndefOr[Boolean] = js.undefined
  }
  object RadioPropsType {
    
    inline def apply(): RadioPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioPropsType]
    }
    
    extension [Self <: RadioPropsType](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* e */ Target => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ Target) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
      
      inline def setWrapLabelUndefined: Self = StObject.set(x, "wrapLabel", js.undefined)
    }
  }
}
