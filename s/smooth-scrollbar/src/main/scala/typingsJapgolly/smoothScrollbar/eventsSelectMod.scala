package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsSelectMod {
  
  @JSImport("smooth-scrollbar/events/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def selectHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
