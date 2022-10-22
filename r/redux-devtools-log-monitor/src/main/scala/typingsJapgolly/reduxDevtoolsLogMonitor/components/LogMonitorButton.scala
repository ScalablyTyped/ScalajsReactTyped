package typingsJapgolly.reduxDevtoolsLogMonitor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorButtonMod.Props
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorButtonMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMonitorButton {
  
  inline def apply(enabled: Boolean, onClick: Callback, theme: Base16Theme): Default[default] = {
    val __props = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onClick = onClick.toJsFn, theme = theme.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorButton", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
