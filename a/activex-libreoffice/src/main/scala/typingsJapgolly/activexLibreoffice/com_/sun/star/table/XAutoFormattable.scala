package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to apply TableAutoFormats to a cell range. */
trait XAutoFormattable
  extends StObject
     with XInterface {
  
  /**
    * applies an AutoFormat to the cell range of the current context.
    * @param aName is the name of the AutoFormat to apply.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified AutoFormat does not exist.
    */
  def autoFormat(aName: String): Unit
}
object XAutoFormattable {
  
  inline def apply(
    acquire: Callback,
    autoFormat: String => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAutoFormattable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, autoFormat = js.Any.fromFunction1((t0: String) => autoFormat(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAutoFormattable]
  }
  
  extension [Self <: XAutoFormattable](x: Self) {
    
    inline def setAutoFormat(value: String => Callback): Self = StObject.set(x, "autoFormat", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
