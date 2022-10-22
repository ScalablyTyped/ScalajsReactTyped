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

object libComponentsCommonAlphaMod {
  
  @JSImport("react-color/lib/components/common/Alpha", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AlphaProps, js.Object, Any]
  
  type Alpha = japgolly.scalajs.react.facade.React.Component[AlphaProps & js.Object, js.Object]
  
  trait AlphaProps
    extends StObject
       with CustomPickerProps[japgolly.scalajs.react.facade.React.Component[AlphaProps & js.Object, js.Object]]
  object AlphaProps {
    
    inline def apply(onChange: (/* color */ ColorResult, /* event */ ReactEventFrom[HTMLInputElement]) => Callback): AlphaProps = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: /* color */ ColorResult, t1: /* event */ ReactEventFrom[HTMLInputElement]) => (onChange(t0, t1)).runNow()))
      __obj.asInstanceOf[AlphaProps]
    }
  }
}
