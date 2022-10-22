package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrap.libTabContainerMod.TabContainerProps
import typingsJapgolly.reactBootstrap.libTabContentMod.TabContentProps
import typingsJapgolly.reactBootstrap.libTabMod.TabProps
import typingsJapgolly.reactBootstrap.libTabPaneMod.TabPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  object Container {
    
    @JSImport("react-bootstrap", "Tab.Container")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Container.type): SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.mod.Tab.Container] = new SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.mod.Tab.Container](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabContainerProps): SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.mod.Tab.Container] = new SharedBuilder_TabContainerProps1178728042[typingsJapgolly.reactBootstrap.mod.Tab.Container](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("react-bootstrap", "Tab.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_TabContentProps1043271847[typingsJapgolly.reactBootstrap.mod.Tab.Content] = new SharedBuilder_TabContentProps1043271847[typingsJapgolly.reactBootstrap.mod.Tab.Content](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabContentProps): SharedBuilder_TabContentProps1043271847[typingsJapgolly.reactBootstrap.mod.Tab.Content] = new SharedBuilder_TabContentProps1043271847[typingsJapgolly.reactBootstrap.mod.Tab.Content](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Pane {
    
    @JSImport("react-bootstrap", "Tab.Pane")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Pane.type): SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.mod.Tab.Pane] = new SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.mod.Tab.Pane](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.mod.Tab.Pane] = new SharedBuilder_TabPaneProps1024747231[typingsJapgolly.reactBootstrap.mod.Tab.Pane](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-bootstrap", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrap.mod.Tab] {
    
    inline def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    inline def eventKey(value: Any): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: /* node */ HTMLElement => Any): this.type = set("onEnter", js.Any.fromFunction1(value))
    
    inline def onEntered(value: /* node */ HTMLElement => Any): this.type = set("onEntered", js.Any.fromFunction1(value))
    
    inline def onEntering(value: /* node */ HTMLElement => Any): this.type = set("onEntering", js.Any.fromFunction1(value))
    
    inline def onExit(value: /* node */ HTMLElement => Any): this.type = set("onExit", js.Any.fromFunction1(value))
    
    inline def onExited(value: /* node */ HTMLElement => Any): this.type = set("onExited", js.Any.fromFunction1(value))
    
    inline def onExiting(value: /* node */ HTMLElement => Any): this.type = set("onExiting", js.Any.fromFunction1(value))
    
    inline def tabClassName(value: String): this.type = set("tabClassName", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
