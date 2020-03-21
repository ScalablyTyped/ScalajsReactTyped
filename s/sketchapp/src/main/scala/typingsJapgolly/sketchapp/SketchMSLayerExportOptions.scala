package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.exportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayerExportOptions extends js.Object {
  var _class: exportOptions
  var exportFormats: js.Array[_]
  var includedLayerIds: js.Array[_]
  var layerOptions: Double
  var shouldTrim: Boolean
}

object SketchMSLayerExportOptions {
  @scala.inline
  def apply(
    _class: exportOptions,
    exportFormats: js.Array[_],
    includedLayerIds: js.Array[_],
    layerOptions: Double,
    shouldTrim: Boolean
  ): SketchMSLayerExportOptions = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], exportFormats = exportFormats.asInstanceOf[js.Any], includedLayerIds = includedLayerIds.asInstanceOf[js.Any], layerOptions = layerOptions.asInstanceOf[js.Any], shouldTrim = shouldTrim.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSLayerExportOptions]
  }
}

