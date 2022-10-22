package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.anon.IgnoreEdgeWidth
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.mod.TabbarRenderTab
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.auto
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.bottom
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.slide
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabbar {
  
  inline def apply(
    index: Double,
    renderTabs: (Double, typingsJapgolly.reactOnsenui.mod.Tabbar) => js.Array[TabbarRenderTab]
  ): Builder = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName & IgnoreEdgeWidth]))
  }
  
  @JSImport("react-onsenui", "Tabbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Tabbar] {
    
    inline def animation(value: none | slide): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def ignoreEdgeWidth(value: Double): this.type = set("ignoreEdgeWidth", value.asInstanceOf[js.Any])
    
    inline def onPostChange(value: Callback): this.type = set("onPostChange", value.toJsFn)
    
    inline def onPreChange(value: Callback): this.type = set("onPreChange", value.toJsFn)
    
    inline def onReactive(value: Callback): this.type = set("onReactive", value.toJsFn)
    
    inline def onSwipe(value: (/* index */ Double, /* animationOptions */ AnimationOptions) => Callback): this.type = set("onSwipe", js.Any.fromFunction2((t0: /* index */ Double, t1: /* animationOptions */ AnimationOptions) => (value(t0, t1)).runNow()))
    
    inline def position(value: bottom | top | auto): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
    
    inline def tabBorder(value: Boolean): this.type = set("tabBorder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassName & IgnoreEdgeWidth): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
