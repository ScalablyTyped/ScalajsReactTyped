package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to consolidate ranges in a spreadsheet document.
  *
  * Consolidation combines the cells of multiple cell ranges, using a specific function.
  * @deprecated Deprecated
  */
trait XConsolidatable
  extends StObject
     with XInterface {
  
  /**
    * consolidates data from several cell ranges, using the settings in the passed descriptor.
    * @param xDescriptor the descriptor used to perform the consolidation.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def consolidate(xDescriptor: XConsolidationDescriptor): Unit
  
  /**
    * creates a consolidation descriptor.
    * @param bEmpty `TRUE` leaves the descriptor empty, `FALSE` fills it with the settings from the last consolidation action.
    * @see com.sun.star.sheet.ConsolidationDescriptor
    */
  def createConsolidationDescriptor(bEmpty: Boolean): XConsolidationDescriptor
}
object XConsolidatable {
  
  inline def apply(
    acquire: Callback,
    consolidate: XConsolidationDescriptor => Callback,
    createConsolidationDescriptor: Boolean => XConsolidationDescriptor,
    queryInterface: `type` => Any,
    release: Callback
  ): XConsolidatable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, consolidate = js.Any.fromFunction1((t0: XConsolidationDescriptor) => consolidate(t0).runNow()), createConsolidationDescriptor = js.Any.fromFunction1(createConsolidationDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConsolidatable]
  }
  
  extension [Self <: XConsolidatable](x: Self) {
    
    inline def setConsolidate(value: XConsolidationDescriptor => Callback): Self = StObject.set(x, "consolidate", js.Any.fromFunction1((t0: XConsolidationDescriptor) => value(t0).runNow()))
    
    inline def setCreateConsolidationDescriptor(value: Boolean => XConsolidationDescriptor): Self = StObject.set(x, "createConsolidationDescriptor", js.Any.fromFunction1(value))
  }
}
