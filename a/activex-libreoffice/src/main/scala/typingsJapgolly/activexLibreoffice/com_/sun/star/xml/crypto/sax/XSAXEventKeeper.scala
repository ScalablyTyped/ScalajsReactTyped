package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of SAX Event Keeper.
  *
  * This interface is used to manipulate element marks in a SAX event stream.
  *
  * There are two kinds of element mark, one is element collector, which is used to collect a particular element from the SAX event stream; the other is
  * blocker, which is used to block the SAX event stream.
  */
trait XSAXEventKeeper
  extends StObject
     with XInterface {
  
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  val CurrentBlockingNode: XXMLElementWrapper
  
  /**
    * Adds a new blocker on the next element in the SAX event stream.
    *
    * No SAX event starting from the next element will be forwarded until this blocker is removed.
    * @returns the keeper id of the new blocker
    */
  def addBlocker(): Double
  
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @returns the keeper id of the new element collector
    */
  def addElementCollector(): Double
  
  /**
    * Gets the element which current blocking happens.
    *
    * This element is the working element of the first blocker in tree order.
    * @returns the current blocking element
    */
  def getCurrentBlockingNode(): XXMLElementWrapper
  
  /**
    * Gets the element of an element mark.
    * @param id the keeper id of the element mark, it can be a element collector or a blocker
    */
  def getElement(id: Double): XXMLElementWrapper
  
  /**
    * Checks whether the SAX event stream is blocking.
    * @returns `true` if blocking, `false` otherwise
    */
  def isBlocking(): Boolean
  
  /**
    * Prints information about all buffered elements.
    * @returns a tree-style string including all buffer information
    */
  def printBufferNodeTree(): String
  
  /**
    * Removes a blocker
    * @param id the keeper id of the blocker to be removed
    */
  def removeBlocker(id: Double): Unit
  
  /**
    * Removes an element collector.
    * @param id the keeper id of the element collector to be removed
    */
  def removeElementCollector(id: Double): Unit
  
  /**
    * Sets the element of an element mark.
    *
    * When an element is replaced outside of this interface, then uses this method can restore the link between an element mark and its working element.
    * @param id the keeper id of the element mark to be set
    * @param aElement the new element for this element mark.
    */
  def setElement(id: Double, aElement: XXMLElementWrapper): Unit
  
  /**
    * Sets the next document handler in the SAX chain.
    *
    * This handler will receive SAX events forwarded by the {@link SAXEventKeeper} .
    * @param nextHandler the next handler in the SAX chain
    * @returns the old next handler
    */
  def setNextHandler(nextHandler: XDocumentHandler): XDocumentHandler
}
object XSAXEventKeeper {
  
  inline def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: Callback,
    addBlocker: CallbackTo[Double],
    addElementCollector: CallbackTo[Double],
    getCurrentBlockingNode: CallbackTo[XXMLElementWrapper],
    getElement: Double => XXMLElementWrapper,
    isBlocking: CallbackTo[Boolean],
    printBufferNodeTree: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeBlocker: Double => Callback,
    removeElementCollector: Double => Callback,
    setElement: (Double, XXMLElementWrapper) => Callback,
    setNextHandler: XDocumentHandler => XDocumentHandler
  ): XSAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBlocker = addBlocker.toJsFn, addElementCollector = addElementCollector.toJsFn, getCurrentBlockingNode = getCurrentBlockingNode.toJsFn, getElement = js.Any.fromFunction1(getElement), isBlocking = isBlocking.toJsFn, printBufferNodeTree = printBufferNodeTree.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeBlocker = js.Any.fromFunction1((t0: Double) => removeBlocker(t0).runNow()), removeElementCollector = js.Any.fromFunction1((t0: Double) => removeElementCollector(t0).runNow()), setElement = js.Any.fromFunction2((t0: Double, t1: XXMLElementWrapper) => (setElement(t0, t1)).runNow()), setNextHandler = js.Any.fromFunction1(setNextHandler))
    __obj.asInstanceOf[XSAXEventKeeper]
  }
  
  extension [Self <: XSAXEventKeeper](x: Self) {
    
    inline def setAddBlocker(value: CallbackTo[Double]): Self = StObject.set(x, "addBlocker", value.toJsFn)
    
    inline def setAddElementCollector(value: CallbackTo[Double]): Self = StObject.set(x, "addElementCollector", value.toJsFn)
    
    inline def setCurrentBlockingNode(value: XXMLElementWrapper): Self = StObject.set(x, "CurrentBlockingNode", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentBlockingNode(value: CallbackTo[XXMLElementWrapper]): Self = StObject.set(x, "getCurrentBlockingNode", value.toJsFn)
    
    inline def setGetElement(value: Double => XXMLElementWrapper): Self = StObject.set(x, "getElement", js.Any.fromFunction1(value))
    
    inline def setIsBlocking(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBlocking", value.toJsFn)
    
    inline def setPrintBufferNodeTree(value: CallbackTo[String]): Self = StObject.set(x, "printBufferNodeTree", value.toJsFn)
    
    inline def setRemoveBlocker(value: Double => Callback): Self = StObject.set(x, "removeBlocker", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveElementCollector(value: Double => Callback): Self = StObject.set(x, "removeElementCollector", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetElement(value: (Double, XXMLElementWrapper) => Callback): Self = StObject.set(x, "setElement", js.Any.fromFunction2((t0: Double, t1: XXMLElementWrapper) => (value(t0, t1)).runNow()))
    
    inline def setSetNextHandler(value: XDocumentHandler => XDocumentHandler): Self = StObject.set(x, "setNextHandler", js.Any.fromFunction1(value))
  }
}
