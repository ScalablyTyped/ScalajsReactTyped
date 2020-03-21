package typingsJapgolly.kiiCloudSdk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon11 extends js.Object {
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any
  def success(theSavedGroup: KiiGroup): js.Any
}

object Anon11 {
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => CallbackTo[js.Any],
    success: KiiGroup => CallbackTo[js.Any]
  ): Anon11 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(js.Any.fromFunction4((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup, t1: java.lang.String, t2: js.Array[typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser], t3: js.Array[typingsJapgolly.kiiCloudSdk.KiiCloud.KiiUser]) => failure(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.kiiCloudSdk.KiiCloud.KiiGroup) => success(t0).runNow()))
    __obj.asInstanceOf[Anon11]
  }
}

