package typingsJapgolly.nodeBarion.mod

import typingsJapgolly.nodeBarion.nodeBarionStrings.All
import typingsJapgolly.nodeBarion.nodeBarionStrings.ApplePay
import typingsJapgolly.nodeBarion.nodeBarionStrings.Balance
import typingsJapgolly.nodeBarion.nodeBarionStrings.BankCard
import typingsJapgolly.nodeBarion.nodeBarionStrings.BankTransfer
import typingsJapgolly.nodeBarion.nodeBarionStrings.CZK
import typingsJapgolly.nodeBarion.nodeBarionStrings.EUR
import typingsJapgolly.nodeBarion.nodeBarionStrings.GooglePay
import typingsJapgolly.nodeBarion.nodeBarionStrings.HUF
import typingsJapgolly.nodeBarion.nodeBarionStrings.USD
import typingsJapgolly.nodeBarion.nodeBarionStrings.`cs-CZ`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`de-DE`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`en-US`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`es-ES`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`fr-FR`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`hu-HU`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`sk-SK`
import typingsJapgolly.nodeBarion.nodeBarionStrings.`sl-SI`
import typingsJapgolly.nodeBarion.nodeBarionStrings.prod
import typingsJapgolly.nodeBarion.nodeBarionStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialOptions extends StObject {
  
  var Currency: js.UndefOr[CZK | EUR | HUF | USD] = js.undefined
  
  var Environment: js.UndefOr[test | prod] = js.undefined
  
  var FundingSources: js.UndefOr[js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]] = js.undefined
  
  var GuestCheckOut: js.UndefOr[Boolean] = js.undefined
  
  var Locale: js.UndefOr[`cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`] = js.undefined
  
  var POSKey: String
  
  var Secure: js.UndefOr[Boolean] = js.undefined
}
object InitialOptions {
  
  inline def apply(POSKey: String): InitialOptions = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialOptions]
  }
  
  extension [Self <: InitialOptions](x: Self) {
    
    inline def setCurrency(value: CZK | EUR | HUF | USD): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
    
    inline def setEnvironment(value: test | prod): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setFundingSources(value: js.Array[All | Balance | BankCard | GooglePay | ApplePay | BankTransfer]): Self = StObject.set(x, "FundingSources", value.asInstanceOf[js.Any])
    
    inline def setFundingSourcesUndefined: Self = StObject.set(x, "FundingSources", js.undefined)
    
    inline def setFundingSourcesVarargs(value: (All | Balance | BankCard | GooglePay | ApplePay | BankTransfer)*): Self = StObject.set(x, "FundingSources", js.Array(value*))
    
    inline def setGuestCheckOut(value: Boolean): Self = StObject.set(x, "GuestCheckOut", value.asInstanceOf[js.Any])
    
    inline def setGuestCheckOutUndefined: Self = StObject.set(x, "GuestCheckOut", js.undefined)
    
    inline def setLocale(value: `cs-CZ` | `de-DE` | `en-US` | `es-ES` | `fr-FR` | `hu-HU` | `sk-SK` | `sl-SI`): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "Secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "Secure", js.undefined)
  }
}
