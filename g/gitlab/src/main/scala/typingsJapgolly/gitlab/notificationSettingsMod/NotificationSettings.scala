package typingsJapgolly.gitlab.notificationSettingsMod

import typingsJapgolly.gitlab.Anon0
import typingsJapgolly.gitlab.Anon1
import typingsJapgolly.gitlab.AnonLevel
import typingsJapgolly.gitlab.infrastructureMod.BaseService
import typingsJapgolly.gitlab.requestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.requestHelperMod.GetResponse
import typingsJapgolly.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/NotificationSettings", "NotificationSettings")
@js.native
class NotificationSettings () extends BaseService {
  def all(hasProjectIdGroupIdOptions: (Anon0 | Anon1) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(hasProjectIdGroupIdOptions: AnonLevel with (Anon0 | Anon1) with BaseRequestOptions): js.Promise[js.Object] = js.native
}

