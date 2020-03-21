package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySet
  extends IMap[String, js.Any] {
  var applicationListingUri: Uri
  var applicationName: String
  var description: String
  var fileTypes: IVector[String]
  var thumbnail: IRandomAccessStreamReference
  var title: String
}

object IDataPackagePropertySet {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    clear: Callback,
    description: String,
    fileTypes: IVector[String],
    first: CallbackTo[IIterator[IKeyValuePair[String, js.Any]]],
    getView: CallbackTo[IMapView[String, js.Any]],
    hasKey: String => CallbackTo[Boolean],
    insert: (String, js.Any) => CallbackTo[Boolean],
    lookup: String => CallbackTo[js.Any],
    remove: String => Callback,
    size: Double,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("getView")(getView.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: java.lang.String) => hasKey(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => insert(t0, t1).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[IDataPackagePropertySet]
  }
}

