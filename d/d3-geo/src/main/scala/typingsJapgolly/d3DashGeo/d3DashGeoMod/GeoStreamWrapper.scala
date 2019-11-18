package typingsJapgolly.d3DashGeo.d3DashGeoMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoStreamWrapper extends js.Object {
  /**
    * Returns a projection stream for the specified output stream. Any input geometry is projected before being streamed to the output stream.
    * A typical projection involves several geometry transformations: the input geometry is first converted to radians, rotated on three axes,
    * clipped to the small circle or cut along the antimeridian, and lastly projected to the plane with adaptive resampling, scale and translation.
    *
    * @param stream An input stream
    */
  def stream(stream: GeoStream): GeoStream
}

object GeoStreamWrapper {
  @scala.inline
  def apply(stream: GeoStream => CallbackTo[GeoStream]): GeoStreamWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stream")(js.Any.fromFunction1((t0: typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoStream) => stream(t0).runNow()))
    __obj.asInstanceOf[GeoStreamWrapper]
  }
}

