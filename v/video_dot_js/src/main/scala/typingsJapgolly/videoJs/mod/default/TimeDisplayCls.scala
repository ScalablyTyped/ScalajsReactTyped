package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.mod.videojs.ComponentOptions
import typingsJapgolly.videoJs.mod.videojs.TimeDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js", "default.TimeDisplay")
@js.native
open class TimeDisplayCls protected ()
  extends StObject
     with TimeDisplay {
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
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
}
