package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a container for sequences of data. With this interface data can only be written to.
  *
  * If you want to be able to also read the data set here, your component must also implement {@link XDataSource} .
  */
trait XDataSink
  extends StObject
     with XInterface {
  
  /**
    * sets new data sequences. The elements set here must support the service {@link DataSequence} .
    *
    * If the data consist only of floating point numbers (double values), the instances set here should also support the service NumericalDataSequence.
    *
    * If the data consist only of strings, the instances set here should also support the service TextualDataSequence.
    *
    * If one of the derived services is supported by one element of the sequence, it should be available for all elements in the sequence.
    */
  def setData(aData: SeqEquiv[XLabeledDataSequence]): Unit
}
object XDataSink {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setData: SeqEquiv[XLabeledDataSequence] => Callback
  ): XDataSink = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setData = js.Any.fromFunction1((t0: SeqEquiv[XLabeledDataSequence]) => setData(t0).runNow()))
    __obj.asInstanceOf[XDataSink]
  }
  
  extension [Self <: XDataSink](x: Self) {
    
    inline def setSetData(value: SeqEquiv[XLabeledDataSequence] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: SeqEquiv[XLabeledDataSequence]) => value(t0).runNow()))
  }
}
