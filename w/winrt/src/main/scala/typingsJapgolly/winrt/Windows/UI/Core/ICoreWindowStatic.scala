package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowStatic extends js.Object {
  def getForCurrentThread(): CoreWindow
}

object ICoreWindowStatic {
  @scala.inline
  def apply(getForCurrentThread: CallbackTo[CoreWindow]): ICoreWindowStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentThread")(getForCurrentThread.toJsFn)
    __obj.asInstanceOf[ICoreWindowStatic]
  }
}

