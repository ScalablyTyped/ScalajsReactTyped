package typingsJapgolly.w3cWebNfc

import org.scalajs.dom.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFScanOptions extends StObject {
  
  var signal: AbortSignal
}
object NDEFScanOptions {
  
  inline def apply(signal: AbortSignal): NDEFScanOptions = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFScanOptions]
  }
  
  extension [Self <: NDEFScanOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
