package typingsJapgolly.youtubePlayer

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.error
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
import typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventNamesMod extends Shortcut {
  
  @JSImport("youtube-player/dist/eventNames", JSImport.Default)
  @js.native
  val default: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.error
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange
    - typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange
  */
  trait EventType extends StObject
  object EventType {
    
    inline def apiChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange = "apiChange".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange]
    
    inline def error: typingsJapgolly.youtubePlayer.youtubePlayerStrings.error = "error".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.error]
    
    inline def playbackQualityChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange = "playbackQualityChange".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange]
    
    inline def playbackRateChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange = "playbackRateChange".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange]
    
    inline def ready: typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready = "ready".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready]
    
    inline def stateChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange = "stateChange".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange]
    
    inline def volumeChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange = "volumeChange".asInstanceOf[typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange]
  }
  
  type _To = js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ]
  
  /* This means you don't have to write `default`, but can instead just say `distEventNamesMod.foo` */
  override def _to: js.Tuple7[
    ready, 
    stateChange, 
    playbackQualityChange, 
    playbackRateChange, 
    error, 
    apiChange, 
    volumeChange
  ] = default
}
