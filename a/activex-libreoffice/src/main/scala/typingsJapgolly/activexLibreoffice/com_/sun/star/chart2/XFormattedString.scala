package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XFormattedString
  extends StObject
     with XInterface {
  
  var String: java.lang.String
  
  def getString(): String
  
  def setString(String: String): Unit
}
object XFormattedString {
  
  inline def apply(
    String: String,
    acquire: Callback,
    getString: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, getString = getString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XFormattedString]
  }
  
  extension [Self <: XFormattedString](x: Self) {
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
