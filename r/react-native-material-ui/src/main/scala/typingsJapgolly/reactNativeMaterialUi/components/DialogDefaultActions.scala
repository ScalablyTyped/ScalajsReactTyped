package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeMaterialUi.anon.DefaultActionsContainer
import typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogDefaultActions {
  
  inline def apply(actions: js.Array[String], onActionPress: String => Callback): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1((t0: String) => onActionPress(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogDefaultActionsProps]))
  }
  
  @JSImport("react-native-material-ui", "DialogDefaultActions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.DialogDefaultActions] {
    
    inline def style(value: DefaultActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogDefaultActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
