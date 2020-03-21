package typingsJapgolly.uuid.interfacesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.uuid.interfacesMod.RandomOptions
  - typingsJapgolly.uuid.interfacesMod.RngOptions
*/
trait V4Options extends js.Object

object V4Options {
  @scala.inline
  def RandomOptions(random: InputBuffer = null): V4Options = {
    val __obj = js.Dynamic.literal()
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4Options]
  }
  @scala.inline
  def RngOptions(rng: js.UndefOr[CallbackTo[InputBuffer]] = js.undefined): V4Options = {
    val __obj = js.Dynamic.literal()
    rng.foreach(p => __obj.updateDynamic("rng")(p.toJsFn))
    __obj.asInstanceOf[V4Options]
  }
}

