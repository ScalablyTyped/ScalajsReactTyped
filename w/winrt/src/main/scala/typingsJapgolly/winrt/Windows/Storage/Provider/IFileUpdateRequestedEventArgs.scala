package typingsJapgolly.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestedEventArgs extends js.Object {
  var request: FileUpdateRequest
}

object IFileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
}

