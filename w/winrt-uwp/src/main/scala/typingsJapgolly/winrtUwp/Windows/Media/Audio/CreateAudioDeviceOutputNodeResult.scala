package typingsJapgolly.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio device output node. */
trait CreateAudioDeviceOutputNodeResult extends StObject {
  
  /** Gets the audio device output node. */
  var deviceOutputNode: AudioDeviceOutputNode
  
  /** Gets the status of audio device output node creation. */
  var status: AudioDeviceNodeCreationStatus
}
object CreateAudioDeviceOutputNodeResult {
  
  inline def apply(deviceOutputNode: AudioDeviceOutputNode, status: AudioDeviceNodeCreationStatus): CreateAudioDeviceOutputNodeResult = {
    val __obj = js.Dynamic.literal(deviceOutputNode = deviceOutputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioDeviceOutputNodeResult]
  }
  
  extension [Self <: CreateAudioDeviceOutputNodeResult](x: Self) {
    
    inline def setDeviceOutputNode(value: AudioDeviceOutputNode): Self = StObject.set(x, "deviceOutputNode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AudioDeviceNodeCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
