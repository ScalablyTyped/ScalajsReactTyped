package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text and formatting of a fixed text field. */
trait XFixedText
  extends StObject
     with XInterface {
  
  /** returns the alignment of the text in the control. */
  var Alignment: Double
  
  /** returns the text of the control. */
  var Text: String
  
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double
  
  /** returns the text of the control. */
  def getText(): String
  
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit
  
  /** sets the text of the control. */
  def setText(Text: String): Unit
}
object XFixedText {
  
  inline def apply(
    Alignment: Double,
    Text: String,
    acquire: Callback,
    getAlignment: CallbackTo[Double],
    getText: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setAlignment: Double => Callback,
    setText: String => Callback
  ): XFixedText = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAlignment = getAlignment.toJsFn, getText = getText.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAlignment = js.Any.fromFunction1((t0: Double) => setAlignment(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()))
    __obj.asInstanceOf[XFixedText]
  }
  
  extension [Self <: XFixedText](x: Self) {
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setGetAlignment(value: CallbackTo[Double]): Self = StObject.set(x, "getAlignment", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setSetAlignment(value: Double => Callback): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
