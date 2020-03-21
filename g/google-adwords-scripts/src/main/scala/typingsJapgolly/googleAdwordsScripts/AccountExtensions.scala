package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad extensions
trait AccountExtensions extends js.Object {
  def callouts(): AdWordsSelector[Callout]
  def message(): AdWordsSelector[Message]
  def mobileApps(): AdWordsSelector[MobileApp]
  def reviews(): AdWordsSelector[Review]
  def sitelinks(): AdWordsSelector[Sitelink]
  def snippets(): AdWordsSelector[Snippet]
}

object AccountExtensions {
  @scala.inline
  def apply(
    callouts: CallbackTo[AdWordsSelector[Callout]],
    message: CallbackTo[AdWordsSelector[Message]],
    mobileApps: CallbackTo[AdWordsSelector[MobileApp]],
    reviews: CallbackTo[AdWordsSelector[Review]],
    sitelinks: CallbackTo[AdWordsSelector[Sitelink]],
    snippets: CallbackTo[AdWordsSelector[Snippet]]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callouts")(callouts.toJsFn)
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.updateDynamic("mobileApps")(mobileApps.toJsFn)
    __obj.updateDynamic("reviews")(reviews.toJsFn)
    __obj.updateDynamic("sitelinks")(sitelinks.toJsFn)
    __obj.updateDynamic("snippets")(snippets.toJsFn)
    __obj.asInstanceOf[AccountExtensions]
  }
}

