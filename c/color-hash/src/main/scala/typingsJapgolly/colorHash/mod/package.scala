package typingsJapgolly.colorHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ColorValueArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type HashFunction = js.Function1[/* input */ java.lang.String, scala.Double]
  type Hue = scala.Double | typingsJapgolly.colorHash.mod.HueObject | js.Array[typingsJapgolly.colorHash.mod.HueObject]
  type Lightness = scala.Double | typingsJapgolly.colorHash.mod.ColorValueArray
  type Saturation = scala.Double | typingsJapgolly.colorHash.mod.ColorValueArray
}
