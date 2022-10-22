package typingsJapgolly.reactColor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.ColorResult
import typingsJapgolly.reactColor.mod.CustomPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCommonSaturationMod {
  
  @JSImport("react-color/lib/components/common/Saturation", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SaturationProps, js.Object, Any]
  
  type Saturation = japgolly.scalajs.react.facade.React.Component[SaturationProps & js.Object, js.Object]
  
  trait SaturationProps
    extends StObject
       with CustomPickerProps[
          japgolly.scalajs.react.facade.React.Component[SaturationProps & js.Object, js.Object]
        ]
  object SaturationProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): SaturationProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (onChange(t0, t1)).runNow()))
      __obj.asInstanceOf[SaturationProps]
    }
  }
}
