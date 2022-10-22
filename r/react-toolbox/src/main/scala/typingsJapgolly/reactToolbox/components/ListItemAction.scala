package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsListListItemActionMod.ListItemActionProps
import typingsJapgolly.reactToolbox.componentsListListItemActionMod.ListItemActionTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemAction {
  
  @JSImport("react-toolbox/components/list", "ListItemAction")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToolbox.componentsListMod.ListItemAction] {
    
    inline def action(value: VdomNode): this.type = set("action", value.rawNode.asInstanceOf[js.Any])
    
    inline def actionNull: this.type = set("action", null)
    
    inline def actionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("action", js.Array(value*))
    
    inline def actionVdomElement(value: VdomElement): this.type = set("action", value.rawElement.asInstanceOf[js.Any])
    
    inline def theme(value: ListItemActionTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemAction.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemActionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
