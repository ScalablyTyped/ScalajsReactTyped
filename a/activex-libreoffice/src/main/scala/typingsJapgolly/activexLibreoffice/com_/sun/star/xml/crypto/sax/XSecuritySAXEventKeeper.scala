package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Security SAX Event Keeper.
  *
  * This interface is an extension of the {@link XSAXEventKeeper} interface, some security related features are added.
  */
trait XSecuritySAXEventKeeper
  extends StObject
     with XSAXEventKeeper {
  
  /**
    * Adds a new element collector on the next element in the SAX event stream.
    * @param priority the priority of the element collector. See ConstOfPriority
    * @param modifyElement a flag representing whether the element collector will modify the content of its element after notification
    * @returns the keeper id of the new element collector
    */
  def addSecurityElementCollector(priority: ElementMarkPriority, modifyElement: Boolean): Double
  
  /**
    * Sets security id for an element mark.
    * @param id the keeper id of the element collector to be set
    * @param securityId the security id to be set
    */
  def setSecurityId(id: Double, securityId: Double): Unit
}
object XSecuritySAXEventKeeper {
  
  inline def apply(
    CurrentBlockingNode: XXMLElementWrapper,
    acquire: Callback,
    addBlocker: CallbackTo[Double],
    addElementCollector: CallbackTo[Double],
    addSecurityElementCollector: (ElementMarkPriority, Boolean) => Double,
    getCurrentBlockingNode: CallbackTo[XXMLElementWrapper],
    getElement: Double => XXMLElementWrapper,
    isBlocking: CallbackTo[Boolean],
    printBufferNodeTree: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeBlocker: Double => Callback,
    removeElementCollector: Double => Callback,
    setElement: (Double, XXMLElementWrapper) => Callback,
    setNextHandler: XDocumentHandler => XDocumentHandler,
    setSecurityId: (Double, Double) => Callback
  ): XSecuritySAXEventKeeper = {
    val __obj = js.Dynamic.literal(CurrentBlockingNode = CurrentBlockingNode.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBlocker = addBlocker.toJsFn, addElementCollector = addElementCollector.toJsFn, addSecurityElementCollector = js.Any.fromFunction2(addSecurityElementCollector), getCurrentBlockingNode = getCurrentBlockingNode.toJsFn, getElement = js.Any.fromFunction1(getElement), isBlocking = isBlocking.toJsFn, printBufferNodeTree = printBufferNodeTree.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeBlocker = js.Any.fromFunction1((t0: Double) => removeBlocker(t0).runNow()), removeElementCollector = js.Any.fromFunction1((t0: Double) => removeElementCollector(t0).runNow()), setElement = js.Any.fromFunction2((t0: Double, t1: XXMLElementWrapper) => (setElement(t0, t1)).runNow()), setNextHandler = js.Any.fromFunction1(setNextHandler), setSecurityId = js.Any.fromFunction2((t0: Double, t1: Double) => (setSecurityId(t0, t1)).runNow()))
    __obj.asInstanceOf[XSecuritySAXEventKeeper]
  }
  
  extension [Self <: XSecuritySAXEventKeeper](x: Self) {
    
    inline def setAddSecurityElementCollector(value: (ElementMarkPriority, Boolean) => Double): Self = StObject.set(x, "addSecurityElementCollector", js.Any.fromFunction2(value))
    
    inline def setSetSecurityId(value: (Double, Double) => Callback): Self = StObject.set(x, "setSecurityId", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
