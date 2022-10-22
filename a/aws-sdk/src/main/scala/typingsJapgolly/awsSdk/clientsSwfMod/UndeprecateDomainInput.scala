package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeprecateDomainInput extends StObject {
  
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var name: DomainName
}
object UndeprecateDomainInput {
  
  inline def apply(name: DomainName): UndeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateDomainInput]
  }
  
  extension [Self <: UndeprecateDomainInput](x: Self) {
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
