package typingsJapgolly.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsMod {
  type DeepNonNullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? std.NonNullable<T[P]>}
    */ typingsJapgolly.reactSelect.reactSelectStrings.DeepNonNullable with T
  type IndicatorComponentType[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = typingsJapgolly.react.mod.ComponentType[typingsJapgolly.reactSelect.indicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType /* <: typingsJapgolly.reactSelect.typesMod.OptionTypeBase */] = japgolly.scalajs.react.raw.React.Element | js.Array[japgolly.scalajs.react.raw.React.Element]
}
