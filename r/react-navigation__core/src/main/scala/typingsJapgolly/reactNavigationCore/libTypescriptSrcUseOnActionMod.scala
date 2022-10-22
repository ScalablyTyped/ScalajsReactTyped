package typingsJapgolly.reactNavigationCore

import typingsJapgolly.reactNavigationCore.anon.PartialStateNavigationSta
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildActionListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildBeforeRemoveListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typingsJapgolly.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.RouterConfigOptions
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOnActionMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnAction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasRouterGetStateSetStateKeyActionListenersBeforeRemoveListenersRouterConfigOptionsEmitter: Options
  ): js.Function2[
    /* action */ NavigationAction, 
    /* visitedNavigators */ js.UndefOr[Set[String]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRouterGetStateSetStateKeyActionListenersBeforeRemoveListenersRouterConfigOptionsEmitter.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* action */ NavigationAction, 
    /* visitedNavigators */ js.UndefOr[Set[String]], 
    Boolean
  ]]
  
  @js.native
  trait Options extends StObject {
    
    var actionListeners: js.Array[ChildActionListener] = js.native
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]] = js.native
    
    var emitter: NavigationEventEmitter[EventMapCore[Any]] = js.native
    
    def getState(): NavigationState[ParamListBase] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var router: Router[NavigationState[ParamListBase], NavigationAction] = js.native
    
    var routerConfigOptions: RouterConfigOptions = js.native
    
    def setState(state: PartialStateNavigationSta): Unit = js.native
    def setState(state: NavigationState[ParamListBase]): Unit = js.native
  }
}
