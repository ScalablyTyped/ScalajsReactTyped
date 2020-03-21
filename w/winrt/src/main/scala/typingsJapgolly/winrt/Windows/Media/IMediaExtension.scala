package typingsJapgolly.winrt.Windows.Media

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaExtension extends js.Object {
  def setProperties(configuration: IPropertySet): Unit
}

object IMediaExtension {
  @scala.inline
  def apply(setProperties: IPropertySet => Callback): IMediaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet) => setProperties(t0).runNow()))
    __obj.asInstanceOf[IMediaExtension]
  }
}

