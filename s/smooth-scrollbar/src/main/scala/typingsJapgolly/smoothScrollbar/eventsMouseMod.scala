package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMouseMod {
  
  @JSImport("smooth-scrollbar/events/mouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mouseHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
