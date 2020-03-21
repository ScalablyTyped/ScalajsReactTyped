package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.Observable
import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.typesMod.Function2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatscan", JSImport.Namespace)
@js.native
object flatscanMod extends js.Object {
  def flatScan[In, Out](src: Observable[In], seed: Out, f: Function2[Out, In, Observable[Out] | Out]): Property[Out] = js.native
}

