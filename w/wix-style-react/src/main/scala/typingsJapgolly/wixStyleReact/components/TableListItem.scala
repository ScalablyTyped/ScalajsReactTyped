package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.distTypesTableListItemMod.TableListItemColumn
import typingsJapgolly.wixStyleReact.distTypesTableListItemMod.TableListItemImperativeActions
import typingsJapgolly.wixStyleReact.distTypesTableListItemMod.TableListItemProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableListItem {
  
  inline def apply(options: js.Array[TableListItemColumn]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableListItemProps & RefAttributes[TableListItemImperativeActions]]))
  }
  
  @JSImport("wix-style-react", "TableListItem")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[TableListItemImperativeActions] {
    
    inline def checkbox(value: Boolean): this.type = set("checkbox", value.asInstanceOf[js.Any])
    
    inline def checkboxDisabled(value: Boolean): this.type = set("checkboxDisabled", value.asInstanceOf[js.Any])
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dragDisabled(value: Boolean): this.type = set("dragDisabled", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* e */ ReactFocusEventFrom[Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[Element]) => value(t0).runNow()))
    
    inline def onCheckboxChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onCheckboxChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onClick(value: js.Function): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: /* e */ KeyboardEvent => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: /* e */ KeyboardEvent) => value(t0).runNow()))
    
    inline def showDivider(value: Boolean): this.type = set("showDivider", value.asInstanceOf[js.Any])
    
    inline def verticalPadding(value: tiny | small | medium): this.type = set("verticalPadding", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableListItemProps & RefAttributes[TableListItemImperativeActions]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
