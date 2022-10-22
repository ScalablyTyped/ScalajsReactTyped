package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents something that can be filtered using an {@link XSheetFilterDescriptor} .
  * @see com.sun.star.sheet.XSheetFilterableEx
  */
trait XSheetFilterable
  extends StObject
     with XInterface {
  
  /**
    * creates a filter descriptor.
    * @param bEmpty if set to `TRUE` , creates an empty filter descriptor. If set to `FALSE` , fills the filter descriptor with previous settings of the curre
    */
  def createFilterDescriptor(bEmpty: Boolean): XSheetFilterDescriptor
  
  /**
    * performs a filter operation, using the settings of the passed filter descriptor.
    * @param xDescriptor the settings for the filter operation.
    */
  def filter(xDescriptor: XSheetFilterDescriptor): Unit
}
object XSheetFilterable {
  
  inline def apply(
    acquire: Callback,
    createFilterDescriptor: Boolean => XSheetFilterDescriptor,
    filter: XSheetFilterDescriptor => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetFilterable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createFilterDescriptor = js.Any.fromFunction1(createFilterDescriptor), filter = js.Any.fromFunction1((t0: XSheetFilterDescriptor) => filter(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetFilterable]
  }
  
  extension [Self <: XSheetFilterable](x: Self) {
    
    inline def setCreateFilterDescriptor(value: Boolean => XSheetFilterDescriptor): Self = StObject.set(x, "createFilterDescriptor", js.Any.fromFunction1(value))
    
    inline def setFilter(value: XSheetFilterDescriptor => Callback): Self = StObject.set(x, "filter", js.Any.fromFunction1((t0: XSheetFilterDescriptor) => value(t0).runNow()))
  }
}
