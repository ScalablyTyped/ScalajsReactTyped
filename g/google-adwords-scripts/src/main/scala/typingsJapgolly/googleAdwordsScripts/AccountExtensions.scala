package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad extensions
trait AccountExtensions extends StObject {
  
  def callouts(): AdWordsSelector[Callout]
  
  def message(): AdWordsSelector[Message]
  
  def mobileApps(): AdWordsSelector[MobileApp]
  
  def reviews(): AdWordsSelector[Review]
  
  def sitelinks(): AdWordsSelector[Sitelink]
  
  def snippets(): AdWordsSelector[Snippet]
}
object AccountExtensions {
  
  inline def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = callouts.toJsFn, message = message.toJsFn, mobileApps = mobileApps.toJsFn, reviews = reviews.toJsFn, sitelinks = sitelinks.toJsFn, snippets = snippets.toJsFn)
    __obj.asInstanceOf[AccountExtensions]
  }
  
  extension [Self <: AccountExtensions](x: Self) {
    
    inline def setCallouts(value: CallbackTo[AdWordsSelector[Callout]]): Self = StObject.set(x, "callouts", value.toJsFn)
    
    inline def setMessage(value: CallbackTo[AdWordsSelector[Message]]): Self = StObject.set(x, "message", value.toJsFn)
    
    inline def setMobileApps(value: CallbackTo[AdWordsSelector[MobileApp]]): Self = StObject.set(x, "mobileApps", value.toJsFn)
    
    inline def setReviews(value: CallbackTo[AdWordsSelector[Review]]): Self = StObject.set(x, "reviews", value.toJsFn)
    
    inline def setSitelinks(value: CallbackTo[AdWordsSelector[Sitelink]]): Self = StObject.set(x, "sitelinks", value.toJsFn)
    
    inline def setSnippets(value: CallbackTo[AdWordsSelector[Snippet]]): Self = StObject.set(x, "snippets", value.toJsFn)
  }
}
