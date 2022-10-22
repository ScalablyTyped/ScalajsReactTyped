package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.KeyObject
import typingsJapgolly.oidcProvider.mod.SymmetricSigningAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var alg: SymmetricSigningAlgorithm
  
  var key: KeyObject | Buffer
  
  var kid: js.UndefOr[String] = js.undefined
}
object Key {
  
  inline def apply(alg: SymmetricSigningAlgorithm, key: KeyObject | Buffer): Key = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setAlg(value: SymmetricSigningAlgorithm): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setKey(value: KeyObject | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
  }
}
