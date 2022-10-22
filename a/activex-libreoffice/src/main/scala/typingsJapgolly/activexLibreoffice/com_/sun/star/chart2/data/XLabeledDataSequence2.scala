package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XLabeledDataSequence2
  extends StObject
     with XLabeledDataSequence
     with XModifyBroadcaster
     with XCloneable
object XLabeledDataSequence2 {
  
  inline def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: Callback,
    addModifyListener: XModifyListener => Callback,
    createClone: CallbackTo[XCloneable],
    getLabel: CallbackTo[XDataSequence],
    getValues: CallbackTo[XDataSequence],
    queryInterface: `type` => Any,
    release: Callback,
    removeModifyListener: XModifyListener => Callback,
    setLabel: XDataSequence => Callback,
    setValues: XDataSequence => Callback
  ): XLabeledDataSequence2 = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), createClone = createClone.toJsFn, getLabel = getLabel.toJsFn, getValues = getValues.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), setLabel = js.Any.fromFunction1((t0: XDataSequence) => setLabel(t0).runNow()), setValues = js.Any.fromFunction1((t0: XDataSequence) => setValues(t0).runNow()))
    __obj.asInstanceOf[XLabeledDataSequence2]
  }
}
