package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the collection of subtotal fields in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalDescriptor
  extends StObject
     with XInterface {
  
  /**
    * adds a subtotal field definition to the descriptor.
    * @param aSubTotalColumns a sequence of all columns used to calculate subtotal values.
    * @param nGroupColumn specifies which column of the source range is used to group the contents of the source data.
    */
  def addNew(aSubTotalColumns: SeqEquiv[SubTotalColumn], nGroupColumn: Double): Unit
  
  /** removes all subtotal field definitions from the descriptor. */
  def clear(): Unit
}
object XSubTotalDescriptor {
  
  inline def apply(
    acquire: Callback,
    addNew: (SeqEquiv[SubTotalColumn], Double) => Callback,
    clear: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSubTotalDescriptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addNew = js.Any.fromFunction2((t0: SeqEquiv[SubTotalColumn], t1: Double) => (addNew(t0, t1)).runNow()), clear = clear.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSubTotalDescriptor]
  }
  
  extension [Self <: XSubTotalDescriptor](x: Self) {
    
    inline def setAddNew(value: (SeqEquiv[SubTotalColumn], Double) => Callback): Self = StObject.set(x, "addNew", js.Any.fromFunction2((t0: SeqEquiv[SubTotalColumn], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
  }
}
