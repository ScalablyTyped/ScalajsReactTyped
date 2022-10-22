package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountExtensions extends StObject {
  
  /** Returns the selector of all callouts to the account. */
  def callouts(): AccountCalloutSelector
  
  /** Returns the selector of all messages to the account. */
  def messages(): AccountMessageSelector
  
  /** Returns the selector of all mobile apps to the account. */
  def mobileApps(): AccountMobileAppSelector
  
  /** Returns the selector of all phone numbers to the account. */
  def phoneNumbers(): AccountPhoneNumberSelector
  
  /** Returns the selector of all prices to the account. */
  def prices(): AccountPriceSelector
  
  /** Returns the selector of all sitelinks to the account. */
  def sitelinks(): AccountSitelinkSelector
  
  /** Returns the selector of all snippets to the account. */
  def snippets(): AccountSnippetSelector
}
object AccountExtensions {
  
  inline def apply(
    callouts: CallbackTo[AccountCalloutSelector],
    messages: CallbackTo[AccountMessageSelector],
    mobileApps: CallbackTo[AccountMobileAppSelector],
    phoneNumbers: CallbackTo[AccountPhoneNumberSelector],
    prices: CallbackTo[AccountPriceSelector],
    sitelinks: CallbackTo[AccountSitelinkSelector],
    snippets: CallbackTo[AccountSnippetSelector]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, messages = messages.toJsFn, mobileApps = mobileApps.toJsFn, phoneNumbers = phoneNumbers.toJsFn, prices = prices.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[AccountExtensions]
  }
  
  extension [Self <: AccountExtensions](x: Self) {
    
    inline def setCallouts(value: CallbackTo[AccountCalloutSelector]): Self = StObject.set(x, "callouts", value.toJsFn)
    
    inline def setMessages(value: CallbackTo[AccountMessageSelector]): Self = StObject.set(x, "messages", value.toJsFn)
    
    inline def setMobileApps(value: CallbackTo[AccountMobileAppSelector]): Self = StObject.set(x, "mobileApps", value.toJsFn)
    
    inline def setPhoneNumbers(value: CallbackTo[AccountPhoneNumberSelector]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
    
    inline def setPrices(value: CallbackTo[AccountPriceSelector]): Self = StObject.set(x, "prices", value.toJsFn)
    
    inline def setSitelinks(value: CallbackTo[AccountSitelinkSelector]): Self = StObject.set(x, "sitelinks", value.toJsFn)
    
    inline def setSnippets(value: CallbackTo[AccountSnippetSelector]): Self = StObject.set(x, "snippets", value.toJsFn)
  }
}
