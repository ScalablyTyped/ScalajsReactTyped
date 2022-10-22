package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.anon.Component
import typingsJapgolly.next.distClientWithRouterMod.ExcludeRouterProps
import typingsJapgolly.next.distClientWithRouterMod.WithRouterProps
import typingsJapgolly.next.distServerConfigSharedMod.DomainLocale
import typingsJapgolly.next.distSharedLibMittMod.MittEmitter
import typingsJapgolly.next.distSharedLibRouterRouterMod.BeforePopStateCallback
import typingsJapgolly.next.distSharedLibRouterRouterMod.NextRouter
import typingsJapgolly.next.distSharedLibRouterRouterMod.PrefetchOptions
import typingsJapgolly.next.distSharedLibRouterRouterMod.TransitionOptions
import typingsJapgolly.next.distSharedLibRouterRouterMod.Url
import typingsJapgolly.next.distSharedLibUtilsMod.BaseContext
import typingsJapgolly.next.distSharedLibUtilsMod.NextComponentType
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRouterMod {
  
  @JSImport("next/dist/client/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/router", JSImport.Default)
  @js.native
  val default: SingletonRouter = js.native
  
  @JSImport("next/dist/client/router", "Router")
  @js.native
  open class Router protected ()
    extends typingsJapgolly.next.distSharedLibRouterRouterMod.default {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallbackLocaleLocalesDefaultLocaleDomainLocalesIsPreview: Component
    ) = this()
  }
  /* static members */
  object Router {
    
    @JSImport("next/dist/client/router", "Router")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/client/router", "Router.events")
    @js.native
    def events: MittEmitter[RouterEvent] = js.native
    inline def events_=(x: MittEmitter[RouterEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def useRouter(): NextRouter = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[NextRouter]
  
  inline def withRouter[P /* <: WithRouterProps */, C /* <: BaseContext */](ComposedComponent: NextComponentType[C, Any, P]): ComponentType[ExcludeRouterProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ExcludeRouterProps[P]]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.routeChangeStart
    - typingsJapgolly.next.nextStrings.beforeHistoryChange
    - typingsJapgolly.next.nextStrings.routeChangeComplete
    - typingsJapgolly.next.nextStrings.routeChangeError
    - typingsJapgolly.next.nextStrings.hashChangeStart
    - typingsJapgolly.next.nextStrings.hashChangeComplete
  */
  trait RouterEvent extends StObject
  
  /* Inlined next.next/dist/client/router.SingletonRouterBase & next.next/dist/shared/lib/router/router.NextRouter */
  trait SingletonRouter extends StObject {
    
    var asPath: String
    
    var back: js.Function0[Unit]
    
    var basePath: String
    
    var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var events: MittEmitter[RouterEvent]
    
    var isFallback: js.Function0[Boolean]
    
    var isLocaleDomain: Boolean
    
    var isPreview: js.Function0[Boolean]
    
    var isReady: Boolean
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var pathname: String
    
    var prefetch: js.Function3[
        /* url */ String, 
        /* asPath */ js.UndefOr[String], 
        /* options */ js.UndefOr[PrefetchOptions], 
        js.Promise[Unit]
      ]
    
    var push: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[TransitionOptions], 
        js.Promise[Boolean]
      ]
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    def ready(cb: js.Function0[Any]): Unit
    
    var readyCallbacks: js.Array[js.Function0[Any]]
    
    var reload: js.Function0[Unit]
    
    var replace: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[TransitionOptions], 
        js.Promise[Boolean]
      ]
    
    var route: String
    
    var router: typingsJapgolly.next.distSharedLibRouterRouterMod.default | Null
  }
  object SingletonRouter {
    
    inline def apply(
      asPath: String,
      back: Callback,
      basePath: String,
      beforePopState: /* cb */ BeforePopStateCallback => Callback,
      events: MittEmitter[RouterEvent],
      isFallback: CallbackTo[Boolean],
      isLocaleDomain: Boolean,
      isPreview: CallbackTo[Boolean],
      isReady: Boolean,
      pathname: String,
      prefetch: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit],
      push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      ready: js.Function0[Any] => Callback,
      readyCallbacks: js.Array[js.Function0[Any]],
      reload: Callback,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      route: String
    ): SingletonRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = back.toJsFn, basePath = basePath.asInstanceOf[js.Any], beforePopState = js.Any.fromFunction1((t0: /* cb */ BeforePopStateCallback) => beforePopState(t0).runNow()), events = events.asInstanceOf[js.Any], isFallback = isFallback.toJsFn, isLocaleDomain = isLocaleDomain.asInstanceOf[js.Any], isPreview = isPreview.toJsFn, isReady = isReady.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction3(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], ready = js.Any.fromFunction1((t0: js.Function0[Any]) => ready(t0).runNow()), readyCallbacks = readyCallbacks.asInstanceOf[js.Any], reload = reload.toJsFn, replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any], router = null)
      __obj.asInstanceOf[SingletonRouter]
    }
    
    extension [Self <: SingletonRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBack(value: Callback): Self = StObject.set(x, "back", value.toJsFn)
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBeforePopState(value: /* cb */ BeforePopStateCallback => Callback): Self = StObject.set(x, "beforePopState", js.Any.fromFunction1((t0: /* cb */ BeforePopStateCallback) => value(t0).runNow()))
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setEvents(value: MittEmitter[RouterEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setIsFallback(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFallback", value.toJsFn)
      
      inline def setIsLocaleDomain(value: Boolean): Self = StObject.set(x, "isLocaleDomain", value.asInstanceOf[js.Any])
      
      inline def setIsPreview(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPreview", value.toJsFn)
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPrefetch(
        value: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit]
      ): Self = StObject.set(x, "prefetch", js.Any.fromFunction3(value))
      
      inline def setPush(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReady(value: js.Function0[Any] => Callback): Self = StObject.set(x, "ready", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setReadyCallbacks(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "readyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setReadyCallbacksVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "readyCallbacks", js.Array(value*))
      
      inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
      
      inline def setReplace(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: typingsJapgolly.next.distSharedLibRouterRouterMod.default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterNull: Self = StObject.set(x, "router", null)
    }
  }
  
  trait SingletonRouterBase extends StObject {
    
    def ready(cb: js.Function0[Any]): Unit
    
    var readyCallbacks: js.Array[js.Function0[Any]]
    
    var router: typingsJapgolly.next.distSharedLibRouterRouterMod.default | Null
  }
  object SingletonRouterBase {
    
    inline def apply(ready: js.Function0[Any] => Callback, readyCallbacks: js.Array[js.Function0[Any]]): SingletonRouterBase = {
      val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1((t0: js.Function0[Any]) => ready(t0).runNow()), readyCallbacks = readyCallbacks.asInstanceOf[js.Any], router = null)
      __obj.asInstanceOf[SingletonRouterBase]
    }
    
    extension [Self <: SingletonRouterBase](x: Self) {
      
      inline def setReady(value: js.Function0[Any] => Callback): Self = StObject.set(x, "ready", js.Any.fromFunction1((t0: js.Function0[Any]) => value(t0).runNow()))
      
      inline def setReadyCallbacks(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "readyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setReadyCallbacksVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "readyCallbacks", js.Array(value*))
      
      inline def setRouter(value: typingsJapgolly.next.distSharedLibRouterRouterMod.default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterNull: Self = StObject.set(x, "router", null)
    }
  }
}
