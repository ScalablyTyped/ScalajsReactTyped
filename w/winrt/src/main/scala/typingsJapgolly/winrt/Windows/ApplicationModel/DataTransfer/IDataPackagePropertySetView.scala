package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.AnonFirst
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataPackagePropertySetView
  extends IMapView[String, js.Any] {
  var applicationListingUri: Uri
  var applicationName: String
  var description: String
  var fileTypes: IVectorView[String]
  var thumbnail: RandomAccessStreamReference
  var title: String
}

object IDataPackagePropertySetView {
  @scala.inline
  def apply(
    applicationListingUri: Uri,
    applicationName: String,
    description: String,
    fileTypes: IVectorView[String],
    first: CallbackTo[IIterator[IKeyValuePair[String, js.Any]]],
    hasKey: String => CallbackTo[Boolean],
    lookup: String => CallbackTo[js.Any],
    size: Double,
    split: CallbackTo[AnonFirst[String, js.Any]],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IDataPackagePropertySetView = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: java.lang.String) => hasKey(t0).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("split")(split.toJsFn)
    __obj.asInstanceOf[IDataPackagePropertySetView]
  }
}

