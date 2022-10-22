package typingsJapgolly.stripeV3.anon

import typingsJapgolly.stripeV3.stripeV3Strings.de
import typingsJapgolly.stripeV3.stripeV3Strings.en
import typingsJapgolly.stripeV3.stripeV3Strings.es
import typingsJapgolly.stripeV3.stripeV3Strings.fr
import typingsJapgolly.stripeV3.stripeV3Strings.it
import typingsJapgolly.stripeV3.stripeV3Strings.nl
import typingsJapgolly.stripeV3.stripeV3Strings.pl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var country: String
  
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.undefined
}
object Country {
  
  inline def apply(country: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  extension [Self <: Country](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setPreferred_language(value: de | en | es | it | fr | nl | pl): Self = StObject.set(x, "preferred_language", value.asInstanceOf[js.Any])
    
    inline def setPreferred_languageUndefined: Self = StObject.set(x, "preferred_language", js.undefined)
  }
}
