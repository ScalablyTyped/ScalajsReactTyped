package typingsJapgolly.reactDetectOffline

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-detect-offline", "Base")
  @js.native
  open class Base protected () extends Component[BaseProps, BaseState, Any] {
    def this(props: BaseProps) = this()
    def this(props: BaseProps, context: Any) = this()
  }
  @JSImport("react-detect-offline", "Base")
  @js.native
  val Base: ComponentClassP[BaseProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-detect-offline", "Detector")
  @js.native
  open class Detector protected () extends Component[DetectorProps, DetectorState, Any] {
    def this(props: DetectorProps) = this()
    def this(props: DetectorProps, context: Any) = this()
  }
  @JSImport("react-detect-offline", "Detector")
  @js.native
  val Detector: ComponentClassP[DetectorProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-detect-offline", "Offline")
  @js.native
  open class Offline protected () extends Component[OfflineProps, OfflineState, Any] {
    def this(props: OfflineProps) = this()
    def this(props: OfflineProps, context: Any) = this()
  }
  @JSImport("react-detect-offline", "Offline")
  @js.native
  val Offline: ComponentClassP[OfflineProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-detect-offline", "Online")
  @js.native
  open class Online protected () extends Component[OnlineProps, OnlineState, Any] {
    def this(props: OnlineProps) = this()
    def this(props: OnlineProps, context: Any) = this()
  }
  @JSImport("react-detect-offline", "Online")
  @js.native
  val Online: ComponentClassP[OnlineProps & js.Object] = js.native
  
  @JSImport("react-detect-offline", "defaultPollingConfig")
  @js.native
  val defaultPollingConfig: PollingConfig = js.native
  
  @JSImport("react-detect-offline", "defaultProps")
  @js.native
  val defaultProps: BaseProps = js.native
  
  trait BaseProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* online */ Boolean, js.UndefOr[Unit]]] = js.undefined
    
    var polling: js.UndefOr[Boolean | PollingConfig] = js.undefined
    
    var wrapperType: js.UndefOr[String] = js.undefined
  }
  object BaseProps {
    
    inline def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: /* online */ Boolean => js.UndefOr[Unit]): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPolling(value: Boolean | PollingConfig): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
      
      inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
      
      inline def setWrapperType(value: String): Self = StObject.set(x, "wrapperType", value.asInstanceOf[js.Any])
      
      inline def setWrapperTypeUndefined: Self = StObject.set(x, "wrapperType", js.undefined)
    }
  }
  
  trait BaseState extends StObject {
    
    var online: Boolean
  }
  object BaseState {
    
    inline def apply(online: Boolean): BaseState = {
      val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseState]
    }
    
    extension [Self <: BaseState](x: Self) {
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetectorProps
    extends StObject
       with BaseProps {
    
    def render(hasOnline: typingsJapgolly.reactDetectOffline.anon.Online): typingsJapgolly.react.mod.global.JSX.Element | Null
  }
  object DetectorProps {
    
    inline def apply(
      render: typingsJapgolly.reactDetectOffline.anon.Online => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): DetectorProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[DetectorProps]
    }
    
    extension [Self <: DetectorProps](x: Self) {
      
      inline def setRender(
        value: typingsJapgolly.reactDetectOffline.anon.Online => typingsJapgolly.react.mod.global.JSX.Element | Null
      ): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  type DetectorState = BaseState
  
  type OfflineProps = BaseProps
  
  type OfflineState = BaseState
  
  type OnlineProps = BaseProps
  
  type OnlineState = BaseState
  
  trait PollingConfig extends StObject {
    
    var enabled: Boolean
    
    var interval: Double
    
    var timeout: Double
    
    var url: String
  }
  object PollingConfig {
    
    inline def apply(enabled: Boolean, interval: Double, timeout: Double, url: String): PollingConfig = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PollingConfig]
    }
    
    extension [Self <: PollingConfig](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
