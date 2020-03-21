package typingsJapgolly.bugsnagJs.sessionMod

import typingsJapgolly.bugsnagJs.AnonHandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bugsnag-js/types/session", JSImport.Default)
@js.native
class default () extends Session {
  /* CompleteClass */
  override var events: AnonHandled = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var startedAt: String = js.native
  /* CompleteClass */
  override def trackError(report: typingsJapgolly.bugsnagJs.reportMod.default): Unit = js.native
}

