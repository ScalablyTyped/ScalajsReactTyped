package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  def getHeight(): Double
  def getWidth(): Double
}

object Dimensions {
  @scala.inline
  def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double]): Dimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.asInstanceOf[Dimensions]
  }
}

