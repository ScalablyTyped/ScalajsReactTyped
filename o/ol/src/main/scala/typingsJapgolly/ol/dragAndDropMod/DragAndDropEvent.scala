package typingsJapgolly.ol.dragAndDropMod

import org.scalajs.dom.raw.File
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/DragAndDrop", "DragAndDropEvent")
@js.native
class DragAndDropEvent protected ()
  extends typingsJapgolly.ol.eventMod.default {
  def this(`type`: DragAndDropEventType, file: File) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ) = this()
  def this(
    `type`: DragAndDropEventType,
    file: File,
    opt_features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    opt_projection: typingsJapgolly.ol.projectionMod.default
  ) = this()
  var features: js.Array[FeatureLike] = js.native
  var file: File = js.native
  var projection: typingsJapgolly.ol.projectionMod.default = js.native
}

