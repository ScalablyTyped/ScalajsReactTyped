package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.mod.CustomPickerProps
import typingsJapgolly.reactColor.reactColorStrings.horizontal
import typingsJapgolly.reactColor.reactColorStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonHueMod {
  
  @JSImport("react-color/lib/components/common/Hue", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HueProps, js.Object, Any]
  
  type Hue = japgolly.scalajs.react.facade.React.Component[HueProps & js.Object, js.Object]
  
  trait HueProps
    extends StObject
       with CustomPickerProps[japgolly.scalajs.react.facade.React.Component[HueProps & js.Object, js.Object]] {
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
  }
  object HueProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): HueProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (onChange(t0, t1)).runNow()))
      __obj.asInstanceOf[HueProps]
    }
    
    extension [Self <: HueProps](x: Self) {
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
