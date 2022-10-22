package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.AutoRefresh
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.horizontal
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("react-onsenui", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Carousel] {
    
    inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def autoRefresh(value: Boolean): this.type = set("autoRefresh", value.asInstanceOf[js.Any])
    
    inline def autoScroll(value: Boolean): this.type = set("autoScroll", value.asInstanceOf[js.Any])
    
    inline def autoScrollRatio(value: Double): this.type = set("autoScrollRatio", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def itemHeight(value: Double | String): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    inline def itemWidth(value: Double | String): this.type = set("itemWidth", value.asInstanceOf[js.Any])
    
    inline def onOverscroll(value: Callback): this.type = set("onOverscroll", value.toJsFn)
    
    inline def onPostChange(value: Callback): this.type = set("onPostChange", value.toJsFn)
    
    inline def onRefresh(value: Callback): this.type = set("onRefresh", value.toJsFn)
    
    inline def overscrollable(value: Boolean): this.type = set("overscrollable", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean): this.type = set("swipeable", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & AutoRefresh): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
