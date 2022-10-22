package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies an autotext entry.
  * @deprecated Deprecated
  */
trait XAutoTextEntry
  extends StObject
     with XInterface {
  
  /** inserts the contents represented by this auto text entry at the specified text range. */
  def applyTo(xRange: XTextRange): Unit
}
object XAutoTextEntry {
  
  inline def apply(
    acquire: Callback,
    applyTo: XTextRange => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAutoTextEntry = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, applyTo = js.Any.fromFunction1((t0: XTextRange) => applyTo(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAutoTextEntry]
  }
  
  extension [Self <: XAutoTextEntry](x: Self) {
    
    inline def setApplyTo(value: XTextRange => Callback): Self = StObject.set(x, "applyTo", js.Any.fromFunction1((t0: XTextRange) => value(t0).runNow()))
  }
}
