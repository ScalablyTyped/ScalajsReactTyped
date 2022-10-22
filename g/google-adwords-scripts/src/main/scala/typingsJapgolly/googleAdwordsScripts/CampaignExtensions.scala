package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignExtensions
  extends StObject
     with AccountExtensions {
  
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}
object CampaignExtensions {
  
  inline def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    phoneNumbers: CallbackTo[AdWordsSelector[PhoneNumber]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): CampaignExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, message = message.toJsFn, mobileApps = mobileApps.toJsFn, phoneNumbers = phoneNumbers.toJsFn, reviews = reviews.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[CampaignExtensions]
  }
  
  extension [Self <: CampaignExtensions](x: Self) {
    
    inline def setPhoneNumbers(value: CallbackTo[AdWordsSelector[PhoneNumber]]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
  }
}
