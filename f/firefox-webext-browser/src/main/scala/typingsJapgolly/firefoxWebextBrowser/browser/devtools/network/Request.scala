package typingsJapgolly.firefoxWebextBrowser.browser.devtools.network

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* devtools.network types */
/**
  * Represents a network request for a document resource (script, image and so on). See HAR Specification for
  * reference.
  */
trait Request extends js.Object {
  /** Returns content of the response body. */
  def getContent(): js.Promise[js.Object]
}

object Request {
  @scala.inline
  def apply(getContent: CallbackTo[js.Promise[js.Object]]): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.asInstanceOf[Request]
  }
}

