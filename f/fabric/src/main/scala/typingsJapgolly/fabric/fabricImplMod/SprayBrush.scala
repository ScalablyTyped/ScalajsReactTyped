package typingsJapgolly.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "SprayBrush")
@js.native
class SprayBrush () extends BaseBrush {
  /**
  	 * Density of a spray (number of dots per chunk)
  	 */
  var density: Double = js.native
  /**
  	 * Width of spray dots
  	 */
  var dotWidth: Double = js.native
  /**
  	 * Width variance of spray dots
  	 */
  var dotWidthVariance: Double = js.native
  /**
  	 * Whether overlapping dots (rectangles) should be removed (for performance reasons)
  	 */
  var optimizeOverlapping: Boolean = js.native
  /**
  	 * Whether opacity of a dot should be random
  	 */
  var randomOpacity: Boolean = js.native
  def addSprayChunk(pointer: js.Any): Unit = js.native
}

