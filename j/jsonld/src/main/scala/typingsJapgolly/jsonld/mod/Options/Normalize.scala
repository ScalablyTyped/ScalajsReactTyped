package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument
import typingsJapgolly.jsonld.jsonldSpecMod.Url
import typingsJapgolly.jsonld.jsonldStrings.URDNA2015
import typingsJapgolly.jsonld.jsonldStrings.URGNA2012
import typingsJapgolly.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Normalize extends Common {
  var algorithm: js.UndefOr[URDNA2015 | URGNA2012] = js.undefined
  var expansion: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[MimeNQuad] = js.undefined
  var inputFormat: js.UndefOr[MimeNQuad] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object Normalize {
  @scala.inline
  def apply(
    algorithm: URDNA2015 | URGNA2012 = null,
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => CallbackTo[js.Promise[RemoteDocument]] = null,
    expandContext: Context = null,
    expansion: js.UndefOr[Boolean] = js.undefined,
    format: MimeNQuad = null,
    inputFormat: MimeNQuad = null,
    skipExpansion: js.UndefOr[Boolean] = js.undefined,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): Normalize = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, t1: /* callback */ js.Function2[
  /* err */ js.Error, 
  /* remoteDoc */ typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument, 
  scala.Unit]) => documentLoader(t0, t1).runNow()))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (!js.isUndefined(expansion)) __obj.updateDynamic("expansion")(expansion.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (inputFormat != null) __obj.updateDynamic("inputFormat")(inputFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalize]
  }
}

