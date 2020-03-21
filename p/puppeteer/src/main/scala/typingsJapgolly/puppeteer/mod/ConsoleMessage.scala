package typingsJapgolly.puppeteer.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle[_]]
  /** The location the message originated from */
  def location(): ConsoleMessageLocation
  /** The message text. */
  def text(): String
  def `type`(): ConsoleMessageType
}

object ConsoleMessage {
  @scala.inline
  def apply(
    args: CallbackTo[js.Array[JSHandle[js.Any]]],
    location: CallbackTo[ConsoleMessageLocation],
    text: CallbackTo[String],
    `type`: CallbackTo[ConsoleMessageType]
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args.toJsFn)
    __obj.updateDynamic("location")(location.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("type")(`type`.toJsFn)
    __obj.asInstanceOf[ConsoleMessage]
  }
}

