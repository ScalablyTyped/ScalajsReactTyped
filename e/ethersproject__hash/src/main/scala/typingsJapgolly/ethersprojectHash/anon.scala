package typingsJapgolly.ethersprojectHash

import typingsJapgolly.ethersprojectAbstractSigner.mod.TypedDataDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Domain extends StObject {
    
    var domain: TypedDataDomain
    
    var value: Any
  }
  object Domain {
    
    inline def apply(domain: TypedDataDomain, value: Any): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: TypedDataDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
