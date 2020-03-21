package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def onPress(): Unit
}

object Anon0 {
  @scala.inline
  def apply(onPress: Callback): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onPress")(onPress.toJsFn)
    __obj.asInstanceOf[Anon0]
  }
}

