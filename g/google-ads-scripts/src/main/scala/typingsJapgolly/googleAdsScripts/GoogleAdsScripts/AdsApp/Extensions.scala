package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  /** Returns the selector of all callouts in the account. */
  def callouts(): CalloutSelector
  
  /** Returns the selector of all messages in the account. */
  def messages(): MessageSelector
  
  /** Returns the selector of all mobile apps in the account. */
  def mobileApps(): MobileAppSelector
  
  /** Returns a new callout builder for this account. */
  def newCalloutBuilder(): CalloutBuilder
  
  /** Returns a new message builder for this account. */
  def newMessageBuilder(): MessageBuilder
  
  /** Returns a new mobile app builder for this account. */
  def newMobileAppBuilder(): MobileAppBuilder
  
  /** Returns a new phone number builder for this account. */
  def newPhoneNumberBuilder(): PhoneNumberBuilder
  
  /** Returns a new price builder for this account. */
  def newPriceBuilder(): PriceBuilder
  
  /** Returns a new price item builder for this account. */
  def newPriceItemBuilder(): PriceItemBuilder
  
  /** Returns a new sitelink builder for this account. */
  def newSitelinkBuilder(): SitelinkBuilder
  
  /** Returns a new snippet builder for this account. */
  def newSnippetBuilder(): SnippetBuilder
  
  /** Returns the selector of all phone numbers in the account. */
  def phoneNumbers(): PhoneNumberSelector
  
  /** Returns the selector of all prices in the account. */
  def prices(): PriceSelector
  
  /** Returns the selector of all sitelinks in the account. */
  def sitelinks(): SitelinkSelector
  
  /** Returns the selector of all snippets in the account. */
  def snippets(): SnippetSelector
}
object Extensions {
  
  inline def apply(
    callouts: CallbackTo[CalloutSelector],
    messages: CallbackTo[MessageSelector],
    mobileApps: CallbackTo[MobileAppSelector],
    newCalloutBuilder: CallbackTo[CalloutBuilder],
    newMessageBuilder: CallbackTo[MessageBuilder],
    newMobileAppBuilder: CallbackTo[MobileAppBuilder],
    newPhoneNumberBuilder: CallbackTo[PhoneNumberBuilder],
    newPriceBuilder: CallbackTo[PriceBuilder],
    newPriceItemBuilder: CallbackTo[PriceItemBuilder],
    newSitelinkBuilder: CallbackTo[SitelinkBuilder],
    newSnippetBuilder: CallbackTo[SnippetBuilder],
    phoneNumbers: CallbackTo[PhoneNumberSelector],
    prices: CallbackTo[PriceSelector],
    sitelinks: CallbackTo[SitelinkSelector],
    snippets: CallbackTo[SnippetSelector]
  ): Extensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, messages = messages.toJsFn, mobileApps = mobileApps.toJsFn, newCalloutBuilder = newCalloutBuilder.toJsFn, newMessageBuilder = newMessageBuilder.toJsFn, newMobileAppBuilder = newMobileAppBuilder.toJsFn, newPhoneNumberBuilder = newPhoneNumberBuilder.toJsFn, newPriceBuilder = newPriceBuilder.toJsFn, newPriceItemBuilder = newPriceItemBuilder.toJsFn, newSitelinkBuilder = newSitelinkBuilder.toJsFn, newSnippetBuilder = newSnippetBuilder.toJsFn, phoneNumbers = phoneNumbers.toJsFn, prices = prices.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setCallouts(value: CallbackTo[CalloutSelector]): Self = StObject.set(x, "callouts", value.toJsFn)
    
    inline def setMessages(value: CallbackTo[MessageSelector]): Self = StObject.set(x, "messages", value.toJsFn)
    
    inline def setMobileApps(value: CallbackTo[MobileAppSelector]): Self = StObject.set(x, "mobileApps", value.toJsFn)
    
    inline def setNewCalloutBuilder(value: CallbackTo[CalloutBuilder]): Self = StObject.set(x, "newCalloutBuilder", value.toJsFn)
    
    inline def setNewMessageBuilder(value: CallbackTo[MessageBuilder]): Self = StObject.set(x, "newMessageBuilder", value.toJsFn)
    
    inline def setNewMobileAppBuilder(value: CallbackTo[MobileAppBuilder]): Self = StObject.set(x, "newMobileAppBuilder", value.toJsFn)
    
    inline def setNewPhoneNumberBuilder(value: CallbackTo[PhoneNumberBuilder]): Self = StObject.set(x, "newPhoneNumberBuilder", value.toJsFn)
    
    inline def setNewPriceBuilder(value: CallbackTo[PriceBuilder]): Self = StObject.set(x, "newPriceBuilder", value.toJsFn)
    
    inline def setNewPriceItemBuilder(value: CallbackTo[PriceItemBuilder]): Self = StObject.set(x, "newPriceItemBuilder", value.toJsFn)
    
    inline def setNewSitelinkBuilder(value: CallbackTo[SitelinkBuilder]): Self = StObject.set(x, "newSitelinkBuilder", value.toJsFn)
    
    inline def setNewSnippetBuilder(value: CallbackTo[SnippetBuilder]): Self = StObject.set(x, "newSnippetBuilder", value.toJsFn)
    
    inline def setPhoneNumbers(value: CallbackTo[PhoneNumberSelector]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
    
    inline def setPrices(value: CallbackTo[PriceSelector]): Self = StObject.set(x, "prices", value.toJsFn)
    
    inline def setSitelinks(value: CallbackTo[SitelinkSelector]): Self = StObject.set(x, "sitelinks", value.toJsFn)
    
    inline def setSnippets(value: CallbackTo[SnippetSelector]): Self = StObject.set(x, "snippets", value.toJsFn)
  }
}
