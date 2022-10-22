package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesRoutingNavManagerMod.NavManagerProps
import typingsJapgolly.ionicReact.distTypesRoutingRouteManagerContextMod.RouteManagerContextState
import typingsJapgolly.ionicReact.distTypesRoutingStackContextMod.StackContextState
import typingsJapgolly.ionicReact.distTypesRoutingViewLifeCycleManagerMod.ViewTransitionManagerProps
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRoutingMod {
  
  @JSImport("@ionic/react/dist/types/routing", "LocationHistory")
  @js.native
  open class LocationHistory ()
    extends typingsJapgolly.ionicReact.distTypesRoutingLocationHistoryMod.LocationHistory
  
  @JSImport("@ionic/react/dist/types/routing", "NavManager")
  @js.native
  open class NavManager protected ()
    extends typingsJapgolly.ionicReact.distTypesRoutingNavManagerMod.NavManager {
    def this(props: NavManagerProps) = this()
  }
  
  @JSImport("@ionic/react/dist/types/routing", "RouteManagerContext")
  @js.native
  val RouteManagerContext: Context[RouteManagerContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/routing", "StackContext")
  @js.native
  val StackContext: Context[StackContextState] = js.native
  
  @JSImport("@ionic/react/dist/types/routing", "ViewLifeCycleManager")
  @js.native
  open class ViewLifeCycleManager protected ()
    extends typingsJapgolly.ionicReact.distTypesRoutingViewLifeCycleManagerMod.ViewLifeCycleManager {
    def this(props: ViewTransitionManagerProps) = this()
  }
  
  /* note: abstract class */ @JSImport("@ionic/react/dist/types/routing", "ViewStacks")
  @js.native
  open class ViewStacks ()
    extends typingsJapgolly.ionicReact.distTypesRoutingViewStacksMod.ViewStacks
}
