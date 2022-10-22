package typingsJapgolly.reduxDevtoolsLogMonitor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorEntryActionMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorEntryAction", JSImport.Default)
  @js.native
  open class default[A /* <: Action[Any] */] () extends LogMonitorAction[A]
  
  @js.native
  trait LogMonitorAction[A /* <: Action[Any] */]
    extends Component[Props[A], js.Object, Any] {
    
    def renderPayload(payload: Record[String, Any]): Element = js.native
    
    def shouldExpandNode(keyPath: js.Array[String | Double], data: Any, level: Double): Boolean = js.native
  }
  
  trait Props[A /* <: Action[Any] */] extends StObject {
    
    var action: A
    
    var collapsed: Boolean
    
    var expandActionRoot: Boolean
    
    var onClick: MouseEventHandler[HTMLDivElement]
    
    var style: CSSProperties
    
    var theme: Base16Theme
  }
  object Props {
    
    inline def apply[A /* <: Action[Any] */](
      action: A,
      collapsed: Boolean,
      expandActionRoot: Boolean,
      onClick: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback,
      style: CSSProperties,
      theme: Base16Theme
    ): Props[A] = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], expandActionRoot = expandActionRoot.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => onClick(t0).runNow()), style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[A]]
    }
    
    extension [Self <: Props[?], A /* <: Action[Any] */](x: Self & Props[A]) {
      
      inline def setAction(value: A): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setExpandActionRoot(value: Boolean): Self = StObject.set(x, "expandActionRoot", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
