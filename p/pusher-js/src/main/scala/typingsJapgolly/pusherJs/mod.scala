package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typingsJapgolly.pusherJs.typesSrcCoreOptionsMod.Options
import typingsJapgolly.pusherJs.typesSrcCorePusherMod.Pusher
import typingsJapgolly.pusherJs.typesSrcRuntimesInterfaceMod.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pusher-js", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.pusherJs.typesSrcCorePusherMod.default {
    def this(app_key: String) = this()
    def this(app_key: String, options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pusher-js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pusher-js", "default.DependenciesReceivers")
    @js.native
    def DependenciesReceivers: Any = js.native
    inline def DependenciesReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DependenciesReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.Runtime")
    @js.native
    def Runtime: typingsJapgolly.pusherJs.typesSrcRuntimesInterfaceMod.Runtime = js.native
    inline def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.ScriptReceivers")
    @js.native
    def ScriptReceivers: Any = js.native
    inline def ScriptReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.auth_callbacks")
    @js.native
    def auth_callbacks: Any = js.native
    inline def auth_callbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth_callbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.getClientFeatures")
    @js.native
    def getClientFeatures: Any = js.native
    inline def getClientFeatures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientFeatures")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.instances")
    @js.native
    def instances: js.Array[Pusher] = js.native
    inline def instances_=(x: js.Array[Pusher]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js", "default.isReady")
    @js.native
    def isReady: Boolean = js.native
    inline def isReady_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isReady")(x.asInstanceOf[js.Any])
    
    inline def log(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("pusher-js", "default.logToConsole")
    @js.native
    def logToConsole: Boolean = js.native
    inline def logToConsole_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(x.asInstanceOf[js.Any])
    
    inline def ready(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Unit]
  }
  
  @JSImport("pusher-js", "Channel")
  @js.native
  open class Channel protected ()
    extends typingsJapgolly.pusherJs.typesSrcCoreChannelsChannelMod.default {
    def this(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default) = this()
  }
  
  @JSImport("pusher-js", "ConnectionManager")
  @js.native
  open class ConnectionManager protected ()
    extends typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default {
    def this(key: String, options: ConnectionManagerOptions) = this()
  }
  
  @JSImport("pusher-js", "Members")
  @js.native
  open class Members ()
    extends typingsJapgolly.pusherJs.typesSrcCoreChannelsMembersMod.default
  
  @JSImport("pusher-js", "PresenceChannel")
  @js.native
  open class PresenceChannel protected ()
    extends typingsJapgolly.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default {
    def this(name: String, pusher: typingsJapgolly.pusherJs.typesSrcCorePusherMod.default) = this()
  }
}
