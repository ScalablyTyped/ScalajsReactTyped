package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRouterOutletElement
import typingsJapgolly.ionicReact.distTypesContextsIonLifeCycleContextMod.IonLifeCycleContextInterface
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesRoutingStackContextMod.StackContextState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingOutletPageManagerMod {
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", JSImport.Default)
  @js.native
  open class default protected () extends OutletPageManager {
    def this(props: OutletPageManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing/OutletPageManager", "OutletPageManager")
  @js.native
  open class OutletPageManager protected ()
    extends Component[OutletPageManagerProps, js.Object, Any] {
    def this(props: OutletPageManagerProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MOutletPageManager(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOutletPageManager(): Unit = js.native
    
    @JSName("context")
    var context_OutletPageManager: ContextType[Context[StackContextState]] = js.native
    
    var ionLifeCycleContext: ContextType[Context[IonLifeCycleContextInterface]] = js.native
    
    var ionRouterOutlet: js.UndefOr[HTMLIonRouterOutletElement] = js.native
    
    def ionViewDidEnterHandler(): Unit = js.native
    
    def ionViewDidLeaveHandler(): Unit = js.native
    
    def ionViewWillEnterHandler(): Unit = js.native
    
    def ionViewWillLeaveHandler(): Unit = js.native
    
    var outletIsReady: Boolean = js.native
  }
  
  trait OutletPageManagerProps extends StObject {
    
    var StackManager: Any
    
    var className: js.UndefOr[String] = js.undefined
    
    var forwardedRef: js.UndefOr[ForwardedRef[HTMLIonRouterOutletElement]] = js.undefined
    
    var routeInfo: js.UndefOr[RouteInfo[Any]] = js.undefined
  }
  object OutletPageManagerProps {
    
    inline def apply(StackManager: Any): OutletPageManagerProps = {
      val __obj = js.Dynamic.literal(StackManager = StackManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutletPageManagerProps]
    }
    
    extension [Self <: OutletPageManagerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[HTMLIonRouterOutletElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ HTMLIonRouterOutletElement | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonRouterOutletElement | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setRouteInfo(value: RouteInfo[Any]): Self = StObject.set(x, "routeInfo", value.asInstanceOf[js.Any])
      
      inline def setRouteInfoUndefined: Self = StObject.set(x, "routeInfo", js.undefined)
      
      inline def setStackManager(value: Any): Self = StObject.set(x, "StackManager", value.asInstanceOf[js.Any])
    }
  }
}
