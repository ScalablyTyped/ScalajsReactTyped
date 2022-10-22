package typingsJapgolly.reactNativeDialog

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactNative.mod.SwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwitchMod extends Shortcut {
  
  @JSImport("react-native-dialog/lib/Switch", JSImport.Default)
  @js.native
  val default: FC[DialogSwitchProps] = js.native
  
  trait DialogSwitchProps
    extends StObject
       with SwitchProps {
    
    var label: js.UndefOr[Node] = js.undefined
  }
  object DialogSwitchProps {
    
    inline def apply(): DialogSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogSwitchProps]
    }
    
    extension [Self <: DialogSwitchProps](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[DialogSwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSwitchMod.foo` */
  override def _to: FC[DialogSwitchProps] = default
}
