package typingsJapgolly.winrt.Windows.Storage.Search

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryOptionsFactory extends js.Object {
  def createCommonFileQuery(query: CommonFileQuery, fileTypeFilter: IIterable[String]): QueryOptions
  def createCommonFolderQuery(query: CommonFolderQuery): QueryOptions
}

object IQueryOptionsFactory {
  @scala.inline
  def apply(
    createCommonFileQuery: (CommonFileQuery, IIterable[String]) => CallbackTo[QueryOptions],
    createCommonFolderQuery: CommonFolderQuery => CallbackTo[QueryOptions]
  ): IQueryOptionsFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCommonFileQuery")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Search.CommonFileQuery, t1: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[java.lang.String]) => createCommonFileQuery(t0, t1).runNow()))
    __obj.updateDynamic("createCommonFolderQuery")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Search.CommonFolderQuery) => createCommonFolderQuery(t0).runNow()))
    __obj.asInstanceOf[IQueryOptionsFactory]
  }
}

