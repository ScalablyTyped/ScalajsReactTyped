package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecordingConfiguration extends StObject {
  
  /**
    * Identifies which track is being recorded.
    */
  var VoiceRecordingTrack: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.VoiceRecordingTrack] = js.undefined
}
object VoiceRecordingConfiguration {
  
  inline def apply(): VoiceRecordingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceRecordingConfiguration]
  }
  
  extension [Self <: VoiceRecordingConfiguration](x: Self) {
    
    inline def setVoiceRecordingTrack(value: VoiceRecordingTrack): Self = StObject.set(x, "VoiceRecordingTrack", value.asInstanceOf[js.Any])
    
    inline def setVoiceRecordingTrackUndefined: Self = StObject.set(x, "VoiceRecordingTrack", js.undefined)
  }
}
