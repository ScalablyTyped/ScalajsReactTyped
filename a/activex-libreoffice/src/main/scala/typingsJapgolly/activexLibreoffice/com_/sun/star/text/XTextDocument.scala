package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the main interface of a text document.
  * @see com.sun.star.text.TextDocument
  */
trait XTextDocument
  extends StObject
     with XModel {
  
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText
  
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText
  
  /** reformats the contents of the document. */
  def reformat(): Unit
}
object XTextDocument {
  
  inline def apply(
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    Text: XText,
    URL: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Callback,
    disconnectController: XController => Callback,
    dispose: Callback,
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getCurrentController: CallbackTo[XController],
    getCurrentSelection: CallbackTo[XInterface],
    getText: CallbackTo[XText],
    getURL: CallbackTo[String],
    hasControllersLocked: CallbackTo[Boolean],
    lockControllers: Callback,
    queryInterface: `type` => Any,
    reformat: Callback,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    setCurrentController: XController => Callback,
    unlockControllers: Callback
  ): XTextDocument = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, getArgs = getArgs.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getText = getText.toJsFn, getURL = getURL.toJsFn, hasControllersLocked = hasControllersLocked.toJsFn, lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), reformat = reformat.toJsFn, release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XTextDocument]
  }
  
  extension [Self <: XTextDocument](x: Self) {
    
    inline def setGetText(value: CallbackTo[XText]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setReformat(value: Callback): Self = StObject.set(x, "reformat", value.toJsFn)
    
    inline def setText(value: XText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
