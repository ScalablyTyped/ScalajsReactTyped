package typingsJapgolly.devextreme.mod.DevExpress.data

import typingsJapgolly.devextreme.anon.Filter
import typingsJapgolly.devextreme.anon.Index
import typingsJapgolly.devextreme.anon.keyinEventNameFunctionInserted
import typingsJapgolly.devextreme.mod.DevExpress.core.DeepPartial
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxExtendedPromise
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.data.Store.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[TItem, TKey] extends StObject {
  
  /**
    * Gets a data item with a specific key.
    */
  def byKey(key: TKey): DxPromise[TItem] = js.native
  def byKey(key: TKey, extraOptions: LoadOptions[TItem]): DxPromise[TItem] = js.native
  
  /**
    * Adds a data item to the store.
    */
  def insert(values: TItem): DxExtendedPromise[TItem] = js.native
  
  /**
    * Gets the key property (or properties) as specified in the key property.
    */
  def key(): String | js.Array[String] = js.native
  
  /**
    * Gets a data item&apos;s key value.
    */
  def keyOf(obj: TItem): TKey = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxExtendedPromise[js.Array[TItem]] = js.native
  /**
    * Starts loading data.
    */
  def load(options: LoadOptions[TItem]): DxExtendedPromise[js.Array[TItem]] = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunctionInserted): this.type = js.native
  
  /**
    * Pushes data changes to the store and notifies the DataSource.
    */
  def push(changes: js.Array[Index[TItem, TKey]]): Unit = js.native
  
  /**
    * Removes a data item with a specific key from the store.
    */
  def remove(key: TKey): DxPromise[Unit] = js.native
  
  /**
    * Gets the total count of items the load() function returns.
    */
  def totalCount(obj: Filter[TItem]): DxPromise[Double] = js.native
  
  /**
    * Updates a data item with a specific key.
    */
  def update(key: TKey, values: DeepPartial[TItem]): DxExtendedPromise[TItem] = js.native
}
object Store {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.loaded
    - typingsJapgolly.devextreme.devextremeStrings.loading
    - typingsJapgolly.devextreme.devextremeStrings.inserted
    - typingsJapgolly.devextreme.devextremeStrings.inserting
    - typingsJapgolly.devextreme.devextremeStrings.updated
    - typingsJapgolly.devextreme.devextremeStrings.updating
    - typingsJapgolly.devextreme.devextremeStrings.push
    - typingsJapgolly.devextreme.devextremeStrings.removed
    - typingsJapgolly.devextreme.devextremeStrings.removing
    - typingsJapgolly.devextreme.devextremeStrings.modified
    - typingsJapgolly.devextreme.devextremeStrings.modifying
  */
  trait EventName extends StObject
  object EventName {
    
    inline def inserted: typingsJapgolly.devextreme.devextremeStrings.inserted = "inserted".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.inserted]
    
    inline def inserting: typingsJapgolly.devextreme.devextremeStrings.inserting = "inserting".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.inserting]
    
    inline def loaded: typingsJapgolly.devextreme.devextremeStrings.loaded = "loaded".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.loaded]
    
    inline def loading: typingsJapgolly.devextreme.devextremeStrings.loading = "loading".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.loading]
    
    inline def modified: typingsJapgolly.devextreme.devextremeStrings.modified = "modified".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.modified]
    
    inline def modifying: typingsJapgolly.devextreme.devextremeStrings.modifying = "modifying".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.modifying]
    
    inline def push: typingsJapgolly.devextreme.devextremeStrings.push = "push".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.push]
    
    inline def removed: typingsJapgolly.devextreme.devextremeStrings.removed = "removed".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.removed]
    
    inline def removing: typingsJapgolly.devextreme.devextremeStrings.removing = "removing".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.removing]
    
    inline def updated: typingsJapgolly.devextreme.devextremeStrings.updated = "updated".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.updated]
    
    inline def updating: typingsJapgolly.devextreme.devextremeStrings.updating = "updating".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.updating]
  }
  
  type Options[TItem, TKey] = StoreOptions[TItem, TKey]
}
