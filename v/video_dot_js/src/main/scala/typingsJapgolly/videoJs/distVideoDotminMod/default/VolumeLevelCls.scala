package typingsJapgolly.videoJs.distVideoDotminMod.default

import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.ComponentOptions
import typingsJapgolly.videoJs.mod.videojs.VolumeLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/video.min", "default.VolumeLevel")
@js.native
open class VolumeLevelCls protected ()
  extends StObject
     with VolumeLevel {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [options.children]
    *        An array of children objects to intialize this component with. Children objects have
    *        a name property that will be used if more than one component of the same type needs to be
    *        added.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
  def this(
    player: typingsJapgolly.videoJs.mod.videojs.Player,
    options: ComponentOptions,
    ready: ReadyCallback
  ) = this()
}
