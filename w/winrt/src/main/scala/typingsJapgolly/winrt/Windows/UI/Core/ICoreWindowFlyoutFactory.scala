package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowFlyoutFactory extends js.Object {
  def create(position: Point): CoreWindowFlyout
  def createWithTitle(position: Point, title: String): CoreWindowFlyout
}

object ICoreWindowFlyoutFactory {
  @scala.inline
  def apply(
    create: Point => CallbackTo[CoreWindowFlyout],
    createWithTitle: (Point, String) => CallbackTo[CoreWindowFlyout]
  ): ICoreWindowFlyoutFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Point) => create(t0).runNow()))
    __obj.updateDynamic("createWithTitle")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Foundation.Point, t1: java.lang.String) => createWithTitle(t0, t1).runNow()))
    __obj.asInstanceOf[ICoreWindowFlyoutFactory]
  }
}

