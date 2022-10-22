package typingsJapgolly.reactDevtoolsInline

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.reactDevtoolsInline.commonsMod.DevtoolsProps
import typingsJapgolly.reactDevtoolsInline.commonsMod.FrontendBridge
import typingsJapgolly.reactDevtoolsInline.commonsMod.ProfilerStore
import typingsJapgolly.reactDevtoolsInline.commonsMod.Wall
import typingsJapgolly.reactDevtoolsInline.commonsMod.global.Window
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frontendMod {
  
  @JSImport("react-devtools-inline/frontend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-devtools-inline/frontend", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactDevtoolsInline.commonsMod.default {
    def this(
      bridge: FrontendBridge,
      store: typingsJapgolly.reactDevtoolsInline.commonsMod.Store,
      defaultIsProfiling: Boolean
    ) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "Bridge")
  @js.native
  open class Bridge[OutgoingEvents /* <: Record[String, js.Array[Any]] */, IncomingEvents /* <: Record[String, js.Array[Any]] */] protected ()
    extends typingsJapgolly.reactDevtoolsInline.commonsMod.Bridge[OutgoingEvents, IncomingEvents] {
    def this(wall: Wall) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "EventEmitter")
  @js.native
  open class EventEmitter[Events] ()
    extends typingsJapgolly.reactDevtoolsInline.commonsMod.EventEmitter[Events]
  
  @JSImport("react-devtools-inline/frontend", "ProfilingCache")
  @js.native
  open class ProfilingCache protected ()
    extends typingsJapgolly.reactDevtoolsInline.commonsMod.ProfilingCache {
    def this(profilerStore: ProfilerStore) = this()
  }
  
  @JSImport("react-devtools-inline/frontend", "Store")
  @js.native
  open class Store protected ()
    extends typingsJapgolly.reactDevtoolsInline.commonsMod.Store {
    def this(bridge: FrontendBridge) = this()
    def this(bridge: FrontendBridge, config: Config) = this()
  }
  
  inline def createBridge(contentWindow: Window): FrontendBridge = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[FrontendBridge]
  inline def createBridge(contentWindow: Window, wall: Wall): FrontendBridge = (^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any], wall.asInstanceOf[js.Any])).asInstanceOf[FrontendBridge]
  
  inline def createStore(bridge: FrontendBridge): typingsJapgolly.reactDevtoolsInline.commonsMod.Store = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(bridge.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.Store]
  inline def createStore(bridge: FrontendBridge, config: Config): typingsJapgolly.reactDevtoolsInline.commonsMod.Store = (^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(bridge.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.Store]
  
  inline def initialize(contentWindow: Window): Component[DevtoolsProps & js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Component[DevtoolsProps & js.Object, js.Object]]
  inline def initialize(contentWindow: Window, options: typingsJapgolly.reactDevtoolsInline.anon.Store): Component[DevtoolsProps & js.Object, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Component[DevtoolsProps & js.Object, js.Object]]
  
  trait Config extends StObject {
    
    var checkBridgeProtocolCompatibility: js.UndefOr[Boolean] = js.undefined
    
    var supportsNativeInspection: js.UndefOr[Boolean] = js.undefined
    
    var supportsProfiling: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setCheckBridgeProtocolCompatibility(value: Boolean): Self = StObject.set(x, "checkBridgeProtocolCompatibility", value.asInstanceOf[js.Any])
      
      inline def setCheckBridgeProtocolCompatibilityUndefined: Self = StObject.set(x, "checkBridgeProtocolCompatibility", js.undefined)
      
      inline def setSupportsNativeInspection(value: Boolean): Self = StObject.set(x, "supportsNativeInspection", value.asInstanceOf[js.Any])
      
      inline def setSupportsNativeInspectionUndefined: Self = StObject.set(x, "supportsNativeInspection", js.undefined)
      
      inline def setSupportsProfiling(value: Boolean): Self = StObject.set(x, "supportsProfiling", value.asInstanceOf[js.Any])
      
      inline def setSupportsProfilingUndefined: Self = StObject.set(x, "supportsProfiling", js.undefined)
    }
  }
}
