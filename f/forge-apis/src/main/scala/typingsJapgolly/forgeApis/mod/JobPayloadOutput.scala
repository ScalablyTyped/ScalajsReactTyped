package typingsJapgolly.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPayloadOutput extends StObject {
  
  var formats: js.Array[JobPayloadItem]
}
object JobPayloadOutput {
  
  inline def apply(formats: js.Array[JobPayloadItem]): JobPayloadOutput = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadOutput]
  }
  
  extension [Self <: JobPayloadOutput](x: Self) {
    
    inline def setFormats(value: js.Array[JobPayloadItem]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: JobPayloadItem*): Self = StObject.set(x, "formats", js.Array(value*))
  }
}
