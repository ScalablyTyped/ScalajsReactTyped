package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Tabs.TabProps
import typingsJapgolly.materialUi.MaterialUI.Tabs.TabsProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("material-ui", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Tabs] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentContainerClassName(value: String): this.type = set("contentContainerClassName", value.asInstanceOf[js.Any])
    
    inline def contentContainerStyle(value: CSSProperties): this.type = set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def initialSelectedIndex(value: Double): this.type = set("initialSelectedIndex", value.asInstanceOf[js.Any])
    
    inline def inkBarStyle(value: CSSProperties): this.type = set("inkBarStyle", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* value */ Any, /* e */ ReactEventFrom[js.Object & Element], Component[TabProps & js.Object, js.Object]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* value */ Any, t1: /* e */ ReactEventFrom[js.Object & Element], t2: Component[TabProps & js.Object, js.Object]) => (value(t0, t1, t2)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabItemContainerStyle(value: CSSProperties): this.type = set("tabItemContainerStyle", value.asInstanceOf[js.Any])
    
    inline def tabTemplate(value: ComponentClassP[Any & js.Object]): this.type = set("tabTemplate", value.asInstanceOf[js.Any])
    
    inline def tabTemplateStyle(value: CSSProperties): this.type = set("tabTemplateStyle", value.asInstanceOf[js.Any])
    
    inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
