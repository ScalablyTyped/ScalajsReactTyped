package typingsJapgolly.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexOptions extends StObject {
  
  /**
    * hex decoded representation must be byte aligned.
    * @default false
    */
  var byteAligned: js.UndefOr[Boolean] = js.undefined
}
object HexOptions {
  
  inline def apply(): HexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexOptions]
  }
  
  extension [Self <: HexOptions](x: Self) {
    
    inline def setByteAligned(value: Boolean): Self = StObject.set(x, "byteAligned", value.asInstanceOf[js.Any])
    
    inline def setByteAlignedUndefined: Self = StObject.set(x, "byteAligned", js.undefined)
  }
}
