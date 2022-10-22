package typingsJapgolly.musickitJs.MusicKit

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class that describes an error that may occur when using MusicKit JS,
  * including server and local errors.
  */
trait MKError
  extends StObject
     with Error {
  
  /**
    * A description of the error that occurred.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The error code for this error.
    */
  var errorCode: String
}
object MKError {
  
  inline def apply(errorCode: String, message: String, name: String): MKError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKError]
  }
  
  extension [Self <: MKError](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
