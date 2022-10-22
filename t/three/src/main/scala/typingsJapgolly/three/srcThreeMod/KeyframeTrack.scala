package typingsJapgolly.three.srcThreeMod

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "KeyframeTrack")
@js.native
open class KeyframeTrack protected ()
  extends typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack {
  /**
    * @param name
    * @param times
    * @param values
    * @param [interpolation=THREE.InterpolateLinear]
    */
  def this(name: String, times: ArrayLike[Any], values: ArrayLike[Any]) = this()
  def this(
    name: String,
    times: ArrayLike[Any],
    values: ArrayLike[Any],
    interpolation: typingsJapgolly.three.srcConstantsMod.InterpolationModes
  ) = this()
}
/* static members */
object KeyframeTrack {
  
  @JSImport("three/src/Three", "KeyframeTrack")
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJSON(track: typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(track.asInstanceOf[js.Any]).asInstanceOf[Any]
}
