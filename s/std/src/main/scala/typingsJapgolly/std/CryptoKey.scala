package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CryptoKey dictionary of the Web Crypto API represents a cryptographic key.
  * Available only in secure contexts.
  */
trait CryptoKey extends StObject {
  
  /* standard dom */
  val algorithm: org.scalajs.dom.KeyAlgorithm
  
  /* standard dom */
  val extractable: scala.Boolean
  
  /* standard dom */
  val `type`: org.scalajs.dom.KeyType
  
  /* standard dom */
  val usages: js.Array[org.scalajs.dom.KeyUsage]
}
object CryptoKey {
  
  inline def apply(
    algorithm: org.scalajs.dom.KeyAlgorithm,
    extractable: scala.Boolean,
    `type`: org.scalajs.dom.KeyType,
    usages: js.Array[org.scalajs.dom.KeyUsage]
  ): CryptoKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKey]
  }
  
  extension [Self <: CryptoKey](x: Self) {
    
    inline def setAlgorithm(value: org.scalajs.dom.KeyAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setExtractable(value: scala.Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
    
    inline def setType(value: org.scalajs.dom.KeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsages(value: js.Array[org.scalajs.dom.KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
    
    inline def setUsagesVarargs(value: org.scalajs.dom.KeyUsage*): Self = StObject.set(x, "usages", js.Array(value*))
  }
}
