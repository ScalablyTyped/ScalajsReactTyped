package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A color defined by red, green, blue color channels.
  */
trait RgbColor extends js.Object {
  def asHexString(): String
  def getBlue(): Integer
  def getColorType(): ColorType
  def getGreen(): Integer
  def getRed(): Integer
}

object RgbColor {
  @scala.inline
  def apply(
    asHexString: CallbackTo[String],
    getBlue: CallbackTo[Integer],
    getColorType: CallbackTo[ColorType],
    getGreen: CallbackTo[Integer],
    getRed: CallbackTo[Integer]
  ): RgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asHexString")(asHexString.toJsFn)
    __obj.updateDynamic("getBlue")(getBlue.toJsFn)
    __obj.updateDynamic("getColorType")(getColorType.toJsFn)
    __obj.updateDynamic("getGreen")(getGreen.toJsFn)
    __obj.updateDynamic("getRed")(getRed.toJsFn)
    __obj.asInstanceOf[RgbColor]
  }
}

