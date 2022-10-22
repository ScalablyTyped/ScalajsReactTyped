package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method to create an {@link XDynamicResultSet} which will be sorted according to the given sorting options. */
trait XSortedDynamicResultSetFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a sorted {@link XDynamicResultSet} depending on internal data, an (unsorted) {@link XDynamicResultSet} and the sorting info.
    * @param Source the (unsorted) source result set
    * @param Info the sort criteria
    * @param CompareFactory a factory for compare objects.
    * @returns a sorted result set.
    */
  def createSortedDynamicResultSet(Source: XDynamicResultSet, Info: SeqEquiv[NumberedSortingInfo], CompareFactory: XAnyCompareFactory): XDynamicResultSet
}
object XSortedDynamicResultSetFactory {
  
  inline def apply(
    acquire: Callback,
    createSortedDynamicResultSet: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet,
    queryInterface: `type` => Any,
    release: Callback
  ): XSortedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createSortedDynamicResultSet = js.Any.fromFunction3(createSortedDynamicResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSortedDynamicResultSetFactory]
  }
  
  extension [Self <: XSortedDynamicResultSetFactory](x: Self) {
    
    inline def setCreateSortedDynamicResultSet(value: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet): Self = StObject.set(x, "createSortedDynamicResultSet", js.Any.fromFunction3(value))
  }
}
