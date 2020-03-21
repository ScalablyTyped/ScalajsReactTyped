package typingsJapgolly.reactNumericInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundsFunctionProp = scala.Double | (js.Function1[
    japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNumericInput.mod.NumericInputProps with js.Object, js.Object], 
    js.UndefOr[scala.Double]
  ])
  type NumericInput = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactNumericInput.mod.NumericInputProps with js.Object, js.Object]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
}
