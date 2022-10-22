package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
trait XLabeledDataSequence
  extends StObject
     with XInterface {
  
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence
  
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence
  
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence
  
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence
  
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): Unit
  
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): Unit
}
object XLabeledDataSequence {
  
  inline def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: Callback,
    getLabel: CallbackTo[XDataSequence],
    getValues: CallbackTo[XDataSequence],
    queryInterface: `type` => Any,
    release: Callback,
    setLabel: XDataSequence => Callback,
    setValues: XDataSequence => Callback
  ): XLabeledDataSequence = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLabel = getLabel.toJsFn, getValues = getValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLabel = js.Any.fromFunction1((t0: XDataSequence) => setLabel(t0).runNow()), setValues = js.Any.fromFunction1((t0: XDataSequence) => setValues(t0).runNow()))
    __obj.asInstanceOf[XLabeledDataSequence]
  }
  
  extension [Self <: XLabeledDataSequence](x: Self) {
    
    inline def setGetLabel(value: CallbackTo[XDataSequence]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetValues(value: CallbackTo[XDataSequence]): Self = StObject.set(x, "getValues", value.toJsFn)
    
    inline def setLabel(value: XDataSequence): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setSetLabel(value: XDataSequence => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: XDataSequence) => value(t0).runNow()))
    
    inline def setSetValues(value: XDataSequence => Callback): Self = StObject.set(x, "setValues", js.Any.fromFunction1((t0: XDataSequence) => value(t0).runNow()))
    
    inline def setValues(value: XDataSequence): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
