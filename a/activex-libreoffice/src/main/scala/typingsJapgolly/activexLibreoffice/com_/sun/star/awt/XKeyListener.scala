package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive keyboard events. */
trait XKeyListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a key has been pressed. */
  def keyPressed(e: KeyEvent): Unit
  
  /** is invoked when a key has been released. */
  def keyReleased(e: KeyEvent): Unit
}
object XKeyListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    keyPressed: KeyEvent => Callback,
    keyReleased: KeyEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XKeyListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), keyPressed = js.Any.fromFunction1((t0: KeyEvent) => keyPressed(t0).runNow()), keyReleased = js.Any.fromFunction1((t0: KeyEvent) => keyReleased(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XKeyListener]
  }
  
  extension [Self <: XKeyListener](x: Self) {
    
    inline def setKeyPressed(value: KeyEvent => Callback): Self = StObject.set(x, "keyPressed", js.Any.fromFunction1((t0: KeyEvent) => value(t0).runNow()))
    
    inline def setKeyReleased(value: KeyEvent => Callback): Self = StObject.set(x, "keyReleased", js.Any.fromFunction1((t0: KeyEvent) => value(t0).runNow()))
  }
}
