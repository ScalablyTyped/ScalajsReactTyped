package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.wixStyleReact.distTypesTagMod.TagProps
import typingsJapgolly.wixStyleReact.distTypesTagMod.TagSize
import typingsJapgolly.wixStyleReact.distTypesTagMod.TagTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagProps]))
  }
  
  @JSImport("wix-style-react", "Tag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Tag] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: MaxWidth[String | Double]): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* id */ String, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onRemove(value: /* id */ String => Callback): this.type = set("onRemove", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
    
    inline def removable(value: Boolean): this.type = set("removable", value.asInstanceOf[js.Any])
    
    inline def size(value: TagSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def theme(value: TagTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def thumb(value: VdomElement): this.type = set("thumb", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
