package typingsJapgolly.winrt.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueryOptions extends StObject {
  
  var applicationSearchFilter: String
  
  var dateStackOption: DateStackOption
  
  var fileTypeFilter: IVector[String]
  
  var folderDepth: FolderDepth
  
  var groupPropertyName: String
  
  var indexerOption: IndexerOption
  
  var language: String
  
  def loadFromString(value: String): Unit
  
  def saveToString(): String
  
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
  
  var sortOrder: IVector[SortEntry]
  
  var userSearchFilter: String
}
object IQueryOptions {
  
  inline def apply(
    applicationSearchFilter: String,
    dateStackOption: DateStackOption,
    fileTypeFilter: IVector[String],
    folderDepth: FolderDepth,
    groupPropertyName: String,
    indexerOption: IndexerOption,
    language: String,
    loadFromString: String => Callback,
    saveToString: CallbackTo[String],
    setPropertyPrefetch: (PropertyPrefetchOptions, IIterable[String]) => Callback,
    setThumbnailPrefetch: (ThumbnailMode, Double, ThumbnailOptions) => Callback,
    sortOrder: IVector[SortEntry],
    userSearchFilter: String
  ): IQueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1((t0: String) => loadFromString(t0).runNow()), saveToString = saveToString.toJsFn, setPropertyPrefetch = js.Any.fromFunction2((t0: PropertyPrefetchOptions, t1: IIterable[String]) => (setPropertyPrefetch(t0, t1)).runNow()), setThumbnailPrefetch = js.Any.fromFunction3((t0: ThumbnailMode, t1: Double, t2: ThumbnailOptions) => (setThumbnailPrefetch(t0, t1, t2)).runNow()), sortOrder = sortOrder.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryOptions]
  }
  
  extension [Self <: IQueryOptions](x: Self) {
    
    inline def setApplicationSearchFilter(value: String): Self = StObject.set(x, "applicationSearchFilter", value.asInstanceOf[js.Any])
    
    inline def setDateStackOption(value: DateStackOption): Self = StObject.set(x, "dateStackOption", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setFolderDepth(value: FolderDepth): Self = StObject.set(x, "folderDepth", value.asInstanceOf[js.Any])
    
    inline def setGroupPropertyName(value: String): Self = StObject.set(x, "groupPropertyName", value.asInstanceOf[js.Any])
    
    inline def setIndexerOption(value: IndexerOption): Self = StObject.set(x, "indexerOption", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLoadFromString(value: String => Callback): Self = StObject.set(x, "loadFromString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSaveToString(value: CallbackTo[String]): Self = StObject.set(x, "saveToString", value.toJsFn)
    
    inline def setSetPropertyPrefetch(value: (PropertyPrefetchOptions, IIterable[String]) => Callback): Self = StObject.set(x, "setPropertyPrefetch", js.Any.fromFunction2((t0: PropertyPrefetchOptions, t1: IIterable[String]) => (value(t0, t1)).runNow()))
    
    inline def setSetThumbnailPrefetch(value: (ThumbnailMode, Double, ThumbnailOptions) => Callback): Self = StObject.set(x, "setThumbnailPrefetch", js.Any.fromFunction3((t0: ThumbnailMode, t1: Double, t2: ThumbnailOptions) => (value(t0, t1, t2)).runNow()))
    
    inline def setSortOrder(value: IVector[SortEntry]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setUserSearchFilter(value: String): Self = StObject.set(x, "userSearchFilter", value.asInstanceOf[js.Any])
  }
}
