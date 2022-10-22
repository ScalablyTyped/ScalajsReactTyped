package typingsJapgolly.pkijs.mod

import typingsJapgolly.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDigestInfo extends StObject {
  
  var digest: OctetString
  
  var digestAlgorithm: AlgorithmIdentifier
}
object IDigestInfo {
  
  inline def apply(digest: OctetString, digestAlgorithm: AlgorithmIdentifier): IDigestInfo = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDigestInfo]
  }
  
  extension [Self <: IDigestInfo](x: Self) {
    
    inline def setDigest(value: OctetString): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
  }
}
