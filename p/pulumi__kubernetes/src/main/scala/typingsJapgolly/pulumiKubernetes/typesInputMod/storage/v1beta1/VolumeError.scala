package typingsJapgolly.pulumiKubernetes.typesInputMod.storage.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeError captures an error encountered during a volume operation.
  */
trait VolumeError extends StObject {
  
  /**
    * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Time the error was encountered.
    */
  var time: js.UndefOr[Input[String]] = js.undefined
}
object VolumeError {
  
  inline def apply(): VolumeError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeError]
  }
  
  extension [Self <: VolumeError](x: Self) {
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTime(value: Input[String]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
