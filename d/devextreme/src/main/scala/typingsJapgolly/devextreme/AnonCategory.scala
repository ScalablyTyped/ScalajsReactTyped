package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.arrowBottom
import typingsJapgolly.devextreme.devextremeStrings.arrowEastWest
import typingsJapgolly.devextreme.devextremeStrings.arrowLeft
import typingsJapgolly.devextreme.devextremeStrings.arrowNorthSouth
import typingsJapgolly.devextreme.devextremeStrings.arrowRight
import typingsJapgolly.devextreme.devextremeStrings.arrowTop
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnLeft
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnRight
import typingsJapgolly.devextreme.devextremeStrings.cardWithImageOnTop
import typingsJapgolly.devextreme.devextremeStrings.containers
import typingsJapgolly.devextreme.devextremeStrings.cross
import typingsJapgolly.devextreme.devextremeStrings.custom
import typingsJapgolly.devextreme.devextremeStrings.data
import typingsJapgolly.devextreme.devextremeStrings.database
import typingsJapgolly.devextreme.devextremeStrings.decision
import typingsJapgolly.devextreme.devextremeStrings.delay
import typingsJapgolly.devextreme.devextremeStrings.diamond
import typingsJapgolly.devextreme.devextremeStrings.display
import typingsJapgolly.devextreme.devextremeStrings.document
import typingsJapgolly.devextreme.devextremeStrings.ellipse
import typingsJapgolly.devextreme.devextremeStrings.flowchart
import typingsJapgolly.devextreme.devextremeStrings.general
import typingsJapgolly.devextreme.devextremeStrings.hardDisk
import typingsJapgolly.devextreme.devextremeStrings.heart
import typingsJapgolly.devextreme.devextremeStrings.horizontalContainer
import typingsJapgolly.devextreme.devextremeStrings.icons
import typingsJapgolly.devextreme.devextremeStrings.internalStorage
import typingsJapgolly.devextreme.devextremeStrings.manualInput
import typingsJapgolly.devextreme.devextremeStrings.manualOperation
import typingsJapgolly.devextreme.devextremeStrings.merge
import typingsJapgolly.devextreme.devextremeStrings.multipleDocuments
import typingsJapgolly.devextreme.devextremeStrings.octagon
import typingsJapgolly.devextreme.devextremeStrings.or
import typingsJapgolly.devextreme.devextremeStrings.orgChart
import typingsJapgolly.devextreme.devextremeStrings.paperTape
import typingsJapgolly.devextreme.devextremeStrings.pentagon
import typingsJapgolly.devextreme.devextremeStrings.predefinedProcess
import typingsJapgolly.devextreme.devextremeStrings.preparation
import typingsJapgolly.devextreme.devextremeStrings.process
import typingsJapgolly.devextreme.devextremeStrings.rectangle
import typingsJapgolly.devextreme.devextremeStrings.star
import typingsJapgolly.devextreme.devextremeStrings.storedData
import typingsJapgolly.devextreme.devextremeStrings.summingJunction
import typingsJapgolly.devextreme.devextremeStrings.terminator
import typingsJapgolly.devextreme.devextremeStrings.text
import typingsJapgolly.devextreme.devextremeStrings.texts
import typingsJapgolly.devextreme.devextremeStrings.triangle
import typingsJapgolly.devextreme.devextremeStrings.verticalContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: js.UndefOr[general | flowchart | orgChart | containers | custom | String] = js.undefined
  var displayMode: js.UndefOr[icons | texts] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var shapes: js.UndefOr[
    js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ]
  ] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonCategory {
  @scala.inline
  def apply(
    category: general | flowchart | orgChart | containers | custom | String = null,
    displayMode: icons | texts = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    shapes: js.Array[
      text | rectangle | ellipse | cross | triangle | diamond | heart | pentagon | octagon | star | arrowLeft | arrowTop | arrowRight | arrowBottom | arrowNorthSouth | arrowEastWest | process | decision | terminator | predefinedProcess | document | multipleDocuments | manualInput | preparation | data | database | hardDisk | internalStorage | paperTape | manualOperation | delay | storedData | display | merge | or | summingJunction | verticalContainer | horizontalContainer | cardWithImageOnLeft | cardWithImageOnTop | cardWithImageOnRight | String
    ] = null,
    title: String = null
  ): AnonCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCategory]
  }
}

