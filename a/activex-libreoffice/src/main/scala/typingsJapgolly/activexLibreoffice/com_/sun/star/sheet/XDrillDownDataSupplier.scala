package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supplies a filtered subset of the original data source based on filtering criteria.
  *
  * A service that acts as a DataPilot data source can optionally implement this interface to allow drill-down of result data. The method this interface
  * provides is used internally when calling {@link XDataPilotTable2.getDrillDownData()} or {@link XDataPilotTable2.insertDrillDownSheet()} . If the data
  * source service does not implement this interface, then the aforementioned two methods will have no effect.
  * @see com.sun.star.sheet.DataPilotSource
  * @since OOo 3.0
  */
trait XDrillDownDataSupplier
  extends StObject
     with XInterface {
  
  /**
    * This method returns filtered subset of the original source data based on a given set of filtering criteria.
    * @param aFilters filtering criteria
    * @returns a filtered subset of the original source data as 2-dimensional sequences of `any` . The first row must be the header row. Each `any` instance mus
    * @see com.sun.star.sheet.DataPilotFieldFilter
    * @see com.sun.star.sheet.XDataPilotTable2
    */
  def getDrillDownData(aFilters: SeqEquiv[DataPilotFieldFilter]): SafeArray[SafeArray[Any]]
}
object XDrillDownDataSupplier {
  
  inline def apply(
    acquire: Callback,
    getDrillDownData: SeqEquiv[DataPilotFieldFilter] => SafeArray[SafeArray[Any]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDrillDownDataSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDrillDownData = js.Any.fromFunction1(getDrillDownData), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDrillDownDataSupplier]
  }
  
  extension [Self <: XDrillDownDataSupplier](x: Self) {
    
    inline def setGetDrillDownData(value: SeqEquiv[DataPilotFieldFilter] => SafeArray[SafeArray[Any]]): Self = StObject.set(x, "getDrillDownData", js.Any.fromFunction1(value))
  }
}
