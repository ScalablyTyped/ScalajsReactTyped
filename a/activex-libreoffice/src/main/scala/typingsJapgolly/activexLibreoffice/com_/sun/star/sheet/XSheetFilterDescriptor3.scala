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
  * This interface uses the {@link TableFilterField3} struct. whereas the {@link XSheetFilterDescriptor2} interface uses the {@link TableFilterField2}
  * struct.
  * @see SheetFilterDescriptor2
  * @since LibreOffice 3.5
  */
trait XSheetFilterDescriptor3
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields3: SafeArray[TableFilterField3]
  
  /** returns the collection of filter fields. */
  def getFilterFields3(): SafeArray[TableFilterField3]
  
  /** sets a new collection of filter fields. */
  def setFilterFields3(aFilterFields: SeqEquiv[TableFilterField3]): Unit
}
object XSheetFilterDescriptor3 {
  
  inline def apply(
    FilterFields3: SafeArray[TableFilterField3],
    acquire: Callback,
    getFilterFields3: CallbackTo[SafeArray[TableFilterField3]],
    queryInterface: `type` => Any,
    release: Callback,
    setFilterFields3: SeqEquiv[TableFilterField3] => Callback
  ): XSheetFilterDescriptor3 = {
    val __obj = js.Dynamic.literal(FilterFields3 = FilterFields3.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilterFields3 = getFilterFields3.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFilterFields3 = js.Any.fromFunction1((t0: SeqEquiv[TableFilterField3]) => setFilterFields3(t0).runNow()))
    __obj.asInstanceOf[XSheetFilterDescriptor3]
  }
  
  extension [Self <: XSheetFilterDescriptor3](x: Self) {
    
    inline def setFilterFields3(value: SafeArray[TableFilterField3]): Self = StObject.set(x, "FilterFields3", value.asInstanceOf[js.Any])
    
    inline def setGetFilterFields3(value: CallbackTo[SafeArray[TableFilterField3]]): Self = StObject.set(x, "getFilterFields3", value.toJsFn)
    
    inline def setSetFilterFields3(value: SeqEquiv[TableFilterField3] => Callback): Self = StObject.set(x, "setFilterFields3", js.Any.fromFunction1((t0: SeqEquiv[TableFilterField3]) => value(t0).runNow()))
  }
}
