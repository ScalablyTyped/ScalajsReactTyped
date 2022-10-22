package typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
  */
trait StatusCause extends StObject {
  
  /**
    * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.
    *
    * Examples:
    *   "name" - the field "name" on the current resource
    *   "items[0].name" - the field "name" on the first array entry in "items"
    */
  var field: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A machine-readable description of the cause of the error. If this value is empty there is no information available.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}
object StatusCause {
  
  inline def apply(): StatusCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusCause]
  }
  
  extension [Self <: StatusCause](x: Self) {
    
    inline def setField(value: Input[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
