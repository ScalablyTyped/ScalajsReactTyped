package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.ApplicationDataContainerSettings")
@js.native
open class ApplicationDataContainerSettings ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.ApplicationDataContainerSettings {
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
  
  /* CompleteClass */
  override def getView(): IMapView[String, Any] = js.native
  
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  
  /* CompleteClass */
  override def insert(key: String, value: Any): Boolean = js.native
  
  /* CompleteClass */
  override def lookup(key: String): Any = js.native
  
  /* CompleteClass */
  var onmapchanged: Any = js.native
  
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  
  /* CompleteClass */
  var size: Double = js.native
}
