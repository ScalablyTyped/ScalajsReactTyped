package typingsJapgolly.contractProxyKit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofRLP extends js.Object {
  def decode(data: Arrayish): js.Any
  def encode(`object`: js.Any): String
}

object TypeofRLP {
  @scala.inline
  def apply(decode: Arrayish => CallbackTo[js.Any], encode: js.Any => CallbackTo[String]): TypeofRLP = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: typingsJapgolly.ethers.typesMod.Arrayish) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    __obj.asInstanceOf[TypeofRLP]
  }
}

