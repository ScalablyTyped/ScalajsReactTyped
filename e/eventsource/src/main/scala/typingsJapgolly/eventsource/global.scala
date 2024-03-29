package typingsJapgolly.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MessageEvent")
  @js.native
  open class MessageEvent[T] protected ()
    extends StObject
       with typingsJapgolly.eventsource.MessageEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit[T]) = this()
  }
}
