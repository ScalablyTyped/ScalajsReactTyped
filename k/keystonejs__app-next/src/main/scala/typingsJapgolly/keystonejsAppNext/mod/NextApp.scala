package typingsJapgolly.keystonejsAppNext.mod

import typingsJapgolly.keystonejsAppNext.AnonDev
import typingsJapgolly.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-next", "NextApp")
@js.native
class NextApp () extends BaseApp {
  def this(options: NextOptions) = this()
  def prepareMiddleware(hasDev: AnonDev): js.Promise[Unit] = js.native
}

