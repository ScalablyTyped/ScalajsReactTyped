package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CaptionsButton")
@js.native
class CaptionsButtonCls protected ()
  extends typingsJapgolly.videoJs.mod.videojs.CaptionsButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        The function to call when this function is ready.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
  def this(
    player: typingsJapgolly.videoJs.mod.videojs.Player,
    options: TrackButtonOptions,
    ready: ReadyCallback
  ) = this()
}

