package typingsJapgolly.bigInteger

import typingsJapgolly.bigInteger.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quotient extends StObject {
    
    var quotient: BigInteger
    
    var remainder: BigInteger
  }
  object Quotient {
    
    inline def apply(quotient: BigInteger, remainder: BigInteger): Quotient = {
      val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quotient]
    }
    
    extension [Self <: Quotient](x: Self) {
      
      inline def setQuotient(value: BigInteger): Self = StObject.set(x, "quotient", value.asInstanceOf[js.Any])
      
      inline def setRemainder(value: BigInteger): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
}
