package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceCandidate extends js.Object {
  var isDefault: Boolean
  var isMatch: Boolean
  var isMatchAsDefault: Boolean
  var qualifiers: IVectorView[ResourceQualifier]
  var valueAsString: String
  def getQualifierValue(qualifierName: String): String
  def getValueAsFileAsync(): IAsyncOperation[StorageFile]
}

object IResourceCandidate {
  @scala.inline
  def apply(
    getQualifierValue: String => CallbackTo[String],
    getValueAsFileAsync: CallbackTo[IAsyncOperation[StorageFile]],
    isDefault: Boolean,
    isMatch: Boolean,
    isMatchAsDefault: Boolean,
    qualifiers: IVectorView[ResourceQualifier],
    valueAsString: String
  ): IResourceCandidate = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], isMatchAsDefault = isMatchAsDefault.asInstanceOf[js.Any], qualifiers = qualifiers.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any])
    __obj.updateDynamic("getQualifierValue")(js.Any.fromFunction1((t0: java.lang.String) => getQualifierValue(t0).runNow()))
    __obj.updateDynamic("getValueAsFileAsync")(getValueAsFileAsync.toJsFn)
    __obj.asInstanceOf[IResourceCandidate]
  }
}

