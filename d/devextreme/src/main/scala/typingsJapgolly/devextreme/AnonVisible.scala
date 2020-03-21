package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.autoLayout
import typingsJapgolly.devextreme.devextremeStrings.bold
import typingsJapgolly.devextreme.devextremeStrings.bringToFront
import typingsJapgolly.devextreme.devextremeStrings.connectorLineEnd
import typingsJapgolly.devextreme.devextremeStrings.connectorLineStart
import typingsJapgolly.devextreme.devextremeStrings.connectorLineType
import typingsJapgolly.devextreme.devextremeStrings.copy
import typingsJapgolly.devextreme.devextremeStrings.cut
import typingsJapgolly.devextreme.devextremeStrings.delete
import typingsJapgolly.devextreme.devextremeStrings.deleteShapeImage
import typingsJapgolly.devextreme.devextremeStrings.editShapeImage
import typingsJapgolly.devextreme.devextremeStrings.export
import typingsJapgolly.devextreme.devextremeStrings.fillColor
import typingsJapgolly.devextreme.devextremeStrings.fontColor
import typingsJapgolly.devextreme.devextremeStrings.fontName
import typingsJapgolly.devextreme.devextremeStrings.fontSize
import typingsJapgolly.devextreme.devextremeStrings.fullScreen
import typingsJapgolly.devextreme.devextremeStrings.insertShapeImage
import typingsJapgolly.devextreme.devextremeStrings.italic
import typingsJapgolly.devextreme.devextremeStrings.lineColor
import typingsJapgolly.devextreme.devextremeStrings.lock
import typingsJapgolly.devextreme.devextremeStrings.paste
import typingsJapgolly.devextreme.devextremeStrings.redo
import typingsJapgolly.devextreme.devextremeStrings.selectAll
import typingsJapgolly.devextreme.devextremeStrings.sendToBack
import typingsJapgolly.devextreme.devextremeStrings.separator
import typingsJapgolly.devextreme.devextremeStrings.textAlignCenter
import typingsJapgolly.devextreme.devextremeStrings.textAlignLeft
import typingsJapgolly.devextreme.devextremeStrings.textAlignRight
import typingsJapgolly.devextreme.devextremeStrings.underline
import typingsJapgolly.devextreme.devextremeStrings.undo
import typingsJapgolly.devextreme.devextremeStrings.unlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVisible extends js.Object {
  var commands: js.UndefOr[
    js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ]
  ] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonVisible {
  @scala.inline
  def apply(
    commands: js.Array[
      separator | export | undo | redo | cut | copy | paste | selectAll | delete | fontName | fontSize | bold | italic | underline | fontColor | lineColor | fillColor | textAlignLeft | textAlignCenter | textAlignRight | lock | unlock | sendToBack | bringToFront | insertShapeImage | editShapeImage | deleteShapeImage | connectorLineType | connectorLineStart | connectorLineEnd | autoLayout | fullScreen
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonVisible = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVisible]
  }
}

