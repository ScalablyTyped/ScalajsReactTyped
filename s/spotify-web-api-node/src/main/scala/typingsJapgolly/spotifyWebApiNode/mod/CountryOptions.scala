package typingsJapgolly.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryOptions extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
}
object CountryOptions {
  
  inline def apply(): CountryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryOptions]
  }
  
  extension [Self <: CountryOptions](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
  }
}
