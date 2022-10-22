package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControl
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XControlModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a view of a standard office document. */
trait OfficeDocumentView
  extends StObject
     with XSelectionSupplier
     with XViewSettingsSupplier
     with XControlAccess
object OfficeDocumentView {
  
  inline def apply(
    Selection: Any,
    ViewSettings: XPropertySet,
    acquire: Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    getControl: XControlModel => XControl,
    getSelection: CallbackTo[Any],
    getViewSettings: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    select: Any => Boolean
  ): OfficeDocumentView = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), getControl = js.Any.fromFunction1(getControl), getSelection = getSelection.toJsFn, getViewSettings = getViewSettings.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[OfficeDocumentView]
  }
}
