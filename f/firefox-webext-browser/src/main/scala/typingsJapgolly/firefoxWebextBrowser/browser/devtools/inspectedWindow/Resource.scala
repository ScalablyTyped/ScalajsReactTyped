package typingsJapgolly.firefoxWebextBrowser.browser.devtools.inspectedWindow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.inspectedWindow types */
/** A resource within the inspected page, such as a document, a script, or an image. */
trait Resource extends js.Object {
  /**
    * Gets the content of the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var getContent: js.UndefOr[js.Function0[js.Promise[js.Object]]] = js.undefined
  /**
    * Sets the content of the resource.
    * @param content New content of the resource. Only resources with the text type are currently supported.
    * @param commit True if the user has finished editing the resource, and the new content of the resource should
    *     be persisted; false if this is a minor change sent in progress of the user editing the resource.
    * @deprecated Unsupported on Firefox at this time.
    */
  var setContent: js.UndefOr[
    js.Function2[/* content */ String, /* commit */ Boolean, js.Promise[StringDictionary[_]]]
  ] = js.undefined
  /** The URL of the resource. */
  var url: String
}

object Resource {
  @scala.inline
  def apply(
    url: String,
    getContent: js.UndefOr[CallbackTo[js.Promise[js.Object]]] = js.undefined,
    setContent: (/* content */ String, /* commit */ Boolean) => CallbackTo[js.Promise[StringDictionary[js.Any]]] = null
  ): Resource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    getContent.foreach(p => __obj.updateDynamic("getContent")(p.toJsFn))
    if (setContent != null) __obj.updateDynamic("setContent")(js.Any.fromFunction2((t0: /* content */ java.lang.String, t1: /* commit */ scala.Boolean) => setContent(t0, t1).runNow()))
    __obj.asInstanceOf[Resource]
  }
}

