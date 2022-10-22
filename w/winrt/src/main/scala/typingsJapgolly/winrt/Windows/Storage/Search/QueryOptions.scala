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

trait QueryOptions
  extends StObject
     with IQueryOptions
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
    userSearchFilter: String
  ): QueryOptions = {
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], loadFromString = js.Any.fromFunction1((t0: String) => loadFromString(t0).runNow()), saveToString = saveToString.toJsFn, setPropertyPrefetch = js.Any.fromFunction2((t0: PropertyPrefetchOptions, t1: IIterable[String]) => (setPropertyPrefetch(t0, t1)).runNow()), setThumbnailPrefetch = js.Any.fromFunction3((t0: ThumbnailMode, t1: Double, t2: ThumbnailOptions) => (setThumbnailPrefetch(t0, t1, t2)).runNow()), sortOrder = sortOrder.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}
