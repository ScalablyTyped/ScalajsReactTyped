package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithLabelMod {
  
  @JSImport("wix-style-react/dist/types/InputWithLabel", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputWithLabelProps, js.Object, Any]
  
  type InputWithLabel = japgolly.scalajs.react.facade.React.Component[InputWithLabelProps & js.Object, js.Object]
  
  trait InputWithLabelProps
    extends StObject
       with InputProps {
    
    @JSName("border")
    var border_InputWithLabelProps: js.UndefOr[standard | bottomLine] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    @JSName("onFocus")
    var onFocus_InputWithLabelProps: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    @JSName("suffix")
    var suffix_InputWithLabelProps: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object InputWithLabelProps {
    
    inline def apply(): InputWithLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputWithLabelProps]
    }
    
    extension [Self <: InputWithLabelProps](x: Self) {
      
      inline def setBorder(value: standard | bottomLine): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setSuffix(value: js.Array[Node]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: Node*): Self = StObject.set(x, "suffix", js.Array(value*))
    }
  }
}
