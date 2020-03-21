package typingsJapgolly.aframe

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.three.mod.KeyframeTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofKeyframeTrack
  extends Instantiable3[
      /* name */ String, 
      /* times */ js.Array[js.Any], 
      /* values */ js.Array[js.Any], 
      KeyframeTrack
    ] {
  def parse(json: js.Any): typingsJapgolly.three.keyframeTrackMod.KeyframeTrack = js.native
  def toJSON(track: typingsJapgolly.three.keyframeTrackMod.KeyframeTrack): js.Any = js.native
}

