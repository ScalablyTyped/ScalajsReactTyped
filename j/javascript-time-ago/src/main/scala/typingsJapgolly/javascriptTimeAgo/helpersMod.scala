package typingsJapgolly.javascriptTimeAgo

import typingsJapgolly.javascriptTimeAgo.gradationMod.Gradation
import typingsJapgolly.javascriptTimeAgo.gradationMod.Unit
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-time-ago/gradation/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  val day: Double = js.native
  val hour: Double = js.native
  val minute: Double = js.native
  val month: Double = js.native
  val year: Double = js.native
  def getDate(value: Double): js.Date = js.native
  def getDate(value: Date): js.Date = js.native
  def getStep(gradation: js.Array[Gradation], unit: Unit): js.UndefOr[Gradation] = js.native
}

