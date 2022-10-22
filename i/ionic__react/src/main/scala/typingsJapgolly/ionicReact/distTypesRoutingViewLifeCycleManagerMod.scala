package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicReact.anon.ComponentCanBeDestroyed
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingViewLifeCycleManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/ViewLifeCycleManager", "ViewLifeCycleManager")
  @js.native
  open class ViewLifeCycleManager protected () extends Component[ViewTransitionManagerProps, ViewTransitionManagerState, Any] {
    def this(props: ViewTransitionManagerProps) = this()
    
    /* private */ var _isMounted: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MViewLifeCycleManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MViewLifeCycleManager(): Unit = js.native
    
    var ionLifeCycleContext: ComponentCanBeDestroyed = js.native
  }
  
  trait ViewTransitionManagerProps extends StObject {
    
    var mount: Boolean
    
    def removeView(): Unit
  }
  object ViewTransitionManagerProps {
    
    inline def apply(mount: Boolean, removeView: Callback): ViewTransitionManagerProps = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], removeView = removeView.toJsFn)
      __obj.asInstanceOf[ViewTransitionManagerProps]
    }
    
    extension [Self <: ViewTransitionManagerProps](x: Self) {
      
      inline def setMount(value: Boolean): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      inline def setRemoveView(value: Callback): Self = StObject.set(x, "removeView", value.toJsFn)
    }
  }
  
  trait ViewTransitionManagerState extends StObject {
    
    var show: Boolean
  }
  object ViewTransitionManagerState {
    
    inline def apply(show: Boolean): ViewTransitionManagerState = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewTransitionManagerState]
    }
    
    extension [Self <: ViewTransitionManagerState](x: Self) {
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
