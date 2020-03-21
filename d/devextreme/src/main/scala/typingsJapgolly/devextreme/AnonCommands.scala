package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.bringToFront
import typingsJapgolly.devextreme.devextremeStrings.copy
import typingsJapgolly.devextreme.devextremeStrings.cut
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.deleteShapeImage
import typingsJapgolly.devextreme.devextremeStrings.editShapeImage
import typingsJapgolly.devextreme.devextremeStrings.insertShapeImage
import typingsJapgolly.devextreme.devextremeStrings.lock
import typingsJapgolly.devextreme.devextremeStrings.paste
import typingsJapgolly.devextreme.devextremeStrings.selectAll
import typingsJapgolly.devextreme.devextremeStrings.sendToBack
import typingsJapgolly.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommands extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ]
  ] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonCommands {
  @scala.inline
  def apply(
    commands: js.Array[
      cut | copy | paste | selectAll | delete | bringToFront | sendToBack | lock | unlock | insertShapeImage | editShapeImage | deleteShapeImage
    ] = null,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): AnonCommands = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommands]
  }
}

