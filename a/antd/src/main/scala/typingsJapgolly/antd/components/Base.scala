package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libTypographyBaseMod.BaseType
import typingsJapgolly.antd.libTypographyBaseMod.CopyConfig
import typingsJapgolly.antd.libTypographyBaseMod.EditConfig
import typingsJapgolly.antd.libTypographyBaseMod.EllipsisConfig
import typingsJapgolly.antd.libTypographyBaseMod.InternalBlockProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  inline def apply(component: String): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InternalBlockProps & RefAttributes[Any]]))
  }
  
  @JSImport("antd/lib/typography/Base", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
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
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def strong(value: Boolean): this.type = set("strong", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: BaseType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underline(value: Boolean): this.type = set("underline", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InternalBlockProps & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
