package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to set date values as categories.
  *
  * Can be obtained from interface {@link XChartDocument} via method getData().
  * @since OOo 3.4
  */
trait XDateCategories extends StObject {
  
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  var DateCategories: SafeArray[Double]
  
  /**
    * retrieves the date values if the category x-axis id a date axis
    * @returns a sequence of doubles representing dates.
    */
  def getDateCategories(): SafeArray[Double]
  
  /**
    * sets dates as categories
    * @param rDates a sequence of sequences of doubles representing dates.
    */
  def setDateCategories(rDates: SeqEquiv[Double]): Unit
}
object XDateCategories {
  
  inline def apply(
    DateCategories: SafeArray[Double],
    getDateCategories: CallbackTo[SafeArray[Double]],
    setDateCategories: SeqEquiv[Double] => Callback
  ): XDateCategories = {
    val __obj = js.Dynamic.literal(DateCategories = DateCategories.asInstanceOf[js.Any], getDateCategories = getDateCategories.toJsFn, setDateCategories = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setDateCategories(t0).runNow()))
    __obj.asInstanceOf[XDateCategories]
  }
  
  extension [Self <: XDateCategories](x: Self) {
    
    inline def setDateCategories(value: SafeArray[Double]): Self = StObject.set(x, "DateCategories", value.asInstanceOf[js.Any])
    
    inline def setGetDateCategories(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getDateCategories", value.toJsFn)
    
    inline def setSetDateCategories(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setDateCategories", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
  }
}
