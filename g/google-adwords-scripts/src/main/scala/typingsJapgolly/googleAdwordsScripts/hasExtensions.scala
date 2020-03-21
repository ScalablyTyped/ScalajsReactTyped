package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasExtensions extends js.Object {
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
  @scala.inline
  def apply(
    addCallout: Callout => CallbackTo[AdWordsOperation[Callout]],
    addMessage: Message => CallbackTo[AdWordsOperation[Message]],
    addMobileApp: MobileApp => CallbackTo[AdWordsOperation[MobileApp]],
    addPhoneNumber: PhoneNumber => CallbackTo[AdWordsOperation[PhoneNumber]],
    addReview: Review => CallbackTo[AdWordsOperation[Review]],
    addSitelink: Sitelink => CallbackTo[AdWordsOperation[Sitelink]],
    addSnippet: Snippet => CallbackTo[AdWordsOperation[Snippet]],
    removeCallout: Callout => Callback,
    removeMessage: Message => Callback,
    removeMobileApp: MobileApp => Callback,
    removePhoneNumber: PhoneNumber => Callback,
    removeReview: Review => Callback,
    removeSitelink: Sitelink => Callback,
    removeSnippet: Snippet => Callback
  ): hasExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCallout")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Callout) => addCallout(t0).runNow()))
    __obj.updateDynamic("addMessage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Message) => addMessage(t0).runNow()))
    __obj.updateDynamic("addMobileApp")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.MobileApp) => addMobileApp(t0).runNow()))
    __obj.updateDynamic("addPhoneNumber")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.PhoneNumber) => addPhoneNumber(t0).runNow()))
    __obj.updateDynamic("addReview")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Review) => addReview(t0).runNow()))
    __obj.updateDynamic("addSitelink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Sitelink) => addSitelink(t0).runNow()))
    __obj.updateDynamic("addSnippet")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Snippet) => addSnippet(t0).runNow()))
    __obj.updateDynamic("removeCallout")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Callout) => removeCallout(t0).runNow()))
    __obj.updateDynamic("removeMessage")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Message) => removeMessage(t0).runNow()))
    __obj.updateDynamic("removeMobileApp")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.MobileApp) => removeMobileApp(t0).runNow()))
    __obj.updateDynamic("removePhoneNumber")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.PhoneNumber) => removePhoneNumber(t0).runNow()))
    __obj.updateDynamic("removeReview")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Review) => removeReview(t0).runNow()))
    __obj.updateDynamic("removeSitelink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Sitelink) => removeSitelink(t0).runNow()))
    __obj.updateDynamic("removeSnippet")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.Snippet) => removeSnippet(t0).runNow()))
    __obj.asInstanceOf[hasExtensions]
  }
}

