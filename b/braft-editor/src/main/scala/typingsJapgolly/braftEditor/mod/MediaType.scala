package typingsJapgolly.braftEditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import typingsJapgolly.braftEditor.AnonAudio
import typingsJapgolly.braftEditor.AnonEmbed
import typingsJapgolly.braftEditor.AnonError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaType extends js.Object {
  var accepts: js.UndefOr[AnonAudio] = js.undefined
  var externals: js.UndefOr[AnonEmbed] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function] = js.undefined
  var onInsert: js.UndefOr[js.Function] = js.undefined
  var pasteImage: js.UndefOr[Boolean] = js.undefined
  var uploadFn: js.UndefOr[js.Function1[/* params */ AnonError, Unit]] = js.undefined
  var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | js.Thenable[_]]] = js.undefined
}

object MediaType {
  @scala.inline
  def apply(
    accepts: AnonAudio = null,
    externals: AnonEmbed = null,
    items: js.Array[_] = null,
    onChange: js.Function = null,
    onInsert: js.Function = null,
    pasteImage: js.UndefOr[Boolean] = js.undefined,
    uploadFn: /* params */ AnonError => Callback = null,
    validateFn: /* file */ File => CallbackTo[Boolean | js.Thenable[js.Any]] = null
  ): MediaType = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (externals != null) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (onInsert != null) __obj.updateDynamic("onInsert")(onInsert.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteImage)) __obj.updateDynamic("pasteImage")(pasteImage.asInstanceOf[js.Any])
    if (uploadFn != null) __obj.updateDynamic("uploadFn")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.braftEditor.AnonError) => uploadFn(t0).runNow()))
    if (validateFn != null) __obj.updateDynamic("validateFn")(js.Any.fromFunction1((t0: /* file */ org.scalajs.dom.raw.File) => validateFn(t0).runNow()))
    __obj.asInstanceOf[MediaType]
  }
}

