package typingsJapgolly.motorHat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  type PinDefinition = typingsJapgolly.motorHat.mod.PinDefinitionObject | js.Array[scala.Double]
}
