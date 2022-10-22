package typingsJapgolly.angularCommon.httpMod

import typingsJapgolly.angularCommon.httpMod.HttpEventType.UploadProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpUploadProgressEvent
  extends StObject
     with HttpProgressEvent {
  
  @JSName("type")
  var type_HttpUploadProgressEvent: UploadProgress
}
object HttpUploadProgressEvent {
  
  inline def apply(loaded: Double, `type`: UploadProgress): HttpUploadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUploadProgressEvent]
  }
  
  extension [Self <: HttpUploadProgressEvent](x: Self) {
    
    inline def setType(value: UploadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
