package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument
import typingsJapgolly.jsonld.jsonldSpecMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocLoader extends js.Object {
  var documentLoader: js.UndefOr[
    js.Function2[
      /* url */ Url, 
      /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit], 
      js.Promise[RemoteDocument]
    ]
  ] = js.undefined
}

object DocLoader {
  @scala.inline
  def apply(
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ js.Error, /* remoteDoc */ RemoteDocument, Unit]) => CallbackTo[js.Promise[RemoteDocument]] = null
  ): DocLoader = {
    val __obj = js.Dynamic.literal()
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2((t0: /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, t1: /* callback */ js.Function2[
  /* err */ js.Error, 
  /* remoteDoc */ typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument, 
  scala.Unit]) => documentLoader(t0, t1).runNow()))
    __obj.asInstanceOf[DocLoader]
  }
}

