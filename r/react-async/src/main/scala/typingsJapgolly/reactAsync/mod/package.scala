package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.AbortController
import org.scalajs.dom.RequestInit
import typingsJapgolly.reactAsync.anon.Data
import typingsJapgolly.reactAsync.anon.Error
import typingsJapgolly.reactAsync.anon.FinishedAt
import typingsJapgolly.reactAsync.anon.Fulfilled
import typingsJapgolly.reactAsync.anon.InitialValue
import typingsJapgolly.reactAsync.anon.IsFulfilled
import typingsJapgolly.reactAsync.mod.^
import typingsJapgolly.reactAsync.reactAsyncStrings.counter
import typingsJapgolly.reactAsync.reactAsyncStrings.initialValue
import typingsJapgolly.reactAsync.reactAsyncStrings.promise
import typingsJapgolly.std.Pick
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Async: GenericAsync = ^.asInstanceOf[js.Dynamic].selectDynamic("Async").asInstanceOf[GenericAsync]
type Async[T] = Component[AsyncProps[T] & js.Object, js.Object]

/**
  * createInstance allows you to create instances of Async that are bound to a specific promise.
  * A unique instance also uses its own React context for better nesting capability.
  */
inline def createInstance[T](): AsyncConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[AsyncConstructor[T]]
inline def createInstance[T](defaultOptions: Unit, displayName: String): AsyncConstructor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[AsyncConstructor[T]]
inline def createInstance[T](defaultOptions: AsyncProps[T]): AsyncConstructor[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[AsyncConstructor[T]]
inline def createInstance[T](defaultOptions: AsyncProps[T], displayName: String): AsyncConstructor[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(defaultOptions.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[AsyncConstructor[T]]

inline def dispatchMiddleware[T](dispatch: js.Function2[/* action */ AsyncAction[T], /* repeated */ Any, Unit]): js.Function2[/* action */ AsyncAction[T], /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchMiddleware")(dispatch.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* action */ AsyncAction[T], /* repeated */ Any, Unit]]

/**
  * Universal global scope object. In the browser this is `self`, in Node.js and React Native it's `global`.
  * This file is excluded from coverage reporting because these globals are environment-specific so we can't test them all.
  */
inline def globalScope: GlobalScope_ = ^.asInstanceOf[js.Dynamic].selectDynamic("globalScope").asInstanceOf[GlobalScope_]

inline def init[T](hasInitialValuePromisePromiseFn: InitialValue[T]): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(hasInitialValuePromisePromiseFn.asInstanceOf[js.Any]).asInstanceOf[(AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]])]

inline def neverSettle: js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].selectDynamic("neverSettle").asInstanceOf[js.Promise[scala.Nothing]]

inline def reducer[T](
  state: AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]],
  action: AsyncAction[T]
): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]])]
inline def reducer[T](
  state: AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]],
  action: AsyncAction[T]
): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]])]
inline def reducer[T](
  state: AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]],
  action: AsyncAction[T]
): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]])]
inline def reducer[T](
  state: AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]],
  action: AsyncAction[T]
): (AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[(AsyncInitial[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncPending[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncFulfilled[T, Pick[AbstractState[T], initialValue | counter | promise]]) | (AsyncRejected[T, Pick[AbstractState[T], initialValue | counter | promise]])]

/* was `typeof useAsync` */
inline def useAsync[T](options: AsyncOptions[T]): AsyncState[T, AbstractState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(options.asInstanceOf[js.Any]).asInstanceOf[AsyncState[T, AbstractState[T]]]
/* was `typeof useAsync` */
inline def useAsync[T](promiseFn: PromiseFn[T]): AsyncState[T, AbstractState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any]).asInstanceOf[AsyncState[T, AbstractState[T]]]
inline def useAsync[T](promiseFn: PromiseFn[T], options: AsyncOptions[T]): AsyncState[T, AbstractState[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")(promiseFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncState[T, AbstractState[T]]]

/**
  *
  * @param {RequestInfo} resource
  * @param {RequestInit} init
  * @param {FetchOptions} options
  * @returns {AsyncState<T, FetchRun<T>>}
  */
/* was `typeof useAsyncFetch` */
inline def useFetch[T](resource: RequestInfo, init: RequestInit): AsyncState[T, FetchRun[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[AsyncState[T, FetchRun[T]]]
inline def useFetch[T](resource: RequestInfo, init: RequestInit, hasDeferJsonOptions: FetchOptions[T]): AsyncState[T, FetchRun[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFetch")(resource.asInstanceOf[js.Any], init.asInstanceOf[js.Any], hasDeferJsonOptions.asInstanceOf[js.Any])).asInstanceOf[AsyncState[T, FetchRun[T]]]

type AsyncChildren[T] = (js.Function1[/* state */ AsyncState[T, AbstractState[T]], Node]) | Node

type AsyncFulfilled[T, S] = S & Data[T]

type AsyncInitial[T, S] = S & Error

type AsyncPending[T, S] = S & FinishedAt[T]

type AsyncRejected[T, S] = S & IsFulfilled[T]

type AsyncState[T, S /* <: AbstractState[T] */] = BaseAsyncState[T, S]

type BaseAsyncState[T, S] = (AsyncInitial[T, S]) | (AsyncPending[T, S]) | (AsyncFulfilled[T, S]) | (AsyncRejected[T, S])

type DeferFn[T] = js.Function3[
/* args */ js.Array[Any], 
/* props */ AsyncProps[T], 
/* controller */ AbortController, 
js.Promise[T]]

type FulfilledChildren[T] = (js.Function2[/* data */ T, /* state */ AsyncFulfilled[T, AbstractState[T]], Node]) | Node

type GenericAsync = (Instantiable0[Component[AsyncProps[js.Object] & js.Object, js.Object]]) & Fulfilled

type InitialChildren[T] = (js.Function1[/* state */ AsyncInitial[T, AbstractState[T]], Node]) | Node

/* Inlined react-async.react-async.AbstractAction['meta'] */
type Meta = counter

type PendingChildren[T] = (js.Function1[/* state */ AsyncPending[T, AbstractState[T]], Node]) | Node

type PromiseFn[T] = js.Function2[/* props */ AsyncProps[T], /* controller */ AbortController, js.Promise[T]]

type ReducerAsyncState[T] = BaseAsyncState[T, ReducerBaseState[T]]

type RejectedChildren[T] = (js.Function2[/* error */ js.Error, /* state */ AsyncRejected[T, AbstractState[T]], Node]) | Node

type SettledChildren[T] = (js.Function1[
/* state */ (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]]), 
Node]) | Node
