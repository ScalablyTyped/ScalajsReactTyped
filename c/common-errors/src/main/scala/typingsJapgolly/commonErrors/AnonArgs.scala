package typingsJapgolly.commonErrors

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.commonErrors.mod.Error
import typingsJapgolly.commonErrors.mod.GenerateMessageMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var `extends`: js.UndefOr[Error] = js.undefined
  var generateMessage: js.UndefOr[GenerateMessageMethod] = js.undefined
  var globalize: js.UndefOr[Boolean] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    `extends`: Error = null,
    generateMessage: js.UndefOr[CallbackTo[String]] = js.undefined,
    globalize: js.UndefOr[Boolean] = js.undefined
  ): AnonArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    generateMessage.foreach(p => __obj.updateDynamic("generateMessage")(p.toJsFn))
    if (!js.isUndefined(globalize)) __obj.updateDynamic("globalize")(globalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

