package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.autoZoom
import typingsJapgolly.devextreme.devextremeStrings.gridSize
import typingsJapgolly.devextreme.devextremeStrings.pageColor
import typingsJapgolly.devextreme.devextremeStrings.pageOrientation
import typingsJapgolly.devextreme.devextremeStrings.pageSize
import typingsJapgolly.devextreme.devextremeStrings.showGrid
import typingsJapgolly.devextreme.devextremeStrings.snapToGrid
import typingsJapgolly.devextreme.devextremeStrings.units
import typingsJapgolly.devextreme.devextremeStrings.zoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommandsArray extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ]
  ] = js.undefined
}

object AnonCommandsArray {
  @scala.inline
  def apply(
    commands: js.Array[
      zoomLevel | autoZoom | showGrid | snapToGrid | gridSize | units | pageSize | pageOrientation | pageColor
    ] = null
  ): AnonCommandsArray = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommandsArray]
  }
}

