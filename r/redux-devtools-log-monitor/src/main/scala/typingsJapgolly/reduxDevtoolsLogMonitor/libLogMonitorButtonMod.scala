package typingsJapgolly.reduxDevtoolsLogMonitor

import japgolly.scalajs.react.Callback
import typingsJapgolly.base16.mod.Base16Theme
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogMonitorButtonMod {
  
  @JSImport("redux-devtools-log-monitor/lib/LogMonitorButton", JSImport.Default)
  @js.native
  open class default () extends LogMonitorButton
  
  @js.native
  trait LogMonitorButton extends PureComponent[Props, State, Any] {
    
    def handleMouseDown(): Unit = js.native
    
    def handleMouseEnter(): Unit = js.native
    
    def handleMouseLeave(): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    def onClick(): Unit = js.native
  }
  
  trait Props extends StObject {
    
    var enabled: Boolean
    
    def onClick(): Unit
    
    var theme: Base16Theme
  }
  object Props {
    
    inline def apply(enabled: Boolean, onClick: Callback, theme: Base16Theme): Props = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onClick = onClick.toJsFn, theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setTheme(value: Base16Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var active: Boolean
    
    var hovered: Boolean
  }
  object State {
    
    inline def apply(active: Boolean, hovered: Boolean): State = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hovered = hovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    }
  }
}
