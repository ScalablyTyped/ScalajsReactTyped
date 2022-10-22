package typingsJapgolly.reactCopyWrite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactCopyWrite.mod.AnyDeepMemberOfState
import typingsJapgolly.reactCopyWrite.mod.ConsumerProps
import typingsJapgolly.reactCopyWrite.mod.MutateFn
import typingsJapgolly.reactCopyWrite.mod.Mutator
import typingsJapgolly.reactCopyWrite.mod.ProviderProps
import typingsJapgolly.reactCopyWrite.mod.SelectorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Consumer[T /* <: js.Object */] extends StObject {
    
    var Consumer: Instantiable0[Component[ConsumerProps[T] & js.Object, js.Object]]
    
    var Provider: Instantiable0[Component[ProviderProps[T] & js.Object, js.Object]]
    
    var createSelector: SelectorFn[T]
    
    var mutate: Mutator[T]
  }
  object Consumer {
    
    inline def apply[T /* <: js.Object */](
      Consumer: Instantiable0[Component[ConsumerProps[T] & js.Object, js.Object]],
      Provider: Instantiable0[Component[ProviderProps[T] & js.Object, js.Object]],
      createSelector: T => AnyDeepMemberOfState[T],
      mutate: /* mutator */ MutateFn[T] => Callback
    ): Consumer[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1((t0: /* mutator */ MutateFn[T]) => mutate(t0).runNow()))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    extension [Self <: Consumer[?], T /* <: js.Object */](x: Self & Consumer[T]) {
      
      inline def setConsumer(value: Instantiable0[Component[ConsumerProps[T] & js.Object, js.Object]]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      inline def setCreateSelector(value: T => AnyDeepMemberOfState[T]): Self = StObject.set(x, "createSelector", js.Any.fromFunction1(value))
      
      inline def setMutate(value: /* mutator */ MutateFn[T] => Callback): Self = StObject.set(x, "mutate", js.Any.fromFunction1((t0: /* mutator */ MutateFn[T]) => value(t0).runNow()))
      
      inline def setProvider(value: Instantiable0[Component[ProviderProps[T] & js.Object, js.Object]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
}
