package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set the label of a button and to register for action events. */
trait XButton
  extends StObject
     with XInterface {
  
  /** registers an event handler for button action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** unregisters an event handler for button action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /**
    * sets a command string for pushing the button.
    * @param Command value can be used to detect which button is pressed.
    */
  def setActionCommand(Command: String): Unit
  
  /** sets the label of the button. */
  def setLabel(Label: String): Unit
}
object XButton {
  
  inline def apply(
    acquire: Callback,
    addActionListener: XActionListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeActionListener: XActionListener => Callback,
    setActionCommand: String => Callback,
    setLabel: String => Callback
  ): XButton = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), setActionCommand = js.Any.fromFunction1((t0: String) => setActionCommand(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[XButton]
  }
  
  extension [Self <: XButton](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setSetActionCommand(value: String => Callback): Self = StObject.set(x, "setActionCommand", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetLabel(value: String => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
