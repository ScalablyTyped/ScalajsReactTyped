package typingsJapgolly.iobroker.mod.global.ioBroker

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificates extends StObject {
  
  /** chained CA certificates */
  var ca: js.Array[String | Buffer]
  
  /** public certificate */
  var cert: String | Buffer
  
  /** private key file */
  var key: String | Buffer
}
object Certificates {
  
  inline def apply(ca: js.Array[String | Buffer], cert: String | Buffer, key: String | Buffer): Certificates = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificates]
  }
  
  extension [Self <: Certificates](x: Self) {
    
    inline def setCa(value: js.Array[String | Buffer]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
