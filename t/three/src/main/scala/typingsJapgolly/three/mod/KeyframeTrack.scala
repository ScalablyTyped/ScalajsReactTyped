package typingsJapgolly.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "KeyframeTrack")
@js.native
class KeyframeTrack protected ()
  extends typingsJapgolly.three.keyframeTrackMod.KeyframeTrack {
  def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
  def this(
    name: String,
    times: js.Array[_],
    values: js.Array[_],
    interpolation: typingsJapgolly.three.constantsMod.InterpolationModes
  ) = this()
}

/* static members */
@JSImport("three", "KeyframeTrack")
@js.native
object KeyframeTrack extends js.Object {
  def parse(json: js.Any): typingsJapgolly.three.keyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: typingsJapgolly.three.keyframeTrackMod.KeyframeTrack): js.Any = js.native
}

