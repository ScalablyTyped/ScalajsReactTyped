package typingsJapgolly.reactBootstrapTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AllTypeaheadOwnAndInjectedProps[T /* <: typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel */] = typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  type TypeaheadLabelKey[T /* <: typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel */] = typingsJapgolly.reactBootstrapTypeahead.mod.StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  type TypeaheadModel = java.lang.String | js.Object
  type TypeaheadResult[T /* <: typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel */] = T with typingsJapgolly.reactBootstrapTypeahead.AnonCustomOption
}
