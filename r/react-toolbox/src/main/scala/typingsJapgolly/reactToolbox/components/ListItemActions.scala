package typingsJapgolly.reactToolbox.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsListListItemActionMod.ListItemActionTheme
import typingsJapgolly.reactToolbox.componentsListListItemActionsMod.ListItemActionsProps
import typingsJapgolly.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.left
import typingsJapgolly.reactToolbox.reactToolboxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemActions {
  
  @JSImport("react-toolbox/components/list", "ListItemActions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToolbox.componentsListMod.ListItemActions] {
    
    inline def theme(value: ListItemActionsTheme & ListItemActionTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: left | right): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemActions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
