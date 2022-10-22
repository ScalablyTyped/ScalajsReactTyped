package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptAccountMod.PrecomposedTransaction
import typingsJapgolly.trezorConnect.trezorConnectStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with PrecomposedTransaction {
  
  var error: String
  
  var `type`: error
}
object Error {
  
  inline def apply(error: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
