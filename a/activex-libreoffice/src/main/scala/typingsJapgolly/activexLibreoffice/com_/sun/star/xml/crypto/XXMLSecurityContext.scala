package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of XML security context
  *
  * This interface specifies a certain signature context. By signature context, the signer or verifier retrieves key specification.
  */
trait XXMLSecurityContext
  extends StObject
     with XInterface {
  
  /** Get the ID of the internal security environment */
  var DefaultSecurityEnvironmentIndex: Double
  
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  val SecurityEnvironment: XSecurityEnvironment
  
  /** Get the number of security environments */
  val SecurityEnvironmentNumber: Double
  
  /** Add personal security environment , and return the index of the added environment. */
  def addSecurityEnvironment(aSecurityEnvironment: XSecurityEnvironment): Double
  
  /** Get the ID of the internal security environment */
  def getDefaultSecurityEnvironmentIndex(): Double
  
  /** An handy method to get the first personal security environment. In XMLSec/NSS, the first personal security environment should be the "internal slot" */
  def getSecurityEnvironment(): XSecurityEnvironment
  
  /** Get personal security environment */
  def getSecurityEnvironmentByIndex(index: Double): XSecurityEnvironment
  
  /** Get the number of security environments */
  def getSecurityEnvironmentNumber(): Double
  
  /** set the ID of the internal security environment */
  def setDefaultSecurityEnvironmentIndex(index: Double): Unit
}
object XXMLSecurityContext {
  
  inline def apply(
    DefaultSecurityEnvironmentIndex: Double,
    SecurityEnvironment: XSecurityEnvironment,
    SecurityEnvironmentNumber: Double,
    acquire: Callback,
    addSecurityEnvironment: XSecurityEnvironment => Double,
    getDefaultSecurityEnvironmentIndex: CallbackTo[Double],
    getSecurityEnvironment: CallbackTo[XSecurityEnvironment],
    getSecurityEnvironmentByIndex: Double => XSecurityEnvironment,
    getSecurityEnvironmentNumber: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultSecurityEnvironmentIndex: Double => Callback
  ): XXMLSecurityContext = {
    val __obj = js.Dynamic.literal(DefaultSecurityEnvironmentIndex = DefaultSecurityEnvironmentIndex.asInstanceOf[js.Any], SecurityEnvironment = SecurityEnvironment.asInstanceOf[js.Any], SecurityEnvironmentNumber = SecurityEnvironmentNumber.asInstanceOf[js.Any], acquire = acquire.toJsFn, addSecurityEnvironment = js.Any.fromFunction1(addSecurityEnvironment), getDefaultSecurityEnvironmentIndex = getDefaultSecurityEnvironmentIndex.toJsFn, getSecurityEnvironment = getSecurityEnvironment.toJsFn, getSecurityEnvironmentByIndex = js.Any.fromFunction1(getSecurityEnvironmentByIndex), getSecurityEnvironmentNumber = getSecurityEnvironmentNumber.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultSecurityEnvironmentIndex = js.Any.fromFunction1((t0: Double) => setDefaultSecurityEnvironmentIndex(t0).runNow()))
    __obj.asInstanceOf[XXMLSecurityContext]
  }
  
  extension [Self <: XXMLSecurityContext](x: Self) {
    
    inline def setAddSecurityEnvironment(value: XSecurityEnvironment => Double): Self = StObject.set(x, "addSecurityEnvironment", js.Any.fromFunction1(value))
    
    inline def setDefaultSecurityEnvironmentIndex(value: Double): Self = StObject.set(x, "DefaultSecurityEnvironmentIndex", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultSecurityEnvironmentIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getDefaultSecurityEnvironmentIndex", value.toJsFn)
    
    inline def setGetSecurityEnvironment(value: CallbackTo[XSecurityEnvironment]): Self = StObject.set(x, "getSecurityEnvironment", value.toJsFn)
    
    inline def setGetSecurityEnvironmentByIndex(value: Double => XSecurityEnvironment): Self = StObject.set(x, "getSecurityEnvironmentByIndex", js.Any.fromFunction1(value))
    
    inline def setGetSecurityEnvironmentNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getSecurityEnvironmentNumber", value.toJsFn)
    
    inline def setSecurityEnvironment(value: XSecurityEnvironment): Self = StObject.set(x, "SecurityEnvironment", value.asInstanceOf[js.Any])
    
    inline def setSecurityEnvironmentNumber(value: Double): Self = StObject.set(x, "SecurityEnvironmentNumber", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultSecurityEnvironmentIndex(value: Double => Callback): Self = StObject.set(x, "setDefaultSecurityEnvironmentIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
