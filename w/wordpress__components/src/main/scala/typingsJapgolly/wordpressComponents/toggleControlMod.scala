package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typingsJapgolly.wordpressComponents.toggleControlMod.ToggleControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleControlMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/toggle-control", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ToggleControl {
    
    trait Props
      extends StObject
         with ControlProps {
      
      /**
        * If checked is `true` the toggle will be checked. If checked is
        * `false` the toggle will be unchecked. If no value is passed the
        * toggle will be unchecked.
        */
      var checked: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A function that receives the checked state as input.
        */
      var onChange: js.UndefOr[js.Function1[/* isChecked */ Boolean, Unit]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
        
        inline def setOnChange(value: /* isChecked */ Boolean => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* isChecked */ Boolean) => value(t0).runNow()))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      }
    }
  }
}
