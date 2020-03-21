package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.devextremeStrings.arrowBottom
import typingsJapgolly.devextreme.devextremeStrings.arrowEastWest
import typingsJapgolly.devextreme.devextremeStrings.arrowLeft
import typingsJapgolly.devextreme.devextremeStrings.arrowNorthSouth
import typingsJapgolly.devextreme.devextremeStrings.arrowRight
import typingsJapgolly.devextreme.devextremeStrings.arrowTop
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnLeft
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnRight
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnTop
import typingsJapgolly.devextreme.devextremeStrings.connector
import typingsJapgolly.devextreme.devextremeStrings.cross
import typingsJapgolly.devextreme.devextremeStrings.data
import typingsJapgolly.devextreme.devextremeStrings.database
import typingsJapgolly.devextreme.devextremeStrings.decision
import typingsJapgolly.devextreme.devextremeStrings.delay
import typingsJapgolly.devextreme.devextremeStrings.diamond
import typingsJapgolly.devextreme.devextremeStrings.display
import typingsJapgolly.devextreme.devextremeStrings.document
import typingsJapgolly.devextreme.devextremeStrings.ellipse
import typingsJapgolly.devextreme.devextremeStrings.hardDisk
import typingsJapgolly.devextreme.devextremeStrings.heart
import typingsJapgolly.devextreme.devextremeStrings.horizontalContainer
import typingsJapgolly.devextreme.devextremeStrings.internalStorage
import typingsJapgolly.devextreme.devextremeStrings.manualInput
import typingsJapgolly.devextreme.devextremeStrings.manualOperation
import typingsJapgolly.devextreme.devextremeStrings.merge
import typingsJapgolly.devextreme.devextremeStrings.multipleDocuments
import typingsJapgolly.devextreme.devextremeStrings.octagon
import typingsJapgolly.devextreme.devextremeStrings.or
import typingsJapgolly.devextreme.devextremeStrings.paperTape
import typingsJapgolly.devextreme.devextremeStrings.pentagon
import typingsJapgolly.devextreme.devextremeStrings.predefinedProcess
import typingsJapgolly.devextreme.devextremeStrings.preparation
import typingsJapgolly.devextreme.devextremeStrings.process
import typingsJapgolly.devextreme.devextremeStrings.rectangle
import typingsJapgolly.devextreme.devextremeStrings.shape
import typingsJapgolly.devextreme.devextremeStrings.star
import typingsJapgolly.devextreme.devextremeStrings.storedData
import typingsJapgolly.devextreme.devextremeStrings.summingJunction
import typingsJapgolly.devextreme.devextremeStrings.terminator
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.devextremeStrings.triangle
import typingsJapgolly.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDiagramShape extends dxDiagramItem {
  /** Specifies the shape's text. */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the shape type. */
  var `type`: js.UndefOr[
    text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
  ] = js.undefined
}

object dxDiagramShape {
  @scala.inline
  def apply(
    dataItem: js.Any = null,
    id: String = null,
    itemType: shape | connector = null,
    text: String = null,
    `type`: text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String = null
  ): dxDiagramShape = {
    val __obj = js.Dynamic.literal()
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDiagramShape]
  }
}

