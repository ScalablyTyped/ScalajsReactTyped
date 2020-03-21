package typingsJapgolly.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsSdk.credentialsMod.Credentials
import typingsJapgolly.awsSdk.stsMod.AssumeRoleRequest
import typingsJapgolly.awsSdk.stsMod.ClientConfiguration
import typingsJapgolly.awsSdk.stsMod.GetSessionTokenRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableTemporaryCredentialsOptions extends js.Object {
  var masterCredentials: js.UndefOr[Credentials] = js.native
  var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.native
  var stsConfig: js.UndefOr[ClientConfiguration] = js.native
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* serialNumber */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}

object ChainableTemporaryCredentialsOptions {
  @scala.inline
  def apply(
    masterCredentials: Credentials = null,
    params: AssumeRoleRequest | GetSessionTokenRequest = null,
    stsConfig: ClientConfiguration = null,
    tokenCodeFn: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Callback = null
  ): ChainableTemporaryCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (masterCredentials != null) __obj.updateDynamic("masterCredentials")(masterCredentials.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (stsConfig != null) __obj.updateDynamic("stsConfig")(stsConfig.asInstanceOf[js.Any])
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(js.Any.fromFunction2((t0: /* serialNumber */ java.lang.String, t1: /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[java.lang.String], scala.Unit]) => tokenCodeFn(t0, t1).runNow()))
    __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
}

