package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Storage.StorageLibrary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates a trigger that will fire when a file is changed in a specified library. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
@js.native
open class StorageLibraryContentChangedTrigger ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger
object StorageLibraryContentChangedTrigger {
  
  @JSGlobal("Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a trigger that will fire when a file is changed in the specified library.
    * @param storageLibrary The location that the trigger monitors such as the music library or documents library.
    * @return A trigger that monitors the specified location.
    */
  /* static member */
  inline def create(storageLibrary: StorageLibrary): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(storageLibrary.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger]
  
  /**
    * Creates a trigger that will fire when a file is changed in any of the specified libraries.
    * @param storageLibraries The list of libraries that the trigger will monitor.
    * @return A trigger that monitors the specified location(s).
    */
  /* static member */
  inline def createFromLibraries(storageLibraries: IIterable[StorageLibrary]): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromLibraries")(storageLibraries.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.StorageLibraryContentChangedTrigger]
}
