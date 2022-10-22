package typingsJapgolly.reduxTestkit

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxTestkit.mod.ReducerTestkit
import typingsJapgolly.reduxTestkit.mod.ThunkTestkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Execute extends StObject {
    
    def execute(state: Any, args: Any*): Any
    
    def expect(state: Any, args: Any*): ToReturn
  }
  object Execute {
    
    inline def apply(execute: (Any, /* repeated */ Any) => Any, expect: (Any, /* repeated */ Any) => ToReturn): Execute = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
      __obj.asInstanceOf[Execute]
    }
    
    extension [Self <: Execute](x: Self) {
      
      inline def setExecute(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setExpect(value: (Any, /* repeated */ Any) => ToReturn): Self = StObject.set(x, "expect", js.Any.fromFunction2(value))
    }
  }
  
  trait Flush extends StObject {
    
    def flush(): Unit
    
    def reset(): Unit
  }
  object Flush {
    
    inline def apply(flush: Callback, reset: Callback): Flush = {
      val __obj = js.Dynamic.literal(flush = flush.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[Flush]
    }
    
    extension [Self <: Flush](x: Self) {
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
  trait ReducerTestkitwithStatest extends StObject {
    
    def execute(action: Action[Any]): Any
    
    def expect(action: Action[Any]): ToChangeInState
    
    def withState(state: Any): ReducerTestkit
  }
  object ReducerTestkitwithStatest {
    
    inline def apply(
      execute: Action[Any] => Any,
      expect: Action[Any] => ToChangeInState,
      withState: Any => ReducerTestkit
    ): ReducerTestkitwithStatest = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ReducerTestkitwithStatest]
    }
    
    extension [Self <: ReducerTestkitwithStatest](x: Self) {
      
      inline def setExecute(value: Action[Any] => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExpect(value: Action[Any] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
      
      inline def setWithState(value: Any => ReducerTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
  trait ThunkTestkitwithStatestat extends StObject {
    
    def execute(args: Any*): Any
    
    def withState(state: Any): ThunkTestkit
  }
  object ThunkTestkitwithStatestat {
    
    inline def apply(execute: /* repeated */ Any => Any, withState: Any => ThunkTestkit): ThunkTestkitwithStatestat = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ThunkTestkitwithStatestat]
    }
    
    extension [Self <: ThunkTestkitwithStatestat](x: Self) {
      
      inline def setExecute(value: /* repeated */ Any => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setWithState(value: Any => ThunkTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  trait ToChangeInState extends StObject {
    
    def toChangeInState(expectedChanges: Any): Unit
    
    def toReturnState(expected: Any): Unit
    
    def toStayTheSame(): Unit
  }
  object ToChangeInState {
    
    inline def apply(toChangeInState: Any => Callback, toReturnState: Any => Callback, toStayTheSame: Callback): ToChangeInState = {
      val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1((t0: Any) => toChangeInState(t0).runNow()), toReturnState = js.Any.fromFunction1((t0: Any) => toReturnState(t0).runNow()), toStayTheSame = toStayTheSame.toJsFn)
      __obj.asInstanceOf[ToChangeInState]
    }
    
    extension [Self <: ToChangeInState](x: Self) {
      
      inline def setToChangeInState(value: Any => Callback): Self = StObject.set(x, "toChangeInState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToReturnState(value: Any => Callback): Self = StObject.set(x, "toReturnState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToStayTheSame(value: Callback): Self = StObject.set(x, "toStayTheSame", value.toJsFn)
    }
  }
  
  trait ToReturn extends StObject {
    
    def toReturn(expected: Any): Unit
  }
  object ToReturn {
    
    inline def apply(toReturn: Any => Callback): ToReturn = {
      val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1((t0: Any) => toReturn(t0).runNow()))
      __obj.asInstanceOf[ToReturn]
    }
    
    extension [Self <: ToReturn](x: Self) {
      
      inline def setToReturn(value: Any => Callback): Self = StObject.set(x, "toReturn", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
