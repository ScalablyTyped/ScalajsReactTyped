package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupExtensions extends AccountExtensions {
  def phoneNumbers(): AdWordsSelector[PhoneNumber]
}

object AdGroupExtensions {
  @scala.inline
  def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    phoneNumbers: CallbackTo[AdWordsSelector[PhoneNumber]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): AdGroupExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts.toJsFn)
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.updateDynamic("mobileApps")(mobileApps.toJsFn)
    __obj.updateDynamic("phoneNumbers")(phoneNumbers.toJsFn)
    __obj.updateDynamic("reviews")(reviews.toJsFn)
    __obj.updateDynamic("sitelinks")(sitelinks.toJsFn)
    __obj.updateDynamic("snippets")(snippets.toJsFn)
    __obj.asInstanceOf[AdGroupExtensions]
  }
}

