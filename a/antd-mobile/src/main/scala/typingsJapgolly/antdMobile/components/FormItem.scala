package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorActivebackgroundcolor
import typingsJapgolly.antdMobile.esComponentsFormFormItemMod.FormItemProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormItem {
  
  inline def apply(
    style: js.UndefOr[CSSPropertiesPartialRecorActivebackgroundcolor] & (js.UndefOr[CSSProperties & (Partial[Record[scala.Nothing, String]])])
  ): SharedBuilder_FormItemProps868188908 = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new SharedBuilder_FormItemProps868188908(js.Array(this.component, __props.asInstanceOf[FormItemProps]))
  }
  
  @JSImport("antd-mobile/es/components/form/form-item", "FormItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormItemProps): SharedBuilder_FormItemProps868188908 = new SharedBuilder_FormItemProps868188908(js.Array(this.component, p.asInstanceOf[js.Any]))
}
