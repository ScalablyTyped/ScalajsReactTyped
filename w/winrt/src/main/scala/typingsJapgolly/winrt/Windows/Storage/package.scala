package typingsJapgolly.winrt.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Storage {
  type ApplicationDataSetVersionHandler = js.Function1[
    /* setVersionRequest */ typingsJapgolly.winrt.Windows.Storage.SetVersionRequest, 
    scala.Unit
  ]
  type StreamedFileDataRequestedHandler = js.Function1[
    /* stream */ typingsJapgolly.winrt.Windows.Storage.StreamedFileDataRequest, 
    scala.Unit
  ]
}
