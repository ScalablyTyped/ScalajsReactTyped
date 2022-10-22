package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows estimating the memory usage of a service.
  * @since LibreOffice 5.3
  */
trait XAccounting
  extends StObject
     with XInterface {
  
  /** @returns an estimate of the current memory usage, in octets. */
  def estimateUsage(): Double
}
object XAccounting {
  
  inline def apply(
    acquire: Callback,
    estimateUsage: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccounting = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, estimateUsage = estimateUsage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccounting]
  }
  
  extension [Self <: XAccounting](x: Self) {
    
    inline def setEstimateUsage(value: CallbackTo[Double]): Self = StObject.set(x, "estimateUsage", value.toJsFn)
  }
}
