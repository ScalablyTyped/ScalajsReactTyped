package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdInts.`1`
import typingsJapgolly.antd.antdInts.`2`
import typingsJapgolly.antd.antdInts.`3`
import typingsJapgolly.antd.antdInts.`4`
import typingsJapgolly.antd.antdInts.`5`
import typingsJapgolly.antd.libTypographyBaseMod.BaseType
import typingsJapgolly.antd.libTypographyBaseMod.CopyConfig
import typingsJapgolly.antd.libTypographyBaseMod.EditConfig
import typingsJapgolly.antd.libTypographyBaseMod.EllipsisConfig
import typingsJapgolly.antd.libTypographyLinkMod.LinkProps
import typingsJapgolly.antd.libTypographyParagraphMod.ParagraphProps
import typingsJapgolly.antd.libTypographyTextMod.TextProps
import typingsJapgolly.antd.libTypographyTitleMod.TitleProps
import typingsJapgolly.antd.libTypographyTypographyMod.TypographyProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Typography {
  
  object Link {
    
    @JSImport("antd", "Typography.Link")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Link.type): SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: LinkProps & RefAttributes[HTMLElement]): SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement] = new SharedBuilder_LinkPropsRefAttributes1051528344[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Paragraph {
    
    @JSImport("antd", "Typography.Paragraph")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLDivElement] {
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
      
      inline def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
      
      inline def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
      
      inline def ellipsis(value: Boolean | EllipsisConfig): this.type = set("ellipsis", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
      
      inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      inline def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
      
      inline def onClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def strong(value: Boolean): this.type = set("strong", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Paragraph.type): typingsJapgolly.antd.components.Typography.Paragraph.Builder = new typingsJapgolly.antd.components.Typography.Paragraph.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ParagraphProps & RefAttributes[HTMLDivElement]): typingsJapgolly.antd.components.Typography.Paragraph.Builder = new typingsJapgolly.antd.components.Typography.Paragraph.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Text {
    
    @JSImport("antd", "Typography.Text")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Text.type): SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TextProps & RefAttributes[HTMLSpanElement]): SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement] = new SharedBuilder_TextPropsRefAttributes51762363[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("antd", "Typography.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[HTMLHeadingElement] {
      
      inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
      
      inline def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
      
      inline def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
      
      inline def ellipsis(value: Boolean | EllipsisConfig): this.type = set("ellipsis", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def italic(value: Boolean): this.type = set("italic", value.asInstanceOf[js.Any])
      
      inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
      
      inline def level(value: `1` | `2` | `3` | `4` | `5`): this.type = set("level", value.asInstanceOf[js.Any])
      
      inline def mark(value: Boolean): this.type = set("mark", value.asInstanceOf[js.Any])
      
      inline def onClick(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
      
      inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
      
      inline def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Title.type): typingsJapgolly.antd.components.Typography.Title.Builder = new typingsJapgolly.antd.components.Typography.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TitleProps & RefAttributes[HTMLHeadingElement]): typingsJapgolly.antd.components.Typography.Title.Builder = new typingsJapgolly.antd.components.Typography.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Typography")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Typography.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TypographyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
