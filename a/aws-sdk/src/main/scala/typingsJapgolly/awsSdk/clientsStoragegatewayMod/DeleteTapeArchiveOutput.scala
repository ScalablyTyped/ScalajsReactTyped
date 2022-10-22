package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapeArchiveOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape that was deleted from the virtual tape shelf (VTS).
    */
  var TapeARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}
object DeleteTapeArchiveOutput {
  
  inline def apply(): DeleteTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapeArchiveOutput]
  }
  
  extension [Self <: DeleteTapeArchiveOutput](x: Self) {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
