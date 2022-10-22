package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter gets some data and provides some data. The received data is typically (but not necessarily) different from the data that can be retrieved by
  * a filter.
  */
trait DataFilter
  extends StObject
     with XDataSink
     with XDataSource
object DataFilter {
  
  inline def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    acquire: Callback,
    getDataSequences: CallbackTo[SafeArray[XLabeledDataSequence]],
    queryInterface: `type` => Any,
    release: Callback,
    setData: SeqEquiv[XLabeledDataSequence] => Callback
  ): DataFilter = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataSequences = getDataSequences.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setData = js.Any.fromFunction1((t0: SeqEquiv[XLabeledDataSequence]) => setData(t0).runNow()))
    __obj.asInstanceOf[DataFilter]
  }
}
