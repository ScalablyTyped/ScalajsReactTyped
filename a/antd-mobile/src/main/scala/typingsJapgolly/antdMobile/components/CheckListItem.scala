package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorActivebackgroundcolor
import typingsJapgolly.antdMobile.esComponentsCheckListCheckListItemMod.CheckListItemProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckListItem {
  
  inline def apply(
    style: js.UndefOr[CSSPropertiesPartialRecorActivebackgroundcolor] & (js.UndefOr[CSSProperties & (Partial[Record[scala.Nothing, String]])]),
    value: String
  ): SharedBuilder_CheckListItemProps850057891 = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new SharedBuilder_CheckListItemProps850057891(js.Array(this.component, __props.asInstanceOf[CheckListItemProps]))
  }
  
  @JSImport("antd-mobile/es/components/check-list/check-list-item", "CheckListItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CheckListItemProps): SharedBuilder_CheckListItemProps850057891 = new SharedBuilder_CheckListItemProps850057891(js.Array(this.component, p.asInstanceOf[js.Any]))
}
