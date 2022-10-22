package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of the sidebar
  * @since LibreOffice 5.1
  */
trait XSidebarProvider
  extends StObject
     with XInterface {
  
  val Decks: XDecks
  
  /** Get the XFrame owner */
  val Frame: XFrame
  
  /** Returns the sidebar object */
  val Sidebar: XSidebar
  
  def getDecks(): XDecks
  
  /** Get the XFrame owner */
  def getFrame(): XFrame
  
  /** Returns the sidebar object */
  def getSidebar(): XSidebar
  
  /** Is the sidebar visible */
  def isVisible(): Boolean
  
  /**
    * Display the sidebar
    * @param bVisible the requested visible state
    */
  def setVisible(bVisible: Boolean): Unit
  
  /**
    * Decks container visibility
    * @param bVisible the requested visible state FALSE collapses the deck container horizontally. Then Only shows the deck TabBar selectorTRUE expands the de
    */
  def showDecks(bVisible: Boolean): Unit
}
object XSidebarProvider {
  
  inline def apply(
    Decks: XDecks,
    Frame: XFrame,
    Sidebar: XSidebar,
    acquire: Callback,
    getDecks: CallbackTo[XDecks],
    getFrame: CallbackTo[XFrame],
    getSidebar: CallbackTo[XSidebar],
    isVisible: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setVisible: Boolean => Callback,
    showDecks: Boolean => Callback
  ): XSidebarProvider = {
    val __obj = js.Dynamic.literal(Decks = Decks.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDecks = getDecks.toJsFn, getFrame = getFrame.toJsFn, getSidebar = getSidebar.toJsFn, isVisible = isVisible.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()), showDecks = js.Any.fromFunction1((t0: Boolean) => showDecks(t0).runNow()))
    __obj.asInstanceOf[XSidebarProvider]
  }
  
  extension [Self <: XSidebarProvider](x: Self) {
    
    inline def setDecks(value: XDecks): Self = StObject.set(x, "Decks", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setGetDecks(value: CallbackTo[XDecks]): Self = StObject.set(x, "getDecks", value.toJsFn)
    
    inline def setGetFrame(value: CallbackTo[XFrame]): Self = StObject.set(x, "getFrame", value.toJsFn)
    
    inline def setGetSidebar(value: CallbackTo[XSidebar]): Self = StObject.set(x, "getSidebar", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShowDecks(value: Boolean => Callback): Self = StObject.set(x, "showDecks", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSidebar(value: XSidebar): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
  }
}
