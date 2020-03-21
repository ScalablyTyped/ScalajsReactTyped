package typingsJapgolly.keystonejsAppStatic.mod

import typingsJapgolly.keystonejsAppStatic.AnonDev
import typingsJapgolly.keystonejsKeystone.mod.BaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/app-static", "StaticApp")
@js.native
class StaticApp () extends BaseApp {
  def this(options: StaticOptions) = this()
  def prepareMiddleware(hasDev: AnonDev): js.Promise[Unit] = js.native
}

