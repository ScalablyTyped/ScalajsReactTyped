package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof tuya-panel-kit.tuya-panel-kit.DatePickerProps, 'theme' | 'children'> ]: tuya-panel-kit.tuya-panel-kit.DatePickerProps[P]} */ trait PopupDatePickerProps
  extends StObject
     with PopupProps {
  
  /**
    * @language zh-CN
    * @description 日期更改回调
    * @defaultValue () => {}
    */
  /**
    * @language en-US
    * @description Value change callback
    * @defaultValue () => {}
    */
  var _onDataChange: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
}
object PopupDatePickerProps {
  
  inline def apply(): PopupDatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupDatePickerProps]
  }
  
  extension [Self <: PopupDatePickerProps](x: Self) {
    
    inline def set_onDataChange(value: /* date */ js.Date => Callback): Self = StObject.set(x, "_onDataChange", js.Any.fromFunction1((t0: /* date */ js.Date) => value(t0).runNow()))
    
    inline def set_onDataChangeUndefined: Self = StObject.set(x, "_onDataChange", js.undefined)
  }
}
