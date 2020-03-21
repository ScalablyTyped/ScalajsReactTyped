package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.FiveArrows
import typingsJapgolly.officeJs.officeJsStrings.FiveArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.FiveBoxes
import typingsJapgolly.officeJs.officeJsStrings.FiveQuarters
import typingsJapgolly.officeJs.officeJsStrings.FiveRating
import typingsJapgolly.officeJs.officeJsStrings.FourArrows
import typingsJapgolly.officeJs.officeJsStrings.FourArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.FourRating
import typingsJapgolly.officeJs.officeJsStrings.FourRedToBlack
import typingsJapgolly.officeJs.officeJsStrings.FourTrafficLights
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.ThreeArrows
import typingsJapgolly.officeJs.officeJsStrings.ThreeArrowsGray
import typingsJapgolly.officeJs.officeJsStrings.ThreeFlags
import typingsJapgolly.officeJs.officeJsStrings.ThreeSigns
import typingsJapgolly.officeJs.officeJsStrings.ThreeStars
import typingsJapgolly.officeJs.officeJsStrings.ThreeSymbols
import typingsJapgolly.officeJs.officeJsStrings.ThreeSymbols2
import typingsJapgolly.officeJs.officeJsStrings.ThreeTrafficLights1
import typingsJapgolly.officeJs.officeJsStrings.ThreeTrafficLights2
import typingsJapgolly.officeJs.officeJsStrings.ThreeTriangles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a cell icon.
  *
  * [Api set: ExcelApi 1.2]
  */
trait Icon extends js.Object {
  /**
    *
    * Represents the index of the icon in the given set.
    *
    * [Api set: ExcelApi 1.2]
    */
  var index: Double
  /**
    *
    * Represents the set that the icon is part of.
    *
    * [Api set: ExcelApi 1.2]
    */
  var set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
}

object Icon {
  @scala.inline
  def apply(
    index: Double,
    set: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes
  ): Icon = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Icon]
  }
}

