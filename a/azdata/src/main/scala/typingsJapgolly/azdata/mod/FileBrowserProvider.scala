package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserProvider
  extends StObject
     with DataProvider {
  
  def closeFileBrowser(ownerUri: String): Thenable[FileBrowserCloseResponse]
  
  def expandFolderNode(ownerUri: String, expandPath: String): Thenable[Boolean]
  
  def openFileBrowser(ownerUri: String, expandPath: String, fileFilters: js.Array[String], changeFilter: Boolean): Thenable[Boolean]
  
  /**
    * Registers a handler for FileBrowserOpened events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnFileBrowserOpened(handler: js.Function1[/* response */ FileBrowserOpenedParams, Any]): Unit
  
  /**
    * Registers a handler for FilePathsValidated events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnFilePathsValidated(handler: js.Function1[/* response */ FileBrowserValidatedParams, Any]): Unit
  
  /**
    * Registers a handler for FolderNodeExpanded events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnFolderNodeExpanded(handler: js.Function1[/* response */ FileBrowserExpandedParams, Any]): Unit
  
  def validateFilePaths(ownerUri: String, serviceType: String, selectedFiles: js.Array[String]): Thenable[Boolean]
}
object FileBrowserProvider {
  
  inline def apply(
    closeFileBrowser: String => Thenable[FileBrowserCloseResponse],
    expandFolderNode: (String, String) => Thenable[Boolean],
    openFileBrowser: (String, String, js.Array[String], Boolean) => Thenable[Boolean],
    providerId: String,
    registerOnFileBrowserOpened: js.Function1[/* response */ FileBrowserOpenedParams, Any] => Callback,
    registerOnFilePathsValidated: js.Function1[/* response */ FileBrowserValidatedParams, Any] => Callback,
    registerOnFolderNodeExpanded: js.Function1[/* response */ FileBrowserExpandedParams, Any] => Callback,
    validateFilePaths: (String, String, js.Array[String]) => Thenable[Boolean]
  ): FileBrowserProvider = {
    val __obj = js.Dynamic.literal(closeFileBrowser = js.Any.fromFunction1(closeFileBrowser), expandFolderNode = js.Any.fromFunction2(expandFolderNode), openFileBrowser = js.Any.fromFunction4(openFileBrowser), providerId = providerId.asInstanceOf[js.Any], registerOnFileBrowserOpened = js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserOpenedParams, Any]) => registerOnFileBrowserOpened(t0).runNow()), registerOnFilePathsValidated = js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserValidatedParams, Any]) => registerOnFilePathsValidated(t0).runNow()), registerOnFolderNodeExpanded = js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserExpandedParams, Any]) => registerOnFolderNodeExpanded(t0).runNow()), validateFilePaths = js.Any.fromFunction3(validateFilePaths))
    __obj.asInstanceOf[FileBrowserProvider]
  }
  
  extension [Self <: FileBrowserProvider](x: Self) {
    
    inline def setCloseFileBrowser(value: String => Thenable[FileBrowserCloseResponse]): Self = StObject.set(x, "closeFileBrowser", js.Any.fromFunction1(value))
    
    inline def setExpandFolderNode(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "expandFolderNode", js.Any.fromFunction2(value))
    
    inline def setOpenFileBrowser(value: (String, String, js.Array[String], Boolean) => Thenable[Boolean]): Self = StObject.set(x, "openFileBrowser", js.Any.fromFunction4(value))
    
    inline def setRegisterOnFileBrowserOpened(value: js.Function1[/* response */ FileBrowserOpenedParams, Any] => Callback): Self = StObject.set(x, "registerOnFileBrowserOpened", js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserOpenedParams, Any]) => value(t0).runNow()))
    
    inline def setRegisterOnFilePathsValidated(value: js.Function1[/* response */ FileBrowserValidatedParams, Any] => Callback): Self = StObject.set(x, "registerOnFilePathsValidated", js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserValidatedParams, Any]) => value(t0).runNow()))
    
    inline def setRegisterOnFolderNodeExpanded(value: js.Function1[/* response */ FileBrowserExpandedParams, Any] => Callback): Self = StObject.set(x, "registerOnFolderNodeExpanded", js.Any.fromFunction1((t0: js.Function1[/* response */ FileBrowserExpandedParams, Any]) => value(t0).runNow()))
    
    inline def setValidateFilePaths(value: (String, String, js.Array[String]) => Thenable[Boolean]): Self = StObject.set(x, "validateFilePaths", js.Any.fromFunction3(value))
  }
}
