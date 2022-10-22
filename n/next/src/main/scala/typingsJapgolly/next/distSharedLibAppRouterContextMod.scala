package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.URL
import typingsJapgolly.next.anon.ChangeByServerResponse
import typingsJapgolly.next.anon.Tree
import typingsJapgolly.next.distServerAppRenderMod.FlightData
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import typingsJapgolly.next.nextBooleans.`true`
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.Map
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibAppRouterContextMod {
  
  @JSImport("next/dist/shared/lib/app-router-context", "AppRouterContext")
  @js.native
  val AppRouterContext: Context[AppRouterInstance] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "GlobalLayoutRouterContext")
  @js.native
  val GlobalLayoutRouterContext: Context[ChangeByServerResponse] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "LayoutRouterContext")
  @js.native
  val LayoutRouterContext: Context[Tree] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "TemplateContext")
  @js.native
  val TemplateContext: Context[Node] = js.native
  
  trait AppRouterInstance extends StObject {
    
    /**
      * Soft prefetch the provided href. Does not fetch data from the server if it was already fetched.
      */
    def prefetch(href: String): Unit
    
    /**
      * Hard navigate to the provided href. Fetches new data from the server.
      * Pushes a new history entry.
      */
    def push(href: String, options: NavigateOptions): Unit
    
    /**
      * Reload the current page. Fetches new data from the server.
      */
    def reload(): Unit
    
    /**
      * Hard navigate to the provided href. Does not fetch data from the server if it was already fetched.
      * Replaces the current history entry.
      */
    def replace(href: String, options: NavigateOptions): Unit
  }
  object AppRouterInstance {
    
    inline def apply(
      prefetch: String => Callback,
      push: (String, NavigateOptions) => Callback,
      reload: Callback,
      replace: (String, NavigateOptions) => Callback
    ): AppRouterInstance = {
      val __obj = js.Dynamic.literal(prefetch = js.Any.fromFunction1((t0: String) => prefetch(t0).runNow()), push = js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (push(t0, t1)).runNow()), reload = reload.toJsFn, replace = js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (replace(t0, t1)).runNow()))
      __obj.asInstanceOf[AppRouterInstance]
    }
    
    extension [Self <: AppRouterInstance](x: Self) {
      
      inline def setPrefetch(value: String => Callback): Self = StObject.set(x, "prefetch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPush(value: (String, NavigateOptions) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (value(t0, t1)).runNow()))
      
      inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
      
      inline def setReplace(value: (String, NavigateOptions) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (value(t0, t1)).runNow()))
    }
  }
  
  trait CacheNode extends StObject {
    
    /**
      * In-flight request for this node.
      */
    var data: (ReturnType[
        js.Function3[
          /* url */ URL, 
          /* flightRouterState */ FlightRouterState, 
          /* prefetch */ js.UndefOr[`true`], 
          js.Promise[js.Array[/* FlightData */ FlightData]]
        ]
      ]) | Null
    
    /**
      * Child parallel routes.
      */
    var parallelRoutes: Map[String, ChildSegmentMap]
    
    /**
      * React Component for this node.
      */
    var subTreeData: Node | Null
  }
  object CacheNode {
    
    inline def apply(parallelRoutes: Map[String, ChildSegmentMap]): CacheNode = {
      val __obj = js.Dynamic.literal(parallelRoutes = parallelRoutes.asInstanceOf[js.Any], data = null, subTreeData = null)
      __obj.asInstanceOf[CacheNode]
    }
    
    extension [Self <: CacheNode](x: Self) {
      
      inline def setData(
        value: ReturnType[
              js.Function3[
                /* url */ URL, 
                /* flightRouterState */ FlightRouterState, 
                /* prefetch */ js.UndefOr[`true`], 
                js.Promise[js.Array[/* FlightData */ FlightData]]
              ]
            ]
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setParallelRoutes(value: Map[String, ChildSegmentMap]): Self = StObject.set(x, "parallelRoutes", value.asInstanceOf[js.Any])
      
      inline def setSubTreeData(value: VdomNode): Self = StObject.set(x, "subTreeData", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubTreeDataNull: Self = StObject.set(x, "subTreeData", null)
      
      inline def setSubTreeDataVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subTreeData", js.Array(value*))
      
      inline def setSubTreeDataVdomElement(value: VdomElement): Self = StObject.set(x, "subTreeData", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type ChildSegmentMap = Map[String, CacheNode]
  
  trait NavigateOptions extends StObject {
    
    var forceOptimisticNavigation: js.UndefOr[Boolean] = js.undefined
  }
  object NavigateOptions {
    
    inline def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    extension [Self <: NavigateOptions](x: Self) {
      
      inline def setForceOptimisticNavigation(value: Boolean): Self = StObject.set(x, "forceOptimisticNavigation", value.asInstanceOf[js.Any])
      
      inline def setForceOptimisticNavigationUndefined: Self = StObject.set(x, "forceOptimisticNavigation", js.undefined)
    }
  }
}
