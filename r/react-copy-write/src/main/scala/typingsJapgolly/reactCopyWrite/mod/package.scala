package typingsJapgolly.reactCopyWrite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // It'd be nice if this could somehow be improved! Perhaps we need variadic
  // kinds plus infer keyword? Alternatively unions may solve our issue if we had
  // the ability to restrict type widening.
  type AnyDeepMemberOfState[T] = js.Any
  type Consumer[T] = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactCopyWrite.mod.ConsumerProps[T] with js.Object, js.Object]
  type MutateFn[T] = js.Function2[/* draft */ T, /* state */ T, scala.Unit]
  type Mutator[T] = js.Function1[/* mutator */ typingsJapgolly.reactCopyWrite.mod.MutateFn[T], scala.Unit]
  type Provider[T] = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactCopyWrite.mod.ProviderProps[T] with js.Object, js.Object]
  type RenderFn[T] = js.Function1[
    /* repeated */ typingsJapgolly.std.ReturnType[typingsJapgolly.reactCopyWrite.mod.SelectorFn[T]], 
    japgolly.scalajs.react.raw.React.Element | js.Array[japgolly.scalajs.react.raw.React.Element] | scala.Null
  ]
  type SelectorFn[T] = js.Function1[/* state */ T, typingsJapgolly.reactCopyWrite.mod.AnyDeepMemberOfState[T]]
}
