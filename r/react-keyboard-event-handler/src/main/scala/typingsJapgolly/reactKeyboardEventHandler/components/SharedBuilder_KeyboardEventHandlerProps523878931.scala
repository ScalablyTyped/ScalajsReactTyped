package typingsJapgolly.reactKeyboardEventHandler.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keydown
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keypress
import typingsJapgolly.reactKeyboardEventHandler.reactKeyboardEventHandlerStrings.keyup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_KeyboardEventHandlerProps523878931 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def handleEventType(value: keydown | keyup | keypress): this.type = set("handleEventType", value.asInstanceOf[js.Any])
  
  inline def handleFocusableElements(value: Boolean): this.type = set("handleFocusableElements", value.asInstanceOf[js.Any])
  
  inline def handleKeys(value: js.Array[String]): this.type = set("handleKeys", value.asInstanceOf[js.Any])
  
  inline def handleKeysVarargs(value: String*): this.type = set("handleKeys", js.Array(value*))
  
  inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
  
  inline def isExclusive(value: Boolean): this.type = set("isExclusive", value.asInstanceOf[js.Any])
  
  inline def onKeyEvent(value: (/* key */ String, /* event */ KeyboardEvent) => Callback): this.type = set("onKeyEvent", js.Any.fromFunction2((t0: /* key */ String, t1: /* event */ KeyboardEvent) => (value(t0, t1)).runNow()))
}
