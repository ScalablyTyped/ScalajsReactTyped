package typingsJapgolly.reactMdList.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonPosition
import typingsJapgolly.reactMdList.typesListItemAddonMod.ListItemAddonType
import typingsJapgolly.reactMdList.typesListItemChildrenMod.ListItemChildrenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemChildren {
  
  @JSImport("@react-md/list", "ListItemChildren")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def forceAddonWrap(value: Boolean): this.type = set("forceAddonWrap", value.asInstanceOf[js.Any])
    
    inline def leftAddon(value: VdomNode): this.type = set("leftAddon", value.rawNode.asInstanceOf[js.Any])
    
    inline def leftAddonNull: this.type = set("leftAddon", null)
    
    inline def leftAddonPosition(value: ListItemAddonPosition): this.type = set("leftAddonPosition", value.asInstanceOf[js.Any])
    
    inline def leftAddonType(value: ListItemAddonType): this.type = set("leftAddonType", value.asInstanceOf[js.Any])
    
    inline def leftAddonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftAddon", js.Array(value*))
    
    inline def leftAddonVdomElement(value: VdomElement): this.type = set("leftAddon", value.rawElement.asInstanceOf[js.Any])
    
    inline def primaryText(value: VdomNode): this.type = set("primaryText", value.rawNode.asInstanceOf[js.Any])
    
    inline def primaryTextNull: this.type = set("primaryText", null)
    
    inline def primaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("primaryText", js.Array(value*))
    
    inline def primaryTextVdomElement(value: VdomElement): this.type = set("primaryText", value.rawElement.asInstanceOf[js.Any])
    
    inline def rightAddon(value: VdomNode): this.type = set("rightAddon", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightAddonNull: this.type = set("rightAddon", null)
    
    inline def rightAddonPosition(value: ListItemAddonPosition): this.type = set("rightAddonPosition", value.asInstanceOf[js.Any])
    
    inline def rightAddonType(value: ListItemAddonType): this.type = set("rightAddonType", value.asInstanceOf[js.Any])
    
    inline def rightAddonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightAddon", js.Array(value*))
    
    inline def rightAddonVdomElement(value: VdomElement): this.type = set("rightAddon", value.rawElement.asInstanceOf[js.Any])
    
    inline def secondaryText(value: VdomNode): this.type = set("secondaryText", value.rawNode.asInstanceOf[js.Any])
    
    inline def secondaryTextClassName(value: String): this.type = set("secondaryTextClassName", value.asInstanceOf[js.Any])
    
    inline def secondaryTextNull: this.type = set("secondaryText", null)
    
    inline def secondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("secondaryText", js.Array(value*))
    
    inline def secondaryTextVdomElement(value: VdomElement): this.type = set("secondaryText", value.rawElement.asInstanceOf[js.Any])
    
    inline def textChildren(value: Boolean): this.type = set("textChildren", value.asInstanceOf[js.Any])
    
    inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemChildren.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemChildrenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
