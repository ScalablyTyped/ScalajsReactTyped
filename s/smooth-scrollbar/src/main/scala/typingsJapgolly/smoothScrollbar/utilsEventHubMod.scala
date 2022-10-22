package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.EventTarget
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEventHubMod {
  
  @JSImport("smooth-scrollbar/utils/event-hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearEventsOn(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearEventsOn")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def eventScope(scrollbar: Scrollbar): js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventScope")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* elem */ EventTarget, /* events */ String, /* fn */ EventHandler, Unit]]
  
  type EventHandler = js.Function1[/* event */ Any, Unit]
}
