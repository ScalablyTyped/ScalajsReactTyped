package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.`sha-256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digest extends StObject {
  
  var algorithm: `sha-256`
  
  var digest: String
}
object Digest {
  
  inline def apply(digest: String): Digest = {
    val __obj = js.Dynamic.literal(algorithm = "sha-256", digest = digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  
  extension [Self <: Digest](x: Self) {
    
    inline def setAlgorithm(value: `sha-256`): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
  }
}
