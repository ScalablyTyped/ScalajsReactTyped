package typingsJapgolly.reduxSagaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionMatchingPattern[P /* <: typingsJapgolly.reduxSagaTypes.mod.ActionPattern[typingsJapgolly.redux.mod.Action[_]] */] = typingsJapgolly.reduxSagaTypes.mod.ActionMatchingSubPattern[
    (/* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any) | P
  ]
  type ActionMatchingSubPattern[P /* <: typingsJapgolly.reduxSagaTypes.mod.ActionSubPattern[typingsJapgolly.redux.mod.Action[_]] */] = typingsJapgolly.redux.mod.Action[js.Any]
  type ActionPattern[Guard /* <: typingsJapgolly.redux.mod.Action[_] */] = typingsJapgolly.reduxSagaTypes.mod.ActionSubPattern[Guard] | js.Array[typingsJapgolly.reduxSagaTypes.mod.ActionSubPattern[Guard]]
  type ActionSubPattern[Guard /* <: typingsJapgolly.redux.mod.Action[_] */] = (typingsJapgolly.reduxSagaTypes.mod.GuardPredicate[Guard, typingsJapgolly.redux.mod.Action[js.Any]]) | typingsJapgolly.reduxSagaTypes.mod.StringableActionCreator[Guard] | typingsJapgolly.reduxSagaTypes.mod.Predicate[typingsJapgolly.redux.mod.Action[js.Any]] | typingsJapgolly.reduxSagaTypes.mod.ActionType
  type ActionType = java.lang.String | scala.Double | js.Symbol
  type CombinatorEffectDescriptor[E] = org.scalablytyped.runtime.StringDictionary[E] | js.Array[E]
  type Effect[T] = (typingsJapgolly.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | (typingsJapgolly.reduxSagaTypes.mod.CombinatorEffect[T, js.Any])
  type GuardPredicate[G /* <: T */, T] = js.Function1[/* arg */ T, /* is G */ scala.Boolean]
  type Pattern[T] = typingsJapgolly.reduxSagaTypes.mod.SubPattern[T] | js.Array[typingsJapgolly.reduxSagaTypes.mod.SubPattern[T]]
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  type Saga[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, typingsJapgolly.std.IterableIterator[js.Any]]
  type SagaIterator = typingsJapgolly.std.IterableIterator[typingsJapgolly.reduxSagaTypes.mod.StrictEffect[js.Any]]
  type StrictEffect[T] = (typingsJapgolly.reduxSagaTypes.mod.SimpleEffect[T, js.Any]) | typingsJapgolly.reduxSagaTypes.mod.StrictCombinatorEffect[T]
  type SubPattern[T] = typingsJapgolly.reduxSagaTypes.mod.Predicate[T] | typingsJapgolly.reduxSagaTypes.mod.StringableActionCreator[typingsJapgolly.redux.mod.Action[js.Any]] | typingsJapgolly.reduxSagaTypes.mod.ActionType
}
