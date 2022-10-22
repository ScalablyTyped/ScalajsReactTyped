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
  * @see SheetFilterDescriptor
  */
trait XSheetFilterDescriptor
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields: SafeArray[TableFilterField]
  
  /** returns the collection of filter fields. */
  def getFilterFields(): SafeArray[TableFilterField]
  
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: SeqEquiv[TableFilterField]): Unit
}
object XSheetFilterDescriptor {
  
  inline def apply(
    FilterFields: SafeArray[TableFilterField],
    acquire: Callback,
    getFilterFields: CallbackTo[SafeArray[TableFilterField]],
    queryInterface: `type` => Any,
    release: Callback,
    setFilterFields: SeqEquiv[TableFilterField] => Callback
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilterFields = getFilterFields.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFilterFields = js.Any.fromFunction1((t0: SeqEquiv[TableFilterField]) => setFilterFields(t0).runNow()))
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
  
  extension [Self <: XSheetFilterDescriptor](x: Self) {
    
    inline def setFilterFields(value: SafeArray[TableFilterField]): Self = StObject.set(x, "FilterFields", value.asInstanceOf[js.Any])
    
    inline def setGetFilterFields(value: CallbackTo[SafeArray[TableFilterField]]): Self = StObject.set(x, "getFilterFields", value.toJsFn)
    
    inline def setSetFilterFields(value: SeqEquiv[TableFilterField] => Callback): Self = StObject.set(x, "setFilterFields", js.Any.fromFunction1((t0: SeqEquiv[TableFilterField]) => value(t0).runNow()))
  }
}
