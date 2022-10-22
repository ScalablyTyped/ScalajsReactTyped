package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.Provider.FileUpdateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Lets apps manage real-time updates to files. */
/* note: abstract class */ @JSGlobal("Windows.Storage.CachedFileManager")
@js.native
open class CachedFileManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.CachedFileManager
object CachedFileManager {
  
  @JSGlobal("Windows.Storage.CachedFileManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initiates updates for the specified file. This method contacts the app that provided the file to perform the updates.
    * @param file The file to update.
    * @return When this method completes, it returns a FileUpdateStatus enum value that describes the status of the updates to the file.
    */
  /* static member */
  inline def completeUpdatesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[FileUpdateStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("completeUpdatesAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[FileUpdateStatus]]
  
  /**
    * Lets apps defer real-time updates for a specified file.
    * @param file The file to defer updates for.
    */
  /* static member */
  inline def deferUpdates(file: IStorageFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deferUpdates")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
