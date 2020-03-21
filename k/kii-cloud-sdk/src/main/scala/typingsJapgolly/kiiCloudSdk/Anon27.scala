package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon27 extends js.Object {
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any
}

object Anon27 {
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => CallbackTo[js.Any],
    success: (KiiUser, KiiSocialNetworkName) => CallbackTo[js.Any]
  ): Anon27 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction3((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiSocialNetworkName, t2: java.lang.String) => failure(t0, t1, t2).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser, t1: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiSocialNetworkName) => success(t0, t1).runNow()))
    __obj.asInstanceOf[Anon27]
  }
}

