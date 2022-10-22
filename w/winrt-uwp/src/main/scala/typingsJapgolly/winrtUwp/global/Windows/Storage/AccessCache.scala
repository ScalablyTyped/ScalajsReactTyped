package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables and manages access to the most recently used (MRU) list of storage items, and to the list of storage items that the application has saved for efficient future access. */
object AccessCache {
  
  /** Describes the behavior to use when the app accesses an item in a list. */
  @JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
  @js.native
  object AccessCacheOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions & Double] = js.native
    
    /* 1 */ val disallowUserInput: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.disallowUserInput & Double = js.native
    
    /* 2 */ val fastLocationsOnly: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.fastLocationsOnly & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.none & Double = js.native
    
    /* 4 */ val suppressAccessTimeUpdate: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.suppressAccessTimeUpdate & Double = js.native
    
    /* 3 */ val useReadOnlyCachedCopy: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessCacheOptions.useReadOnlyCachedCopy & Double = js.native
  }
  
  /** A list of the entries that are in your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property) and in your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). */
  /* note: abstract class */ @JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
  @js.native
  open class AccessListEntryView ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.AccessListEntryView
  
  /** Provides data about an ItemRemoved event. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.AccessCache.ItemRemovedEventArgs")
  @js.native
  open class ItemRemovedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.ItemRemovedEventArgs {
    
    /** Gets information about the StorageFile or StorageFolder that was removed from the StorageItemMostRecentlyUsedList . */
    /* CompleteClass */
    var removedEntry: AccessListEntry = js.native
  }
  
  /** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
  @JSGlobal("Windows.Storage.AccessCache.RecentStorageItemVisibility")
  @js.native
  object RecentStorageItemVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility & Double
      ] = js.native
    
    /* 1 */ val appAndSystem: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appAndSystem & Double = js.native
    
    /* 0 */ val appOnly: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.RecentStorageItemVisibility.appOnly & Double = js.native
  }
  
  /** Provides static properties for you to get your app's most recently used list (MRU) (use StorageApplicationPermissions.MostRecentlyUsedList ) and future-access list (use StorageApplicationPermissions.FutureAccessList . */
  /* note: abstract class */ @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
  @js.native
  open class StorageApplicationPermissions ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageApplicationPermissions
  object StorageApplicationPermissions {
    
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets an object that represents a list that an app maintains so that the app can store files and/or locations (like folders) and easily access these items in the future. */
    /* static member */
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.futureAccessList")
    @js.native
    def futureAccessList: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList = js.native
    inline def futureAccessList_=(x: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("futureAccessList")(x.asInstanceOf[js.Any])
    
    /** Gets an object that represents a list that an app can use to track the files and/or locations (like folders) that the app has accessed most recently. */
    /* static member */
    @JSGlobal("Windows.Storage.AccessCache.StorageApplicationPermissions.mostRecentlyUsedList")
    @js.native
    def mostRecentlyUsedList: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList = js.native
    inline def mostRecentlyUsedList_=(x: typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mostRecentlyUsedList")(x.asInstanceOf[js.Any])
  }
  
  /** Represents your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). By picking files and folders, your user grants your app permission to access items that might not be accessible otherwise. If you add these items to your future-access list then you'll retain that permission when your app wants to access those items again later. Items are stored in the future-access list as StorageFile and StorageFolder objects. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.AccessCache.StorageItemAccessList")
  @js.native
  open class StorageItemAccessList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemAccessList
  
  /** Represents your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property). You use your MRU to track items (files and/or folders) that the user has accessed most recently. Items are stored in the MRU as StorageFile and StorageFolder objects. */
  /* note: abstract class */ @JSGlobal("Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList")
  @js.native
  open class StorageItemMostRecentlyUsedList ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Storage.AccessCache.StorageItemMostRecentlyUsedList
}
