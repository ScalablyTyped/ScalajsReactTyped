package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Deck
  * @since LibreOffice 5.1
  */
trait XDeck extends StObject {
  
  /** The deck identifier */
  val Id: String
  
  /** Get the ordering index of the deck button in sidebar */
  var OrderIndex: Double
  
  /** Panels collection attached to the deck */
  val Panels: XPanels
  
  /** Get the deck title string */
  var Title: String
  
  /**
    * Activate the deck and display its content
    * @param bActivate The requested state for the deck TRUE sets the deck as the active oneFALSE hide the deck and defaults to the first deck of the sidebar
    */
  def activate(bActivate: Boolean): Unit
  
  /** The deck identifier */
  def getId(): String
  
  /** Get the ordering index of the deck button in sidebar */
  def getOrderIndex(): Double
  
  /** Panels collection attached to the deck */
  def getPanels(): XPanels
  
  /** Get the deck title string */
  def getTitle(): String
  
  /** Is the deck the active one */
  def isActive(): Boolean
  
  /** Move deck one step down in the sidebar */
  def moveDown(): Unit
  
  /** Move deck button at first position in sidebar */
  def moveFirst(): Unit
  
  /** Move deck button at last position in sidebar */
  def moveLast(): Unit
  
  /** Move deck one step up in the sidebar */
  def moveUp(): Unit
  
  /**
    * Set the ordering index of the deck button in sidebar
    * @param newOrderIndex The new position
    */
  def setOrderIndex(newOrderIndex: Double): Unit
  
  /**
    * Set the deck title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit
}
object XDeck {
  
  inline def apply(
    Id: String,
    OrderIndex: Double,
    Panels: XPanels,
    Title: String,
    activate: Boolean => Callback,
    getId: CallbackTo[String],
    getOrderIndex: CallbackTo[Double],
    getPanels: CallbackTo[XPanels],
    getTitle: CallbackTo[String],
    isActive: CallbackTo[Boolean],
    moveDown: Callback,
    moveFirst: Callback,
    moveLast: Callback,
    moveUp: Callback,
    setOrderIndex: Double => Callback,
    setTitle: String => Callback
  ): XDeck = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Panels = Panels.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], activate = js.Any.fromFunction1((t0: Boolean) => activate(t0).runNow()), getId = getId.toJsFn, getOrderIndex = getOrderIndex.toJsFn, getPanels = getPanels.toJsFn, getTitle = getTitle.toJsFn, isActive = isActive.toJsFn, moveDown = moveDown.toJsFn, moveFirst = moveFirst.toJsFn, moveLast = moveLast.toJsFn, moveUp = moveUp.toJsFn, setOrderIndex = js.Any.fromFunction1((t0: Double) => setOrderIndex(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XDeck]
  }
  
  extension [Self <: XDeck](x: Self) {
    
    inline def setActivate(value: Boolean => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetOrderIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getOrderIndex", value.toJsFn)
    
    inline def setGetPanels(value: CallbackTo[XPanels]): Self = StObject.set(x, "getPanels", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setMoveDown(value: Callback): Self = StObject.set(x, "moveDown", value.toJsFn)
    
    inline def setMoveFirst(value: Callback): Self = StObject.set(x, "moveFirst", value.toJsFn)
    
    inline def setMoveLast(value: Callback): Self = StObject.set(x, "moveLast", value.toJsFn)
    
    inline def setMoveUp(value: Callback): Self = StObject.set(x, "moveUp", value.toJsFn)
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "OrderIndex", value.asInstanceOf[js.Any])
    
    inline def setPanels(value: XPanels): Self = StObject.set(x, "Panels", value.asInstanceOf[js.Any])
    
    inline def setSetOrderIndex(value: Double => Callback): Self = StObject.set(x, "setOrderIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
