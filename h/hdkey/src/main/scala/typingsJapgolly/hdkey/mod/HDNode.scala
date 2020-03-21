package typingsJapgolly.hdkey.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hdkey.AnonXpriv
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HDNode extends js.Object {
  var chainCode: Buffer
  var privateKey: Buffer
  var publicKey: Buffer
  def derive(path: String): HDNode
  def toJSON(): AnonXpriv
}

object HDNode {
  @scala.inline
  def apply(
    chainCode: Buffer,
    derive: String => CallbackTo[HDNode],
    privateKey: Buffer,
    publicKey: Buffer,
    toJSON: CallbackTo[AnonXpriv]
  ): HDNode = {
    val __obj = js.Dynamic.literal(chainCode = chainCode.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("derive")(js.Any.fromFunction1((t0: java.lang.String) => derive(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[HDNode]
  }
}

