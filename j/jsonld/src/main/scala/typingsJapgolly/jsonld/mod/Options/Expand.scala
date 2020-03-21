package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonld.jsonldSpecMod.Context
import typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument
import typingsJapgolly.jsonld.jsonldSpecMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand
  extends Common
     with ExpMap {
  var keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
}

object Expand {
  @scala.inline
  def apply(
    base: String = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => CallbackTo[js.Promise[RemoteDocument]] = null,
    expandContext: Context = null,
    expansionMap: /* info */ js.Any => CallbackTo[js.Any] = null,
    keepFreeFloatingNodes: js.UndefOr[Boolean] = js.undefined
  ): Expand = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, t1: /* callback */ js.Function2[
  /* err */ js.Error, 
  /* remoteDoc */ typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument, 
  scala.Unit]) => documentLoader(t0, t1).runNow()))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1((t0: /* info */ js.Any) => expansionMap(t0).runNow()))
    if (!js.isUndefined(keepFreeFloatingNodes)) __obj.updateDynamic("keepFreeFloatingNodes")(keepFreeFloatingNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}

