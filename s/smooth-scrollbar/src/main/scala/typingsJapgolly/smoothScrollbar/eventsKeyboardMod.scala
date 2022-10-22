package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsKeyboardMod {
  
  @JSImport("smooth-scrollbar/events/keyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyboardHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
