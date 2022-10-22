package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to sort the contents of this object.
  *
  * The available properties describing the sort criteria are defined in the sort descriptor implemented by the object that implements this interface.
  *
  * There are older deprecated sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor}{@link com.sun.star.table.TableSortDescriptor}{@link com.sun.star.text.TextSortDescriptor}
  *
  * And a new set of sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor2}{@link com.sun.star.table.TableSortDescriptor2}{@link com.sun.star.text.TextSortDescriptor2}
  *
  * Both types may be implemented by the same object. When calling the sort method however properties from different descriptors must not be mixed.
  */
trait XSortable
  extends StObject
     with XInterface {
  
  /**
    * @returns a sequence of properties which allows to specify/modify the sort criteria.  The set of properties is specific to the type of object that implemen
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def createSortDescriptor(): SafeArray[PropertyValue]
  
  /**
    * sorts the contents of the object according to the specified properties.
    *
    * The specified properties are usually the same or a subset of those obtained by calling {@link createSortDescriptor()} on the same type of object.
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def sort(xDescriptor: SeqEquiv[PropertyValue]): Unit
}
object XSortable {
  
  inline def apply(
    acquire: Callback,
    createSortDescriptor: CallbackTo[SafeArray[PropertyValue]],
    queryInterface: `type` => Any,
    release: Callback,
    sort: SeqEquiv[PropertyValue] => Callback
  ): XSortable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createSortDescriptor = createSortDescriptor.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, sort = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => sort(t0).runNow()))
    __obj.asInstanceOf[XSortable]
  }
  
  extension [Self <: XSortable](x: Self) {
    
    inline def setCreateSortDescriptor(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "createSortDescriptor", value.toJsFn)
    
    inline def setSort(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "sort", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
