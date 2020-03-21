package typingsJapgolly.winrtUwp.Windows.Graphics.Imaging

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides read and write access to image properties and metadata. */
@JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
@js.native
abstract class BitmapProperties () extends js.Object {
  /**
    * Asynchronously retrieves one or more bitmap properties.
    * @param propertiesToRetrieve A collection of strings containing the specified property keys.
    * @return Object that manages the asynchronous retrieval of the bitmap properties.
    */
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IPromiseWithIAsyncOperation[BitmapPropertySet] = js.native
  /**
    * Asynchronously sets one or more bitmap properties.
    * @param propertiesToSet A collection of key-value pairs representing the bitmap properties to be set. Each key is a string containing the Windows property or metadata query, and the corresponding value is a BitmapTypedValue with the data and the correct PropertyType .
    * @return Object that manages the setting of the bitmap properties asynchronously.
    */
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[_, _]]): IPromiseWithIAsyncAction = js.native
}

