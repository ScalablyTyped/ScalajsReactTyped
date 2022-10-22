package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets you add and remove folders from a library like Music or Videos and lets you get a list of folders included in the library. */
/* note: abstract class */ @JSGlobal("Windows.Storage.StorageLibrary")
@js.native
open class StorageLibrary ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary
object StorageLibrary {
  
  @JSGlobal("Windows.Storage.StorageLibrary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the specified library.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  /* static member */
  inline def getLibraryAsync(libraryId: typingsJapgolly.winrtUwp.Windows.Storage.KnownLibraryId): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLibraryAsync")(libraryId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary]]
  
  /**
    * Gets the specified library for a User .
    * @param user The User for which the library is retrieved.
    * @param libraryId A KnownLibraryId value that identifies the library to retrieve, like Music or Videos.
    * @return When this method completes successfully, it returns the library (type StorageLibrary ).
    */
  /* static member */
  inline def getLibraryForUserAsync(user: User, libraryId: typingsJapgolly.winrtUwp.Windows.Storage.KnownLibraryId): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLibraryForUserAsync")(user.asInstanceOf[js.Any], libraryId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary]]
}
