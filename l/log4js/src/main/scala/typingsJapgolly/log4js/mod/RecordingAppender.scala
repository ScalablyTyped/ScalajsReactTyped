package typingsJapgolly.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingAppender extends StObject {
  
  var `type`: typingsJapgolly.log4js.log4jsStrings.recording
}
object RecordingAppender {
  
  inline def apply(): RecordingAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("recording")
    __obj.asInstanceOf[RecordingAppender]
  }
  
  extension [Self <: RecordingAppender](x: Self) {
    
    inline def setType(value: typingsJapgolly.log4js.log4jsStrings.recording): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
