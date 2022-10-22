package typingsJapgolly.guacamoleClient.mod

import org.scalajs.dom.HTMLDocument
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "Keyboard")
@js.native
/**
  * @param element
  * The Element to use to provide keyboard events. If omitted, at least one
  * Element must be manually provided through the listenTo() function for
  * the Guacamole.Keyboard instance to have any effect.
  */
open class Keyboard ()
  extends typingsJapgolly.guacamoleClient.libKeyboardMod.Keyboard {
  def this(element: HTMLDocument) = this()
  def this(element: HTMLElement) = this()
}
object Keyboard {
  
  @JSImport("guacamole-client", "Keyboard.ModifierState")
  @js.native
  open class ModifierState ()
    extends typingsJapgolly.guacamoleClient.libKeyboardMod.Keyboard.ModifierState
  /* static members */
  object ModifierState {
    
    @JSImport("guacamole-client", "Keyboard.ModifierState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the modifier state applicable to the keyboard event given.
      * @param event The keyboard event to read.
      * @returns The current state of keyboard modifiers.
      */
    inline def fromKeyboardEvent(event: KeyboardEvent): typingsJapgolly.guacamoleClient.libKeyboardMod.Keyboard.ModifierState = ^.asInstanceOf[js.Dynamic].applyDynamic("fromKeyboardEvent")(event.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.guacamoleClient.libKeyboardMod.Keyboard.ModifierState]
  }
}
