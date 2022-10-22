package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** {@link ChartType} service */
trait ChartType
  extends StObject
     with XChartType
     with XDataSeriesContainer
     with XPropertySet
object ChartType {
  
  inline def apply(
    ChartType: String,
    DataSeries: SafeArray[XDataSeries],
    PropertySetInfo: XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: String,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
    acquire: Callback,
    addDataSeries: XDataSeries => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createCoordinateSystem: Double => XCoordinateSystem,
    getChartType: CallbackTo[String],
    getDataSeries: CallbackTo[SafeArray[XDataSeries]],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRoleOfSequenceForSeriesLabel: CallbackTo[String],
    getSupportedMandatoryRoles: CallbackTo[SafeArray[String]],
    getSupportedOptionalRoles: CallbackTo[SafeArray[String]],
    getSupportedPropertyRoles: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback,
    removeDataSeries: XDataSeries => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setDataSeries: SeqEquiv[XDataSeries] => Callback,
    setPropertyValue: (String, Any) => Callback
  ): ChartType = {
    val __obj = js.Dynamic.literal(ChartType = ChartType.asInstanceOf[js.Any], DataSeries = DataSeries.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel.asInstanceOf[js.Any], SupportedMandatoryRoles = SupportedMandatoryRoles.asInstanceOf[js.Any], SupportedOptionalRoles = SupportedOptionalRoles.asInstanceOf[js.Any], SupportedPropertyRoles = SupportedPropertyRoles.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDataSeries = js.Any.fromFunction1((t0: XDataSeries) => addDataSeries(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = getChartType.toJsFn, getDataSeries = getDataSeries.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRoleOfSequenceForSeriesLabel = getRoleOfSequenceForSeriesLabel.toJsFn, getSupportedMandatoryRoles = getSupportedMandatoryRoles.toJsFn, getSupportedOptionalRoles = getSupportedOptionalRoles.toJsFn, getSupportedPropertyRoles = getSupportedPropertyRoles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDataSeries = js.Any.fromFunction1((t0: XDataSeries) => removeDataSeries(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setDataSeries = js.Any.fromFunction1((t0: SeqEquiv[XDataSeries]) => setDataSeries(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[ChartType]
  }
}
