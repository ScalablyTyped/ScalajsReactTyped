package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument
import typingsJapgolly.jsonld.jsonldSpecMod.Url
import typingsJapgolly.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToRdf extends Common {
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
}

object ToRdf {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => CallbackTo[js.Promise[RemoteDocument]] = null,
    expandContext: Context = null,
    format: MimeNQuad = null,
    produceGeneralizedRdf: js.UndefOr[Boolean] = js.undefined,
    skipExpansion: js.UndefOr[Boolean] = js.undefined
  ): ToRdf = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, t1: /* callback */ js.Function2[
  /* err */ js.Error, 
  /* remoteDoc */ typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument, 
  scala.Unit]) => documentLoader(t0, t1).runNow()))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(produceGeneralizedRdf)) __obj.updateDynamic("produceGeneralizedRdf")(produceGeneralizedRdf.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToRdf]
  }
}

