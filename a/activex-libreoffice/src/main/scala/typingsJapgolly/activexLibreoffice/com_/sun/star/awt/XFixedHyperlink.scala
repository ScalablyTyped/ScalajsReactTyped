package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text and formatting of a fixed hyperlink field. */
trait XFixedHyperlink
  extends StObject
     with XInterface {
  
  /** returns the alignment of the text in the control. */
  var Alignment: Double
  
  /** returns the text of the control. */
  var Text: String
  
  /** returns the url of the control. */
  var URL: String
  
  /** registers an event handler for click action event. */
  def addActionListener(l: XActionListener): Unit
  
  /** returns the alignment of the text in the control. */
  def getAlignment(): Double
  
  /** returns the text of the control. */
  def getText(): String
  
  /** returns the url of the control. */
  def getURL(): String
  
  /** unregisters an event handler for click action event. */
  def removeActionListener(l: XActionListener): Unit
  
  /**
    * sets the alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  def setAlignment(nAlign: Double): Unit
  
  /** sets the text of the control. */
  def setText(Text: String): Unit
  
  /** sets the url of the control. */
  def setURL(URL: String): Unit
}
object XFixedHyperlink {
  
  inline def apply(
    Alignment: Double,
    Text: String,
    URL: String,
    acquire: Callback,
    addActionListener: XActionListener => Callback,
    getAlignment: CallbackTo[Double],
    getText: CallbackTo[String],
    getURL: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeActionListener: XActionListener => Callback,
    setAlignment: Double => Callback,
    setText: String => Callback,
    setURL: String => Callback
  ): XFixedHyperlink = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), getAlignment = getAlignment.toJsFn, getText = getText.toJsFn, getURL = getURL.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), setAlignment = js.Any.fromFunction1((t0: Double) => setAlignment(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), setURL = js.Any.fromFunction1((t0: String) => setURL(t0).runNow()))
    __obj.asInstanceOf[XFixedHyperlink]
  }
  
  extension [Self <: XFixedHyperlink](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setAlignment(value: Double): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setGetAlignment(value: CallbackTo[Double]): Self = StObject.set(x, "getAlignment", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetURL(value: CallbackTo[String]): Self = StObject.set(x, "getURL", value.toJsFn)
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setSetAlignment(value: Double => Callback): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetText(value: String => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetURL(value: String => Callback): Self = StObject.set(x, "setURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
