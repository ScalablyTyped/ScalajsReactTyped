package typingsJapgolly.activestorage.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectUploadDelegate extends js.Object {
  var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
  var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
}

object DirectUploadDelegate {
  @scala.inline
  def apply(
    directUploadWillCreateBlobWithXHR: /* xhr */ XMLHttpRequest => Callback = null,
    directUploadWillStoreFileWithXHR: /* xhr */ XMLHttpRequest => Callback = null
  ): DirectUploadDelegate = {
    val __obj = js.Dynamic.literal()
    if (directUploadWillCreateBlobWithXHR != null) __obj.updateDynamic("directUploadWillCreateBlobWithXHR")(js.Any.fromFunction1((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => directUploadWillCreateBlobWithXHR(t0).runNow()))
    if (directUploadWillStoreFileWithXHR != null) __obj.updateDynamic("directUploadWillStoreFileWithXHR")(js.Any.fromFunction1((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest) => directUploadWillStoreFileWithXHR(t0).runNow()))
    __obj.asInstanceOf[DirectUploadDelegate]
  }
}

