package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasExtensions extends StObject {
  
  def addCallout(calloutExtension: Callout): AdWordsOperation[Callout]
  
  def addMessage(messageExtension: Message): AdWordsOperation[Message]
  
  def addMobileApp(mobileAppExtension: MobileApp): AdWordsOperation[MobileApp]
  
  def addPhoneNumber(phoneNumberExtension: PhoneNumber): AdWordsOperation[PhoneNumber]
  
  def addReview(reviewExtension: Review): AdWordsOperation[Review]
  
  def addSitelink(sitelinkExtension: Sitelink): AdWordsOperation[Sitelink]
  
  def addSnippet(snippetExtension: Snippet): AdWordsOperation[Snippet]
  
  def removeCallout(calloutExtension: Callout): Unit
  
  def removeMessage(messageExtension: Message): Unit
  
  def removeMobileApp(mobileAppExtension: MobileApp): Unit
  
  def removePhoneNumber(phoneNumberExtension: PhoneNumber): Unit
  
  def removeReview(reviewExtension: Review): Unit
  
  def removeSitelink(sitelinkExtension: Sitelink): Unit
  
  def removeSnippet(snippetExtension: Snippet): Unit
}
object hasExtensions {
  
  inline def apply(
    addCallout: Callout => AdWordsOperation[Callout],
    addMessage: Message => AdWordsOperation[Message],
    addMobileApp: MobileApp => AdWordsOperation[MobileApp],
    addPhoneNumber: PhoneNumber => AdWordsOperation[PhoneNumber],
    addReview: Review => AdWordsOperation[Review],
    addSitelink: Sitelink => AdWordsOperation[Sitelink],
    addSnippet: Snippet => AdWordsOperation[Snippet],
    removeCallout: Callout => Callback,
    removeMessage: Message => Callback,
    removeMobileApp: MobileApp => Callback,
    removePhoneNumber: PhoneNumber => Callback,
    removeReview: Review => Callback,
    removeSitelink: Sitelink => Callback,
    removeSnippet: Snippet => Callback
  ): hasExtensions = {
    val __obj = js.Dynamic.literal(addCallout = js.Any.fromFunction1(addCallout), addMessage = js.Any.fromFunction1(addMessage), addMobileApp = js.Any.fromFunction1(addMobileApp), addPhoneNumber = js.Any.fromFunction1(addPhoneNumber), addReview = js.Any.fromFunction1(addReview), addSitelink = js.Any.fromFunction1(addSitelink), addSnippet = js.Any.fromFunction1(addSnippet), removeCallout = js.Any.fromFunction1((t0: Callout) => removeCallout(t0).runNow()), removeMessage = js.Any.fromFunction1((t0: Message) => removeMessage(t0).runNow()), removeMobileApp = js.Any.fromFunction1((t0: MobileApp) => removeMobileApp(t0).runNow()), removePhoneNumber = js.Any.fromFunction1((t0: PhoneNumber) => removePhoneNumber(t0).runNow()), removeReview = js.Any.fromFunction1((t0: Review) => removeReview(t0).runNow()), removeSitelink = js.Any.fromFunction1((t0: Sitelink) => removeSitelink(t0).runNow()), removeSnippet = js.Any.fromFunction1((t0: Snippet) => removeSnippet(t0).runNow()))
    __obj.asInstanceOf[hasExtensions]
  }
  
  extension [Self <: hasExtensions](x: Self) {
    
    inline def setAddCallout(value: Callout => AdWordsOperation[Callout]): Self = StObject.set(x, "addCallout", js.Any.fromFunction1(value))
    
    inline def setAddMessage(value: Message => AdWordsOperation[Message]): Self = StObject.set(x, "addMessage", js.Any.fromFunction1(value))
    
    inline def setAddMobileApp(value: MobileApp => AdWordsOperation[MobileApp]): Self = StObject.set(x, "addMobileApp", js.Any.fromFunction1(value))
    
    inline def setAddPhoneNumber(value: PhoneNumber => AdWordsOperation[PhoneNumber]): Self = StObject.set(x, "addPhoneNumber", js.Any.fromFunction1(value))
    
    inline def setAddReview(value: Review => AdWordsOperation[Review]): Self = StObject.set(x, "addReview", js.Any.fromFunction1(value))
    
    inline def setAddSitelink(value: Sitelink => AdWordsOperation[Sitelink]): Self = StObject.set(x, "addSitelink", js.Any.fromFunction1(value))
    
    inline def setAddSnippet(value: Snippet => AdWordsOperation[Snippet]): Self = StObject.set(x, "addSnippet", js.Any.fromFunction1(value))
    
    inline def setRemoveCallout(value: Callout => Callback): Self = StObject.set(x, "removeCallout", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setRemoveMessage(value: Message => Callback): Self = StObject.set(x, "removeMessage", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setRemoveMobileApp(value: MobileApp => Callback): Self = StObject.set(x, "removeMobileApp", js.Any.fromFunction1((t0: MobileApp) => value(t0).runNow()))
    
    inline def setRemovePhoneNumber(value: PhoneNumber => Callback): Self = StObject.set(x, "removePhoneNumber", js.Any.fromFunction1((t0: PhoneNumber) => value(t0).runNow()))
    
    inline def setRemoveReview(value: Review => Callback): Self = StObject.set(x, "removeReview", js.Any.fromFunction1((t0: Review) => value(t0).runNow()))
    
    inline def setRemoveSitelink(value: Sitelink => Callback): Self = StObject.set(x, "removeSitelink", js.Any.fromFunction1((t0: Sitelink) => value(t0).runNow()))
    
    inline def setRemoveSnippet(value: Snippet => Callback): Self = StObject.set(x, "removeSnippet", js.Any.fromFunction1((t0: Snippet) => value(t0).runNow()))
  }
}
