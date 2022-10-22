package typingsJapgolly.reduxDevtoolsLogMonitor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryActionMod.Props
import typingsJapgolly.reduxDevtoolsLogMonitor.libLogMonitorEntryActionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LogMonitorEntryAction {
  
  inline def apply[A /* <: Action[Any] */](
    action: A,
    collapsed: Boolean,
    expandActionRoot: Boolean,
    onClick: ReactMouseEventFrom[HTMLDivElement & Element] => Callback,
    style: CSSProperties,
    theme: Base16Theme
  ): Builder[A] = {
    val __props = js.Dynamic.literal(action = action.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => onClick(t0).runNow()), style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Builder[A](js.Array(this.component, __props.asInstanceOf[Props[A]]))
  }
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryAction", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[A /* <: Action[Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[A]]
  
  def withProps[A /* <: Action[Any] */](p: Props[A]): Builder[A] = new Builder[A](js.Array(this.component, p.asInstanceOf[js.Any]))
}
