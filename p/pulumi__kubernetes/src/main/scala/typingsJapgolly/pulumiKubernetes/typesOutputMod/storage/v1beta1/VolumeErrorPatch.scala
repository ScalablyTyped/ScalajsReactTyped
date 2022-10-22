package typingsJapgolly.pulumiKubernetes.typesOutputMod.storage.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeError captures an error encountered during a volume operation.
  */
trait VolumeErrorPatch extends StObject {
  
  /**
    * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
    */
  var message: String
  
  /**
    * Time the error was encountered.
    */
  var time: String
}
object VolumeErrorPatch {
  
  inline def apply(message: String, time: String): VolumeErrorPatch = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeErrorPatch]
  }
  
  extension [Self <: VolumeErrorPatch](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
