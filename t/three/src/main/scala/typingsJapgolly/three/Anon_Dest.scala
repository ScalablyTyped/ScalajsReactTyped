package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.srcMathVector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dest extends js.Object {
  var slices: Double
  var stacks: Double
  def func(u: Double, v: Double, dest: Vector3): Unit
}

object Anon_Dest {
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Callback, slices: Double, stacks: Double): Anon_Dest = {
    val __obj = js.Dynamic.literal(slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
    __obj.updateDynamic("func")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: typingsJapgolly.three.srcMathVector3Mod.Vector3) => func(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Anon_Dest]
  }
}

