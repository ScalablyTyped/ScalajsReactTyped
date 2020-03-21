package typingsJapgolly.hapi.mod

import typingsJapgolly.hapi.AnonArtifacts
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.shot.AnonClose
import typingsJapgolly.shot.mod.Headers
import typingsJapgolly.shot.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectOptions extends RequestOptions {
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[Boolean] = js.undefined
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[ApplicationState] = js.undefined
  /**
    * Authentication bypass options.
    */
  var auth: js.UndefOr[AnonArtifacts] = js.undefined
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.undefined
}

object ServerInjectOptions {
  @scala.inline
  def apply(
    url: String,
    allowInternals: js.UndefOr[Boolean] = js.undefined,
    app: ApplicationState = null,
    auth: AnonArtifacts = null,
    authority: String = null,
    headers: Headers = null,
    method: String = null,
    payload: String | Buffer | Stream | js.Object = null,
    plugins: PluginsStates = null,
    remoteAddress: String = null,
    simulate: AnonClose = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInternals)) __obj.updateDynamic("allowInternals")(allowInternals.asInstanceOf[js.Any])
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    if (simulate != null) __obj.updateDynamic("simulate")(simulate.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectOptions]
  }
}

