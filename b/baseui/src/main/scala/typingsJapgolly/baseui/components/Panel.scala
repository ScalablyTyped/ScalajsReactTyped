package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.accordionTypesMod.PanelOverrides
import typingsJapgolly.baseui.anon.ExpandedBoolean
import typingsJapgolly.baseui.anon.childrenReactNodedisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  @JSImport("baseui/accordion", "Panel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def `aria-controls`(value: String): this.type = set("aria-controls", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ ExpandedBoolean => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onClick(value: /* e */ Event => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onKeyDown(value: /* e */ KeyboardEvent => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def overrides(value: PanelOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def renderPanelContent(value: Boolean): this.type = set("renderPanelContent", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Panel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: childrenReactNodedisabled): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
