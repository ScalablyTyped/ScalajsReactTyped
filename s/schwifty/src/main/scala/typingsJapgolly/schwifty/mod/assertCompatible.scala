package typingsJapgolly.schwifty.mod

import typingsJapgolly.schwifty.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", "assertCompatible")
@js.native
object assertCompatible extends js.Object {
  def apply(ModelA: TypeofModel, ModelB: TypeofModel): Unit | js.Error = js.native
  def apply(ModelA: TypeofModel, ModelB: TypeofModel, message: String): Unit | js.Error = js.native
}

