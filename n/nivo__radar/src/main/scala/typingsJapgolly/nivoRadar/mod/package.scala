package typingsJapgolly.nivoRadar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomDotLabel = js.Function1[/* repeated */ js.Any, japgolly.scalajs.react.raw.React.Node]
  type CustomDotSymbol = js.Function1[/* repeated */ js.Any, japgolly.scalajs.react.raw.React.Node]
  type CustomFormatter = js.Function1[/* repeated */ js.Any, japgolly.scalajs.react.raw.React.Node]
  type GridLabelCustomFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
  type IndexByCustomFunctiono[D] = js.Function1[/* datum */ D, java.lang.String | scala.Double]
  type RadarProps = typingsJapgolly.nivoRadar.mod.CommonRadarProps[_] with typingsJapgolly.nivoCore.mod.MotionProps
}
