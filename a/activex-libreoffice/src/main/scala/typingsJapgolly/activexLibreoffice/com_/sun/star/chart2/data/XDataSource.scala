package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to sequences of data. With this interface data can only be read from.
  *
  * If the data stored consists only of floating point numbers (double values), the returned instances should also support the service
  * NumericalDataSequence.
  *
  * If the data stored consists only of strings, the returned instances should also support the service TextualDataSequence.
  */
trait XDataSource
  extends StObject
     with XInterface {
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  val DataSequences: SafeArray[XLabeledDataSequence]
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  def getDataSequences(): SafeArray[XLabeledDataSequence]
}
object XDataSource {
  
  inline def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    acquire: Callback,
    getDataSequences: CallbackTo[SafeArray[XLabeledDataSequence]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataSource = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataSequences = getDataSequences.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataSource]
  }
  
  extension [Self <: XDataSource](x: Self) {
    
    inline def setDataSequences(value: SafeArray[XLabeledDataSequence]): Self = StObject.set(x, "DataSequences", value.asInstanceOf[js.Any])
    
    inline def setGetDataSequences(value: CallbackTo[SafeArray[XLabeledDataSequence]]): Self = StObject.set(x, "getDataSequences", value.toJsFn)
  }
}
