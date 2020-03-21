package typingsJapgolly.reactAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncChildren[T] = (js.Function1[
    /* state */ typingsJapgolly.reactAsync.mod.AsyncState[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
  // unfortunately, we cannot just omit K from AsyncInitial as that would unbox the Discriminated Union
  type AsyncInitialWithout[K /* <: java.lang.String */, T] = typingsJapgolly.std.Omit[
    typingsJapgolly.reactAsync.mod.AsyncFulfilled[T] | typingsJapgolly.reactAsync.mod.AsyncInitial[T] | typingsJapgolly.reactAsync.mod.AsyncPending[T] | typingsJapgolly.reactAsync.mod.AsyncRejected[T], 
    K
  ]
  type DeferFn[T] = js.Function3[
    /* args */ js.Array[js.Any], 
    /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  type FulfilledChildren[T] = (js.Function2[
    /* data */ T, 
    /* state */ typingsJapgolly.reactAsync.mod.AsyncFulfilled[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
  type InitialChildren[T] = (js.Function1[
    /* state */ typingsJapgolly.reactAsync.mod.AsyncInitial[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
  type PendingChildren[T] = (js.Function1[
    /* state */ typingsJapgolly.reactAsync.mod.AsyncPending[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
  type PromiseFn[T] = js.Function2[
    /* props */ typingsJapgolly.reactAsync.mod.AsyncProps[T], 
    /* controller */ org.scalajs.dom.experimental.AbortController, 
    js.Promise[T]
  ]
  type RejectedChildren[T] = (js.Function2[
    /* error */ js.Error, 
    /* state */ typingsJapgolly.reactAsync.mod.AsyncRejected[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
  type SettledChildren[T] = (js.Function1[
    /* state */ typingsJapgolly.reactAsync.mod.AsyncFulfilled[T] | typingsJapgolly.reactAsync.mod.AsyncRejected[T], 
    japgolly.scalajs.react.raw.React.Node
  ]) | japgolly.scalajs.react.raw.React.Node
}
