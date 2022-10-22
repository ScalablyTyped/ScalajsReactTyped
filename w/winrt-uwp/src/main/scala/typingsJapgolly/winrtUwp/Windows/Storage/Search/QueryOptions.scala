package typingsJapgolly.winrtUwp.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsJapgolly.winrtUwp.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrtUwp.Windows.Storage.FileProperties.ThumbnailOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the parameters of a search query for enumerating the contents of storage folders. */
trait QueryOptions extends StObject {
  
  /** Gets or sets an application-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the UserSearchFilter to create the query's search filter. */
  var applicationSearchFilter: String
  
  /** Gets the unit of time used to group files into folders if the QueryOptions object was created with a CommonFolderQuery based on date. For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is DateStackOption.Year . */
  var dateStackOption: DateStackOption
  
  /** Gets a list of file name extensions used to filter the search results. If the list is empty, the results include all file types. */
  var fileTypeFilter: IVector[String]
  
  /** Indicates whether the search query should produce a shallow view of the folder contents or a deep recursive view of all files and subfolder. */
  var folderDepth: FolderDepth
  
  /** Gets the name of the property used to group query results if the QueryOptions object was created using a CommonFolderQuery . For example, if CommonFolderQuery.GroupByYear is used to create a QueryOptions object, the value of this property is System.ItemDate . */
  var groupPropertyName: String
  
  /** Gets or sets a value that specifies whether the system index or the file system is used to retrieve query results. The indexer can retrieve results faster but is not available in all file locations. */
  var indexerOption: IndexerOption
  
  /** Gets or sets the Internet Engineering Task Force (IETF) language tag (BCP47 standard) that identifies the language associated with the query. This determines the language-specific algorithm used by the system to break the query into individual search tokens. */
  var language: String
  
  /**
    * Initializes the current instance of the QueryOptions class with search parameters specified by a string that was created by the SaveToString method.
    * @param value A string retrieved by a previous call to SaveToString .
    */
  def loadFromString(value: String): Unit
  
  /**
    * Converts the values of a QueryOptions object to a string that can be used to initialize the values of a QueryOptions object by calling LoadFromString .
    * @return A string representing the serialized settings of a QueryOptions instance.
    */
  def saveToString(): String
  
  /**
    * Specifies properties that the system should load in advance for all items in the query result set while the query is being executed (instead of retrieving them on a case-by-case basis). If many properties are specified, the query might take longer to execute, but subsequent property retrieval on query results will be faster.
    * @param options A value that specifies the set of properties to retrieve in advance.
    * @param propertiesToRetrieve A custom list of properties to retrieve in advance as an array of property names. Use the system property names to specify properties, for example "System.Copyright" and "System.Image.ColorSpace".
    */
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  
  /**
    * Specifies the type and size of thumbnails that the system should start loading immediately when items are accessed (instead of retrieving them on a case-by-case basis). This uses more resources but makes thumbnail retrieval on query results faster.
    * @param mode The enumeration value that describes the purpose of the thumbnail and determines how the thumbnail image is adjusted.
    * @param requestedSize The requested size, in pixels, of the longest edge of the thumbnail. Windows uses the requestedSize as a guide and tries to return a thumbnail image that can be scaled to the requested size without reducing the quality of the image.
    * @param options The enum value that describes the desired behavior to use to retrieve the thumbnail image. The specified behavior might affect the size and/or quality of the image and how quickly the thumbnail image is retrieved.
    */
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
  
  /** Gets the list of SortEntry structures that specify how to sort content (like files and subfolders) in query results. Use this list to customize how query results are sorted. */
  var sortOrder: IVector[SortEntry]
  
  /** Gets the filter for storage provider identifiers. */
  var storageProviderIdFilter: IVector[String]
  
  /** Gets or sets a user-defined Advanced Query Syntax (AQS) string for filtering files by keywords or properties. This property is combined with the ApplicationSearchFilter to create the query's search filter. */
  var userSearchFilter: String
}
object QueryOptions {
  
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
    storageProviderIdFilter: IVector[String],
    userSearchFilter: String
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1((t0: String) => loadFromString(t0).runNow()), saveToString = saveToString.toJsFn, setPropertyPrefetch = js.Any.fromFunction2((t0: PropertyPrefetchOptions, t1: IIterable[String]) => (setPropertyPrefetch(t0, t1)).runNow()), setThumbnailPrefetch = js.Any.fromFunction3((t0: ThumbnailMode, t1: Double, t2: ThumbnailOptions) => (setThumbnailPrefetch(t0, t1, t2)).runNow()), sortOrder = sortOrder.asInstanceOf[js.Any], storageProviderIdFilter = storageProviderIdFilter.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
  
  extension [Self <: QueryOptions](x: Self) {
    
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
    
    inline def setStorageProviderIdFilter(value: IVector[String]): Self = StObject.set(x, "storageProviderIdFilter", value.asInstanceOf[js.Any])
    
    inline def setUserSearchFilter(value: String): Self = StObject.set(x, "userSearchFilter", value.asInstanceOf[js.Any])
  }
}
