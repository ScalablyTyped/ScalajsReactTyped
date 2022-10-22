package typingsJapgolly.winrt.global.Windows.Foundation

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collections {
  
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Foundation.Collections.CollectionChange & Double] = js.native
    
    /* 3 */ val itemChanged: typingsJapgolly.winrt.Windows.Foundation.Collections.CollectionChange.itemChanged & Double = js.native
    
    /* 1 */ val itemInserted: typingsJapgolly.winrt.Windows.Foundation.Collections.CollectionChange.itemInserted & Double = js.native
    
    /* 2 */ val itemRemoved: typingsJapgolly.winrt.Windows.Foundation.Collections.CollectionChange.itemRemoved & Double = js.native
    
    /* 0 */ val reset: typingsJapgolly.winrt.Windows.Foundation.Collections.CollectionChange.reset & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Collections.PropertySet")
  @js.native
  open class PropertySet ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Foundation.Collections.PropertySet {
    
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
  
  @JSGlobal("Windows.Foundation.Collections.ValueSet")
  @js.native
  open class ValueSet ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet {
    
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
}
