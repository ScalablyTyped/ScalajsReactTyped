package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcTable.anon.`0`
import typingsJapgolly.rcTable.libStickyScrollBarMod.StickyScrollBarProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StickyScrollBar {
  
  inline def apply(
    container: HTMLElement | Window,
    offsetScroll: Double,
    onScroll: `0` => Callback,
    scrollBodyRef: RefHandle[HTMLDivElement]
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(container = container.asInstanceOf[js.Any], offsetScroll = offsetScroll.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1((t0: `0`) => onScroll(t0).runNow()), scrollBodyRef = scrollBodyRef.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[StickyScrollBarProps & RefAttributes[Any]]))
  }
  
  @JSImport("rc-table/lib/stickyScrollBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: StickyScrollBarProps & RefAttributes[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
