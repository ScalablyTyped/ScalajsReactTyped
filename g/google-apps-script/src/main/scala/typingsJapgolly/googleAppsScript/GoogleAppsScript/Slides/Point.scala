package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A point representing a location.
  */
trait Point extends js.Object {
  def getX(): Double
  def getY(): Double
}

object Point {
  @scala.inline
  def apply(getX: CallbackTo[Double], getY: CallbackTo[Double]): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getX")(getX.toJsFn)
    __obj.updateDynamic("getY")(getY.toJsFn)
    __obj.asInstanceOf[Point]
  }
}

