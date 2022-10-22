package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.ImageState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.ImageBase")
@js.native
open class ImageBase protected ()
  extends typingsJapgolly.openlayers.mod.ImageBase {
  /**
    * @param extent Extent.
    * @param resolution Resolution.
    * @param pixelRatio Pixel ratio.
    * @param state State.
    * @param attributions Attributions.
    */
  def this(
    extent: Extent_,
    resolution: Double,
    pixelRatio: Double,
    state: ImageState,
    attributions: js.Array[typingsJapgolly.openlayers.mod.Attribution]
  ) = this()
}
