package typingsJapgolly.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsState extends StObject {
  
  var cards: js.Array[HostedFieldsHostedFieldsCard]
  
  var fields: HostedFieldsFieldDataFields
}
object HostedFieldsState {
  
  inline def apply(cards: js.Array[HostedFieldsHostedFieldsCard], fields: HostedFieldsFieldDataFields): HostedFieldsState = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsState]
  }
  
  extension [Self <: HostedFieldsState](x: Self) {
    
    inline def setCards(value: js.Array[HostedFieldsHostedFieldsCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsVarargs(value: HostedFieldsHostedFieldsCard*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setFields(value: HostedFieldsFieldDataFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
