package typingsJapgolly.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncMod {
  type AsyncComponentProps[T /* <: typingsJapgolly.react.mod.ComponentType[_] */] = typingsJapgolly.reactSelect.srcAsyncMod.SelectComponentProps[T] with typingsJapgolly.reactSelect.srcAsyncMod.AsyncProps[_]
  type ClassProps[T] = js.Any
  type FunctionProps[T] = js.Any
  type Props[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = typingsJapgolly.reactSelect.selectMod.Props[OptionType] with typingsJapgolly.reactSelect.srcAsyncMod.AsyncProps[OptionType]
  type SelectComponentProps[T] = typingsJapgolly.reactSelect.srcAsyncMod.ClassProps[T] | typingsJapgolly.reactSelect.srcAsyncMod.FunctionProps[T]
}
