package typingsJapgolly.reactMeasure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BoundingRect = typingsJapgolly.reactMeasure.mod.Dimensions with typingsJapgolly.reactMeasure.mod.Margin
  type Margin = typingsJapgolly.reactMeasure.mod.TopLeft with typingsJapgolly.reactMeasure.mod.BottomRight
  type Measure = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactMeasure.mod.MeasureProps with js.Object, js.Object]
  type MeasuredComponent[T] = typingsJapgolly.react.mod.ComponentType[T with typingsJapgolly.reactMeasure.mod.MeasuredComponentProps]
  type Rect = typingsJapgolly.reactMeasure.mod.TopLeft with typingsJapgolly.reactMeasure.mod.Dimensions
}
