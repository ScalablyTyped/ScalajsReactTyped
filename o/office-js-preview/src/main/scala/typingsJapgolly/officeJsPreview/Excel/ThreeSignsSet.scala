package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreeSignsSet extends /* index */ NumberDictionary[Icon] {
  var greenCircle: Icon
  var redDiamond: Icon
  var yellowTriangle: Icon
}

object ThreeSignsSet {
  @scala.inline
  def apply(
    greenCircle: Icon,
    redDiamond: Icon,
    yellowTriangle: Icon,
    NumberDictionary: /* index */ NumberDictionary[Icon] = null
  ): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redDiamond = redDiamond.asInstanceOf[js.Any], yellowTriangle = yellowTriangle.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[ThreeSignsSet]
  }
}

