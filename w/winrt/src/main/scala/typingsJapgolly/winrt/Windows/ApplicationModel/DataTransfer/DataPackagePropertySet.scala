package typingsJapgolly.winrt.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataPackagePropertySet
  extends StObject
     with IDataPackagePropertySet
object DataPackagePropertySet {
  
  inline def apply(
    applicationListingUri: Uri,
    applicationName: String,
    clear: Callback,
    description: String,
    fileTypes: IVector[String],
    first: CallbackTo[IIterator[IKeyValuePair[String, Any]]],
    getView: CallbackTo[IMapView[String, Any]],
    hasKey: String => Boolean,
    insert: (String, Any) => Boolean,
    lookup: String => Any,
    remove: String => Callback,
    size: Double,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): DataPackagePropertySet = {
    val __obj = js.Dynamic.literal(applicationListingUri = applicationListingUri.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], clear = clear.toJsFn, description = description.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPackagePropertySet]
  }
}
