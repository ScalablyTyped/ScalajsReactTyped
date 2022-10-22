package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsTouchMod {
  
  @JSImport("smooth-scrollbar/events/touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def touchHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
