package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTransfer {
  /** Provides data when the target app requests it, instead of including the data in the DataPackage ahead of time. DataProviderHandler is used when the source app wants to avoid unnecessary work that is resource intensive, such as performing format conversions. */
  type DataProviderHandler = js.Function1[
    /* request */ typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer.DataProviderRequest, 
    scala.Unit
  ]
}
