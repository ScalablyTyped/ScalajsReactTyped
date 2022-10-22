package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface enables the object to handle list of ruby lines (aka Furigana lines). */
trait XRubySelection
  extends StObject
     with XInterface {
  
  /**
    * returns a sequence of ruby elements.
    *
    * Each element contains at least a string that contains the selected text and the ruby text. Additional parameters can be the ruby adjustment, the name
    * of a character style.
    * @param Automatic if Automatic is set the selection is parsed for words and applied ruby attributes
    * @returns a sequence of ruby properties
    */
  def getRubyList(Automatic: Boolean): SafeArray[PropertyValues]
  
  /**
    * applies the RubyList to the current selection. The number of elements must be equal to the number of elements that are returned by getRubyList.
    * Automatic must be set equally, too.
    */
  def setRubyList(RubyList: SeqEquiv[PropertyValues], Automatic: Boolean): Unit
}
object XRubySelection {
  
  inline def apply(
    acquire: Callback,
    getRubyList: Boolean => SafeArray[PropertyValues],
    queryInterface: `type` => Any,
    release: Callback,
    setRubyList: (SeqEquiv[PropertyValues], Boolean) => Callback
  ): XRubySelection = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getRubyList = js.Any.fromFunction1(getRubyList), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setRubyList = js.Any.fromFunction2((t0: SeqEquiv[PropertyValues], t1: Boolean) => (setRubyList(t0, t1)).runNow()))
    __obj.asInstanceOf[XRubySelection]
  }
  
  extension [Self <: XRubySelection](x: Self) {
    
    inline def setGetRubyList(value: Boolean => SafeArray[PropertyValues]): Self = StObject.set(x, "getRubyList", js.Any.fromFunction1(value))
    
    inline def setSetRubyList(value: (SeqEquiv[PropertyValues], Boolean) => Callback): Self = StObject.set(x, "setRubyList", js.Any.fromFunction2((t0: SeqEquiv[PropertyValues], t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
