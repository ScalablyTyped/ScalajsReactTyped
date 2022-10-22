package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /** An automatic google login account. */
  var googleAuto: js.UndefOr[Any] = js.undefined
}
object Account {
  
  inline def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setGoogleAuto(value: Any): Self = StObject.set(x, "googleAuto", value.asInstanceOf[js.Any])
    
    inline def setGoogleAutoUndefined: Self = StObject.set(x, "googleAuto", js.undefined)
  }
}
