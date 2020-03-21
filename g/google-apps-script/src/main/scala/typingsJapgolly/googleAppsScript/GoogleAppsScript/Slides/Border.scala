package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the border around an element.
  */
trait Border extends js.Object {
  def getDashStyle(): DashStyle
  def getLineFill(): LineFill
  def getWeight(): Double
  def isVisible(): Boolean
  def setDashStyle(style: DashStyle): Border
  def setTransparent(): Border
  def setWeight(points: Double): Border
}

object Border {
  @scala.inline
  def apply(
    getDashStyle: CallbackTo[DashStyle],
    getLineFill: CallbackTo[LineFill],
    getWeight: CallbackTo[Double],
    isVisible: CallbackTo[Boolean],
    setDashStyle: DashStyle => CallbackTo[Border],
    setTransparent: CallbackTo[Border],
    setWeight: Double => CallbackTo[Border]
  ): Border = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDashStyle")(getDashStyle.toJsFn)
    __obj.updateDynamic("getLineFill")(getLineFill.toJsFn)
    __obj.updateDynamic("getWeight")(getWeight.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("setDashStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides.DashStyle) => setDashStyle(t0).runNow()))
    __obj.updateDynamic("setTransparent")(setTransparent.toJsFn)
    __obj.updateDynamic("setWeight")(js.Any.fromFunction1((t0: scala.Double) => setWeight(t0).runNow()))
    __obj.asInstanceOf[Border]
  }
}

