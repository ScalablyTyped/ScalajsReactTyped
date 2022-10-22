package typingsJapgolly.unstatedNext

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unstated-next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContainer[Value, State](useHook: js.Function1[/* initialState */ js.UndefOr[State], Value]): Container[Value, State] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(useHook.asInstanceOf[js.Any]).asInstanceOf[Container[Value, State]]
  
  inline def useContainer[Value, State](container: Container[Value, State]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("useContainer")(container.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  trait Container[Value, State] extends StObject {
    
    var Provider: ComponentType[ContainerProviderProps[State]]
    
    def useContainer(): Value
  }
  object Container {
    
    inline def apply[Value, State](Provider: ComponentType[ContainerProviderProps[State]], useContainer: CallbackTo[Value]): Container[Value, State] = {
      val __obj = js.Dynamic.literal(Provider = Provider.asInstanceOf[js.Any], useContainer = useContainer.toJsFn)
      __obj.asInstanceOf[Container[Value, State]]
    }
    
    extension [Self <: Container[?, ?], Value, State](x: Self & (Container[Value, State])) {
      
      inline def setProvider(value: ComponentType[ContainerProviderProps[State]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
      
      inline def setUseContainer(value: CallbackTo[Value]): Self = StObject.set(x, "useContainer", value.toJsFn)
    }
  }
  
  trait ContainerProviderProps[State] extends StObject {
    
    var children: Node
    
    var initialState: js.UndefOr[State] = js.undefined
  }
  object ContainerProviderProps {
    
    inline def apply[State](): ContainerProviderProps[State] = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ContainerProviderProps[State]]
    }
    
    extension [Self <: ContainerProviderProps[?], State](x: Self & ContainerProviderProps[State]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    }
  }
}
