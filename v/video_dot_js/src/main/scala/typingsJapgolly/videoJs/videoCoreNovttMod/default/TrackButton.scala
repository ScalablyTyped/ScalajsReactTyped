package typingsJapgolly.videoJs.videoCoreNovttMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "TrackButton")
@js.native
class TrackButton protected ()
  extends typingsJapgolly.videoJs.mod.videojs.MenuButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
  def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
}

/**
  * The base class for buttons that toggle specific  track types (e.g. subtitles).
  */
@JSImport("video.js/dist/alt/video.core.novtt", "TrackButton")
@js.native
object TrackButton
  extends /**
  * Creates an instance of this class.
  *
  * @param player
  *         The `Player` that this class should be attached to.
  *
  * @param [options]
  *         The key/value store of player options.
  */
Instantiable1[
      /* player */ typingsJapgolly.videoJs.mod.videojs.Player, 
      typingsJapgolly.videoJs.mod.videojs.MenuButton
    ]
     with Instantiable2[
      /* player */ typingsJapgolly.videoJs.mod.videojs.Player, 
      /* options */ TrackButtonOptions, 
      typingsJapgolly.videoJs.mod.videojs.MenuButton
    ]

