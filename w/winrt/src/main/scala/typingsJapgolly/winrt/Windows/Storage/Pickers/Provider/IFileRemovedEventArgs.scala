package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileRemovedEventArgs extends js.Object {
  var id: String
}

object IFileRemovedEventArgs {
  @scala.inline
  def apply(id: String): IFileRemovedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileRemovedEventArgs]
  }
}

