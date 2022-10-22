package typingsJapgolly.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio file input node. */
trait CreateAudioFileInputNodeResult extends StObject {
  
  /** Gets the audio file input node. */
  var fileInputNode: AudioFileInputNode
  
  /** Gets the status of audio file input node creation. */
  var status: AudioFileNodeCreationStatus
}
object CreateAudioFileInputNodeResult {
  
  inline def apply(fileInputNode: AudioFileInputNode, status: AudioFileNodeCreationStatus): CreateAudioFileInputNodeResult = {
    val __obj = js.Dynamic.literal(fileInputNode = fileInputNode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioFileInputNodeResult]
  }
  
  extension [Self <: CreateAudioFileInputNodeResult](x: Self) {
    
    inline def setFileInputNode(value: AudioFileInputNode): Self = StObject.set(x, "fileInputNode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AudioFileNodeCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
