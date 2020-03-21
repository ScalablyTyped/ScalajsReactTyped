package typingsJapgolly.tslint

import typingsJapgolly.tslint.runnerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/files/reading", JSImport.Namespace)
@js.native
object readingMod extends js.Object {
  def tryReadFile(filename: String, logger: Logger): js.Promise[js.UndefOr[String]] = js.native
}

