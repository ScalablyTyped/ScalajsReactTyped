package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the value and formatting of a pattern field. */
trait XPatternField
  extends StObject
     with XInterface {
  
  /** returns the currently set string value of the pattern field. */
  var String: java.lang.String
  
  /** returns the currently set pattern mask. */
  def getMasks(EditMask: js.Array[String], LiteralMask: js.Array[String]): Unit
  
  /** returns the currently set string value of the pattern field. */
  def getString(): String
  
  /** returns whether the format is currently checked during user input. */
  def isStrictFormat(): Boolean
  
  /** sets the pattern mask. */
  def setMasks(EditMask: String, LiteralMask: String): Unit
  
  /** determines if the format is checked during user input. */
  def setStrictFormat(bStrict: Boolean): Unit
  
  /** sets the string value of the pattern field. */
  def setString(Str: String): Unit
}
object XPatternField {
  
  inline def apply(
    String: String,
    acquire: Callback,
    getMasks: (js.Array[String], js.Array[String]) => Callback,
    getString: CallbackTo[String],
    isStrictFormat: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setMasks: (String, String) => Callback,
    setStrictFormat: Boolean => Callback,
    setString: String => Callback
  ): XPatternField = {
    val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMasks = js.Any.fromFunction2((t0: js.Array[String], t1: js.Array[String]) => (getMasks(t0, t1)).runNow()), getString = getString.toJsFn, isStrictFormat = isStrictFormat.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMasks = js.Any.fromFunction2((t0: String, t1: String) => (setMasks(t0, t1)).runNow()), setStrictFormat = js.Any.fromFunction1((t0: Boolean) => setStrictFormat(t0).runNow()), setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XPatternField]
  }
  
  extension [Self <: XPatternField](x: Self) {
    
    inline def setGetMasks(value: (js.Array[String], js.Array[String]) => Callback): Self = StObject.set(x, "getMasks", js.Any.fromFunction2((t0: js.Array[String], t1: js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setIsStrictFormat(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStrictFormat", value.toJsFn)
    
    inline def setSetMasks(value: (String, String) => Callback): Self = StObject.set(x, "setMasks", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetStrictFormat(value: Boolean => Callback): Self = StObject.set(x, "setStrictFormat", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
