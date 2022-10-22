package typingsJapgolly.reduxImmutableStateInvariant

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-immutable-state-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-immutable-state-invariant", JSImport.Default)
  @js.native
  def default: immutableStateInvariantMiddlewareInterface = js.native
  inline def default_=(x: immutableStateInvariantMiddlewareInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type immutableStateInvariantMiddlewareInterface = js.Function1[
    /* options */ js.UndefOr[immutableStateInvariantMiddlewareOptions], 
    Middleware[js.Object, Any, Dispatch[AnyAction]]
  ]
  
  trait immutableStateInvariantMiddlewareOptions extends StObject {
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var isImmutable: js.UndefOr[js.Function1[/* value */ Any, Boolean]] = js.undefined
  }
  object immutableStateInvariantMiddlewareOptions {
    
    inline def apply(): immutableStateInvariantMiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[immutableStateInvariantMiddlewareOptions]
    }
    
    extension [Self <: immutableStateInvariantMiddlewareOptions](x: Self) {
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setIsImmutable(value: /* value */ Any => Boolean): Self = StObject.set(x, "isImmutable", js.Any.fromFunction1(value))
      
      inline def setIsImmutableUndefined: Self = StObject.set(x, "isImmutable", js.undefined)
    }
  }
}
