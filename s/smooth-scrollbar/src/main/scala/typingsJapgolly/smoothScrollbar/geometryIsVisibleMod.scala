package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryIsVisibleMod {
  
  @JSImport("smooth-scrollbar/geometry/is-visible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
