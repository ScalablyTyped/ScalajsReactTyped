package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.VolumeControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "VolumeControl")
@js.native
class VolumeControlCls protected ()
  extends typingsJapgolly.videoJs.mod.videojs.VolumeControl {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: VolumeControlOptions) = this()
}

