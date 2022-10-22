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
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Button", JSImport.Default)
  @js.native
  val default: FC[DialogButtonProps] = js.native
  
  trait DialogButtonProps
    extends StObject
       with TextProps {
    
    var bold: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[ColorValue] = js.undefined
    
    var label: Node
    
    @JSName("onPress")
    def onPress_MDialogButtonProps(): Unit
  }
  object DialogButtonProps {
    
    inline def apply(onPress: Callback): DialogButtonProps = {
      val __obj = js.Dynamic.literal(onPress = onPress.toJsFn, label = null)
      __obj.asInstanceOf[DialogButtonProps]
    }
    
    extension [Self <: DialogButtonProps](x: Self) {
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    }
  }
  
  type _To = FC[DialogButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libButtonMod.foo` */
  override def _to: FC[DialogButtonProps] = default
}
