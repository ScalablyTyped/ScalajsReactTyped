package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceCandidate")
@js.native
class ResourceCandidate () extends IResourceCandidate {
  /* CompleteClass */
  override var isDefault: Boolean = js.native
  /* CompleteClass */
  override var isMatch: Boolean = js.native
  /* CompleteClass */
  override var isMatchAsDefault: Boolean = js.native
  /* CompleteClass */
  override var qualifiers: IVectorView[ResourceQualifier] = js.native
  /* CompleteClass */
  override var valueAsString: String = js.native
  /* CompleteClass */
  override def getQualifierValue(qualifierName: String): String = js.native
  /* CompleteClass */
  override def getValueAsFileAsync(): IAsyncOperation[StorageFile] = js.native
}

