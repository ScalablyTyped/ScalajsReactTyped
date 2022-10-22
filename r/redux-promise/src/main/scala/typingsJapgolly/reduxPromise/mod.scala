package typingsJapgolly.reduxPromise

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxPromise.mod.ReduxPromise.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-promise", JSImport.Namespace)
  @js.native
  val ^ : Promise = js.native
  
  object ReduxPromise {
    
    type Promise = Middleware[js.Object, Any, Dispatch[AnyAction]]
  }
  
  type _To = Promise
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Promise = ^
  
  /* augmented module */
  object reduxAugmentingMod {
    
    type Dispatch[S] = js.Function1[/* asyncAction */ PromiseAction[S], Any]
    
    @js.native
    trait PromiseAction[S] extends StObject {
      
      def apply(dispatch: typingsJapgolly.reduxPromise.mod.reduxAugmentingMod.Dispatch[S]): Any = js.native
      def apply(
        dispatch: typingsJapgolly.reduxPromise.mod.reduxAugmentingMod.Dispatch[S],
        getState: js.Function0[S]
      ): Any = js.native
    }
  }
}
