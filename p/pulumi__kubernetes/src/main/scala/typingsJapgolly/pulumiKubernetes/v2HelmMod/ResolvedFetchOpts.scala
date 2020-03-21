package typingsJapgolly.pulumiKubernetes.v2HelmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedFetchOpts extends js.Object {
  var caFile: js.UndefOr[String] = js.undefined
  var certFile: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var devel: js.UndefOr[Boolean] = js.undefined
  var home: js.UndefOr[String] = js.undefined
  var keyFile: js.UndefOr[String] = js.undefined
  var keyring: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var prov: js.UndefOr[Boolean] = js.undefined
  var repo: js.UndefOr[String] = js.undefined
  var untar: js.UndefOr[Boolean] = js.undefined
  var untardir: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var verify: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ResolvedFetchOpts {
  @scala.inline
  def apply(
    caFile: String = null,
    certFile: String = null,
    destination: String = null,
    devel: js.UndefOr[Boolean] = js.undefined,
    home: String = null,
    keyFile: String = null,
    keyring: String = null,
    password: String = null,
    prov: js.UndefOr[Boolean] = js.undefined,
    repo: String = null,
    untar: js.UndefOr[Boolean] = js.undefined,
    untardir: String = null,
    username: String = null,
    verify: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): ResolvedFetchOpts = {
    val __obj = js.Dynamic.literal()
    if (caFile != null) __obj.updateDynamic("caFile")(caFile.asInstanceOf[js.Any])
    if (certFile != null) __obj.updateDynamic("certFile")(certFile.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(devel)) __obj.updateDynamic("devel")(devel.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyring != null) __obj.updateDynamic("keyring")(keyring.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(prov)) __obj.updateDynamic("prov")(prov.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (!js.isUndefined(untar)) __obj.updateDynamic("untar")(untar.asInstanceOf[js.Any])
    if (untardir != null) __obj.updateDynamic("untardir")(untardir.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedFetchOpts]
  }
}

