package typingsJapgolly.winrtUwp.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
trait FileSavePicker extends StObject {
  
  /** Gets or sets the label text of the commit button in the file picker UI. */
  var commitButtonText: String
  
  /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet
  
  /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
  var defaultFileExtension: String
  
  /** Gets or sets an ID that specifies the enterprise that owns the file. */
  var enterpriseId: String
  
  /** Gets the collection of valid file types that the user can choose to assign to a file. */
  var fileTypeChoices: IMap[String, IVector[String]]
  
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSaveFileAndContinue(): Unit
  
  /**
    * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
    */
  def pickSaveFileAsync(): IPromiseWithIAsyncOperation[StorageFile]
  
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  var settingsIdentifier: String
  
  /** Gets or sets the file name that the file save picker suggests to the user. */
  var suggestedFileName: String
  
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  var suggestedSaveFile: StorageFile
  
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  var suggestedStartLocation: PickerLocationId
}
object FileSavePicker {
  
  inline def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    enterpriseId: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: Callback,
    pickSaveFileAsync: CallbackTo[IPromiseWithIAsyncOperation[StorageFile]],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): FileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = pickSaveFileAndContinue.toJsFn, pickSaveFileAsync = pickSaveFileAsync.toJsFn, settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePicker]
  }
  
  extension [Self <: FileSavePicker](x: Self) {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setDefaultFileExtension(value: String): Self = StObject.set(x, "defaultFileExtension", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    inline def setFileTypeChoices(value: IMap[String, IVector[String]]): Self = StObject.set(x, "fileTypeChoices", value.asInstanceOf[js.Any])
    
    inline def setPickSaveFileAndContinue(value: Callback): Self = StObject.set(x, "pickSaveFileAndContinue", value.toJsFn)
    
    inline def setPickSaveFileAsync(value: CallbackTo[IPromiseWithIAsyncOperation[StorageFile]]): Self = StObject.set(x, "pickSaveFileAsync", value.toJsFn)
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuggestedFileName(value: String): Self = StObject.set(x, "suggestedFileName", value.asInstanceOf[js.Any])
    
    inline def setSuggestedSaveFile(value: StorageFile): Self = StObject.set(x, "suggestedSaveFile", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
  }
}
