package typingsJapgolly.ethers.typesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ethers.ethersStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnceBlockable extends js.Object {
  @JSName("once")
  def once_block(eventName: block, handler: js.Function0[Unit]): Unit
}

object OnceBlockable {
  @scala.inline
  def apply(once: (block, js.Function0[Unit]) => Callback): OnceBlockable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: typingsJapgolly.ethers.ethersStrings.block, t1: js.Function0[scala.Unit]) => once(t0, t1).runNow()))
    __obj.asInstanceOf[OnceBlockable]
  }
}

