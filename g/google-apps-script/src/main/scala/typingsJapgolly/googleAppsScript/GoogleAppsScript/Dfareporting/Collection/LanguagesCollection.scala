package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.LanguagesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguagesCollection extends js.Object {
  // Retrieves a list of languages.
  def list(profileId: String): LanguagesListResponse
}

object LanguagesCollection {
  @scala.inline
  def apply(list: String => CallbackTo[LanguagesListResponse]): LanguagesCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[LanguagesCollection]
  }
}

