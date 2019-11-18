package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashSelection.d3DashSelectionMod.ContainerElement
import typingsJapgolly.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "touch")
@js.native
object touch extends js.Object {
  def apply(container: ContainerElement, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
  def apply(container: ContainerElement, touches: TouchList, identifier: Double): (js.Tuple2[Double, Double]) | Null = js.native
}

