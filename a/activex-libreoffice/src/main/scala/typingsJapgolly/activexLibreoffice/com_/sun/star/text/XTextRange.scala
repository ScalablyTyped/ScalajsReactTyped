package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the object's position in a text.
  *
  * It represents a text range. The beginning and end of the range may be identical.
  */
trait XTextRange
  extends StObject
     with XInterface {
  
  /** @returns a text range which contains only the end of this text range. */
  val End: XTextRange
  
  /** @returns a text range which contains only the start of this text range. */
  val Start: XTextRange
  
  /** @returns the string that is included in this text range. */
  var String: java.lang.String
  
  /** @returns a text range which contains only the end of this text range. */
  def getEnd(): XTextRange
  
  /** @returns a text range which contains only the start of this text range. */
  def getStart(): XTextRange
  
  /** @returns the string that is included in this text range. */
  def getString(): String
  
  /** @returns the text interface in which the text position is contained. */
  def getText(): XText
  
  /**
    * the whole string of characters of this piece of text is replaced.
    *
    * All styles are removed when applying this method.
    */
  def setString(aString: String): Unit
}
object XTextRange {
  
  inline def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: Callback,
    getEnd: CallbackTo[XTextRange],
    getStart: CallbackTo[XTextRange],
    getString: CallbackTo[String],
    getText: CallbackTo[XText],
    queryInterface: `type` => Any,
    release: Callback,
    setString: String => Callback
  ): XTextRange = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEnd = getEnd.toJsFn, getStart = getStart.toJsFn, getString = getString.toJsFn, getText = getText.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setString = js.Any.fromFunction1((t0: String) => setString(t0).runNow()))
    __obj.asInstanceOf[XTextRange]
  }
  
  extension [Self <: XTextRange](x: Self) {
    
    inline def setEnd(value: XTextRange): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setGetEnd(value: CallbackTo[XTextRange]): Self = StObject.set(x, "getEnd", value.toJsFn)
    
    inline def setGetStart(value: CallbackTo[XTextRange]): Self = StObject.set(x, "getStart", value.toJsFn)
    
    inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[XText]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setSetString(value: String => Callback): Self = StObject.set(x, "setString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStart(value: XTextRange): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
