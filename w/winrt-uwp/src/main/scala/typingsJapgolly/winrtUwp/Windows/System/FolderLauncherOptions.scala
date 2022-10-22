package typingsJapgolly.winrtUwp.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageItem
import typingsJapgolly.winrtUwp.Windows.UI.ViewManagement.ViewSizePreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the options to use when launching File Explorer to display the contents of a specific folder by calling the LaunchFolderAsync(IStorageFolder, FolderLauncherOptions) method. */
trait FolderLauncherOptions extends StObject {
  
  /** Specifies how much space on the screen to leave for the calling app when launching File Explorer. The calling app can take up more or less space than File Explorer, or File Explorer can fill the entire screen. */
  var desiredRemainingView: ViewSizePreference
  
  /** Provides the list of items to select when File Explorer displays the contents of the specified folder. */
  var itemsToSelect: IVector[IStorageItem]
}
object FolderLauncherOptions {
  
  inline def apply(desiredRemainingView: ViewSizePreference, itemsToSelect: IVector[IStorageItem]): FolderLauncherOptions = {
    val __obj = js.Dynamic.literal(desiredRemainingView = desiredRemainingView.asInstanceOf[js.Any], itemsToSelect = itemsToSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderLauncherOptions]
  }
  
  extension [Self <: FolderLauncherOptions](x: Self) {
    
    inline def setDesiredRemainingView(value: ViewSizePreference): Self = StObject.set(x, "desiredRemainingView", value.asInstanceOf[js.Any])
    
    inline def setItemsToSelect(value: IVector[IStorageItem]): Self = StObject.set(x, "itemsToSelect", value.asInstanceOf[js.Any])
  }
}
