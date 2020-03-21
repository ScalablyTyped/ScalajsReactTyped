package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument
import typingsJapgolly.jsonld.jsonldSpecMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compact
  extends Common
     with ExpMap {
  var appropriate: js.UndefOr[Boolean] = js.undefined
  var compactArrays: js.UndefOr[Boolean] = js.undefined
  var compactToRelative: js.UndefOr[Boolean] = js.undefined
  // TODO: Figure out type of info
  var compactionMap: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.undefined
  var expansion: js.UndefOr[Boolean] = js.undefined
  var framing: js.UndefOr[Boolean] = js.undefined
  var graph: js.UndefOr[Boolean] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
}

object Compact {
  @scala.inline
  def apply(
    appropriate: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    compactArrays: js.UndefOr[Boolean] = js.undefined,
    compactToRelative: js.UndefOr[Boolean] = js.undefined,
    compactionMap: /* info */ js.Any => Callback = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => CallbackTo[js.Promise[RemoteDocument]] = null,
    expandContext: Context = null,
    expansion: js.UndefOr[Boolean] = js.undefined,
    expansionMap: /* info */ js.Any => CallbackTo[js.Any] = null,
    framing: js.UndefOr[Boolean] = js.undefined,
    graph: js.UndefOr[Boolean] = js.undefined,
    skipExpansion: js.UndefOr[Boolean] = js.undefined
  ): Compact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appropriate)) __obj.updateDynamic("appropriate")(appropriate.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(compactArrays)) __obj.updateDynamic("compactArrays")(compactArrays.asInstanceOf[js.Any])
    if (!js.isUndefined(compactToRelative)) __obj.updateDynamic("compactToRelative")(compactToRelative.asInstanceOf[js.Any])
    if (compactionMap != null) __obj.updateDynamic("compactionMap")(js.Any.fromFunction1((t0: /* info */ js.Any) => compactionMap(t0).runNow()))
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, t1: /* callback */ js.Function2[
  /* err */ js.Error, 
  /* remoteDoc */ typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument, 
  scala.Unit]) => documentLoader(t0, t1).runNow()))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (!js.isUndefined(expansion)) __obj.updateDynamic("expansion")(expansion.asInstanceOf[js.Any])
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1((t0: /* info */ js.Any) => expansionMap(t0).runNow()))
    if (!js.isUndefined(framing)) __obj.updateDynamic("framing")(framing.asInstanceOf[js.Any])
    if (!js.isUndefined(graph)) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
}

