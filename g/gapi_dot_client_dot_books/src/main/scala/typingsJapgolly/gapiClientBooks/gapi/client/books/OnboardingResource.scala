package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonCategoryId
import typingsJapgolly.gapiClientBooks.AnonKeyLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnboardingResource extends js.Object {
  /** List categories for onboarding experience. */
  def listCategories(request: AnonKeyLocale): Request_[Category]
  /** List available volumes under categories for onboarding experience. */
  def listCategoryVolumes(request: AnonCategoryId): Request_[Volume2]
}

object OnboardingResource {
  @scala.inline
  def apply(
    listCategories: AnonKeyLocale => CallbackTo[Request_[Category]],
    listCategoryVolumes: AnonCategoryId => CallbackTo[Request_[Volume2]]
  ): OnboardingResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listCategories")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonKeyLocale) => listCategories(t0).runNow()))
    __obj.updateDynamic("listCategoryVolumes")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonCategoryId) => listCategoryVolumes(t0).runNow()))
    __obj.asInstanceOf[OnboardingResource]
  }
}

