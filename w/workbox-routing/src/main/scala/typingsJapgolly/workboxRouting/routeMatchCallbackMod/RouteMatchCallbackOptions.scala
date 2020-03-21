package typingsJapgolly.workboxRouting.routeMatchCallbackMod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteMatchCallbackOptions extends js.Object {
  var event: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any
  ] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var url: URL
}

object RouteMatchCallbackOptions {
  @scala.inline
  def apply(
    url: URL,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExtendableEvent */ js.Any = null,
    request: Request = null
  ): RouteMatchCallbackOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteMatchCallbackOptions]
  }
}

