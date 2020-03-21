package typingsJapgolly.jose.mod.JWT

import typingsJapgolly.jose.mod.ProduceKeyInputWithNone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWT.sign")
@js.native
object sign extends js.Object {
  def apply(payload: js.Object, key: ProduceKeyInputWithNone): String = js.native
  def apply(payload: js.Object, key: ProduceKeyInputWithNone, options: SignOptions): String = js.native
}

