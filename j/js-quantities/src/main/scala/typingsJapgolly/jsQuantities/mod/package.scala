package typingsJapgolly.jsQuantities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter = js.Function2[/* scalar */ scala.Double, /* unit */ java.lang.String, java.lang.String]
  type Source = typingsJapgolly.jsQuantities.mod.UnitSource | scala.Double
  type UnitSource = typingsJapgolly.jsQuantities.mod.Qty | java.lang.String
}
