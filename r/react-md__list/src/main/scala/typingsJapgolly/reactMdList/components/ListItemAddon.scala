package typingsJapgolly.reactMdList.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonProps
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemAddon {
  
  @JSImport("@react-md/list", "ListItemAddon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    inline def addon(value: Node | Element): this.type = set("addon", value.asInstanceOf[js.Any])
    
    inline def addonAfter(value: Boolean): this.type = set("addonAfter", value.asInstanceOf[js.Any])
    
    inline def addonNull: this.type = set("addon", null)
    
    inline def addonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("addon", js.Array(value*))
    
    inline def addonVdomElement(value: VdomElement): this.type = set("addon", value.rawElement.asInstanceOf[js.Any])
    
    inline def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    inline def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    inline def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flexReverse(value: Boolean): this.type = set("flexReverse", value.asInstanceOf[js.Any])
    
    inline def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    inline def position(value: ListItemAddonPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
    
    inline def `type`(value: ListItemAddonType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemAddon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemAddonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
