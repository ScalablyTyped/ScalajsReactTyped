package typingsJapgolly.three

import typingsJapgolly.three.constantsMod.InterpolationModes
import typingsJapgolly.three.keyframeTrackMod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/tracks/NumberKeyframeTrack", JSImport.Namespace)
@js.native
object numberKeyframeTrackMod extends js.Object {
  @js.native
  class NumberKeyframeTrack protected () extends KeyframeTrack {
    def this(name: String, times: js.Array[_], values: js.Array[_]) = this()
    def this(name: String, times: js.Array[_], values: js.Array[_], interpolation: InterpolationModes) = this()
  }
  
}

