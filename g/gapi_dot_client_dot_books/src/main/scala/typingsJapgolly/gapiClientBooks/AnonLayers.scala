package typingsJapgolly.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayers extends js.Object {
  /** A layer should appear here if and only if the layer exists for this book. */
  var layers: js.UndefOr[js.Array[AnonVolumeAnnotationsVersion]] = js.undefined
}

object AnonLayers {
  @scala.inline
  def apply(layers: js.Array[AnonVolumeAnnotationsVersion] = null): AnonLayers = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayers]
  }
}

