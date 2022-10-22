package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.createDirectory
import typingsJapgolly.electron.electronStrings.dontAddToRecent
import typingsJapgolly.electron.electronStrings.multiSelections
import typingsJapgolly.electron.electronStrings.noResolveAliases
import typingsJapgolly.electron.electronStrings.openDirectory
import typingsJapgolly.electron.electronStrings.openFile
import typingsJapgolly.electron.electronStrings.promptToCreate
import typingsJapgolly.electron.electronStrings.showHiddenFiles
import typingsJapgolly.electron.electronStrings.treatPackageAsDirectory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDialogSyncOptions extends StObject {
  
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.undefined
  
  var defaultPath: js.UndefOr[String] = js.undefined
  
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  
  /**
    * Message to display above input boxes.
    *
    * @platform darwin
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Contains which features the dialog should use. The following values are
    * supported:
    */
  var properties: js.UndefOr[
    js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
    ]
  ] = js.undefined
  
  /**
    * Create security scoped bookmarks when packaged for the Mac App Store.
    *
    * @platform darwin,mas
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object OpenDialogSyncOptions {
  
  inline def apply(): OpenDialogSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenDialogSyncOptions]
  }
  
  extension [Self <: OpenDialogSyncOptions](x: Self) {
    
    inline def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
    
    inline def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
    
    inline def setDefaultPath(value: String): Self = StObject.set(x, "defaultPath", value.asInstanceOf[js.Any])
    
    inline def setDefaultPathUndefined: Self = StObject.set(x, "defaultPath", js.undefined)
    
    inline def setFilters(value: js.Array[FileFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: FileFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProperties(
      value: js.Array[
          openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(
      value: (openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory | dontAddToRecent)*
    ): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSecurityScopedBookmarks(value: Boolean): Self = StObject.set(x, "securityScopedBookmarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityScopedBookmarksUndefined: Self = StObject.set(x, "securityScopedBookmarks", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
