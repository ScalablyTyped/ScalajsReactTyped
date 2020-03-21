package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.CurveSet
  * @classdesc A curve set is a collection of curves.
  * @description Creates a new curve set.
  * @param {Array<number[]>} [curveKeys] - An array of arrays of keys (pairs of numbers with
  * the time first and value second).
  */
@JSImport("playcanvas", "CurveSet")
@js.native
class CurveSet ()
  extends typingsJapgolly.playcanvas.pc.CurveSet {
  def this(curveKeys: js.Array[js.Array[Double]]) = this()
}

