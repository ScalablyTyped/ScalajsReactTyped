package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to connect data sinks and sources.
  *
  * The predecessor-member is the element in the connection that is nearer to the source of the data. The successor-member is the element that is further
  * away from the source of the data. (Note that this classification does not depend on whether the class implements {@link XInputStream} or {@link
  * XOutputStream} ; it only depends on the direction of data flow.)
  *
  * This interface allows generic services to navigate between arbitrary elements of a connection.
  */
trait XConnectable
  extends StObject
     with XInterface {
  
  /** @returns the predecessor of this object. */
  var Predecessor: XConnectable
  
  /** @returns the successor of this object. */
  var Successor: XConnectable
  
  /** @returns the predecessor of this object. */
  def getPredecessor(): XConnectable
  
  /** @returns the successor of this object. */
  def getSuccessor(): XConnectable
  
  /** sets the source of the data flow for this object. */
  def setPredecessor(aPredecessor: XConnectable): Unit
  
  /** sets the sink of the data flow for this object. */
  def setSuccessor(aSuccessor: XConnectable): Unit
}
object XConnectable {
  
  inline def apply(
    Predecessor: XConnectable,
    Successor: XConnectable,
    acquire: Callback,
    getPredecessor: CallbackTo[XConnectable],
    getSuccessor: CallbackTo[XConnectable],
    queryInterface: `type` => Any,
    release: Callback,
    setPredecessor: XConnectable => Callback,
    setSuccessor: XConnectable => Callback
  ): XConnectable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPredecessor = js.Any.fromFunction1((t0: XConnectable) => setPredecessor(t0).runNow()), setSuccessor = js.Any.fromFunction1((t0: XConnectable) => setSuccessor(t0).runNow()))
    __obj.asInstanceOf[XConnectable]
  }
  
  extension [Self <: XConnectable](x: Self) {
    
    inline def setGetPredecessor(value: CallbackTo[XConnectable]): Self = StObject.set(x, "getPredecessor", value.toJsFn)
    
    inline def setGetSuccessor(value: CallbackTo[XConnectable]): Self = StObject.set(x, "getSuccessor", value.toJsFn)
    
    inline def setPredecessor(value: XConnectable): Self = StObject.set(x, "Predecessor", value.asInstanceOf[js.Any])
    
    inline def setSetPredecessor(value: XConnectable => Callback): Self = StObject.set(x, "setPredecessor", js.Any.fromFunction1((t0: XConnectable) => value(t0).runNow()))
    
    inline def setSetSuccessor(value: XConnectable => Callback): Self = StObject.set(x, "setSuccessor", js.Any.fromFunction1((t0: XConnectable) => value(t0).runNow()))
    
    inline def setSuccessor(value: XConnectable): Self = StObject.set(x, "Successor", value.asInstanceOf[js.Any])
  }
}
