package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Spacer")
@js.native
class SpacerCls protected ()
  extends typingsJapgolly.videoJs.mod.videojs.Spacer {
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
    *        Function that gets called when the `Component` is ready.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
  def this(
    player: typingsJapgolly.videoJs.mod.videojs.Player,
    options: ComponentOptions,
    ready: ReadyCallback
  ) = this()
}

