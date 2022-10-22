package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a container for a sequence of values.
  *
  * With the interface {@link XDataSequence} it is possible to transfer a complete sequence of values.
  *
  * With the optional {@link com.sun.star.container.XIndexReplace} it is possible to modify single elements, if the corresponding {@link DataProvider}
  * supports modification of its values.
  */
trait DataSequence
  extends StObject
     with XDataSequence
     with XNumericalDataSequence
     with XTextualDataSequence
     with XIndexReplace
     with XCloneable
     with XModifyBroadcaster
     with XPropertySet {
  
  /** a sequence of indexes that identify values that are hidden in the underlying data provider. */
  var HiddenValues: SafeArray[Double]
  
  /** If set to false `FALSE` , values from hidden cells are not returned. */
  var IncludeHiddenCells: Boolean
  
  /**
    * The key (index) of the number format that this sequence should be formatted with.
    *
    * The key identifies a number format in an {@link com.sun.star.util.XNumberFormats} object. This object can be retrieved by the {@link
    * com.sun.star.util.XNumberFormatsSupplier} interface supported by {@link com.sun.star.chart.ChartDocument} .
    *
    * The role of the series inside a data series. This may be any string. However some strings are predefined and should always be used in the same way.
    * @see DataSequenceRole
    */
  var Role: DataSequenceRole
}
object DataSequence {
  
  inline def apply(
    Count: Double,
    Data: SafeArray[Any],
    ElementType: `type`,
    HiddenValues: SafeArray[Double],
    IncludeHiddenCells: Boolean,
    NumericalData: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    Role: DataSequenceRole,
    SourceRangeRepresentation: String,
    TextualData: SafeArray[String],
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createClone: CallbackTo[XCloneable],
    generateLabel: LabelOrigin => SafeArray[String],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getData: CallbackTo[SafeArray[Any]],
    getElementType: CallbackTo[`type`],
    getNumberFormatKeyByIndex: Double => Double,
    getNumericalData: CallbackTo[SafeArray[Double]],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSourceRangeRepresentation: CallbackTo[String],
    getTextualData: CallbackTo[SafeArray[String]],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeModifyListener: XModifyListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    replaceByIndex: (Double, Any) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DataSequence = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], HiddenValues = HiddenValues.asInstanceOf[js.Any], IncludeHiddenCells = IncludeHiddenCells.asInstanceOf[js.Any], NumericalData = NumericalData.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], SourceRangeRepresentation = SourceRangeRepresentation.asInstanceOf[js.Any], TextualData = TextualData.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createClone = createClone.toJsFn, generateLabel = js.Any.fromFunction1(generateLabel), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getData = getData.toJsFn, getElementType = getElementType.toJsFn, getNumberFormatKeyByIndex = js.Any.fromFunction1(getNumberFormatKeyByIndex), getNumericalData = getNumericalData.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceRangeRepresentation = getSourceRangeRepresentation.toJsFn, getTextualData = getTextualData.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DataSequence]
  }
  
  extension [Self <: DataSequence](x: Self) {
    
    inline def setHiddenValues(value: SafeArray[Double]): Self = StObject.set(x, "HiddenValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeHiddenCells(value: Boolean): Self = StObject.set(x, "IncludeHiddenCells", value.asInstanceOf[js.Any])
    
    inline def setRole(value: DataSequenceRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
  }
}
