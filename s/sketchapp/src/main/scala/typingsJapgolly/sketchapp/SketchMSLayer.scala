package typingsJapgolly.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSLayer extends js.Object {
  var _class: String
  var booleanOperation: SketchMSLayerBooleanOperation
  var clippingMaskMode: SketchMSLayerClippingMaskMode
  // xLayers custom property
  var css: js.UndefOr[String] = js.undefined
  var do_objectID: String
  var exportOptions: SketchMSLayerExportOptions
  var frame: SketchMSLayerFrame
  var hasClippingMask: Boolean
  var isFixedToViewport: Boolean
  var isFlippedHorizontal: Boolean
  var isFlippedVertical: Boolean
  var isLocked: Boolean
  var isVisible: Boolean
  var layerListExpandedType: Double
  var layers: js.UndefOr[js.Array[SketchMSLayer]] = js.undefined
  var name: String
  var nameIsFixed: Boolean
  var resizingConstraint: Double
  var resizingType: SketchMSLayerResizingType
  var rotation: Double
  var shouldBreakMaskChain: Boolean
  var style: SketchMSStyle
}

object SketchMSLayer {
  @scala.inline
  def apply(
    _class: String,
    booleanOperation: SketchMSLayerBooleanOperation,
    clippingMaskMode: SketchMSLayerClippingMaskMode,
    do_objectID: String,
    exportOptions: SketchMSLayerExportOptions,
    frame: SketchMSLayerFrame,
    hasClippingMask: Boolean,
    isFixedToViewport: Boolean,
    isFlippedHorizontal: Boolean,
    isFlippedVertical: Boolean,
    isLocked: Boolean,
    isVisible: Boolean,
    layerListExpandedType: Double,
    name: String,
    nameIsFixed: Boolean,
    resizingConstraint: Double,
    resizingType: SketchMSLayerResizingType,
    rotation: Double,
    shouldBreakMaskChain: Boolean,
    style: SketchMSStyle,
    css: String = null,
    layers: js.Array[SketchMSLayer] = null
  ): SketchMSLayer = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], booleanOperation = booleanOperation.asInstanceOf[js.Any], clippingMaskMode = clippingMaskMode.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportOptions = exportOptions.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasClippingMask = hasClippingMask.asInstanceOf[js.Any], isFixedToViewport = isFixedToViewport.asInstanceOf[js.Any], isFlippedHorizontal = isFlippedHorizontal.asInstanceOf[js.Any], isFlippedVertical = isFlippedVertical.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layerListExpandedType = layerListExpandedType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameIsFixed = nameIsFixed.asInstanceOf[js.Any], resizingConstraint = resizingConstraint.asInstanceOf[js.Any], resizingType = resizingType.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], shouldBreakMaskChain = shouldBreakMaskChain.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSLayer]
  }
}

