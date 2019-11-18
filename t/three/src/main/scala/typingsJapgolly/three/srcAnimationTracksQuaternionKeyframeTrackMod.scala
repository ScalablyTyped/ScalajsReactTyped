package typingsJapgolly.three

import typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack
import typingsJapgolly.three.srcConstantsMod.InterpolationModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/tracks/QuaternionKeyframeTrack", JSImport.Namespace)
@js.native
object srcAnimationTracksQuaternionKeyframeTrackMod extends js.Object {
  @js.native
  class QuaternionKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
  
}

