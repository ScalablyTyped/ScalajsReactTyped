package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables the object to be a member of a chain. */
trait XChainable
  extends StObject
     with XInterface {
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  val Predecessor: XChainable
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  var Successor: XChainable
  
  /** @returns the previous object in this chain or NULL, if this is the first object of this chain. */
  def getPredecessor(): XChainable
  
  /** @returns the next object in this chain or NULL, if this is the last object in this chain. */
  def getSuccessor(): XChainable
  
  /** checks if the specified object can be linked to this. */
  def isChainable(xChainable: XChainable): Boolean
  
  /**
    * connects the specified object to this object as the successor in a chain.
    *
    * This implies that this object will become the predecessor of **xChainable** .
    */
  def setSuccessor(xChainable: XChainable): Unit
}
object XChainable {
  
  inline def apply(
    Predecessor: XChainable,
    Successor: XChainable,
    acquire: Callback,
    getPredecessor: CallbackTo[XChainable],
    getSuccessor: CallbackTo[XChainable],
    isChainable: XChainable => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setSuccessor: XChainable => Callback
  ): XChainable = {
    val __obj = js.Dynamic.literal(Predecessor = Predecessor.asInstanceOf[js.Any], Successor = Successor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPredecessor = getPredecessor.toJsFn, getSuccessor = getSuccessor.toJsFn, isChainable = js.Any.fromFunction1(isChainable), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSuccessor = js.Any.fromFunction1((t0: XChainable) => setSuccessor(t0).runNow()))
    __obj.asInstanceOf[XChainable]
  }
  
  extension [Self <: XChainable](x: Self) {
    
    inline def setGetPredecessor(value: CallbackTo[XChainable]): Self = StObject.set(x, "getPredecessor", value.toJsFn)
    
    inline def setGetSuccessor(value: CallbackTo[XChainable]): Self = StObject.set(x, "getSuccessor", value.toJsFn)
    
    inline def setIsChainable(value: XChainable => Boolean): Self = StObject.set(x, "isChainable", js.Any.fromFunction1(value))
    
    inline def setPredecessor(value: XChainable): Self = StObject.set(x, "Predecessor", value.asInstanceOf[js.Any])
    
    inline def setSetSuccessor(value: XChainable => Callback): Self = StObject.set(x, "setSuccessor", js.Any.fromFunction1((t0: XChainable) => value(t0).runNow()))
    
    inline def setSuccessor(value: XChainable): Self = StObject.set(x, "Successor", value.asInstanceOf[js.Any])
  }
}
