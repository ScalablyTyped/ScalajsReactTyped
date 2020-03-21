package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JWT credentials for a service account.
  */
@js.native
trait SchemaServiceAccountJwtAccessCredentials extends js.Object {
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.native
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.native
}

object SchemaServiceAccountJwtAccessCredentials {
  @scala.inline
  def apply(jsonKey: String = null, tokenLifetimeSeconds: String = null): SchemaServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    if (jsonKey != null) __obj.updateDynamic("jsonKey")(jsonKey.asInstanceOf[js.Any])
    if (tokenLifetimeSeconds != null) __obj.updateDynamic("tokenLifetimeSeconds")(tokenLifetimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceAccountJwtAccessCredentials]
  }
}

