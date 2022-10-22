package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text in a control. */
trait XTextArea
  extends StObject
     with XInterface {
  
  /** returns the text lines as a single string with line separators. */
  val TextLines: String
  
  /** returns the text lines as a single string with line separators. */
  def getTextLines(): String
}
object XTextArea {
  
  inline def apply(
    TextLines: String,
    acquire: Callback,
    getTextLines: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextArea = {
    val __obj = js.Dynamic.literal(TextLines = TextLines.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextLines = getTextLines.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextArea]
  }
  
  extension [Self <: XTextArea](x: Self) {
    
    inline def setGetTextLines(value: CallbackTo[String]): Self = StObject.set(x, "getTextLines", value.toJsFn)
    
    inline def setTextLines(value: String): Self = StObject.set(x, "TextLines", value.asInstanceOf[js.Any])
  }
}
