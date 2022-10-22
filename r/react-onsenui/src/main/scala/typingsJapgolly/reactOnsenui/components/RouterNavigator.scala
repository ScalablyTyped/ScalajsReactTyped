package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.anon.OnPostPop
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouterNavigator {
  
  inline def apply(
    onPostPop: Callback,
    onPostPush: Callback,
    renderPage: (Any, js.UndefOr[typingsJapgolly.reactOnsenui.mod.Navigator]) => Element,
    routeConfig: Any
  ): Builder = {
    val __props = js.Dynamic.literal(onPostPop = onPostPop.toJsFn, onPostPush = onPostPush.toJsFn, renderPage = js.Any.fromFunction2(renderPage), routeConfig = routeConfig.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName & OnPostPop]))
  }
  
  @JSImport("react-onsenui", "RouterNavigator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.RouterNavigator] {
    
    inline def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def swipePop(value: Callback): this.type = set("swipePop", value.toJsFn)
    
    inline def swipeTargetWidth(value: Double): this.type = set("swipeTargetWidth", value.asInstanceOf[js.Any])
    
    inline def swipeable(value: Boolean | force): this.type = set("swipeable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassName & OnPostPop): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
