package typingsJapgolly.plottable.scalesMod

import typingsJapgolly.plottable.tickGeneratorsMod.ITickGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales", "TickGenerators")
@js.native
object TickGenerators extends js.Object {
  def integerTickGenerator(): ITickGenerator[Double] = js.native
  def intervalTickGenerator(interval: Double): ITickGenerator[Double] = js.native
}

