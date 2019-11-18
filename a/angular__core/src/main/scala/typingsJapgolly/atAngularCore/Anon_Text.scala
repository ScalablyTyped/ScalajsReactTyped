package typingsJapgolly.atAngularCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  def text(): js.Promise[String]
}

object Anon_Text {
  @scala.inline
  def apply(text: CallbackTo[js.Promise[String]]): Anon_Text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.asInstanceOf[Anon_Text]
  }
}

