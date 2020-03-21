package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object of this type is passed to the DataProviderHandler delegate. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.DataProviderRequest")
@js.native
abstract class DataProviderRequest () extends js.Object {
  /** Gets the deadline for finishing a delayed rendering operation. If execution goes beyond that deadline, the results of delayed rendering are ignored. */
  var deadline: js.Date = js.native
  /** Specifies the format id. */
  var formatId: String = js.native
  /**
    * Returns a DataProviderDeferral object.
    * @return An data provider deferral object.
    */
  def getDeferral(): DataProviderDeferral = js.native
  /**
    * Sets the content of the DataPackage to be shared with a target app.
    * @param value The object associated with a particular format in the DataPackage .
    */
  def setData(value: js.Any): Unit = js.native
}

