package typingsJapgolly.youtubePlayer.eventNamesMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.error
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-player/dist/eventNames", JSImport.Default)
@js.native
object default
  extends TopLevel[
      js.Tuple7[
        ready, 
        stateChange, 
        playbackQualityChange, 
        playbackRateChange, 
        error, 
        apiChange, 
        volumeChange
      ]
    ]

