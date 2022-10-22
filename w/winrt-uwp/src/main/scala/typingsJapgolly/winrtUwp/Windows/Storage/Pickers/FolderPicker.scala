package typingsJapgolly.winrtUwp.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UI element that lets the user choose folders. */
trait FolderPicker extends StObject {
  
  /** Gets or sets the label text of the folder picker's commit button. */
  var commitButtonText: String
  
  /** Gets a set of values to be populated by the app before a PickFolderAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet
  
  /** Gets the collection of file types that the folder picker displays. */
  var fileTypeFilter: IVector[String]
  
  /** Shows the file picker so that the user can pick a folder, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickFolderAndContinue(): Unit
  
  /**
    * Shows the folderPicker object so that the user can pick a folder. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFolder object that represents the folder that the user picked.
    */
  def pickSingleFolderAsync(): IPromiseWithIAsyncOperation[StorageFolder]
  
  /** Gets or sets the settings identifier associated with the with the current FolderPicker instance. */
  var settingsIdentifier: String
  
  /** Gets or sets the initial location where the folder picker looks for folders to present to the user. */
  var suggestedStartLocation: PickerLocationId
  
  /** Gets or sets the view mode that the folder picker uses to display items. */
  var viewMode: PickerViewMode
}
object FolderPicker {
  
  inline def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: Callback,
    pickSingleFolderAsync: CallbackTo[IPromiseWithIAsyncOperation[StorageFolder]],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): FolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickFolderAndContinue = pickFolderAndContinue.toJsFn, pickSingleFolderAsync = pickSingleFolderAsync.toJsFn, settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPicker]
  }
  
  extension [Self <: FolderPicker](x: Self) {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setPickFolderAndContinue(value: Callback): Self = StObject.set(x, "pickFolderAndContinue", value.toJsFn)
    
    inline def setPickSingleFolderAsync(value: CallbackTo[IPromiseWithIAsyncOperation[StorageFolder]]): Self = StObject.set(x, "pickSingleFolderAsync", value.toJsFn)
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
