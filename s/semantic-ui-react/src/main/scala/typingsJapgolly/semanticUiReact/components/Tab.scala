package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabMod.TabProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesTabTabPaneMod.TabPaneProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  object Pane {
    
    @JSImport("semantic-ui-react", "Tab.Pane")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Pane.type): SharedBuilder_TabPaneProps33467167 = new SharedBuilder_TabPaneProps33467167(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TabPaneProps): SharedBuilder_TabPaneProps33467167 = new SharedBuilder_TabPaneProps33467167(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("semantic-ui-react", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeIndex(value: Double | String): this.type = set("activeIndex", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def defaultActiveIndex(value: Double | String): this.type = set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    inline def grid(value: Any): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def menu(value: Any): this.type = set("menu", value.asInstanceOf[js.Any])
    
    inline def menuPosition(value: left | right): this.type = set("menuPosition", value.asInstanceOf[js.Any])
    
    inline def onTabChange(value: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ TabProps) => Callback): this.type = set("onTabChange", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLDivElement], t1: /* data */ TabProps) => (value(t0, t1)).runNow()))
    
    inline def panes(value: js.Array[typingsJapgolly.semanticUiReact.anon.MenuItem]): this.type = set("panes", value.asInstanceOf[js.Any])
    
    inline def panesVarargs(value: typingsJapgolly.semanticUiReact.anon.MenuItem*): this.type = set("panes", js.Array(value*))
    
    inline def renderActiveOnly(value: Boolean): this.type = set("renderActiveOnly", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
