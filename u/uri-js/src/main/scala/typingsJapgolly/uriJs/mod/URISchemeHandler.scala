package typingsJapgolly.uriJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends js.Object {
  var absolutePath: js.UndefOr[Boolean] = js.undefined
  var domainHost: js.UndefOr[Boolean] = js.undefined
  var scheme: String
  var unicodeSupport: js.UndefOr[Boolean] = js.undefined
  def parse(components: ParentComponents, options: Options): Components
  def serialize(components: Components, options: Options): ParentComponents
}

object URISchemeHandler {
  @scala.inline
  def apply[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */](
    parse: (ParentComponents, Options) => CallbackTo[Components],
    scheme: String,
    serialize: (Components, Options) => CallbackTo[ParentComponents],
    absolutePath: js.UndefOr[Boolean] = js.undefined,
    domainHost: js.UndefOr[Boolean] = js.undefined,
    unicodeSupport: js.UndefOr[Boolean] = js.undefined
  ): URISchemeHandler[Components, Options, ParentComponents] = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: ParentComponents, t1: Options) => parse(t0, t1).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction2((t0: Components, t1: Options) => serialize(t0, t1).runNow()))
    if (!js.isUndefined(absolutePath)) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (!js.isUndefined(domainHost)) __obj.updateDynamic("domainHost")(domainHost.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeSupport)) __obj.updateDynamic("unicodeSupport")(unicodeSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
  }
}

