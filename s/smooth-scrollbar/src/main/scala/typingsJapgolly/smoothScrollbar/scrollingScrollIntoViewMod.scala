package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.HTMLElement
import typingsJapgolly.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollingScrollIntoViewMod {
  
  @JSImport("smooth-scrollbar/scrolling/scroll-into-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scrollIntoView(scrollbar: Scrollbar, elem: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scrollIntoView(
    scrollbar: Scrollbar,
    elem: HTMLElement,
    hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom: PartialScrollIntoViewOpti
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any], hasAlignToTopOnlyScrollIfNeededOffsetTopOffsetLeftOffsetBottom.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
