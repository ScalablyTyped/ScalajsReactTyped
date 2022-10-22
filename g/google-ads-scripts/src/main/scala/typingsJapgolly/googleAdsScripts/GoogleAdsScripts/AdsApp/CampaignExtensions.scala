package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignExtensions extends StObject {
  
  /** Returns the selector of all callouts to the campaign. */
  def callouts(): CampaignCalloutSelector
  
  /** Returns the selector of all messages to the campaign. */
  def messages(): CampaignMessageSelector
  
  /** Returns the selector of all mobile apps to the campaign. */
  def mobileApps(): CampaignMobileAppSelector
  
  /** Returns the selector of all phone numbers to the campaign. */
  def phoneNumbers(): CampaignPhoneNumberSelector
  
  /** Returns the selector of all prices to the campaign. */
  def prices(): CampaignPriceSelector
  
  /** Returns the selector of all sitelinks to the campaign. */
  def sitelinks(): CampaignSitelinkSelector
  
  /** Returns the selector of all snippets to the campaign. */
  def snippets(): CampaignSnippetSelector
}
object CampaignExtensions {
  
  inline def apply(
    callouts: CallbackTo[CampaignCalloutSelector],
    messages: CallbackTo[CampaignMessageSelector],
    mobileApps: CallbackTo[CampaignMobileAppSelector],
    phoneNumbers: CallbackTo[CampaignPhoneNumberSelector],
    prices: CallbackTo[CampaignPriceSelector],
    sitelinks: CallbackTo[CampaignSitelinkSelector],
    snippets: CallbackTo[CampaignSnippetSelector]
  ): CampaignExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, messages = messages.toJsFn, mobileApps = mobileApps.toJsFn, phoneNumbers = phoneNumbers.toJsFn, prices = prices.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[CampaignExtensions]
  }
  
  extension [Self <: CampaignExtensions](x: Self) {
    
    inline def setCallouts(value: CallbackTo[CampaignCalloutSelector]): Self = StObject.set(x, "callouts", value.toJsFn)
    
    inline def setMessages(value: CallbackTo[CampaignMessageSelector]): Self = StObject.set(x, "messages", value.toJsFn)
    
    inline def setMobileApps(value: CallbackTo[CampaignMobileAppSelector]): Self = StObject.set(x, "mobileApps", value.toJsFn)
    
    inline def setPhoneNumbers(value: CallbackTo[CampaignPhoneNumberSelector]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
    
    inline def setPrices(value: CallbackTo[CampaignPriceSelector]): Self = StObject.set(x, "prices", value.toJsFn)
    
    inline def setSitelinks(value: CallbackTo[CampaignSitelinkSelector]): Self = StObject.set(x, "sitelinks", value.toJsFn)
    
    inline def setSnippets(value: CallbackTo[CampaignSnippetSelector]): Self = StObject.set(x, "snippets", value.toJsFn)
  }
}
