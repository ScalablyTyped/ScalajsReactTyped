package typingsJapgolly.levenshtein.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levenshtein extends js.Object {
  /**
    * Distance between strings
    */
  var distance: Double
  /**
    * Return the Levenshtein table.
    */
  def getMatrix(): js.Array[js.Array[Double]]
  /**
    * Pretty print Levenshtein table.
    */
  def inspect(): String
}

object Levenshtein {
  @scala.inline
  def apply(distance: Double, getMatrix: CallbackTo[js.Array[js.Array[Double]]], inspect: CallbackTo[String]): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.updateDynamic("getMatrix")(getMatrix.toJsFn)
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.asInstanceOf[Levenshtein]
  }
}

