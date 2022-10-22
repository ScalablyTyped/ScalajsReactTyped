package typingsJapgolly.storybookAddonActions.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonActions.distTs3Dot9ContainersActionLoggerMod.ActionLoggerProps
import typingsJapgolly.storybookAddonActions.distTs3Dot9ContainersActionLoggerMod.default
import typingsJapgolly.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionLogger {
  
  inline def apply(active: Boolean, api: API): Default[default] = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[ActionLoggerProps]))
  }
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/containers/ActionLogger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ActionLoggerProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
