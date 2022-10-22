package typingsJapgolly.jstree

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSTreeStaticDefaultsCoreKeyboard extends StObject {
  
  @JSName("*")
  def Asterisk(e: Event): Unit
  
  def `ctrl-space`(e: Event): Unit
  
  def down(e: Event): Unit
  
  def end(e: Event): Unit
  
  def enter(e: Event): Unit
  
  def f2(e: Event): Unit
  
  def home(e: Event): Unit
  
  def left(e: Event): Unit
  
  def right(e: Event): Unit
  
  def up(e: Event): Unit
}
object JSTreeStaticDefaultsCoreKeyboard {
  
  inline def apply(
    Asterisk: Event => Callback,
    `ctrl-space`: Event => Callback,
    down: Event => Callback,
    end: Event => Callback,
    enter: Event => Callback,
    f2: Event => Callback,
    home: Event => Callback,
    left: Event => Callback,
    right: Event => Callback,
    up: Event => Callback
  ): JSTreeStaticDefaultsCoreKeyboard = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction1((t0: Event) => down(t0).runNow()), end = js.Any.fromFunction1((t0: Event) => end(t0).runNow()), enter = js.Any.fromFunction1((t0: Event) => enter(t0).runNow()), f2 = js.Any.fromFunction1((t0: Event) => f2(t0).runNow()), home = js.Any.fromFunction1((t0: Event) => home(t0).runNow()), left = js.Any.fromFunction1((t0: Event) => left(t0).runNow()), right = js.Any.fromFunction1((t0: Event) => right(t0).runNow()), up = js.Any.fromFunction1((t0: Event) => up(t0).runNow()))
    __obj.updateDynamic("*")(js.Any.fromFunction1((t0: Event) => Asterisk(t0).runNow()))
    __obj.updateDynamic("ctrl-space")(js.Any.fromFunction1((t0: Event) => `ctrl-space`(t0).runNow()))
    __obj.asInstanceOf[JSTreeStaticDefaultsCoreKeyboard]
  }
  
  extension [Self <: JSTreeStaticDefaultsCoreKeyboard](x: Self) {
    
    inline def setAsterisk(value: Event => Callback): Self = StObject.set(x, "*", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def `setCtrl-space`(value: Event => Callback): Self = StObject.set(x, "ctrl-space", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setDown(value: Event => Callback): Self = StObject.set(x, "down", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setEnd(value: Event => Callback): Self = StObject.set(x, "end", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setEnter(value: Event => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setF2(value: Event => Callback): Self = StObject.set(x, "f2", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setHome(value: Event => Callback): Self = StObject.set(x, "home", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setLeft(value: Event => Callback): Self = StObject.set(x, "left", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setRight(value: Event => Callback): Self = StObject.set(x, "right", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setUp(value: Event => Callback): Self = StObject.set(x, "up", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
  }
}
