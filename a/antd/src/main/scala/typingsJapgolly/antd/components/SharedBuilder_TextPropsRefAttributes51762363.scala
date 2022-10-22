package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.OmitEllipsisConfigexpanda
import typingsJapgolly.antd.libTypographyBaseMod.BaseType
import typingsJapgolly.antd.libTypographyBaseMod.CopyConfig
import typingsJapgolly.antd.libTypographyBaseMod.EditConfig
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TextPropsRefAttributes51762363[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def code(value: Boolean): this.type = set("code", value.asInstanceOf[js.Any])
  
  inline def copyable(value: Boolean | CopyConfig): this.type = set("copyable", value.asInstanceOf[js.Any])
  
  inline def delete(value: Boolean): this.type = set("delete", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def editable(value: Boolean | EditConfig): this.type = set("editable", value.asInstanceOf[js.Any])
  
  inline def ellipsis(value: Boolean | OmitEllipsisConfigexpanda): this.type = set("ellipsis", value.asInstanceOf[js.Any])
  
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
