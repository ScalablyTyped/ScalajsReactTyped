package typingsJapgolly.web3Core.mod

import typingsJapgolly.web3Core.anon.Gas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RLPEncodedTransaction extends StObject {
  
  var raw: String
  
  var tx: Gas
}
object RLPEncodedTransaction {
  
  inline def apply(raw: String, tx: Gas): RLPEncodedTransaction = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[RLPEncodedTransaction]
  }
  
  extension [Self <: RLPEncodedTransaction](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setTx(value: Gas): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
