package typingsJapgolly.stylelint.mod

import typingsJapgolly.stylelint.PartialLinterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylelint", "lint")
@js.native
object lint extends js.Object {
  def apply(): js.Promise[LinterResult] = js.native
  def apply(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
}

