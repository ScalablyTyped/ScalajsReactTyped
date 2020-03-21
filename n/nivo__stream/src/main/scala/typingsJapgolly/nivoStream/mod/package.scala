package typingsJapgolly.nivoStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DatumToNumber = js.Function1[/* datum */ typingsJapgolly.nivoStream.mod.Datum, scala.Double]
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[typingsJapgolly.nivoStream.Anon0[T]]]]
  type TooltipFormatter[T] = js.Function1[/* value */ T, japgolly.scalajs.react.raw.React.Node]
  type TooltipLabel[T] = js.Function1[/* value */ T, java.lang.String]
}
