package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.countryChange
import typingsJapgolly.baseui.baseuiStrings.textChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryChange extends StObject {
  
  val countryChange: typingsJapgolly.baseui.baseuiStrings.countryChange
  
  val textChange: typingsJapgolly.baseui.baseuiStrings.textChange
}
object CountryChange {
  
  inline def apply(): CountryChange = {
    val __obj = js.Dynamic.literal(countryChange = "countryChange", textChange = "textChange")
    __obj.asInstanceOf[CountryChange]
  }
  
  extension [Self <: CountryChange](x: Self) {
    
    inline def setCountryChange(value: countryChange): Self = StObject.set(x, "countryChange", value.asInstanceOf[js.Any])
    
    inline def setTextChange(value: textChange): Self = StObject.set(x, "textChange", value.asInstanceOf[js.Any])
  }
}
