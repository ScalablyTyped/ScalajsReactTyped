package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesAnalyticsLayoutMod.AnalyticsLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnalyticsLayout {
  
  inline def apply(
    children: (/* item */ Any, /* index */ Double, /* rowItemsCount */ Double) => Node,
    items: js.Array[Any]
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction3(children), items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AnalyticsLayoutProps]))
  }
  
  @JSImport("wix-style-react", "AnalyticsLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.AnalyticsLayout] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnalyticsLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
