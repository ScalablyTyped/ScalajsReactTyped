package typingsJapgolly.winrt.Windows.Media.MediaProperties

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
@js.native
class MediaPropertySet ()
  extends IMap[String, js.Any] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, js.Any] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

