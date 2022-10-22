package typingsJapgolly.next

import typingsJapgolly.next.anon.Component
import typingsJapgolly.next.distClientRouterMod.RouterEvent
import typingsJapgolly.next.distClientRouterMod.SingletonRouter
import typingsJapgolly.next.distClientWithRouterMod.ExcludeRouterProps
import typingsJapgolly.next.distClientWithRouterMod.WithRouterProps
import typingsJapgolly.next.distSharedLibMittMod.MittEmitter
import typingsJapgolly.next.distSharedLibRouterRouterMod.NextRouter
import typingsJapgolly.next.distSharedLibUtilsMod.BaseContext
import typingsJapgolly.next.distSharedLibUtilsMod.NextComponentType
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("next/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/router", JSImport.Default)
  @js.native
  val default: SingletonRouter = js.native
  
  @JSImport("next/router", "Router")
  @js.native
  open class Router protected ()
    extends typingsJapgolly.next.distClientRouterMod.Router {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallbackLocaleLocalesDefaultLocaleDomainLocalesIsPreview: Component
    ) = this()
  }
  /* static members */
  object Router {
    
    @JSImport("next/router", "Router")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/router", "Router.events")
    @js.native
    def events: MittEmitter[RouterEvent] = js.native
    inline def events_=(x: MittEmitter[RouterEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def useRouter(): NextRouter = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[NextRouter]
  
  inline def withRouter[P /* <: WithRouterProps */, C /* <: BaseContext */](ComposedComponent: NextComponentType[C, Any, P]): ComponentType[ExcludeRouterProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ExcludeRouterProps[P]]]
}
