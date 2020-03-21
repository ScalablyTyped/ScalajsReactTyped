package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorTranslateArgs extends js.Object {
  var CustomMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var MessageArgs: js.Any
  var TranslateId: String
}

object IErrorTranslateArgs {
  @scala.inline
  def apply(
    MessageArgs: js.Any,
    TranslateId: String,
    CustomMessage: (/* config */ js.Any, /* args */ js.Any) => CallbackTo[String] = null
  ): IErrorTranslateArgs = {
    val __obj = js.Dynamic.literal(MessageArgs = MessageArgs.asInstanceOf[js.Any], TranslateId = TranslateId.asInstanceOf[js.Any])
    if (CustomMessage != null) __obj.updateDynamic("CustomMessage")(js.Any.fromFunction2((t0: /* config */ js.Any, t1: /* args */ js.Any) => CustomMessage(t0, t1).runNow()))
    __obj.asInstanceOf[IErrorTranslateArgs]
  }
}

