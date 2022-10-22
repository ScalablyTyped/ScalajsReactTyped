package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.Collapse
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.collapse
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.landscape
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.left
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.overlay
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.portrait
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.right
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SplitterSide {
  
  @JSImport("react-onsenui", "SplitterSide")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.SplitterSide] {
    
    inline def animation(value: overlay | default): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapse(value: portrait | landscape | Boolean): this.type = set("collapse", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def mode(value: collapse | split): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* e */ js.UndefOr[Event] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def onModeChange(value: /* e */ js.UndefOr[Event] => Callback): this.type = set("onModeChange", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def onOpen(value: /* e */ js.UndefOr[Event] => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def onPreClose(value: /* e */ js.UndefOr[Event] => Callback): this.type = set("onPreClose", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def onPreOpen(value: /* e */ js.UndefOr[Event] => Callback): this.type = set("onPreOpen", js.Any.fromFunction1((t0: /* e */ js.UndefOr[Event]) => value(t0).runNow()))
    
    inline def openThreshold(value: Double): this.type = set("openThreshold", value.asInstanceOf[js.Any])
    
    inline def side(value: left | right): this.type = set("side", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def swipeTargetWidth(value: Double): this.type = set("swipeTargetWidth", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SplitterSide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & Collapse): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
