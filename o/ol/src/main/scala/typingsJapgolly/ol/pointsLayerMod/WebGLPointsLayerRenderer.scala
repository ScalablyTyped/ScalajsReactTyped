package typingsJapgolly.ol.pointsLayerMod

import typingsJapgolly.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLPointsLayerRenderer
  extends typingsJapgolly.ol.webglLayerMod.default[
      typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ] {
  def renderHitDetection(frameState: FrameState): Unit = js.native
}

