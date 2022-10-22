package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a single page of a {@link Wizard}
  * @since OOo 3.3
  */
trait XWizardPage
  extends StObject
     with XComponent {
  
  /**
    * denotes the ID of the page.
    *
    * Within a wizard, no two pages are allowed to have the same ID.
    */
  var PageId: Double
  
  /** provides read-only access to the window of the page */
  var Window: XWindow
  
  /** called when the page is activated */
  def activatePage(): Unit
  
  /**
    * determines whether it is allowed to travel to a later page in the wizard
    *
    * You should base this decision on the state of the page only, not on a global state of the wizard. Usually, you return `FALSE` here if and only if not
    * all necessary input on the page has been provided by the user, or the provided input is not valid.
    *
    * If checked for validity is expensive, or if you prefer giving your user more detailed feedback on validity than a disabled `Next` button in the
    * wizard, then move your checks to the {@link commitPage()} method.
    */
  def canAdvance(): Boolean
  
  /**
    * is called when the page is about to be left
    *
    * An implementation can veto the leave by returning `FALSE` here. Usually, the decision about this depends on the current state of the page.
    * @param Reason is one of the {@link WizardTravelType} constants denoting the reason why the page should be committed.
    */
  def commitPage(Reason: Double): Boolean
}
object XWizardPage {
  
  inline def apply(
    PageId: Double,
    Window: XWindow,
    acquire: Callback,
    activatePage: Callback,
    addEventListener: XEventListener => Callback,
    canAdvance: CallbackTo[Boolean],
    commitPage: Double => Boolean,
    dispose: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback
  ): XWizardPage = {
    val __obj = js.Dynamic.literal(PageId = PageId.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], acquire = acquire.toJsFn, activatePage = activatePage.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), canAdvance = canAdvance.toJsFn, commitPage = js.Any.fromFunction1(commitPage), dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[XWizardPage]
  }
  
  extension [Self <: XWizardPage](x: Self) {
    
    inline def setActivatePage(value: Callback): Self = StObject.set(x, "activatePage", value.toJsFn)
    
    inline def setCanAdvance(value: CallbackTo[Boolean]): Self = StObject.set(x, "canAdvance", value.toJsFn)
    
    inline def setCommitPage(value: Double => Boolean): Self = StObject.set(x, "commitPage", js.Any.fromFunction1(value))
    
    inline def setPageId(value: Double): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
