package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonAnnotationId
import typingsJapgolly.gapiClientBooks.AnonEndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnonAnnotationId): Request_[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: AnonEndOffset): Request_[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(
    get: AnonAnnotationId => CallbackTo[Request_[Volumeannotation]],
    list: AnonEndOffset => CallbackTo[Request_[Volumeannotations]]
  ): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonAnnotationId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonEndOffset) => list(t0).runNow()))
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

