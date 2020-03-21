package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonMaxAllowedMaturityRating
import typingsJapgolly.gapiClientBooks.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecommendedResource extends js.Object {
  /** Return a list of recommended books for the current user. */
  def list(request: AnonMaxAllowedMaturityRating): Request_[Volumes]
  /** Rate a recommended book for the current user. */
  def rate(request: AnonRating): Request_[BooksVolumesRecommendedRateResponse]
}

object RecommendedResource {
  @scala.inline
  def apply(
    list: AnonMaxAllowedMaturityRating => CallbackTo[Request_[Volumes]],
    rate: AnonRating => CallbackTo[Request_[BooksVolumesRecommendedRateResponse]]
  ): RecommendedResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonMaxAllowedMaturityRating) => list(t0).runNow()))
    __obj.updateDynamic("rate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonRating) => rate(t0).runNow()))
    __obj.asInstanceOf[RecommendedResource]
  }
}

