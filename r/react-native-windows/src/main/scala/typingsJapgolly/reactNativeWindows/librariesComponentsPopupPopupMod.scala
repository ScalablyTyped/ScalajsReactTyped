package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativeWindows.librariesComponentsPopupPopupPropsMod.IPopupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsPopupPopupMod {
  
  @JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
  @js.native
  open class Popup protected () extends Component[IPopupProps, IPopupTargetState, Any] {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  object Popup {
    
    @JSImport("react-native-windows/Libraries/Components/Popup/Popup", "Popup")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[IPopupTargetState]
  }
  
  trait IPopupTargetState extends StObject {
    
    var target: js.UndefOr[Double | Null] = js.undefined
    
    var targetRef: js.UndefOr[Node] = js.undefined
  }
  object IPopupTargetState {
    
    inline def apply(): IPopupTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopupTargetState]
    }
    
    extension [Self <: IPopupTargetState](x: Self) {
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetRef(value: VdomNode): Self = StObject.set(x, "targetRef", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTargetRefNull: Self = StObject.set(x, "targetRef", null)
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
      
      inline def setTargetRefVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "targetRef", js.Array(value*))
      
      inline def setTargetRefVdomElement(value: VdomElement): Self = StObject.set(x, "targetRef", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
