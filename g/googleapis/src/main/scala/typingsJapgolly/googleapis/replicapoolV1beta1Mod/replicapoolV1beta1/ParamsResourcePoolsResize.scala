package typingsJapgolly.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourcePoolsResize extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The desired number of replicas to resize to. If this number is larger
    * than the existing number of replicas, new replicas will be added. If the
    * number is smaller, then existing replicas will be deleted.
    */
  var numReplicas: js.UndefOr[Double] = js.native
  /**
    * The name of the replica pool for this request.
    */
  var poolName: js.UndefOr[String] = js.native
  /**
    * The project ID for this replica pool.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * The zone for this replica pool.
    */
  var zone: js.UndefOr[String] = js.native
}

object ParamsResourcePoolsResize {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    numReplicas: Int | Double = null,
    oauth_token: String = null,
    poolName: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    projectName: String = null,
    quotaUser: String = null,
    userIp: String = null,
    zone: String = null
  ): ParamsResourcePoolsResize = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (numReplicas != null) __obj.updateDynamic("numReplicas")(numReplicas.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (poolName != null) __obj.updateDynamic("poolName")(poolName.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (projectName != null) __obj.updateDynamic("projectName")(projectName.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourcePoolsResize]
  }
}

