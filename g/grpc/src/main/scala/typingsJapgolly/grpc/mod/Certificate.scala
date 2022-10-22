package typingsJapgolly.grpc.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The raw certificate in DER form.
    */
  var raw: Buffer
}
object Certificate {
  
  inline def apply(raw: Buffer): Certificate = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
