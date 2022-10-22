package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.anon.InitialRoute
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.mod.NavigatorAnimationTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Navigator {
  
  inline def apply(renderPage: (Any, js.UndefOr[typingsJapgolly.reactOnsenui.mod.Navigator]) => Element): Builder = {
    val __props = js.Dynamic.literal(renderPage = js.Any.fromFunction2(renderPage))
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName & InitialRoute]))
  }
  
  @JSImport("react-onsenui", "Navigator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Navigator] {
    
    inline def animation(value: NavigatorAnimationTypes): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def initialRoute(value: Any): this.type = set("initialRoute", value.asInstanceOf[js.Any])
    
    inline def initialRouteStack(value: js.Array[String]): this.type = set("initialRouteStack", value.asInstanceOf[js.Any])
    
    inline def initialRouteStackVarargs(value: String*): this.type = set("initialRouteStack", js.Array(value*))
    
    inline def onPostPop(value: Callback): this.type = set("onPostPop", value.toJsFn)
    
    inline def onPostPush(value: Callback): this.type = set("onPostPush", value.toJsFn)
    
    inline def onPrePop(value: Callback): this.type = set("onPrePop", value.toJsFn)
    
    inline def onPrePush(value: Callback): this.type = set("onPrePush", value.toJsFn)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassName & InitialRoute): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
