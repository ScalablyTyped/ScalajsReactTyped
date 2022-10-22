package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to register for action events of an image button and sets the action command. */
trait XImageButton
  extends StObject
     with XInterface {
  
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): Unit
  
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): Unit
  
  /** sets the action command string. */
  def setActionCommand(Command: String): Unit
}
object XImageButton {
  
  inline def apply(
    acquire: Callback,
    addActionListener: XActionListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeActionListener: XActionListener => Callback,
    setActionCommand: String => Callback
  ): XImageButton = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()), setActionCommand = js.Any.fromFunction1((t0: String) => setActionCommand(t0).runNow()))
    __obj.asInstanceOf[XImageButton]
  }
  
  extension [Self <: XImageButton](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setSetActionCommand(value: String => Callback): Self = StObject.set(x, "setActionCommand", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
