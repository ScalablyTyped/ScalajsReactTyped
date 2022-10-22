package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains methods to handle a subtotal descriptor.
  *
  * The subtotal descriptor provides properties to set up the subtotal function.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalCalculatable
  extends StObject
     with XInterface {
  
  /**
    * creates subtotals using the settings of the passed descriptor.
    * @param xDescriptor the subtotal descriptor with the settings used for the subtotal operation.
    * @param bReplace if set to `TRUE` , replaces previous subtotal results.
    */
  def applySubTotals(xDescriptor: XSubTotalDescriptor, bReplace: Boolean): Unit
  
  /**
    * creates a subtotal descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty descriptor. If set to `FALSE` , fills the descriptor with previous settings of the current object (i.e
    */
  def createSubTotalDescriptor(bEmpty: Boolean): XSubTotalDescriptor
  
  /** removes the subtotals from the current object. */
  def removeSubTotals(): Unit
}
object XSubTotalCalculatable {
  
  inline def apply(
    acquire: Callback,
    applySubTotals: (XSubTotalDescriptor, Boolean) => Callback,
    createSubTotalDescriptor: Boolean => XSubTotalDescriptor,
    queryInterface: `type` => Any,
    release: Callback,
    removeSubTotals: Callback
  ): XSubTotalCalculatable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, applySubTotals = js.Any.fromFunction2((t0: XSubTotalDescriptor, t1: Boolean) => (applySubTotals(t0, t1)).runNow()), createSubTotalDescriptor = js.Any.fromFunction1(createSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSubTotals = removeSubTotals.toJsFn)
    __obj.asInstanceOf[XSubTotalCalculatable]
  }
  
  extension [Self <: XSubTotalCalculatable](x: Self) {
    
    inline def setApplySubTotals(value: (XSubTotalDescriptor, Boolean) => Callback): Self = StObject.set(x, "applySubTotals", js.Any.fromFunction2((t0: XSubTotalDescriptor, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setCreateSubTotalDescriptor(value: Boolean => XSubTotalDescriptor): Self = StObject.set(x, "createSubTotalDescriptor", js.Any.fromFunction1(value))
    
    inline def setRemoveSubTotals(value: Callback): Self = StObject.set(x, "removeSubTotals", value.toJsFn)
  }
}
