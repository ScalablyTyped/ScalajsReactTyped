package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AccessCache {
  
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions & Double] = js.native
    
    /* 1 */ val disallowUserInput: typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput & Double = js.native
    
    /* 2 */ val fastLocationsOnly: typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions.none & Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate & Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
  @js.native
  open class AccessListEntryView ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.AccessCache.AccessListEntryView {
    
    /* CompleteClass */
    override def first(): IIterator[AccessListEntry] = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
  @js.native
  open class ItemRemovedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.AccessCache.ItemRemovedEventArgs {
    
    /* CompleteClass */
    var removedEntry: AccessListEntry = js.native
  }
  
  @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
  @js.native
  open class StorageApplicationPermissions ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageApplicationPermissions
  /* static members */
  object StorageApplicationPermissions {
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.futureAccessList")
    @js.native
    def futureAccessList: typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    inline def futureAccessList_=(x: typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemAccessList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureAccessList")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.mostRecentlyUsedList")
    @js.native
    def mostRecentlyUsedList: typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
    inline def mostRecentlyUsedList_=(x: typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedList")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
  @js.native
  open class StorageItemAccessList ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemAccessList
  
  @JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
  @js.native
  open class StorageItemMostRecentlyUsedList ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
