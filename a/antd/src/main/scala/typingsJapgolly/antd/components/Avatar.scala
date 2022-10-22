package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings._empty
import typingsJapgolly.antd.antdStrings.`use-credentials`
import typingsJapgolly.antd.antdStrings.anonymous
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.focus
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.antd.libAvatarAvatarMod.AvatarProps
import typingsJapgolly.antd.libAvatarGroupMod.GroupProps
import typingsJapgolly.antd.libAvatarSizeContextMod.AvatarSize
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  object Group {
    
    @JSImport("antd", "Avatar.Group")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def maxCount(value: Double): this.type = set("maxCount", value.asInstanceOf[js.Any])
      
      inline def maxPopoverPlacement(value: top | bottom): this.type = set("maxPopoverPlacement", value.asInstanceOf[js.Any])
      
      inline def maxPopoverTrigger(value: hover | focus | click): this.type = set("maxPopoverTrigger", value.asInstanceOf[js.Any])
      
      inline def maxStyle(value: CSSProperties): this.type = set("maxStyle", value.asInstanceOf[js.Any])
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Group.type): typingsJapgolly.antd.components.Avatar.Group.Builder = new typingsJapgolly.antd.components.Avatar.Group.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: GroupProps): typingsJapgolly.antd.components.Avatar.Group.Builder = new typingsJapgolly.antd.components.Avatar.Group.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLSpanElement] {
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: _empty | anonymous | `use-credentials`): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def onError(value: CallbackTo[Boolean]): this.type = set("onError", value.toJsFn)
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def shape(value: circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: AvatarSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def src(value: VdomNode): this.type = set("src", value.rawNode.asInstanceOf[js.Any])
    
    inline def srcNull: this.type = set("src", null)
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
    
    inline def srcVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("src", js.Array(value*))
    
    inline def srcVdomElement(value: VdomElement): this.type = set("src", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarProps & RefAttributes[HTMLSpanElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
