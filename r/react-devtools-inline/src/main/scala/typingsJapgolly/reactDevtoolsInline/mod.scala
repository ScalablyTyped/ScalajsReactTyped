package typingsJapgolly.reactDevtoolsInline

import typingsJapgolly.reactDevtoolsInline.commonsMod.BackendBridge
import typingsJapgolly.reactDevtoolsInline.commonsMod.FrontendBridge
import typingsJapgolly.reactDevtoolsInline.commonsMod.ProfilerStore
import typingsJapgolly.reactDevtoolsInline.commonsMod.Wall
import typingsJapgolly.reactDevtoolsInline.commonsMod.global.Window
import typingsJapgolly.reactDevtoolsInline.frontendMod.Config
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-devtools-inline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-devtools-inline", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactDevtoolsInline.backendMod.default {
    def this(
      bridge: FrontendBridge,
      store: typingsJapgolly.reactDevtoolsInline.commonsMod.Store,
      defaultIsProfiling: Boolean
    ) = this()
  }
  
  @JSImport("react-devtools-inline", "Bridge")
  @js.native
  open class Bridge[OutgoingEvents /* <: Record[String, js.Array[Any]] */, IncomingEvents /* <: Record[String, js.Array[Any]] */] protected ()
    extends typingsJapgolly.reactDevtoolsInline.backendMod.Bridge[OutgoingEvents, IncomingEvents] {
    def this(wall: Wall) = this()
  }
  
  @JSImport("react-devtools-inline", "EventEmitter")
  @js.native
  open class EventEmitter[Events] ()
    extends typingsJapgolly.reactDevtoolsInline.backendMod.EventEmitter[Events]
  
  @JSImport("react-devtools-inline", "ProfilingCache")
  @js.native
  open class ProfilingCache protected ()
    extends typingsJapgolly.reactDevtoolsInline.backendMod.ProfilingCache {
    def this(profilerStore: ProfilerStore) = this()
  }
  
  @JSImport("react-devtools-inline", "Store")
  @js.native
  open class Store protected ()
    extends typingsJapgolly.reactDevtoolsInline.backendMod.Store {
    def this(bridge: FrontendBridge) = this()
    def this(bridge: FrontendBridge, config: Config) = this()
  }
  
  inline def activate(contentWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def activate(contentWindow: Window, options: typingsJapgolly.reactDevtoolsInline.anon.Bridge): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(contentWindow.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createBridge(contentWindow: Window): BackendBridge = ^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[BackendBridge]
  inline def createBridge(contentWindow: Window, wall: Wall): BackendBridge = (^.asInstanceOf[js.Dynamic].applyDynamic("createBridge")(contentWindow.asInstanceOf[js.Any], wall.asInstanceOf[js.Any])).asInstanceOf[BackendBridge]
  
  inline def initialize(contentWindow: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(contentWindow.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
