package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A solid color fill.
  *
  * SolidFill objects are detached and immutable, so do not reflect changes made after
  * they have been created.
  */
trait SolidFill extends js.Object {
  def getAlpha(): Double
  def getColor(): Color
}

object SolidFill {
  @scala.inline
  def apply(getAlpha: CallbackTo[Double], getColor: CallbackTo[Color]): SolidFill = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAlpha")(getAlpha.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.asInstanceOf[SolidFill]
  }
}

