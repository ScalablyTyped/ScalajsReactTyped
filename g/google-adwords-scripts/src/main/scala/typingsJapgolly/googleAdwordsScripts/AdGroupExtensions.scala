package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupExtensions
  extends StObject
     with AccountExtensions {
  
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}
object AdGroupExtensions {
  
  inline def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    phoneNumbers: CallbackTo[AdWordsSelector[PhoneNumber]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, message = message.toJsFn, mobileApps = mobileApps.toJsFn, phoneNumbers = phoneNumbers.toJsFn, reviews = reviews.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[AdGroupExtensions]
  }
  
  extension [Self <: AdGroupExtensions](x: Self) {
    
    inline def setPhoneNumbers(value: CallbackTo[AdWordsSelector[PhoneNumber]]): Self = StObject.set(x, "phoneNumbers", value.toJsFn)
  }
}
