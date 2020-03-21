package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsAdExtensions extends AdGroupExtensions {
  def newCalloutBuilder(): CalloutBuilder[Callout]
  def newMessageBuilder(): MessageBuilder[Message]
  def newMobileAppBuilder(): MobileAppBuilder[MobileApp]
  def newPhoneNumberBuilder(): PhoneNumberBuilder[PhoneNumber]
  def newReviewBuilder(): ReviewBuilder[Review]
  def newSitelinkBuilder(): SitelinkBuilder[Sitelink]
  def newSnippetBuilder(): SnippetBuilder[Snippet]
}

object AdWordsAdExtensions {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts.toJsFn)
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.updateDynamic("mobileApps")(mobileApps.toJsFn)
    __obj.updateDynamic("newCalloutBuilder")(newCalloutBuilder.toJsFn)
    __obj.updateDynamic("newMessageBuilder")(newMessageBuilder.toJsFn)
    __obj.updateDynamic("newMobileAppBuilder")(newMobileAppBuilder.toJsFn)
    __obj.updateDynamic("newPhoneNumberBuilder")(newPhoneNumberBuilder.toJsFn)
    __obj.updateDynamic("newReviewBuilder")(newReviewBuilder.toJsFn)
    __obj.updateDynamic("newSitelinkBuilder")(newSitelinkBuilder.toJsFn)
    __obj.updateDynamic("newSnippetBuilder")(newSnippetBuilder.toJsFn)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers.toJsFn)
    __obj.updateDynamic("reviews")(reviews.toJsFn)
    __obj.updateDynamic("sitelinks")(sitelinks.toJsFn)
    __obj.updateDynamic("snippets")(snippets.toJsFn)
    __obj.asInstanceOf[AdWordsAdExtensions]
  }
}

