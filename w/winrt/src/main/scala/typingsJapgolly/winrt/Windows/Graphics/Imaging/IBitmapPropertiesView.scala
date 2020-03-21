package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapPropertiesView extends js.Object {
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet]
}

object IBitmapPropertiesView {
  @scala.inline
  def apply(getPropertiesAsync: IIterable[String] => CallbackTo[IAsyncOperation[BitmapPropertySet]]): IBitmapPropertiesView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPropertiesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => getPropertiesAsync(t0).runNow()))
    __obj.asInstanceOf[IBitmapPropertiesView]
  }
}

