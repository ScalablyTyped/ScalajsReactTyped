package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsAdExtensions
  extends StObject
     with AdGroupExtensions {
  
  def newCalloutBuilder(): CalloutBuilder[Callout]
  
  def newMessageBuilder(): MessageBuilder[Message]
  
  def newMobileAppBuilder(): MobileAppBuilder[MobileApp]
  
  def newPhoneNumberBuilder(): PhoneNumberBuilder[PhoneNumber]
  
  def newReviewBuilder(): ReviewBuilder[Review]
  
  def newSitelinkBuilder(): SitelinkBuilder[Sitelink]
  
  def newSnippetBuilder(): SnippetBuilder[Snippet]
}
object AdWordsAdExtensions {
  
  inline def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    newCalloutBuilder: CallbackTo[CalloutBuilder[Callout]],
    newMessageBuilder: CallbackTo[MessageBuilder[Message]],
    newMobileAppBuilder: CallbackTo[MobileAppBuilder[MobileApp]],
    newPhoneNumberBuilder: CallbackTo[PhoneNumberBuilder[PhoneNumber]],
    newReviewBuilder: CallbackTo[ReviewBuilder[Review]],
    newSitelinkBuilder: CallbackTo[SitelinkBuilder[Sitelink]],
    newSnippetBuilder: CallbackTo[SnippetBuilder[Snippet]],
    phoneNumbers: CallbackTo[AdWordsSelector[PhoneNumber]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): AdWordsAdExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, message = message.toJsFn, mobileApps = mobileApps.toJsFn, newCalloutBuilder = newCalloutBuilder.toJsFn, newMessageBuilder = newMessageBuilder.toJsFn, newMobileAppBuilder = newMobileAppBuilder.toJsFn, newPhoneNumberBuilder = newPhoneNumberBuilder.toJsFn, newReviewBuilder = newReviewBuilder.toJsFn, newSitelinkBuilder = newSitelinkBuilder.toJsFn, newSnippetBuilder = newSnippetBuilder.toJsFn, phoneNumbers = phoneNumbers.toJsFn, reviews = reviews.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[AdWordsAdExtensions]
  }
  
  extension [Self <: AdWordsAdExtensions](x: Self) {
    
    inline def setNewCalloutBuilder(value: CallbackTo[CalloutBuilder[Callout]]): Self = StObject.set(x, "newCalloutBuilder", value.toJsFn)
    
    inline def setNewMessageBuilder(value: CallbackTo[MessageBuilder[Message]]): Self = StObject.set(x, "newMessageBuilder", value.toJsFn)
    
    inline def setNewMobileAppBuilder(value: CallbackTo[MobileAppBuilder[MobileApp]]): Self = StObject.set(x, "newMobileAppBuilder", value.toJsFn)
    
    inline def setNewPhoneNumberBuilder(value: CallbackTo[PhoneNumberBuilder[PhoneNumber]]): Self = StObject.set(x, "newPhoneNumberBuilder", value.toJsFn)
    
    inline def setNewReviewBuilder(value: CallbackTo[ReviewBuilder[Review]]): Self = StObject.set(x, "newReviewBuilder", value.toJsFn)
    
    inline def setNewSitelinkBuilder(value: CallbackTo[SitelinkBuilder[Sitelink]]): Self = StObject.set(x, "newSitelinkBuilder", value.toJsFn)
    
    inline def setNewSnippetBuilder(value: CallbackTo[SnippetBuilder[Snippet]]): Self = StObject.set(x, "newSnippetBuilder", value.toJsFn)
  }
}
