package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResponse extends js.Object {
  /**
    * Information about the application. 
    */
  var ApplicationInfo: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}

object UpdateApplicationResponse {
  @scala.inline
  def apply(ApplicationInfo: ApplicationInfo = null): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationInfo != null) __obj.updateDynamic("ApplicationInfo")(ApplicationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
}

