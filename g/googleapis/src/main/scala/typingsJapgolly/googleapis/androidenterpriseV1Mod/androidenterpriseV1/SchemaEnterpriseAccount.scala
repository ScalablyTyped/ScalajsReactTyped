package typingsJapgolly.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service account that can be used to authenticate as the enterprise to API
  * calls that require such authentication.
  */
@js.native
trait SchemaEnterpriseAccount extends js.Object {
  /**
    * The email address of the service account.
    */
  var accountEmail: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#enterpriseAccount&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEnterpriseAccount {
  @scala.inline
  def apply(accountEmail: String = null, kind: String = null): SchemaEnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    if (accountEmail != null) __obj.updateDynamic("accountEmail")(accountEmail.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnterpriseAccount]
  }
}

