package typingsJapgolly.ccap.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Captcha extends js.Object {
  def get(): js.Tuple2[String, Buffer]
}

object Captcha {
  @scala.inline
  def apply(get: CallbackTo[js.Tuple2[String, Buffer]]): Captcha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[Captcha]
  }
}

