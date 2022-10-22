package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSequence
import typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An internal DataProvider that has more access to data than a plain DataProvider. */
trait XInternalDataProvider
  extends StObject
     with XDataProvider {
  
  /** same as insertSequence with nAfterIndex being the largest current index of the data, i.e. (size - 1) */
  def appendSequence(): Unit
  
  /**
    * deletes an additional sequence for categories at nLevel>=1; categories at level 0 are always present and cannot be deleted
    * @since OOo 3.3
    */
  def deleteComplexCategoryLevel(nLevel: Double): Unit
  
  def deleteDataPointForAllSequences(nAtIndex: Double): Unit
  
  def deleteSequence(nAtIndex: Double): Unit
  
  def getDataByRangeRepresentation(aRange: String): SafeArray[Any]
  
  def hasDataByRangeRepresentation(aRange: String): Boolean
  
  /**
    * insert an additional sequence for categories nLevel>=1; categories at level 0 are always present and cannot be inserted or deleted
    * @since OOo 3.3
    */
  def insertComplexCategoryLevel(nLevel: Double): Unit
  
  def insertDataPointForAllSequences(nAfterIndex: Double): Unit
  
  def insertSequence(nAfterIndex: Double): Unit
  
  /**
    * If range representations of data sequences change due to internal structural changes, they must be registered at the data provider.
    *
    * Sequences that are directly retrieved via the methods of the XDataProvider interface are already registered. If a labeled data sequence was created by
    * cloning an existing one, it has to be explicitly registered via this method.
    */
  def registerDataSequenceForChanges(xSeq: XDataSequence): Unit
  
  def setDataByRangeRepresentation(aRange: String, aNewData: SeqEquiv[Any]): Unit
  
  def swapDataPointWithNextOneForAllSequences(nAtIndex: Double): Unit
}
object XInternalDataProvider {
  
  inline def apply(
    RangeSelection: XRangeSelection,
    acquire: Callback,
    appendSequence: Callback,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    deleteComplexCategoryLevel: Double => Callback,
    deleteDataPointForAllSequences: Double => Callback,
    deleteSequence: Double => Callback,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    getDataByRangeRepresentation: String => SafeArray[Any],
    getRangeSelection: CallbackTo[XRangeSelection],
    hasDataByRangeRepresentation: String => Boolean,
    insertComplexCategoryLevel: Double => Callback,
    insertDataPointForAllSequences: Double => Callback,
    insertSequence: Double => Callback,
    queryInterface: `type` => Any,
    registerDataSequenceForChanges: XDataSequence => Callback,
    release: Callback,
    setDataByRangeRepresentation: (String, SeqEquiv[Any]) => Callback,
    swapDataPointWithNextOneForAllSequences: Double => Callback
  ): XInternalDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendSequence = appendSequence.toJsFn, createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), deleteComplexCategoryLevel = js.Any.fromFunction1((t0: Double) => deleteComplexCategoryLevel(t0).runNow()), deleteDataPointForAllSequences = js.Any.fromFunction1((t0: Double) => deleteDataPointForAllSequences(t0).runNow()), deleteSequence = js.Any.fromFunction1((t0: Double) => deleteSequence(t0).runNow()), detectArguments = js.Any.fromFunction1(detectArguments), getDataByRangeRepresentation = js.Any.fromFunction1(getDataByRangeRepresentation), getRangeSelection = getRangeSelection.toJsFn, hasDataByRangeRepresentation = js.Any.fromFunction1(hasDataByRangeRepresentation), insertComplexCategoryLevel = js.Any.fromFunction1((t0: Double) => insertComplexCategoryLevel(t0).runNow()), insertDataPointForAllSequences = js.Any.fromFunction1((t0: Double) => insertDataPointForAllSequences(t0).runNow()), insertSequence = js.Any.fromFunction1((t0: Double) => insertSequence(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), registerDataSequenceForChanges = js.Any.fromFunction1((t0: XDataSequence) => registerDataSequenceForChanges(t0).runNow()), release = release.toJsFn, setDataByRangeRepresentation = js.Any.fromFunction2((t0: String, t1: SeqEquiv[Any]) => (setDataByRangeRepresentation(t0, t1)).runNow()), swapDataPointWithNextOneForAllSequences = js.Any.fromFunction1((t0: Double) => swapDataPointWithNextOneForAllSequences(t0).runNow()))
    __obj.asInstanceOf[XInternalDataProvider]
  }
  
  extension [Self <: XInternalDataProvider](x: Self) {
    
    inline def setAppendSequence(value: Callback): Self = StObject.set(x, "appendSequence", value.toJsFn)
    
    inline def setDeleteComplexCategoryLevel(value: Double => Callback): Self = StObject.set(x, "deleteComplexCategoryLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDeleteDataPointForAllSequences(value: Double => Callback): Self = StObject.set(x, "deleteDataPointForAllSequences", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setDeleteSequence(value: Double => Callback): Self = StObject.set(x, "deleteSequence", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetDataByRangeRepresentation(value: String => SafeArray[Any]): Self = StObject.set(x, "getDataByRangeRepresentation", js.Any.fromFunction1(value))
    
    inline def setHasDataByRangeRepresentation(value: String => Boolean): Self = StObject.set(x, "hasDataByRangeRepresentation", js.Any.fromFunction1(value))
    
    inline def setInsertComplexCategoryLevel(value: Double => Callback): Self = StObject.set(x, "insertComplexCategoryLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInsertDataPointForAllSequences(value: Double => Callback): Self = StObject.set(x, "insertDataPointForAllSequences", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setInsertSequence(value: Double => Callback): Self = StObject.set(x, "insertSequence", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRegisterDataSequenceForChanges(value: XDataSequence => Callback): Self = StObject.set(x, "registerDataSequenceForChanges", js.Any.fromFunction1((t0: XDataSequence) => value(t0).runNow()))
    
    inline def setSetDataByRangeRepresentation(value: (String, SeqEquiv[Any]) => Callback): Self = StObject.set(x, "setDataByRangeRepresentation", js.Any.fromFunction2((t0: String, t1: SeqEquiv[Any]) => (value(t0, t1)).runNow()))
    
    inline def setSwapDataPointWithNextOneForAllSequences(value: Double => Callback): Self = StObject.set(x, "swapDataPointWithNextOneForAllSequences", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
