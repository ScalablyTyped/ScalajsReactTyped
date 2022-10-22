package typingsJapgolly.atlaskitSingleSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitSingleSelect.anon.Event
import typingsJapgolly.atlaskitSingleSelect.atlaskitSingleSelectStrings.subtle
import typingsJapgolly.atlaskitSingleSelect.mod.GroupType
import typingsJapgolly.atlaskitSingleSelect.mod.ItemType
import typingsJapgolly.atlaskitSingleSelect.mod.Props
import typingsJapgolly.atlaskitSingleSelect.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleSelect {
  
  @JSImport("@atlaskit/single-select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def appearance(value: typingsJapgolly.atlaskitSingleSelect.atlaskitSingleSelectStrings.default | subtle): this.type = set("appearance", value.asInstanceOf[js.Any])
    
    inline def defaultSelected(value: ItemType): this.type = set("defaultSelected", value.asInstanceOf[js.Any])
    
    inline def droplistShouldFitContainer(value: Boolean): this.type = set("droplistShouldFitContainer", value.asInstanceOf[js.Any])
    
    inline def hasAutocomplete(value: Boolean): this.type = set("hasAutocomplete", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def invalidMessage(value: VdomNode): this.type = set("invalidMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def invalidMessageNull: this.type = set("invalidMessage", null)
    
    inline def invalidMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("invalidMessage", js.Array(value*))
    
    inline def invalidMessageVdomElement(value: VdomElement): this.type = set("invalidMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def isDefaultOpen(value: Boolean): this.type = set("isDefaultOpen", value.asInstanceOf[js.Any])
    
    inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    inline def isFirstChild(value: Boolean): this.type = set("isFirstChild", value.asInstanceOf[js.Any])
    
    inline def isInvalid(value: Boolean): this.type = set("isInvalid", value.asInstanceOf[js.Any])
    
    inline def isRequired(value: Boolean): this.type = set("isRequired", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[GroupType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: GroupType*): this.type = set("items", js.Array(value*))
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noMatchesFound(value: String): this.type = set("noMatchesFound", value.asInstanceOf[js.Any])
    
    inline def onFilterChange(value: /* filter */ String => Callback): this.type = set("onFilterChange", js.Any.fromFunction1((t0: /* filter */ String) => value(t0).runNow()))
    
    inline def onOpenChange(value: /* change */ Event => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* change */ Event) => value(t0).runNow()))
    
    inline def onSelected(value: /* item */ ItemType => Callback): this.type = set("onSelected", js.Any.fromFunction1((t0: /* item */ ItemType) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def shouldFitContainer(value: Boolean): this.type = set("shouldFitContainer", value.asInstanceOf[js.Any])
    
    inline def shouldFlip(value: Boolean): this.type = set("shouldFlip", value.asInstanceOf[js.Any])
    
    inline def shouldFocus(value: Boolean): this.type = set("shouldFocus", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SingleSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
