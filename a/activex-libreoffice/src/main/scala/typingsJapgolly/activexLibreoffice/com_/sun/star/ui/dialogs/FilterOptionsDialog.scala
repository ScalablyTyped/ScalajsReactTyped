package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service enables a filter developer to register a dialog to query for user options before the filter operation is performed.
  *
  * The user options are stored inside the {@link com.sun.star.document.MediaDescriptor} and can be queried from the {@link
  * com.sun.star.document.MediaDescriptor} by the component that implements {@link com.sun.star.document.XFilter} .
  *
  * The application will set the {@link com.sun.star.document.MediaDescriptor} using the interface {@link com.sun.star.beans.XPropertyAccess} and then
  * call {@link XExecutableDialog.execute()} .
  *
  * If that method returns `ExecutableDialogResults::OK` , the application will retrieve the changed {@link com.sun.star.document.MediaDescriptor} back
  * using the interface {@link com.sun.star.beans.XPropertyAccess} . The filter operation is than continued, using the new {@link
  * com.sun.star.document.MediaDescriptor} .
  *
  * Otherwise, the filter operation is canceled.
  * @since OOo 1.1.2
  */
trait FilterOptionsDialog
  extends StObject
     with XPropertyAccess
     with XExecutableDialog
object FilterOptionsDialog {
  
  inline def apply(
    PropertyValues: SafeArray[PropertyValue],
    acquire: Callback,
    execute: CallbackTo[Double],
    getPropertyValues: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback,
    setPropertyValues: SeqEquiv[PropertyValue] => Callback,
    setTitle: String => Callback
  ): FilterOptionsDialog = {
    val __obj = js.Dynamic.literal(PropertyValues = PropertyValues.asInstanceOf[js.Any], acquire = acquire.toJsFn, execute = execute.toJsFn, getPropertyValues = getPropertyValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPropertyValues = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setPropertyValues(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[FilterOptionsDialog]
  }
}
