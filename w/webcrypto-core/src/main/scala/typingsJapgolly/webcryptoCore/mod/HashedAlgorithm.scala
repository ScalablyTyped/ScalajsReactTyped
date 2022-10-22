package typingsJapgolly.webcryptoCore.mod

import typingsJapgolly.std.Algorithm
import typingsJapgolly.std.AlgorithmIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashedAlgorithm
  extends StObject
     with Algorithm {
  
  var hash: AlgorithmIdentifier
}
object HashedAlgorithm {
  
  inline def apply(hash: AlgorithmIdentifier, name: String): HashedAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashedAlgorithm]
  }
  
  extension [Self <: HashedAlgorithm](x: Self) {
    
    inline def setHash(value: AlgorithmIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
