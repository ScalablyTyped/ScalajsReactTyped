package typingsJapgolly.reactNativeDialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextInput
import typingsJapgolly.reactNative.mod.TextInputProps
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Input", JSImport.Default)
  @js.native
  val default: FC[DialogInputProps] = js.native
  
  trait DialogInputProps
    extends StObject
       with TextInputProps {
    
    var label: js.UndefOr[Node] = js.undefined
    
    var textInputRef: js.UndefOr[LegacyRef[TextInput]] = js.undefined
    
    var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object DialogInputProps {
    
    inline def apply(): DialogInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogInputProps]
    }
    
    extension [Self <: DialogInputProps](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTextInputRef(value: LegacyRef[TextInput]): Self = StObject.set(x, "textInputRef", value.asInstanceOf[js.Any])
      
      inline def setTextInputRefFunction1(value: TextInput | Null => Callback): Self = StObject.set(x, "textInputRef", js.Any.fromFunction1((t0: TextInput | Null) => value(t0).runNow()))
      
      inline def setTextInputRefNull: Self = StObject.set(x, "textInputRef", null)
      
      inline def setTextInputRefUndefined: Self = StObject.set(x, "textInputRef", js.undefined)
      
      inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
  
  type _To = FC[DialogInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `libInputMod.foo` */
  override def _to: FC[DialogInputProps] = default
}
