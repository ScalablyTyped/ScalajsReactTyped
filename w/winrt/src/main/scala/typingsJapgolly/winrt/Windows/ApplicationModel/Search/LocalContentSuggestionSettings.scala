package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
@js.native
class LocalContentSuggestionSettings () extends ILocalContentSuggestionSettings {
  /* CompleteClass */
  override var aqsFilter: String = js.native
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /* CompleteClass */
  override var locations: IVector[StorageFolder] = js.native
  /* CompleteClass */
  override var propertiesToMatch: IVector[String] = js.native
}

