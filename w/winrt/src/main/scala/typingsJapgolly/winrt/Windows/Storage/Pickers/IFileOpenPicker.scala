package typingsJapgolly.winrt.Windows.Storage.Pickers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOpenPicker extends StObject {
  
  var commitButtonText: String
  
  var continuationData: ValueSet
  
  var fileTypeFilter: IVector[String]
  
  def pickMultipleFilesAndContinue(): Unit
  
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]]
  
  def pickSingleFileAndContinue(): Unit
  
  def pickSingleFileAsync(): IAsyncOperation[StorageFile]
  
  var settingsIdentifier: String
  
  var suggestedStartLocation: PickerLocationId
  
  var viewMode: PickerViewMode
}
object IFileOpenPicker {
  
  inline def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickMultipleFilesAndContinue: Callback,
    pickMultipleFilesAsync: CallbackTo[IAsyncOperation[IVectorView[StorageFile]]],
    pickSingleFileAndContinue: Callback,
    pickSingleFileAsync: CallbackTo[IAsyncOperation[StorageFile]],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickMultipleFilesAndContinue = pickMultipleFilesAndContinue.toJsFn, pickMultipleFilesAsync = pickMultipleFilesAsync.toJsFn, pickSingleFileAndContinue = pickSingleFileAndContinue.toJsFn, pickSingleFileAsync = pickSingleFileAsync.toJsFn, settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPicker]
  }
  
  extension [Self <: IFileOpenPicker](x: Self) {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setPickMultipleFilesAndContinue(value: Callback): Self = StObject.set(x, "pickMultipleFilesAndContinue", value.toJsFn)
    
    inline def setPickMultipleFilesAsync(value: CallbackTo[IAsyncOperation[IVectorView[StorageFile]]]): Self = StObject.set(x, "pickMultipleFilesAsync", value.toJsFn)
    
    inline def setPickSingleFileAndContinue(value: Callback): Self = StObject.set(x, "pickSingleFileAndContinue", value.toJsFn)
    
    inline def setPickSingleFileAsync(value: CallbackTo[IAsyncOperation[StorageFile]]): Self = StObject.set(x, "pickSingleFileAsync", value.toJsFn)
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
