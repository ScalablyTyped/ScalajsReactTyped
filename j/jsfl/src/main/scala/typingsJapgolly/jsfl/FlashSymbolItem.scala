package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashSymbolItem extends js.Object {
  var scalingGrid: Boolean
  var scalingGridRect: FlashRectangle
  var sourceAutoUpdate: Boolean
  var sourceFilePath: String
  var sourceLibraryName: String
  var symbolType: String
  var timeline: FlashTimeline
  def convertToCompiledClip(): Unit
  def exportSWC(outputURI: String): Unit
  def exportSWF(outputURI: String): Unit
}

object FlashSymbolItem {
  @scala.inline
  def apply(
    convertToCompiledClip: Callback,
    exportSWC: String => Callback,
    exportSWF: String => Callback,
    scalingGrid: Boolean,
    scalingGridRect: FlashRectangle,
    sourceAutoUpdate: Boolean,
    sourceFilePath: String,
    sourceLibraryName: String,
    symbolType: String,
    timeline: FlashTimeline
  ): FlashSymbolItem = {
    val __obj = js.Dynamic.literal(scalingGrid = scalingGrid.asInstanceOf[js.Any], scalingGridRect = scalingGridRect.asInstanceOf[js.Any], sourceAutoUpdate = sourceAutoUpdate.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.updateDynamic("convertToCompiledClip")(convertToCompiledClip.toJsFn)
    __obj.updateDynamic("exportSWC")(js.Any.fromFunction1((t0: java.lang.String) => exportSWC(t0).runNow()))
    __obj.updateDynamic("exportSWF")(js.Any.fromFunction1((t0: java.lang.String) => exportSWF(t0).runNow()))
    __obj.asInstanceOf[FlashSymbolItem]
  }
}

