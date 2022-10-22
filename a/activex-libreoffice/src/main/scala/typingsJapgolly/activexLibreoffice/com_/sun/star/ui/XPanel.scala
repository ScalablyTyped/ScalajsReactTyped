package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Panel
  * @since LibreOffice 5.1
  */
trait XPanel extends StObject {
  
  /** Get the panel dialog element */
  val Dialog: XWindow
  
  /** The panel identifier */
  val Id: String
  
  /** Get the ordering index of the panel in the deck */
  var OrderIndex: Double
  
  /** Get the panel title string */
  var Title: String
  
  /** Collapse the panel to only show its title bar */
  def collapse(): Unit
  
  /**
    * Expand and display the panel
    * @param bCollapseOther TRUE collapse all other panels of the deckFALSE do not change other panels state
    */
  def expand(bCollapseOther: Boolean): Unit
  
  /** Get the panel dialog element */
  def getDialog(): XWindow
  
  /** The panel identifier */
  def getId(): String
  
  /** Get the ordering index of the panel in the deck */
  def getOrderIndex(): Double
  
  /** Get the panel title string */
  def getTitle(): String
  
  /** Is the panel expanded */
  def isExpanded(): Boolean
  
  /** Move the panel one step down in the deck */
  def moveDown(): Unit
  
  /** Move panel as first item of the deck */
  def moveFirst(): Unit
  
  /** Move panel as last item of the deck */
  def moveLast(): Unit
  
  /** Move panel one step up in the deck */
  def moveUp(): Unit
  
  /** Set the ordering index of the panel in the deck */
  def setOrderIndex(newOrderIndex: Double): Unit
  
  /**
    * Set the panel title string
    * @param newTitle The new title string
    */
  def setTitle(newTitle: String): Unit
}
object XPanel {
  
  inline def apply(
    Dialog: XWindow,
    Id: String,
    OrderIndex: Double,
    Title: String,
    collapse: Callback,
    expand: Boolean => Callback,
    getDialog: CallbackTo[XWindow],
    getId: CallbackTo[String],
    getOrderIndex: CallbackTo[Double],
    getTitle: CallbackTo[String],
    isExpanded: CallbackTo[Boolean],
    moveDown: Callback,
    moveFirst: Callback,
    moveLast: Callback,
    moveUp: Callback,
    setOrderIndex: Double => Callback,
    setTitle: String => Callback
  ): XPanel = {
    val __obj = js.Dynamic.literal(Dialog = Dialog.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OrderIndex = OrderIndex.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], collapse = collapse.toJsFn, expand = js.Any.fromFunction1((t0: Boolean) => expand(t0).runNow()), getDialog = getDialog.toJsFn, getId = getId.toJsFn, getOrderIndex = getOrderIndex.toJsFn, getTitle = getTitle.toJsFn, isExpanded = isExpanded.toJsFn, moveDown = moveDown.toJsFn, moveFirst = moveFirst.toJsFn, moveLast = moveLast.toJsFn, moveUp = moveUp.toJsFn, setOrderIndex = js.Any.fromFunction1((t0: Double) => setOrderIndex(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XPanel]
  }
  
  extension [Self <: XPanel](x: Self) {
    
    inline def setCollapse(value: Callback): Self = StObject.set(x, "collapse", value.toJsFn)
    
    inline def setDialog(value: XWindow): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
    
    inline def setExpand(value: Boolean => Callback): Self = StObject.set(x, "expand", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetDialog(value: CallbackTo[XWindow]): Self = StObject.set(x, "getDialog", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetOrderIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getOrderIndex", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpanded", value.toJsFn)
    
    inline def setMoveDown(value: Callback): Self = StObject.set(x, "moveDown", value.toJsFn)
    
    inline def setMoveFirst(value: Callback): Self = StObject.set(x, "moveFirst", value.toJsFn)
    
    inline def setMoveLast(value: Callback): Self = StObject.set(x, "moveLast", value.toJsFn)
    
    inline def setMoveUp(value: Callback): Self = StObject.set(x, "moveUp", value.toJsFn)
    
    inline def setOrderIndex(value: Double): Self = StObject.set(x, "OrderIndex", value.asInstanceOf[js.Any])
    
    inline def setSetOrderIndex(value: Double => Callback): Self = StObject.set(x, "setOrderIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
