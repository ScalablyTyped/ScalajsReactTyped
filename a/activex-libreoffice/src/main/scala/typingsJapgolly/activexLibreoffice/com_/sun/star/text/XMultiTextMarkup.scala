package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to apply multiple text markups in one call.
  * @since OOo 3.0.1
  */
trait XMultiTextMarkup extends StObject {
  
  /**
    * submits multiple new markup ranges.
    *
    * The main use of this function will probably be for proofreading to allow for setting the markup of all found errors in a sentence in a single call.
    * For this the sequence needs to provide the markups for all errors along with the markup for the identified sentence boundaries. The order of those
    * entries is arbitrary.
    * @param aMarkups a sequence of single text markups.
    * @see com.sun.star.text.XTextMarkup
    * @see com.sun.star.text.TextMarkupType
    */
  def commitMultiTextMarkup(aMarkups: SeqEquiv[TextMarkupDescriptor]): Unit
}
object XMultiTextMarkup {
  
  inline def apply(commitMultiTextMarkup: SeqEquiv[TextMarkupDescriptor] => Callback): XMultiTextMarkup = {
    val __obj = js.Dynamic.literal(commitMultiTextMarkup = js.Any.fromFunction1((t0: SeqEquiv[TextMarkupDescriptor]) => commitMultiTextMarkup(t0).runNow()))
    __obj.asInstanceOf[XMultiTextMarkup]
  }
  
  extension [Self <: XMultiTextMarkup](x: Self) {
    
    inline def setCommitMultiTextMarkup(value: SeqEquiv[TextMarkupDescriptor] => Callback): Self = StObject.set(x, "commitMultiTextMarkup", js.Any.fromFunction1((t0: SeqEquiv[TextMarkupDescriptor]) => value(t0).runNow()))
  }
}
