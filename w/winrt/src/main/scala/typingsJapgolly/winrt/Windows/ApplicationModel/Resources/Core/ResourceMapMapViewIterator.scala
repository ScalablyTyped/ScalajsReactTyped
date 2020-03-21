package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import typingsJapgolly.winrt.AnonItems
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceMapMapViewIterator")
@js.native
class ResourceMapMapViewIterator () extends IIterator[IKeyValuePair[String, ResourceMap]] {
  /* CompleteClass */
  override var current: IKeyValuePair[String, ResourceMap] = js.native
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /* CompleteClass */
  override def getMany(): AnonItems[IKeyValuePair[String, ResourceMap]] = js.native
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

