package typingsJapgolly.nodeForge.mod.tls

import typingsJapgolly.nodeForge.mod.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherSuite extends StObject {
  
  var id: js.Tuple2[Byte, Byte]
  
  var name: String
}
object CipherSuite {
  
  inline def apply(id: js.Tuple2[Byte, Byte], name: String): CipherSuite = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherSuite]
  }
  
  extension [Self <: CipherSuite](x: Self) {
    
    inline def setId(value: js.Tuple2[Byte, Byte]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
