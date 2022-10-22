package typingsJapgolly.winrt.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactPicker
  extends StObject
     with IContactPicker
object ContactPicker {
  
  inline def apply(
    commitButtonText: String,
    desiredFields: IVector[String],
    pickMultipleContactsAsync: CallbackTo[IAsyncOperation[IVectorView[ContactInformation]]],
    pickSingleContactAsync: CallbackTo[IAsyncOperation[ContactInformation]],
    selectionMode: ContactSelectionMode
  ): ContactPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], pickMultipleContactsAsync = pickMultipleContactsAsync.toJsFn, pickSingleContactAsync = pickSingleContactAsync.toJsFn, selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPicker]
  }
}
