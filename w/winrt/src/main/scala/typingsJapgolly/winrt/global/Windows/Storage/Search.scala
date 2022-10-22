package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery
import typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery
import typingsJapgolly.winrt.Windows.Storage.Search.DateStackOption
import typingsJapgolly.winrt.Windows.Storage.Search.FolderDepth
import typingsJapgolly.winrt.Windows.Storage.Search.IndexerOption
import typingsJapgolly.winrt.Windows.Storage.Search.SortEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSGlobal("Windows.Storage.Search.CommonFileQuery")
  @js.native
  object CommonFileQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery & Double] = js.native
    
    /* 0 */ val defaultQuery: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.defaultQuery & Double = js.native
    
    /* 5 */ val orderByDate: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.orderByDate & Double = js.native
    
    /* 3 */ val orderByMusicProperties: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.orderByMusicProperties & Double = js.native
    
    /* 1 */ val orderByName: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.orderByName & Double = js.native
    
    /* 4 */ val orderBySearchRank: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.orderBySearchRank & Double = js.native
    
    /* 2 */ val orderByTitle: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery.orderByTitle & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.CommonFolderQuery")
  @js.native
  object CommonFolderQuery extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery & Double] = js.native
    
    /* 0 */ val defaultQuery: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.defaultQuery & Double = js.native
    
    /* 4 */ val groupByAlbum: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbum & Double = js.native
    
    /* 5 */ val groupByAlbumArtist: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAlbumArtist & Double = js.native
    
    /* 3 */ val groupByArtist: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByArtist & Double = js.native
    
    /* 11 */ val groupByAuthor: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByAuthor & Double = js.native
    
    /* 6 */ val groupByComposer: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByComposer & Double = js.native
    
    /* 7 */ val groupByGenre: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByGenre & Double = js.native
    
    /* 2 */ val groupByMonth: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByMonth & Double = js.native
    
    /* 8 */ val groupByPublishedYear: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByPublishedYear & Double = js.native
    
    /* 9 */ val groupByRating: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByRating & Double = js.native
    
    /* 10 */ val groupByTag: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByTag & Double = js.native
    
    /* 12 */ val groupByType: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByType & Double = js.native
    
    /* 1 */ val groupByYear: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery.groupByYear & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.DateStackOption")
  @js.native
  object DateStackOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.DateStackOption & Double] = js.native
    
    /* 2 */ val month: typingsJapgolly.winrt.Windows.Storage.Search.DateStackOption.month & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Storage.Search.DateStackOption.none & Double = js.native
    
    /* 1 */ val year: typingsJapgolly.winrt.Windows.Storage.Search.DateStackOption.year & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.FolderDepth")
  @js.native
  object FolderDepth extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.FolderDepth & Double] = js.native
    
    /* 1 */ val deep: typingsJapgolly.winrt.Windows.Storage.Search.FolderDepth.deep & Double = js.native
    
    /* 0 */ val shallow: typingsJapgolly.winrt.Windows.Storage.Search.FolderDepth.shallow & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.IndexedState")
  @js.native
  object IndexedState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.IndexedState & Double] = js.native
    
    /* 3 */ val fullyIndexed: typingsJapgolly.winrt.Windows.Storage.Search.IndexedState.fullyIndexed & Double = js.native
    
    /* 1 */ val notIndexed: typingsJapgolly.winrt.Windows.Storage.Search.IndexedState.notIndexed & Double = js.native
    
    /* 2 */ val partiallyIndexed: typingsJapgolly.winrt.Windows.Storage.Search.IndexedState.partiallyIndexed & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Storage.Search.IndexedState.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.IndexerOption")
  @js.native
  object IndexerOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Storage.Search.IndexerOption & Double] = js.native
    
    /* 2 */ val doNotUseIndexer: typingsJapgolly.winrt.Windows.Storage.Search.IndexerOption.doNotUseIndexer & Double = js.native
    
    /* 1 */ val onlyUseIndexer: typingsJapgolly.winrt.Windows.Storage.Search.IndexerOption.onlyUseIndexer & Double = js.native
    
    /* 0 */ val useIndexerWhenAvailable: typingsJapgolly.winrt.Windows.Storage.Search.IndexerOption.useIndexerWhenAvailable & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.QueryOptions")
  @js.native
  open class QueryOptions ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions {
    def this(query: CommonFolderQuery) = this()
    def this(query: CommonFileQuery, fileTypeFilter: IIterable[String]) = this()
    
    /* CompleteClass */
    var applicationSearchFilter: String = js.native
    
    /* CompleteClass */
    var dateStackOption: DateStackOption = js.native
    
    /* CompleteClass */
    var fileTypeFilter: IVector[String] = js.native
    
    /* CompleteClass */
    var folderDepth: FolderDepth = js.native
    
    /* CompleteClass */
    var groupPropertyName: String = js.native
    
    /* CompleteClass */
    var indexerOption: IndexerOption = js.native
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    override def loadFromString(value: String): Unit = js.native
    
    /* CompleteClass */
    override def saveToString(): String = js.native
    
    /* CompleteClass */
    override def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit = js.native
    
    /* CompleteClass */
    override def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit = js.native
    
    /* CompleteClass */
    var sortOrder: IVector[SortEntry] = js.native
    
    /* CompleteClass */
    var userSearchFilter: String = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.SortEntryVector")
  @js.native
  open class SortEntryVector ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Search.SortEntryVector {
    
    /* CompleteClass */
    override def first(): IIterator[SortEntry] = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
  @js.native
  open class StorageFileQueryResult ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Search.StorageFileQueryResult {
    
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    
    /* CompleteClass */
    override def findStartIndexAsync(value: Any): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var folder: typingsJapgolly.winrt.Windows.Storage.StorageFolder = js.native
    
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions = js.native
    
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var oncontentschanged: Any = js.native
    
    /* CompleteClass */
    var onoptionschanged: Any = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.StorageFolderQueryResult")
  @js.native
  open class StorageFolderQueryResult ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Search.StorageFolderQueryResult {
    
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    
    /* CompleteClass */
    override def findStartIndexAsync(value: Any): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var folder: typingsJapgolly.winrt.Windows.Storage.StorageFolder = js.native
    
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions = js.native
    
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var oncontentschanged: Any = js.native
    
    /* CompleteClass */
    var onoptionschanged: Any = js.native
  }
  
  @JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
  @js.native
  open class StorageItemQueryResult ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Storage.Search.StorageItemQueryResult {
    
    /* CompleteClass */
    override def applyNewQueryOptions(newQueryOptions: typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions): Unit = js.native
    
    /* CompleteClass */
    override def findStartIndexAsync(value: Any): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var folder: typingsJapgolly.winrt.Windows.Storage.StorageFolder = js.native
    
    /* CompleteClass */
    override def getCurrentQueryOptions(): typingsJapgolly.winrt.Windows.Storage.Search.QueryOptions = js.native
    
    /* CompleteClass */
    override def getItemCountAsync(): IAsyncOperation[Double] = js.native
    
    /* CompleteClass */
    var oncontentschanged: Any = js.native
    
    /* CompleteClass */
    var onoptionschanged: Any = js.native
  }
}
