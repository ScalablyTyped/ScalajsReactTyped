package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.NpmClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/definitions.ConfigFile> */
trait PartialConfigFile extends js.Object {
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.undefined
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.undefined
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.undefined
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var npmClient: js.UndefOr[NpmClient] = js.undefined
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.undefined
  var telemetry: js.UndefOr[Boolean] = js.undefined
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.undefined
  @JSName("tokens.user")
  var tokensDotuser: js.UndefOr[String] = js.undefined
  @JSName("urls.api")
  var urlsDotapi: js.UndefOr[String] = js.undefined
  @JSName("urls.dash")
  var urlsDotdash: js.UndefOr[String] = js.undefined
  @JSName("user.email")
  var userDotemail: js.UndefOr[String] = js.undefined
  @JSName("user.id")
  var userDotid: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PartialConfigFile {
  @scala.inline
  def apply(
    `featuresDotssl-commands`: js.UndefOr[Boolean] = js.undefined,
    gitDothost: String = null,
    gitDotport: Int | Double = null,
    gitDotsetup: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    npmClient: NpmClient = null,
    orgDotid: String = null,
    proxy: String = null,
    sslDotcafile: String | js.Array[String] = null,
    sslDotcertfile: String | js.Array[String] = null,
    sslDotkeyfile: String | js.Array[String] = null,
    telemetry: js.UndefOr[Boolean] = js.undefined,
    tokensDottelemetry: String = null,
    tokensDotuser: String = null,
    urlsDotapi: String = null,
    urlsDotdash: String = null,
    userDotemail: String = null,
    userDotid: Int | Double = null,
    version: String = null
  ): PartialConfigFile = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`featuresDotssl-commands`)) __obj.updateDynamic("features.ssl-commands")(`featuresDotssl-commands`.asInstanceOf[js.Any])
    if (gitDothost != null) __obj.updateDynamic("git.host")(gitDothost.asInstanceOf[js.Any])
    if (gitDotport != null) __obj.updateDynamic("git.port")(gitDotport.asInstanceOf[js.Any])
    if (!js.isUndefined(gitDotsetup)) __obj.updateDynamic("git.setup")(gitDotsetup.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (npmClient != null) __obj.updateDynamic("npmClient")(npmClient.asInstanceOf[js.Any])
    if (orgDotid != null) __obj.updateDynamic("org.id")(orgDotid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (sslDotcafile != null) __obj.updateDynamic("ssl.cafile")(sslDotcafile.asInstanceOf[js.Any])
    if (sslDotcertfile != null) __obj.updateDynamic("ssl.certfile")(sslDotcertfile.asInstanceOf[js.Any])
    if (sslDotkeyfile != null) __obj.updateDynamic("ssl.keyfile")(sslDotkeyfile.asInstanceOf[js.Any])
    if (!js.isUndefined(telemetry)) __obj.updateDynamic("telemetry")(telemetry.asInstanceOf[js.Any])
    if (tokensDottelemetry != null) __obj.updateDynamic("tokens.telemetry")(tokensDottelemetry.asInstanceOf[js.Any])
    if (tokensDotuser != null) __obj.updateDynamic("tokens.user")(tokensDotuser.asInstanceOf[js.Any])
    if (urlsDotapi != null) __obj.updateDynamic("urls.api")(urlsDotapi.asInstanceOf[js.Any])
    if (urlsDotdash != null) __obj.updateDynamic("urls.dash")(urlsDotdash.asInstanceOf[js.Any])
    if (userDotemail != null) __obj.updateDynamic("user.email")(userDotemail.asInstanceOf[js.Any])
    if (userDotid != null) __obj.updateDynamic("user.id")(userDotid.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfigFile]
  }
}

