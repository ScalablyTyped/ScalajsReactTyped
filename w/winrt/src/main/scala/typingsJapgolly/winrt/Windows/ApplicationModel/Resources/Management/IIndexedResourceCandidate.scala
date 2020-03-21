package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Management

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndexedResourceCandidate extends js.Object {
  var metadata: IMapView[String, String]
  var qualifiers: IVectorView[IndexedResourceQualifier]
  var `type`: IndexedResourceType
  var uri: Uri
  var valueAsString: String
  def getQualifierValue(qualifierName: String): String
}

object IIndexedResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => CallbackTo[String],
    metadata: IMapView[String, String],
    qualifiers: IVectorView[IndexedResourceQualifier],
    `type`: IndexedResourceType,
    uri: Uri,
    valueAsString: String
  ): IIndexedResourceCandidate = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.updateDynamic("getQualifierValue")(js.Any.fromFunction1((t0: java.lang.String) => getQualifierValue(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexedResourceCandidate]
  }
}

