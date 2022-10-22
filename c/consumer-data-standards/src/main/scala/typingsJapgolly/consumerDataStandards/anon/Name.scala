package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.CONTACT_NAME
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.EMAIL
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.PAYPAL_AU
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.TELEPHONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The identifier of the digital wallet (dependent on type)
    */
  var identifier: String
  
  /**
    * The name assigned to the digital wallet by the owner of the wallet, else the display name provided by the digital wallet provider
    */
  var name: String
  
  /**
    * The provider of the digital wallet
    */
  var provider: PAYPAL_AU | OTHER
  
  /**
    * The type of the digital wallet identifier
    */
  var `type`: EMAIL | CONTACT_NAME | TELEPHONE
}
object Name {
  
  inline def apply(
    identifier: String,
    name: String,
    provider: PAYPAL_AU | OTHER,
    `type`: EMAIL | CONTACT_NAME | TELEPHONE
  ): Name = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: PAYPAL_AU | OTHER): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setType(value: EMAIL | CONTACT_NAME | TELEPHONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
