package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.sheet.XRangeSelection
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An application that provides data for a chart must implement this interface. */
trait XDataProvider
  extends StObject
     with XInterface {
  
  /**
    * Returns a component that is able to change a given range representation to another one. This usually is a controller-component that uses the GUI to
    * allow a user to select a new range.
    *
    * This method may return nothing, if it does not support range selection or if there is no current controller available that offers the functionality.
    * @returns The component for selecting a new range. It must support XComponent, in order to inform the receiver about its lifetime.
    */
  val RangeSelection: XRangeSelection
  
  /**
    * creates a single data sequence for the given data range.
    * @param aRangeRepresentation is a string that can be interpreted by the component that implements this interface. The representation string is of a form
    * @see createDataSource
    * @throws com::sun::star::lang::IllegalArgumentException if the given range does not contain a valid range representation for a one-dimensional range of data.
    */
  def createDataSequenceByRangeRepresentation(aRangeRepresentation: String): XDataSequence
  
  /**
    * If `TRUE` is returned, a call to createDataSequenceByRangeRepresentation with the same argument must return a valid {@link XDataSequence} object. If
    * `FALSE` is returned, createDataSequenceByRangeRepresentation throws an exception.
    */
  def createDataSequenceByRangeRepresentationPossible(aRangeRepresentation: String): Boolean
  
  def createDataSequenceByValueArray(aRole: String, aValueArray: String): XDataSequence
  
  /**
    * Creates a data source object that matches the given range representation string.
    *
    * This can be used for creating the necessary data for a new chart out of a previously selected range of cells in a spreadsheet.
    * @param aArguments Arguments that tell the data provider how to slice the given range. The properties should be defined in a separate service.  For sprea
    * @returns a data source containing DataSequences that span the entire region given in `aArguments` .
    * @throws com::sun::star::lang::IllegalArgumentException may be raised by the {@link XDataProvider} if it is unable to interpret the arguments passed in `a
    */
  def createDataSource(aArguments: SeqEquiv[PropertyValue]): XDataSource
  
  /**
    * If `TRUE` is returned, a call to createDataSource with the same arguments must return a valid {@link XDataSequence} object. If `FALSE` is returned,
    * createDataSource throws an exception.
    */
  def createDataSourcePossible(aArguments: SeqEquiv[PropertyValue]): Boolean
  
  /**
    * Tries to find out with what parameters the passed {@link DataSource} most probably was created.
    *
    * if xDataSource is a data source that was created with {@link createDataSource()} , the arguments returned here should be the same than the ones passed
    * to the function. Of course, this cannot be guaranteed. However, if detection is ambiguous, the returned arguments should be empty.
    *
    * This method may merge representation strings together if adjacent ranges appear successively in the range identifiers. E.g., if the first range refers
    * to "$Sheet1.$A$1:$A$8" and the second range refers to "$Sheet1.$B$1:$B$8", those should be merged together to "$Sheet1.$A$1:$B$8".
    * @param xDataSource A data source containing all data used in a chart.
    * @returns Arguments that when being passed to {@link createDataSource()} should in an ideal case return the same data source as `xDataSource` .
    */
  def detectArguments(xDataSource: XDataSource): SafeArray[PropertyValue]
  
  /**
    * Returns a component that is able to change a given range representation to another one. This usually is a controller-component that uses the GUI to
    * allow a user to select a new range.
    *
    * This method may return nothing, if it does not support range selection or if there is no current controller available that offers the functionality.
    * @returns The component for selecting a new range. It must support XComponent, in order to inform the receiver about its lifetime.
    */
  def getRangeSelection(): XRangeSelection
}
object XDataProvider {
  
  inline def apply(
    RangeSelection: XRangeSelection,
    acquire: Callback,
    createDataSequenceByRangeRepresentation: String => XDataSequence,
    createDataSequenceByRangeRepresentationPossible: String => Boolean,
    createDataSequenceByValueArray: (String, String) => XDataSequence,
    createDataSource: SeqEquiv[PropertyValue] => XDataSource,
    createDataSourcePossible: SeqEquiv[PropertyValue] => Boolean,
    detectArguments: XDataSource => SafeArray[PropertyValue],
    getRangeSelection: CallbackTo[XRangeSelection],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataProvider = {
    val __obj = js.Dynamic.literal(RangeSelection = RangeSelection.asInstanceOf[js.Any], acquire = acquire.toJsFn, createDataSequenceByRangeRepresentation = js.Any.fromFunction1(createDataSequenceByRangeRepresentation), createDataSequenceByRangeRepresentationPossible = js.Any.fromFunction1(createDataSequenceByRangeRepresentationPossible), createDataSequenceByValueArray = js.Any.fromFunction2(createDataSequenceByValueArray), createDataSource = js.Any.fromFunction1(createDataSource), createDataSourcePossible = js.Any.fromFunction1(createDataSourcePossible), detectArguments = js.Any.fromFunction1(detectArguments), getRangeSelection = getRangeSelection.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataProvider]
  }
  
  extension [Self <: XDataProvider](x: Self) {
    
    inline def setCreateDataSequenceByRangeRepresentation(value: String => XDataSequence): Self = StObject.set(x, "createDataSequenceByRangeRepresentation", js.Any.fromFunction1(value))
    
    inline def setCreateDataSequenceByRangeRepresentationPossible(value: String => Boolean): Self = StObject.set(x, "createDataSequenceByRangeRepresentationPossible", js.Any.fromFunction1(value))
    
    inline def setCreateDataSequenceByValueArray(value: (String, String) => XDataSequence): Self = StObject.set(x, "createDataSequenceByValueArray", js.Any.fromFunction2(value))
    
    inline def setCreateDataSource(value: SeqEquiv[PropertyValue] => XDataSource): Self = StObject.set(x, "createDataSource", js.Any.fromFunction1(value))
    
    inline def setCreateDataSourcePossible(value: SeqEquiv[PropertyValue] => Boolean): Self = StObject.set(x, "createDataSourcePossible", js.Any.fromFunction1(value))
    
    inline def setDetectArguments(value: XDataSource => SafeArray[PropertyValue]): Self = StObject.set(x, "detectArguments", js.Any.fromFunction1(value))
    
    inline def setGetRangeSelection(value: CallbackTo[XRangeSelection]): Self = StObject.set(x, "getRangeSelection", value.toJsFn)
    
    inline def setRangeSelection(value: XRangeSelection): Self = StObject.set(x, "RangeSelection", value.asInstanceOf[js.Any])
  }
}
