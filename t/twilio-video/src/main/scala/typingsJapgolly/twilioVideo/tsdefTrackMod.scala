package typingsJapgolly.twilioVideo

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefTrackMod {
  
  @JSImport("twilio-video/tsdef/Track", "Track")
  @js.native
  open class Track () extends EventEmitter {
    
    var kind: Kind = js.native
    
    var name: String = js.native
  }
  object Track {
    
    type ID = String
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.twilioVideo.twilioVideoStrings.audio
      - typingsJapgolly.twilioVideo.twilioVideoStrings.video
      - typingsJapgolly.twilioVideo.twilioVideoStrings.data
    */
    trait Kind extends StObject
    object Kind {
      
      inline def audio: typingsJapgolly.twilioVideo.twilioVideoStrings.audio = "audio".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.audio]
      
      inline def data: typingsJapgolly.twilioVideo.twilioVideoStrings.data = "data".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.data]
      
      inline def video: typingsJapgolly.twilioVideo.twilioVideoStrings.video = "video".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.video]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.twilioVideo.twilioVideoStrings.low
      - typingsJapgolly.twilioVideo.twilioVideoStrings.standard
      - typingsJapgolly.twilioVideo.twilioVideoStrings.high
    */
    trait Priority extends StObject
    object Priority {
      
      inline def high: typingsJapgolly.twilioVideo.twilioVideoStrings.high = "high".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.high]
      
      inline def low: typingsJapgolly.twilioVideo.twilioVideoStrings.low = "low".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.low]
      
      inline def standard: typingsJapgolly.twilioVideo.twilioVideoStrings.standard = "standard".asInstanceOf[typingsJapgolly.twilioVideo.twilioVideoStrings.standard]
    }
    
    type SID = String
  }
}
