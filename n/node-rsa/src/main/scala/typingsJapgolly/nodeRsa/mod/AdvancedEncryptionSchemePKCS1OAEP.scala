package typingsJapgolly.nodeRsa.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1_oaep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvancedEncryptionSchemePKCS1OAEP
  extends StObject
     with AdvancedEncryptionScheme {
  
  var hash: HashingAlgorithm
  
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm, Buffer]
  ] = js.undefined
  
  var scheme: pkcs1_oaep
}
object AdvancedEncryptionSchemePKCS1OAEP {
  
  inline def apply(hash: HashingAlgorithm): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = "pkcs1_oaep")
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
  
  extension [Self <: AdvancedEncryptionSchemePKCS1OAEP](x: Self) {
    
    inline def setHash(value: HashingAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setMgf(value: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => Buffer): Self = StObject.set(x, "mgf", js.Any.fromFunction3(value))
    
    inline def setMgfUndefined: Self = StObject.set(x, "mgf", js.undefined)
    
    inline def setScheme(value: pkcs1_oaep): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
