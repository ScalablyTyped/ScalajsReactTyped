package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupExtensions extends StObject {
  
  /** Returns the selector of all callouts to the ad group. */
  def callouts(): AdGroupCalloutSelector
  
  /** Returns the selector of all messages to the ad group. */
  def messages(): AdGroupMessageSelector
  
  /** Returns the selector of all mobile apps to the ad group. */
  def mobileApps(): AdGroupMobileAppSelector
  
  /** Returns the selector of all phone numbers to the ad group. */
  def phoneNumbers(): AdGroupPhoneNumberSelector
  
  /** Returns the selector of all prices to the ad group. */
  def prices(): AdGroupPriceSelector
  
  /** Returns the selector of all sitelinks to the ad group. */
  def sitelinks(): AdGroupSitelinkSelector
  
  /** Returns the selector of all snippets to the ad group. */
  def snippets(): AdGroupSnippetSelector
}
object AdGroupExtensions {
  
  inline def apply(
    callouts: CallbackTo[AdGroupCalloutSelector],
    messages: CallbackTo[AdGroupMessageSelector],
    mobileApps: CallbackTo[AdGroupMobileAppSelector],
    phoneNumbers: CallbackTo[AdGroupPhoneNumberSelector],
    prices: CallbackTo[AdGroupPriceSelector],
    sitelinks: CallbackTo[AdGroupSitelinkSelector],
    snippets: CallbackTo[AdGroupSnippetSelector]
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, messages = messages.toJsFn, mobileApps = mobileApps.toJsFn, phoneNumbers = phoneNumbers.toJsFn, prices = prices.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[AdGroupExtensions]
  }
  
  extension [Self <: AdGroupExtensions](x: Self) {
    
    inline def setCallouts(value: CallbackTo[AdGroupCalloutSelector]): Self = StObject.set(x, "callouts", value.toJsFn)
    
    inline def setMessages(value: CallbackTo[AdGroupMessageSelector]): Self = StObject.set(x, "messages", value.toJsFn)
    
    inline def setMobileApps(value: CallbackTo[AdGroupMobileAppSelector]): Self = StObject.set(x, "mobileApps", value.toJsFn)
    
    inline def setPhoneNumbers(value: CallbackTo[AdGroupPhoneNumberSelector]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
    
    inline def setPrices(value: CallbackTo[AdGroupPriceSelector]): Self = StObject.set(x, "prices", value.toJsFn)
    
    inline def setSitelinks(value: CallbackTo[AdGroupSitelinkSelector]): Self = StObject.set(x, "sitelinks", value.toJsFn)
    
    inline def setSnippets(value: CallbackTo[AdGroupSnippetSelector]): Self = StObject.set(x, "snippets", value.toJsFn)
  }
}
