package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveBoxes
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveQuarters
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FiveRating
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourRating
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourRedToBlack
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.FourTrafficLights
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeArrows
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeArrowsGray
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeFlags
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSigns
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeStars
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSymbols
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeSymbols2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights1
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTrafficLights2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeTriangles
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

