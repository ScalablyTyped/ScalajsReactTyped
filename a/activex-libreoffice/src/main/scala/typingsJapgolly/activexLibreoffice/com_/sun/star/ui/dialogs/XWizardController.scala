package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface of a client-provided controller of a custom {@link Wizard} .
  * @since OOo 3.3
  */
trait XWizardController extends StObject {
  
  def canAdvance(): Boolean
  
  /**
    * called when the wizard is about to be finished.
    *
    * This method allows the controller to do any final checks, and ultimately veto finishing the wizard.
    */
  def confirmFinish(): Boolean
  
  /**
    * creates a page
    *
    * {@link Wizard} pages are created on demand, when the respective page is reached during traveling through the wizard. Effectively, this means the
    * method is called at most once for each possible page ID.
    * @param ParentWindow the parent window to use for the page window
    * @param PageId the ID of the page.
    * @returns the requested page.
    */
  def createPage(ParentWindow: XWindow, PageId: Double): XWizardPage
  
  /**
    * provides the title of a page given by ID
    *
    * The page titles are displayed in the wizard's roadmap.
    */
  def getPageTitle(PageId: Double): String
  
  /** called when a new page in the wizard is being activated */
  def onActivatePage(PageId: Double): Unit
  
  /** called when a page in the wizard is being deactivated */
  def onDeactivatePage(PageId: Double): Unit
}
object XWizardController {
  
  inline def apply(
    canAdvance: CallbackTo[Boolean],
    confirmFinish: CallbackTo[Boolean],
    createPage: (XWindow, Double) => XWizardPage,
    getPageTitle: Double => String,
    onActivatePage: Double => Callback,
    onDeactivatePage: Double => Callback
  ): XWizardController = {
    val __obj = js.Dynamic.literal(canAdvance = canAdvance.toJsFn, confirmFinish = confirmFinish.toJsFn, createPage = js.Any.fromFunction2(createPage), getPageTitle = js.Any.fromFunction1(getPageTitle), onActivatePage = js.Any.fromFunction1((t0: Double) => onActivatePage(t0).runNow()), onDeactivatePage = js.Any.fromFunction1((t0: Double) => onDeactivatePage(t0).runNow()))
    __obj.asInstanceOf[XWizardController]
  }
  
  extension [Self <: XWizardController](x: Self) {
    
    inline def setCanAdvance(value: CallbackTo[Boolean]): Self = StObject.set(x, "canAdvance", value.toJsFn)
    
    inline def setConfirmFinish(value: CallbackTo[Boolean]): Self = StObject.set(x, "confirmFinish", value.toJsFn)
    
    inline def setCreatePage(value: (XWindow, Double) => XWizardPage): Self = StObject.set(x, "createPage", js.Any.fromFunction2(value))
    
    inline def setGetPageTitle(value: Double => String): Self = StObject.set(x, "getPageTitle", js.Any.fromFunction1(value))
    
    inline def setOnActivatePage(value: Double => Callback): Self = StObject.set(x, "onActivatePage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOnDeactivatePage(value: Double => Callback): Self = StObject.set(x, "onDeactivatePage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
