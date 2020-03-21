package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapProperties extends IBitmapPropertiesView {
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction
}

object IBitmapProperties {
  @scala.inline
  def apply(
    getPropertiesAsync: IIterable[String] => CallbackTo[IAsyncOperation[BitmapPropertySet]],
    setPropertiesAsync: IIterable[IKeyValuePair[String, BitmapTypedValue]] => CallbackTo[IAsyncAction]
  ): IBitmapProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPropertiesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => getPropertiesAsync(t0).runNow()))
    __obj.updateDynamic("setPropertiesAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[
  typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair[java.lang.String, typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue]]) => setPropertiesAsync(t0).runNow()))
    __obj.asInstanceOf[IBitmapProperties]
  }
}

