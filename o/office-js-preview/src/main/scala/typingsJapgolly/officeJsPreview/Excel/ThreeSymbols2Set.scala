package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeSymbols2Set extends /* index */ NumberDictionary[Icon] {
  var greenCheck: Icon
  var redCross: Icon
  var yellowExclamation: Icon
}

object ThreeSymbols2Set {
  @scala.inline
  def apply(
    greenCheck: Icon,
    redCross: Icon,
    yellowExclamation: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeSymbols2Set = {
    val __obj = js.Dynamic.literal(greenCheck = greenCheck.asInstanceOf[js.Any], redCross = redCross.asInstanceOf[js.Any], yellowExclamation = yellowExclamation.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeSymbols2Set]
  }
}

