package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.ControlBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "ControlBar")
@js.native
class ControlBarCls protected ()
  extends typingsJapgolly.videoJs.mod.videojs.ControlBar {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: ControlBarOptions) = this()
}

