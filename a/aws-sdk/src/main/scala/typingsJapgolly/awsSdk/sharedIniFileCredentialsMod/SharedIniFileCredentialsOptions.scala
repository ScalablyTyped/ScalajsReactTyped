package typingsJapgolly.awsSdk.sharedIniFileCredentialsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsSdk.configMod.HTTPOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedIniFileCredentialsOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.native
  var disableAssumeRole: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  var profile: js.UndefOr[String] = js.native
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}

object SharedIniFileCredentialsOptions {
  @scala.inline
  def apply(
    callback: /* err */ js.UndefOr[js.Error] => Callback = null,
    disableAssumeRole: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    httpOptions: HTTPOptions = null,
    profile: String = null,
    tokenCodeFn: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[String], Unit]) => Callback = null
  ): SharedIniFileCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Error]) => callback(t0).runNow()))
    if (!js.isUndefined(disableAssumeRole)) __obj.updateDynamic("disableAssumeRole")(disableAssumeRole.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(js.Any.fromFunction2((t0: /* mfaSerial */ java.lang.String, t1: /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* token */ js.UndefOr[java.lang.String], scala.Unit]) => tokenCodeFn(t0, t1).runNow()))
    __obj.asInstanceOf[SharedIniFileCredentialsOptions]
  }
}

