package typingsJapgolly.reactRouterNavigationCore.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactRouterNavigationCore.mod.TabStackProps
import typingsJapgolly.reactRouterNavigationCore.mod.TabsRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabStack {
  
  inline def apply(render: TabsRendererProps => Node): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[TabStackProps]))
  }
  
  @JSImport("react-router-navigation-core", "TabStack")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRouterNavigationCore.mod.TabStack] {
    
    inline def children(value: js.Array[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Node*): this.type = set("children", js.Array(value*))
    
    inline def forceSync(value: Boolean): this.type = set("forceSync", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: TabStackProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
