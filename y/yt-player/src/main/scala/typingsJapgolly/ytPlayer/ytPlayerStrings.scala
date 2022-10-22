package typingsJapgolly.ytPlayer

import typingsJapgolly.ytPlayer.mod.YouTubePlayerQuality
import typingsJapgolly.ytPlayer.mod.YouTubePlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ytPlayerStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with YouTubePlayerQuality
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait buffering
    extends StObject
       with YouTubePlayerState
  inline def buffering: buffering = "buffering".asInstanceOf[buffering]
  
  @js.native
  sealed trait cued
    extends StObject
       with YouTubePlayerState
  inline def cued: cued = "cued".asInstanceOf[cued]
  
  @js.native
  sealed trait ended
    extends StObject
       with YouTubePlayerState
  inline def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hd1080
    extends StObject
       with YouTubePlayerQuality
  inline def hd1080: hd1080 = "hd1080".asInstanceOf[hd1080]
  
  @js.native
  sealed trait hd720
    extends StObject
       with YouTubePlayerQuality
  inline def hd720: hd720 = "hd720".asInstanceOf[hd720]
  
  @js.native
  sealed trait highres
    extends StObject
       with YouTubePlayerQuality
  inline def highres: highres = "highres".asInstanceOf[highres]
  
  @js.native
  sealed trait large
    extends StObject
       with YouTubePlayerQuality
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait medium
    extends StObject
       with YouTubePlayerQuality
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait paused
    extends StObject
       with YouTubePlayerState
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait playbackQualityChange extends StObject
  inline def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  
  @js.native
  sealed trait playbackRateChange extends StObject
  inline def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  
  @js.native
  sealed trait playing
    extends StObject
       with YouTubePlayerState
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait small
    extends StObject
       with YouTubePlayerQuality
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait timeupdate extends StObject
  inline def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @js.native
  sealed trait unplayable extends StObject
  inline def unplayable: unplayable = "unplayable".asInstanceOf[unplayable]
  
  @js.native
  sealed trait unstarted
    extends StObject
       with YouTubePlayerState
  inline def unstarted: unstarted = "unstarted".asInstanceOf[unstarted]
}
