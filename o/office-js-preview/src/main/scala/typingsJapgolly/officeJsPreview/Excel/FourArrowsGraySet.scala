package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FourArrowsGraySet extends /* index */ NumberDictionary[Icon] {
  var grayDownArrow: Icon
  var grayDownInclineArrow: Icon
  var grayUpArrow: Icon
  var grayUpInclineArrow: Icon
}

object FourArrowsGraySet {
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    grayDownInclineArrow: Icon,
    grayUpArrow: Icon,
    grayUpInclineArrow: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): FourArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], grayDownInclineArrow = grayDownInclineArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any], grayUpInclineArrow = grayUpInclineArrow.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[FourArrowsGraySet]
  }
}

