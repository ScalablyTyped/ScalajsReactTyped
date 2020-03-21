package typingsJapgolly.videoJs.mod.default.TextTrack

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.videoJs.mod.videojs.TextTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "TextTrack")
@js.native
class ^ protected ()
  extends typingsJapgolly.videoJs.mod.videojs.TextTrack {
  /**
    * Create an instance of this class.
    *
    * @param options={}
    *        Object of option names and values
    *
    * @param options.tech
    *        A reference to the tech that owns this TextTrack.
    *
    * @param [options.kind='subtitles']
    *        A valid text track kind.
    *
    * @param [options.mode='disabled']
    *        A valid text track mode.
    *
    * @param [options.id='vjs_track_' + Guid.newGUID()]
    *        A unique id for this TextTrack.
    *
    * @param [options.label='']
    *        The menu label for this track.
    *
    * @param [options.language='']
    *        A valid two character language code.
    *
    * @param [options.srclang='']
    *        A valid two character language code. An alternative, but deprioritized
    *        version of `options.language`
    *
    * @param [options.src]
    *        A url to TextTrack cues.
    *
    * @param [options.default]
    *        If this track should default to on or off.
    */
  def this(options: TextTrackOptions) = this()
}

@JSImport("video.js", "TextTrack")
@js.native
object ^
  extends TopLevel[
      /**
  * Create an instance of this class.
  *
  * @param options={}
  *        Object of option names and values
  *
  * @param options.tech
  *        A reference to the tech that owns this TextTrack.
  *
  * @param [options.kind='subtitles']
  *        A valid text track kind.
  *
  * @param [options.mode='disabled']
  *        A valid text track mode.
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this TextTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.srclang='']
  *        A valid two character language code. An alternative, but deprioritized
  *        version of `options.language`
  *
  * @param [options.src]
  *        A url to TextTrack cues.
  *
  * @param [options.default]
  *        If this track should default to on or off.
  */
Instantiable1[/* options */ TextTrackOptions, typingsJapgolly.videoJs.mod.videojs.TextTrack]
    ]

