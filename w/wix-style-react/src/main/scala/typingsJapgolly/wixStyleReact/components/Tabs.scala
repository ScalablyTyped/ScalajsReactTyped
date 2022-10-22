package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTabsMod.TabsProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings._empty
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.compact
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.compactSide
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.uniformFull
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.uniformSide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  inline def apply(items: js.Array[typingsJapgolly.wixStyleReact.distTypesTabsMod.Item]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabsProps]))
  }
  
  @JSImport("wix-style-react", "Tabs")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Tabs] {
    
    inline def activeId(value: String | Double): this.type = set("activeId", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def hasDivider(value: Boolean): this.type = set("hasDivider", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: String | Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* item */ typingsJapgolly.wixStyleReact.distTypesTabsMod.Item => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* item */ typingsJapgolly.wixStyleReact.distTypesTabsMod.Item) => value(t0).runNow()))
    
    inline def sideContent(value: VdomNode): this.type = set("sideContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def sideContentNull: this.type = set("sideContent", null)
    
    inline def sideContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sideContent", js.Array(value*))
    
    inline def sideContentVdomElement(value: VdomElement): this.type = set("sideContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def `type`(value: _empty | compact | compactSide | uniformSide | uniformFull): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
