package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object configMod {
  type ExcludeMappedValueRef[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/config.ExcludeValueRefKeepSignal<T[P]>}
    */ typingsJapgolly.vegaTypings.vegaTypingsStrings.ExcludeMappedValueRef with T
  type ExcludeValueRefKeepSignal[T] = (typingsJapgolly.std.Exclude[
    T, 
    typingsJapgolly.vegaTypings.encodeMod.ScaledValueRef[js.Any] | typingsJapgolly.vegaTypings.encodeMod.NumericValueRef | typingsJapgolly.vegaTypings.encodeMod.ColorValueRef
  ]) | typingsJapgolly.vegaTypings.configMod.KeepSignal[T]
  type KeepSignal[T] = typingsJapgolly.vegaTypings.signalMod.SignalRef
  type MarkConfigKeys = typingsJapgolly.vegaTypings.vegaTypingsStrings.mark | (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/mark.Mark['type'] */ js.Any)
}
