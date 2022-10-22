package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedContextTimestampAndHash extends StObject {
  
  var hash: String
  
  var safeTime: Double
  
  var timestampHash: js.UndefOr[String] = js.undefined
}
object ResolvedContextTimestampAndHash {
  
  inline def apply(hash: String, safeTime: Double): ResolvedContextTimestampAndHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], safeTime = safeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedContextTimestampAndHash]
  }
  
  extension [Self <: ResolvedContextTimestampAndHash](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setSafeTime(value: Double): Self = StObject.set(x, "safeTime", value.asInstanceOf[js.Any])
    
    inline def setTimestampHash(value: String): Self = StObject.set(x, "timestampHash", value.asInstanceOf[js.Any])
    
    inline def setTimestampHashUndefined: Self = StObject.set(x, "timestampHash", js.undefined)
  }
}
