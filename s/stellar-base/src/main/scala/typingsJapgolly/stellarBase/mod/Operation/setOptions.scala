package typingsJapgolly.stellarBase.mod.Operation

import typingsJapgolly.stellarBase.mod.OperationOptions.SetOptions
import typingsJapgolly.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Operation.setOptions")
@js.native
object setOptions extends js.Object {
  def apply[T /* <: SignerOptions */](options: SetOptions[T]): typingsJapgolly.stellarBase.mod.xdr.Operation[SetOptions_[T]] = js.native
}

