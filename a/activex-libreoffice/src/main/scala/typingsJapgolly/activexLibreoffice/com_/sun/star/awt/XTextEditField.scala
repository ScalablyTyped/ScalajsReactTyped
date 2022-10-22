package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for password fields. */
trait XTextEditField
  extends StObject
     with XInterface {
  
  /** sets the character to display as a substitute on user input. */
  def setEchoChar(cEcho: String): Unit
}
object XTextEditField {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setEchoChar: String => Callback
  ): XTextEditField = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setEchoChar = js.Any.fromFunction1((t0: String) => setEchoChar(t0).runNow()))
    __obj.asInstanceOf[XTextEditField]
  }
  
  extension [Self <: XTextEditField](x: Self) {
    
    inline def setSetEchoChar(value: String => Callback): Self = StObject.set(x, "setEchoChar", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
