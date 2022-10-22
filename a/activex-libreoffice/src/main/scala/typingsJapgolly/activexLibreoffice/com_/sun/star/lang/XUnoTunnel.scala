package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to tunnel UNO. This means providing access to data or something else, which is not specified by UNO-IDL.
  *
  *
  *
  * Common usage: Getting a C++ object pointer in the same process, thus to use an implementation directly, most often because of a design flaw.
  */
trait XUnoTunnel
  extends StObject
     with XInterface {
  
  /**
    * Call this method to get something which is not specified in UNO, e.g. an address to some C++ object.
    * @param aIdentifier identifier
    * @returns something
    */
  def getSomething(aIdentifier: SeqEquiv[Double]): Double
}
object XUnoTunnel {
  
  inline def apply(
    acquire: Callback,
    getSomething: SeqEquiv[Double] => Double,
    queryInterface: `type` => Any,
    release: Callback
  ): XUnoTunnel = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getSomething = js.Any.fromFunction1(getSomething), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUnoTunnel]
  }
  
  extension [Self <: XUnoTunnel](x: Self) {
    
    inline def setGetSomething(value: SeqEquiv[Double] => Double): Self = StObject.set(x, "getSomething", js.Any.fromFunction1(value))
  }
}
