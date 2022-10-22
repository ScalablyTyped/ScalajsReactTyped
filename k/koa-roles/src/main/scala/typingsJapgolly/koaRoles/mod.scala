package typingsJapgolly.koaRoles

import japgolly.scalajs.react.Callback
import typingsJapgolly.koa.mod.DefaultContextExtends
import typingsJapgolly.koa.mod.DefaultStateExtends
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koa.mod.ParameterizedContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-roles", JSImport.Namespace)
  @js.native
  open class ^[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] ()
    extends StObject
       with Roles[StateT, ContextT, ResponseBodyT] {
    def this(options: Options[StateT, ContextT, ResponseBodyT]) = this()
  }
  
  type Handler[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT, Action /* <: String */] = js.Function2[
    /* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], 
    /* action */ Action, 
    Boolean | js.Promise[Boolean]
  ]
  
  trait Options[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] extends StObject {
    
    var failureHandler: js.UndefOr[
        js.Function2[
          /* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], 
          /* action */ String, 
          Unit
        ]
      ] = js.undefined
    
    var userProperty: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT](): Options[StateT, ContextT, ResponseBodyT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[StateT, ContextT, ResponseBodyT]]
    }
    
    extension [Self <: Options[?, ?, ?], StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT](x: Self & (Options[StateT, ContextT, ResponseBodyT])) {
      
      inline def setFailureHandler(
        value: (/* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], /* action */ String) => Callback
      ): Self = StObject.set(x, "failureHandler", js.Any.fromFunction2((t0: /* ctx */ ParameterizedContext[StateT, ContextT, ResponseBodyT], t1: /* action */ String) => (value(t0, t1)).runNow()))
      
      inline def setFailureHandlerUndefined: Self = StObject.set(x, "failureHandler", js.undefined)
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
      
      inline def setUserPropertyUndefined: Self = StObject.set(x, "userProperty", js.undefined)
    }
  }
  
  @js.native
  trait Roles[StateT /* <: DefaultStateExtends */, ContextT /* <: DefaultContextExtends */, ResponseBodyT] extends StObject {
    
    def can(action: String): Middleware[StateT, ContextT, ResponseBodyT] = js.native
    
    def middleware(): Middleware[StateT, ContextT, ResponseBodyT] = js.native
    
    def use(fn: Handler[StateT, ContextT, ResponseBodyT, String]): Unit = js.native
    def use[Action /* <: String */](action: Action, fn: Handler[StateT, ContextT, ResponseBodyT, Action]): Unit = js.native
  }
}
