package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.scanMod.Accumulator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/fold", JSImport.Namespace)
@js.native
object foldMod extends js.Object {
  def default[In, Out](src: typingsJapgolly.baconjs.observableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = js.native
}

