package typingsJapgolly.winrtUwp.Windows.Media

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the method needed to set the configuration properties on a registered media parser or codec. */
trait IMediaExtension extends js.Object {
  /**
    * Sets the configuration properties that were supplied when the media parser or codec was registered.
    * @param configuration The configuration properties for the media parser or codec.
    */
  def setProperties(configuration: IPropertySet): Unit
}

object IMediaExtension {
  @scala.inline
  def apply(setProperties: IPropertySet => Callback): IMediaExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setProperties")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IPropertySet) => setProperties(t0).runNow()))
    __obj.asInstanceOf[IMediaExtension]
  }
}

