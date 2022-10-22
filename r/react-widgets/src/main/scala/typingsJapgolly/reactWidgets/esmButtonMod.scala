package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmButtonMod {
  
  @JSImport("react-widgets/esm/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameDisabledLabelIconBusyChildrenSpinnerProps: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameDisabledLabelIconBusyChildrenSpinnerProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with HTMLProps[HTMLButtonElement] {
    
    var busy: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var spinner: js.UndefOr[Node] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSpinner(value: VdomNode): Self = StObject.set(x, "spinner", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSpinnerNull: Self = StObject.set(x, "spinner", null)
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setSpinnerVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "spinner", js.Array(value*))
      
      inline def setSpinnerVdomElement(value: VdomElement): Self = StObject.set(x, "spinner", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
