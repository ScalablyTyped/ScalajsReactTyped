package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libTransferListItemMod.ListItemProps
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  inline def apply(item: KeyWiseTransferItem, onClick: KeyWiseTransferItem => Callback, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: KeyWiseTransferItem) => onClick(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ ListItemProps[KeyWiseTransferItem]]))
  }
  
  @JSImport("antd/lib/transfer/ListItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onRemove(value: KeyWiseTransferItem => Callback): this.type = set("onRemove", js.Any.fromFunction1((t0: KeyWiseTransferItem) => value(t0).runNow()))
    
    inline def renderedEl(value: VdomNode): this.type = set("renderedEl", value.rawNode.asInstanceOf[js.Any])
    
    inline def renderedElNull: this.type = set("renderedEl", null)
    
    inline def renderedElVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("renderedEl", js.Array(value*))
    
    inline def renderedElVdomElement(value: VdomElement): this.type = set("renderedEl", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderedText(value: String | Double): this.type = set("renderedText", value.asInstanceOf[js.Any])
    
    inline def showRemove(value: Boolean): this.type = set("showRemove", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ ListItemProps[KeyWiseTransferItem]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
