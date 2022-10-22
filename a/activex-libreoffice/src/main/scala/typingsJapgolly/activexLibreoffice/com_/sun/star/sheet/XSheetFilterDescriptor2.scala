package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of filter conditions (filter fields).
  *
  * This interface uses the {@link TableFilterField2} struct, whereas the {@link XSheetFilterDescriptor} interface uses the {@link TableFilterField}
  * struct.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
trait XSheetFilterDescriptor2
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields2: SafeArray[TableFilterField2]
  
  /** returns the collection of filter fields. */
  def getFilterFields2(): SafeArray[TableFilterField2]
  
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: SeqEquiv[TableFilterField2]): Unit
}
object XSheetFilterDescriptor2 {
  
  inline def apply(
    FilterFields2: SafeArray[TableFilterField2],
    acquire: Callback,
    getFilterFields2: CallbackTo[SafeArray[TableFilterField2]],
    queryInterface: `type` => Any,
    release: Callback,
    setFilterFields2: SeqEquiv[TableFilterField2] => Callback
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal(FilterFields2 = FilterFields2.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilterFields2 = getFilterFields2.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFilterFields2 = js.Any.fromFunction1((t0: SeqEquiv[TableFilterField2]) => setFilterFields2(t0).runNow()))
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
  
  extension [Self <: XSheetFilterDescriptor2](x: Self) {
    
    inline def setFilterFields2(value: SafeArray[TableFilterField2]): Self = StObject.set(x, "FilterFields2", value.asInstanceOf[js.Any])
    
    inline def setGetFilterFields2(value: CallbackTo[SafeArray[TableFilterField2]]): Self = StObject.set(x, "getFilterFields2", value.toJsFn)
    
    inline def setSetFilterFields2(value: SeqEquiv[TableFilterField2] => Callback): Self = StObject.set(x, "setFilterFields2", js.Any.fromFunction1((t0: SeqEquiv[TableFilterField2]) => value(t0).runNow()))
  }
}
