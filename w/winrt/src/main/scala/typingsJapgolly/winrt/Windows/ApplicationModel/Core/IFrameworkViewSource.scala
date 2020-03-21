package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFrameworkViewSource extends js.Object {
  def createView(): IFrameworkView
}

object IFrameworkViewSource {
  @scala.inline
  def apply(createView: CallbackTo[IFrameworkView]): IFrameworkViewSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createView")(createView.toJsFn)
    __obj.asInstanceOf[IFrameworkViewSource]
  }
}

