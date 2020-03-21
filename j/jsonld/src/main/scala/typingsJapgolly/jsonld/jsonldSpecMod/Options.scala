package typingsJapgolly.jsonld.jsonldSpecMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base: js.UndefOr[DOMString | Null] = js.undefined
  var compactArrays: js.UndefOr[Boolean] = js.undefined
  var documentLoader: js.UndefOr[LoadDocumentCallback | Null] = js.undefined
  var expandContext: js.UndefOr[Context | Null] = js.undefined
  var processingMode: js.UndefOr[DOMString] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    base: DOMString = null,
    compactArrays: js.UndefOr[Boolean] = js.undefined,
    documentLoader: /* url */ Url => CallbackTo[js.Promise[RemoteDocument]] = null,
    expandContext: Context = null,
    processingMode: DOMString = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(compactArrays)) __obj.updateDynamic("compactArrays")(compactArrays.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction1((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url) => documentLoader(t0).runNow()))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (processingMode != null) __obj.updateDynamic("processingMode")(processingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

