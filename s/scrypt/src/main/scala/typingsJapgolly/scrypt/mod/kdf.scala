package typingsJapgolly.scrypt.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "kdf")
@js.native
object kdf extends js.Object {
  def apply(key: String, paramsObject: Params_): js.Promise[Buffer] = js.native
  def apply(
    key: String,
    paramsObject: Params_,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
  def apply(key: Buffer, paramsObject: Params_): js.Promise[Buffer] = js.native
  def apply(
    key: Buffer,
    paramsObject: Params_,
    cb: js.Function2[/* err */ js.Error | Null, /* obj */ Buffer, Unit]
  ): Unit = js.native
}

