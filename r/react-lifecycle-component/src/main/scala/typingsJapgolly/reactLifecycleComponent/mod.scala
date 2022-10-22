package typingsJapgolly.reactLifecycleComponent

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentLifecycle
import typingsJapgolly.reactRedux.esComponentsConnectMod.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycle-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  open class LifecycleComponent protected () extends Component[Props[Any, Any], Any, Any] {
    def this(props: Props[Any, Any]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props[Any, Any], context: Any) = this()
  }
  
  inline def applyLifecycle[P, S](component: ComponentClassP[P & js.Object]): ComponentClassP[P & (LifecycleDispatchProps[P, S]) & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyLifecycle")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[P & (LifecycleDispatchProps[P, S]) & js.Object]]
  
  @JSImport("react-lifecycle-component", "connectWithLifecycle")
  @js.native
  val connectWithLifecycle: Connect[Any] = js.native
  
  type LifecycleDispatchProps[P, S] = ComponentLifecycle[P, S, Any]
  
  trait LifecycleStateProps[P, S] extends StObject {
    
    var component: ComponentClassP[P & js.Object]
  }
  object LifecycleStateProps {
    
    inline def apply[P, S](component: ComponentClassP[P & js.Object]): LifecycleStateProps[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecycleStateProps[P, S]]
    }
    
    extension [Self <: LifecycleStateProps[?, ?], P, S](x: Self & (LifecycleStateProps[P, S])) {
      
      inline def setComponent(value: ComponentClassP[P & js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props[P, S]
    extends StObject
       with LifecycleStateProps[P, S]
       with ComponentLifecycle[P, S, Any]
  object Props {
    
    inline def apply[P, S](component: ComponentClassP[P & js.Object]): Props[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P, S]]
    }
  }
}
