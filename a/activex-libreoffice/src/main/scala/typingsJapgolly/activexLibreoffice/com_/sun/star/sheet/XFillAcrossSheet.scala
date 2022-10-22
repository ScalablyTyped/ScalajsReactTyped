package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XFillAcrossSheet
  extends StObject
     with XInterface {
  
  /** copies data between ranges onto different sheets in the document. */
  def fillAcrossSheets(nContentFlags: Double): Unit
}
object XFillAcrossSheet {
  
  inline def apply(
    acquire: Callback,
    fillAcrossSheets: Double => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XFillAcrossSheet = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, fillAcrossSheets = js.Any.fromFunction1((t0: Double) => fillAcrossSheets(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFillAcrossSheet]
  }
  
  extension [Self <: XFillAcrossSheet](x: Self) {
    
    inline def setFillAcrossSheets(value: Double => Callback): Self = StObject.set(x, "fillAcrossSheets", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
