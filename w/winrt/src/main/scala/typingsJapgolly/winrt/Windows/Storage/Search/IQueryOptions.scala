package typingsJapgolly.winrt.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryOptions extends js.Object {
  var applicationSearchFilter: String
  var dateStackOption: DateStackOption
  var fileTypeFilter: IVector[String]
  var folderDepth: FolderDepth
  var groupPropertyName: String
  var indexerOption: IndexerOption
  var language: String
  var sortOrder: IVector[SortEntry]
  var userSearchFilter: String
  def loadFromString(value: String): Unit
  def saveToString(): String
  def setPropertyPrefetch(options: PropertyPrefetchOptions, propertiesToRetrieve: IIterable[String]): Unit
  def setThumbnailPrefetch(mode: ThumbnailMode, requestedSize: Double, options: ThumbnailOptions): Unit
}

object IQueryOptions {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal(applicationSearchFilter = applicationSearchFilter.asInstanceOf[js.Any], dateStackOption = dateStackOption.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], folderDepth = folderDepth.asInstanceOf[js.Any], groupPropertyName = groupPropertyName.asInstanceOf[js.Any], indexerOption = indexerOption.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any], userSearchFilter = userSearchFilter.asInstanceOf[js.Any])
    __obj.updateDynamic("loadFromString")(js.Any.fromFunction1((t0: java.lang.String) => loadFromString(t0).runNow()))
    __obj.updateDynamic("saveToString")(saveToString.toJsFn)
    __obj.updateDynamic("setPropertyPrefetch")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.FileProperties.PropertyPrefetchOptions, t1: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => setPropertyPrefetch(t0, t1).runNow()))
    __obj.updateDynamic("setThumbnailPrefetch")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailMode, t1: scala.Double, t2: typingsJapgolly.winrt.Windows.Storage.FileProperties.ThumbnailOptions) => setThumbnailPrefetch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IQueryOptions]
  }
}

