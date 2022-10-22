package typingsJapgolly.domMediacaptureRecord

import typingsJapgolly.domMediacaptureRecord.anon.Instantiable
import typingsJapgolly.domMediacaptureRecord.anon.InstantiableBlobEvent
import typingsJapgolly.domMediacaptureRecord.anon.InstantiableMediaRecorderErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var BlobEvent: InstantiableBlobEvent
  
  var MediaRecorder: Instantiable
  
  var MediaRecorderErrorEvent: InstantiableMediaRecorderErrorEvent
}
object Window {
  
  inline def apply(
    BlobEvent: InstantiableBlobEvent,
    MediaRecorder: Instantiable,
    MediaRecorderErrorEvent: InstantiableMediaRecorderErrorEvent
  ): Window = {
    val __obj = js.Dynamic.literal(BlobEvent = BlobEvent.asInstanceOf[js.Any], MediaRecorder = MediaRecorder.asInstanceOf[js.Any], MediaRecorderErrorEvent = MediaRecorderErrorEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setBlobEvent(value: InstantiableBlobEvent): Self = StObject.set(x, "BlobEvent", value.asInstanceOf[js.Any])
    
    inline def setMediaRecorder(value: Instantiable): Self = StObject.set(x, "MediaRecorder", value.asInstanceOf[js.Any])
    
    inline def setMediaRecorderErrorEvent(value: InstantiableMediaRecorderErrorEvent): Self = StObject.set(x, "MediaRecorderErrorEvent", value.asInstanceOf[js.Any])
  }
}
