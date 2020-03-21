package typingsJapgolly.uuid.interfacesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.uuid.interfacesMod.V1RandomOptions
  - typingsJapgolly.uuid.interfacesMod.V1RngOptions
*/
trait V1Options extends js.Object

object V1Options {
  @scala.inline
  def V1RandomOptions(
    clockseq: Int | Double = null,
    msecs: Double | js.Date = null,
    node: InputBuffer = null,
    nsecs: Int | Double = null,
    random: InputBuffer = null
  ): V1Options = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    if (random != null) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1Options]
  }
  @scala.inline
  def V1RngOptions(
    clockseq: Int | Double = null,
    msecs: Double | js.Date = null,
    node: InputBuffer = null,
    nsecs: Int | Double = null,
    rng: js.UndefOr[CallbackTo[InputBuffer]] = js.undefined
  ): V1Options = {
    val __obj = js.Dynamic.literal()
    if (clockseq != null) __obj.updateDynamic("clockseq")(clockseq.asInstanceOf[js.Any])
    if (msecs != null) __obj.updateDynamic("msecs")(msecs.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (nsecs != null) __obj.updateDynamic("nsecs")(nsecs.asInstanceOf[js.Any])
    rng.foreach(p => __obj.updateDynamic("rng")(p.toJsFn))
    __obj.asInstanceOf[V1Options]
  }
}

