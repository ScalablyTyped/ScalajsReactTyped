package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.AbortController
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAsync.mod.AbstractState
import typingsJapgolly.reactAsync.mod.AsyncAction
import typingsJapgolly.reactAsync.mod.AsyncChildren
import typingsJapgolly.reactAsync.mod.AsyncProps
import typingsJapgolly.reactAsync.mod.AsyncState
import typingsJapgolly.reactAsync.mod.ReducerAsyncState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AsyncProps_815169652[R <: js.Object, T] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def children(value: AsyncChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => Node): this.type = set("children", js.Any.fromFunction1(value))
  
  inline def childrenNull: this.type = set("children", null)
  
  inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def debugLabel(value: String): this.type = set("debugLabel", value.asInstanceOf[js.Any])
  
  inline def deferFn(
    value: (/* args */ js.Array[Any], /* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]
  ): this.type = set("deferFn", js.Any.fromFunction3(value))
  
  inline def dispatcher(
    value: (/* action */ AsyncAction[T], /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], /* props */ AsyncProps[T]) => Callback
  ): this.type = set("dispatcher", js.Any.fromFunction3((t0: /* action */ AsyncAction[T], t1: /* internalDispatch */ js.Function1[/* action */ AsyncAction[T], Unit], t2: /* props */ AsyncProps[T]) => (value(t0, t1, t2)).runNow()))
  
  inline def initialValue(value: T): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def onReject(value: /* error */ js.Error => Callback): this.type = set("onReject", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
  
  inline def onResolve(value: T => Callback): this.type = set("onResolve", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  
  inline def promise(value: js.Promise[T]): this.type = set("promise", value.asInstanceOf[js.Any])
  
  inline def promiseFn(value: (/* props */ AsyncProps[T], /* controller */ AbortController) => js.Promise[T]): this.type = set("promiseFn", js.Any.fromFunction2(value))
  
  inline def reducer(
    value: (/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], /* internalReducer */ js.Function2[/* state */ ReducerAsyncState[T], /* action */ AsyncAction[T], ReducerAsyncState[T]]) => AsyncState[T, AbstractState[T]]
  ): this.type = set("reducer", js.Any.fromFunction3(value))
  
  inline def watch(value: Any): this.type = set("watch", value.asInstanceOf[js.Any])
  
  inline def watchFn(value: (/* props */ AsyncProps[T], /* prevProps */ AsyncProps[T]) => Any): this.type = set("watchFn", js.Any.fromFunction2(value))
}
