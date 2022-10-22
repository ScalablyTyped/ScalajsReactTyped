package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a framework for implementing a wizard dialog.
  * @since OOo 3.3
  */
trait Wizard
  extends StObject
     with XWizard {
  
  /**
    * creates a wizard with a multiple possible execution paths
    * @param PageIds the IDs of the pages which constitute the execution paths. IDs in each path must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createMultiplePathsWizard(PageIds: SeqEquiv[SeqEquiv[Double]], Controller: XWizardController): Unit
  
  /**
    * creates a wizard with a single execution path
    * @param PageIds the IDs of the pages which constitute the execution path. IDs must be in ascending order.
    * @param Controller the wizard controller.
    */
  def createSinglePathWizard(PageIds: SeqEquiv[Double], Controller: XWizardController): Unit
}
object Wizard {
  
  inline def apply(
    CurrentPage: XWizardPage,
    DialogWindow: XWindow,
    HelpURL: String,
    acquire: Callback,
    activatePath: (Double, Boolean) => Callback,
    advanceTo: Double => Boolean,
    createMultiplePathsWizard: (SeqEquiv[SeqEquiv[Double]], XWizardController) => Callback,
    createSinglePathWizard: (SeqEquiv[Double], XWizardController) => Callback,
    enableButton: (Double, Boolean) => Callback,
    enablePage: (Double, Boolean) => Callback,
    execute: CallbackTo[Double],
    getCurrentPage: CallbackTo[XWizardPage],
    goBackTo: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultButton: Double => Callback,
    setTitle: String => Callback,
    travelNext: CallbackTo[Boolean],
    travelPrevious: CallbackTo[Boolean],
    updateTravelUI: Callback
  ): Wizard = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], DialogWindow = DialogWindow.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], acquire = acquire.toJsFn, activatePath = js.Any.fromFunction2((t0: Double, t1: Boolean) => (activatePath(t0, t1)).runNow()), advanceTo = js.Any.fromFunction1(advanceTo), createMultiplePathsWizard = js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[Double]], t1: XWizardController) => (createMultiplePathsWizard(t0, t1)).runNow()), createSinglePathWizard = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: XWizardController) => (createSinglePathWizard(t0, t1)).runNow()), enableButton = js.Any.fromFunction2((t0: Double, t1: Boolean) => (enableButton(t0, t1)).runNow()), enablePage = js.Any.fromFunction2((t0: Double, t1: Boolean) => (enablePage(t0, t1)).runNow()), execute = execute.toJsFn, getCurrentPage = getCurrentPage.toJsFn, goBackTo = js.Any.fromFunction1(goBackTo), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultButton = js.Any.fromFunction1((t0: Double) => setDefaultButton(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()), travelNext = travelNext.toJsFn, travelPrevious = travelPrevious.toJsFn, updateTravelUI = updateTravelUI.toJsFn)
    __obj.asInstanceOf[Wizard]
  }
  
  extension [Self <: Wizard](x: Self) {
    
    inline def setCreateMultiplePathsWizard(value: (SeqEquiv[SeqEquiv[Double]], XWizardController) => Callback): Self = StObject.set(x, "createMultiplePathsWizard", js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[Double]], t1: XWizardController) => (value(t0, t1)).runNow()))
    
    inline def setCreateSinglePathWizard(value: (SeqEquiv[Double], XWizardController) => Callback): Self = StObject.set(x, "createSinglePathWizard", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: XWizardController) => (value(t0, t1)).runNow()))
  }
}
