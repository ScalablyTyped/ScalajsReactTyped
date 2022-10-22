package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to return filter options from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionFilterOptions
  extends StObject
     with XInteractionContinuation {
  
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  var FilterOptions: SafeArray[PropertyValue]
  
  /**
    * Get results from the continuation.
    * @returns the stored list of properties containing filter options.
    */
  def getFilterOptions(): SafeArray[PropertyValue]
  
  /**
    * Store results to the continuation.
    * @param rProperties the list of properties containing filter options.
    */
  def setFilterOptions(rProperties: SeqEquiv[PropertyValue]): Unit
}
object XInteractionFilterOptions {
  
  inline def apply(
    FilterOptions: SafeArray[PropertyValue],
    acquire: Callback,
    getFilterOptions: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setFilterOptions: SeqEquiv[PropertyValue] => Callback
  ): XInteractionFilterOptions = {
    val __obj = js.Dynamic.literal(FilterOptions = FilterOptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFilterOptions = getFilterOptions.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setFilterOptions = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setFilterOptions(t0).runNow()))
    __obj.asInstanceOf[XInteractionFilterOptions]
  }
  
  extension [Self <: XInteractionFilterOptions](x: Self) {
    
    inline def setFilterOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "FilterOptions", value.asInstanceOf[js.Any])
    
    inline def setGetFilterOptions(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getFilterOptions", value.toJsFn)
    
    inline def setSetFilterOptions(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setFilterOptions", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
