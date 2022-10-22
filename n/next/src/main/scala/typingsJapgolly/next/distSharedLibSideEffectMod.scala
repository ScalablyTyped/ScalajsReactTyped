package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibSideEffectMod {
  
  @JSImport("next/dist/shared/lib/side-effect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SideEffectProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  trait SideEffectProps extends StObject {
    
    var children: Node
    
    var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
    
    var headManager: Any
    
    var inAmpMode: js.UndefOr[Boolean] = js.undefined
    
    def reduceComponentsToState[T /* <: js.Object */](components: js.Array[Element], props: T): State
  }
  object SideEffectProps {
    
    inline def apply(headManager: Any, reduceComponentsToState: (js.Array[Element], Any) => State): SideEffectProps = {
      val __obj = js.Dynamic.literal(headManager = headManager.asInstanceOf[js.Any], reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState), children = null)
      __obj.asInstanceOf[SideEffectProps]
    }
    
    extension [Self <: SideEffectProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandleStateChange(value: /* state */ State => Callback): Self = StObject.set(x, "handleStateChange", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
      
      inline def setHandleStateChangeUndefined: Self = StObject.set(x, "handleStateChange", js.undefined)
      
      inline def setHeadManager(value: Any): Self = StObject.set(x, "headManager", value.asInstanceOf[js.Any])
      
      inline def setInAmpMode(value: Boolean): Self = StObject.set(x, "inAmpMode", value.asInstanceOf[js.Any])
      
      inline def setInAmpModeUndefined: Self = StObject.set(x, "inAmpMode", js.undefined)
      
      inline def setReduceComponentsToState(value: (js.Array[Element], Any) => State): Self = StObject.set(x, "reduceComponentsToState", js.Any.fromFunction2(value))
    }
  }
  
  type State = js.UndefOr[js.Array[typingsJapgolly.react.mod.global.JSX.Element]]
}
