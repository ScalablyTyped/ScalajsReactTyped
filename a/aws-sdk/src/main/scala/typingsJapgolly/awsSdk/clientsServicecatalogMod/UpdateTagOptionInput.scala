package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagOptionInput extends StObject {
  
  /**
    * The updated active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
  
  /**
    * The updated value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}
object UpdateTagOptionInput {
  
  inline def apply(Id: TagOptionId): UpdateTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagOptionInput]
  }
  
  extension [Self <: UpdateTagOptionInput](x: Self) {
    
    inline def setActive(value: TagOptionActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    inline def setId(value: TagOptionId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagOptionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
