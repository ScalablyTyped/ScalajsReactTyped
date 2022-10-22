package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View dependent part of the Draw and Impress controller.
  *
  * During the lifetime of an Impress application the {@link com.sun.star.drawing.DrawingDocumentDrawView} changes its sub controllers whenever the view
  * in the center pane is replaced by another one. The sub controller handles the things that are not common to all views, i.e. properties, the current
  * page/slide, and the selection.
  */
trait XDrawSubController
  extends StObject
     with XDrawView
     with XSelectionSupplier
     with XFastPropertySet
object XDrawSubController {
  
  inline def apply(
    CurrentPage: XDrawPage,
    Selection: Any,
    acquire: Callback,
    addSelectionChangeListener: XSelectionChangeListener => Callback,
    getCurrentPage: CallbackTo[XDrawPage],
    getFastPropertyValue: Double => Any,
    getSelection: CallbackTo[Any],
    queryInterface: `type` => Any,
    release: Callback,
    removeSelectionChangeListener: XSelectionChangeListener => Callback,
    select: Any => Boolean,
    setCurrentPage: XDrawPage => Callback,
    setFastPropertyValue: (Double, Any) => Callback
  ): XDrawSubController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => addSelectionChangeListener(t0).runNow()), getCurrentPage = getCurrentPage.toJsFn, getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getSelection = getSelection.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSelectionChangeListener = js.Any.fromFunction1((t0: XSelectionChangeListener) => removeSelectionChangeListener(t0).runNow()), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1((t0: XDrawPage) => setCurrentPage(t0).runNow()), setFastPropertyValue = js.Any.fromFunction2((t0: Double, t1: Any) => (setFastPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XDrawSubController]
  }
}
