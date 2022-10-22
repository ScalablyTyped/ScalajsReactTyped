package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libCommentMod.CommentProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comment {
  
  @JSImport("antd", "Comment")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: js.Array[japgolly.scalajs.react.facade.React.Node]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: japgolly.scalajs.react.facade.React.Node*): this.type = set("actions", js.Array(value*))
    
    inline def author(value: VdomNode): this.type = set("author", value.rawNode.asInstanceOf[js.Any])
    
    inline def authorNull: this.type = set("author", null)
    
    inline def authorVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("author", js.Array(value*))
    
    inline def authorVdomElement(value: VdomElement): this.type = set("author", value.rawElement.asInstanceOf[js.Any])
    
    inline def avatar(value: VdomNode): this.type = set("avatar", value.rawNode.asInstanceOf[js.Any])
    
    inline def avatarNull: this.type = set("avatar", null)
    
    inline def avatarVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("avatar", js.Array(value*))
    
    inline def avatarVdomElement(value: VdomElement): this.type = set("avatar", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def datetime(value: VdomNode): this.type = set("datetime", value.rawNode.asInstanceOf[js.Any])
    
    inline def datetimeNull: this.type = set("datetime", null)
    
    inline def datetimeVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("datetime", js.Array(value*))
    
    inline def datetimeVdomElement(value: VdomElement): this.type = set("datetime", value.rawElement.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Comment.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CommentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
